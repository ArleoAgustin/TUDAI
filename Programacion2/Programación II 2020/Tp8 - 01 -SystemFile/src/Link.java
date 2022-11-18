import java.util.ArrayList;


public class Link extends SystemFileElement{
	private SystemFileElement file;
	
	public Link(String  name, SystemFileElement file) {
		super(name);
		this.file = file;
	}
	public Link(SystemFileElement file) {
		super("New Link");
		this.file = file;
		this.fileSize = 1;
	}

	public String getName() {
		return file.getName();
	}
	
	@Override
	public double getFileSize() {
		return fileSize;
	}
	@Override
	public ArrayList<SystemFileElement> search(Filter f) {
		ArrayList<SystemFileElement> aux = new ArrayList<SystemFileElement>();
		if(f.filtrate(this)) {
			aux.add(this);
		}
		return aux;
	}
}
