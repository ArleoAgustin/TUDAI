import java.util.ArrayList;


public class FileSystem {
	 private Folder root;

	    public FileSystem(){
	        this.root = new Folder ("/");
	        this.root.setFathere(null);
	    }
	    
	    public void addElemento(SystemFileElement elem){
	    	root.addFile(elem);
	    }

	    public int cantElementos(){
	        return root.numberElement();
	    }
	    
	    public void createLink(SystemFileElement elem) {
	    	root.addFile(new Link(elem));
	    }
	    public ArrayList<SystemFileElement> search(Filter f) {
	    	return root.search(f);
	    }
	    public double getFileSize() {
	    	return root.getFileSize();
	    }

	    public static void main(String[] args) {
	    	FileSystem fs = new FileSystem();
	    	Folder f0 = new Folder();
	    	Folder f1 = new Folder();
	    	Folder f2 = new Folder();
	    	Folder f3 = new Folder();
	    	Folder f4 = new Folder();
	    	Folder f5 = new Folder();
	    	Folder f6 = new Folder();
	    	Folder f7 = new Folder();
	    	Folder f8 = new Folder();
	    	Folder f9 = new Folder();
	    	File sf0 = new File("Pato", 4);
	    	File sf1 = new File("Pato", 7);
	    	File sf2 = new File("Pato", 6);
	    	File sf3 = new File("Pato", 1);
	    	File sf4 = new File("Pato", 5);
	    	File sf5 = new File("Pata", 3);
	    	File sf6 = new File("Pato", 8);
	    	File sf7 = new File("Pata", 9);
	    	File sf8 = new File("Pato", 2);
	    	File sf9 = new File("Pato", 10);
	    	ZipFile f10 = new ZipFile(4);
	    	File sf10 = new File("Juan", 10);
	    	File sf11 = new File("Pedro", 10);
	    	f10.addFile(sf11);
	    	f10.addFile(sf10);
	    	fs.addElemento(f0);
	    	f0.addFile(f1);
	    	f0.addFile(f2);
	    	f2.addFile(f3);
	    	f2.addFile(f4);
	    	fs.addElemento(f5);
	    	f5.addFile(f6);
	    	f5.addFile(f7);
	    	f5.addFile(f8);
	    	fs.addElemento(f9);
	    	f0.addFile(sf1);
	    	f1.addFile(sf2);
	    	f2.addFile(sf3);
	    	f3.addFile(sf4);
	    	f4.addFile(sf5);
	    	f5.addFile(sf6);
	    	f6.addFile(sf7);
	    	f7.addFile(sf8);
	    	f8.addFile(sf9);
	    	f9.addFile(sf0);
	    	f9.addFile(f10);
	    	Filter fil0 = new FilterByName("Pato");
	    	Filter fil1 = new FilterByName("Juan");
	    	Filter fnot = new FilterNot(fil0);
	    	System.out.println(fs.search(fil0));
	    	System.out.println(fs.search(fnot));
	    	System.out.println("Buscar archivos: "+fs.getFileSize());
	    	System.out.println("Buscar Zip: "+fs.search(fil1));
	    }
	    
}
