
public class Main {
	public static void main(String []args) {
		ElectoralSystem es = new ElectoralSystem();
		
		PlaceToVote ec0 =  new PlaceToVote();
		PlaceToVote ec1 =  new PlaceToVote();
		PlaceToVote ec2 =  new PlaceToVote();
		PlaceToVote ec3 =  new PlaceToVote();
		PlaceToVote ec4 =  new PlaceToVote();
		PlaceToVote ec5 =  new PlaceToVote();
		PlaceToVote ec6 =  new PlaceToVote();
		PlaceToVote ec7 =  new PlaceToVote();
		PlaceToVote ec8 =  new PlaceToVote();
		PlaceToVote ec9 =  new PlaceToVote();
		
		Table et0 =  new Table();
		Table et1 =  new Table();
		Table et2 =  new Table();
		Table et3 =  new Table();
		Table et4 =  new Table();
		Table et5 =  new Table();
		Table et6 =  new Table();
		
		es.addElectoralComposite(ec0);
		ec0.addPlaceToVote(ec1);
		ec0.addPlaceToVote(ec2);
		ec0.addPlaceToVote(ec3);
		ec1.addPlaceToVote(ec4);
		ec1.addPlaceToVote(ec5);
		ec2.addPlaceToVote(ec6);
		ec2.addPlaceToVote(ec7);
		ec3.addPlaceToVote(ec8);
		ec4.addPlaceToVote(ec9);
		
		ec0.addPlaceToVote(et0);
		ec1.addPlaceToVote(et1);
		ec5.addPlaceToVote(et2);
		ec6.addPlaceToVote(et3);
		ec7.addPlaceToVote(et4);
		ec8.addPlaceToVote(et5);
		ec9.addPlaceToVote(et6);
		
		Person p0 = new Person();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		Person p6 = new Person();
		Person p7 = new Person();
		Person p8 = new Person();
		Person p9 = new Person();
		Person p10 = new Person();
		Person p11 = new Person();
		Person p12 = new Person();
		Person p13 = new Person();
		
		Politician po0 = new Politician("Juan", "a", "a");
		Politician po1 = new Politician("Jose", "a", "a");
		Politician po2 = new Politician("Pedro", "a", "a");
		
		es.addPolitical(po0);
		es.addPolitical(po1);
		es.addPolitical(po2);
		
		es.addPerson(p0);
		es.addPerson(p1);
		es.addPerson(p2);
		es.addPerson(p3);
		es.addPerson(p4);
		es.addPerson(p5);
		es.addPerson(p6);
		es.addPerson(p7);
		es.addPerson(p8);
		es.addPerson(p9);
		es.addPerson(p10);
		es.addPerson(p11);
		es.addPerson(p12);
		es.addPerson(p13);
		
		es.assignPeople();
		
		es.vote(p0, 1);
		es.vote(p1, 2);
		es.vote(p2, 0);
		es.vote(p3, 2);
		es.vote(p4, 0);
		es.vote(p5, 2);
		es.vote(p6);
		es.vote(p7, 0);
		es.vote(p8, 0);
		es.vote(p9, 0);
		es.vote(p10);
		es.vote(p11, 0);
		es.vote(p12, 2);
		es.vote(p12, 0);
		
		Filter f0 = new FilterByBlankVotes();
		Filter f1 = new FilterByVoteOfAPolitician(po1);
		Filter f2 = new FilterByHoursTheVoteWasTaken("2020-10-03T10:15:30","2020-12-03T10:15:30");
		
		System.out.println("Porsentaje de votos en blanco: "+ es.getPercentageOfVotesByFilter(f0));
		System.out.println("Porsentaje de un politico: "+ es.getPercentageOfVotesByFilter(f1));
		System.out.println("Porsentaje por un período de horas: "+ es.getPercentageOfVotesByFilter(f2));
	}
}
