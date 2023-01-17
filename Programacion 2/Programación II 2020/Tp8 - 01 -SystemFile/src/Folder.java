import java.util.ArrayList;

public class Folder extends SystemFileElement{
	protected ArrayList<SystemFileElement> files;
	
	public Folder(String  name) {
		super(name);
		files = new ArrayList<SystemFileElement>();
	}
	public Folder() {
		super("New Folder");
		files = new ArrayList<SystemFileElement>();
	}
	
	@Override
	public double getFileSize() {
		double aux = 0;
		for (SystemFileElement systemFile : files) {
			aux += systemFile.getFileSize();
		}
		return aux;
	}
	@Override
	public ArrayList<SystemFileElement> search(Filter f) {
		ArrayList<SystemFileElement> aux = new  ArrayList<SystemFileElement>();
		for (SystemFileElement systemFile : files) {
			aux.addAll(systemFile.search(f));
		}
		if(f.filtrate(this)) {
			aux.add(this);
		}
		return aux;
	}
	public void addFile(SystemFileElement elem) {
		files.add(elem);
		elem.setFathere(this);
	}

	public int numberElement() {
		return files.size();
	}
}
