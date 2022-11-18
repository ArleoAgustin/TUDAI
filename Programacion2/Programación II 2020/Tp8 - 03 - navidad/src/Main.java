
public class Main {

	public static void main(String[] args) {
		PlaceForAMailbox pfam0 = new PlaceForAMailbox();
		PlaceForAMailbox pfam1 = new PlaceForAMailbox();
		PlaceForAMailbox pfam2 = new PlaceForAMailbox();
		PlaceForAMailbox pfam3 = new PlaceForAMailbox();
		PlaceForAMailbox pfam4 = new PlaceForAMailbox();
		
		Mailbox mb0 = new Mailbox();
		Mailbox mb1 = new Mailbox();
		Mailbox mb2 = new Mailbox();
		
		pfam0.addPlace(pfam1);
		pfam0.addPlace(pfam2);
		pfam1.addPlace(pfam3);
		pfam3.addPlace(pfam4);
		pfam0.addPlace(mb1);
		pfam0.addPlace(mb0);
		pfam1.addPlace(mb2);
		
		Child c0 =  new Child("Juan");
		// Child c1 =  new Child("predro");
		// Child c2 =  new Child("Jose");
		Child c3 =  new Child("Bip bop 3000");
		// Child c4 =  new Child("Jose");
		Child c5 =  new Child("Juan - impostor");
		
		c0.addPresent("auto");
		c3.addPresent("auto");
		c5.addPresent("auto");
		
		
		
		// mb0.addLetter(child, letter);
		
		// FilterByPresent f = new FilterByPresent();
	}

}
