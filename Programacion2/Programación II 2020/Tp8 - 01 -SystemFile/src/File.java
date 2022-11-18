import java.util.ArrayList;


public class File extends SystemFileElement{
	private String extension;
	
	public File(String  name, double fileSize) {
		super(name);
		this.fileSize = fileSize;
	}
	public File(double fileSize) {
		super("New File");
		this.fileSize = fileSize;
	}
	
	public String getName() {
		return super.getName()+extension;
	}
	
	@Override
	public double getFileSize() {
		return fileSize;
	}
	@Override
	public ArrayList<SystemFileElement> search(Filter f) {
		ArrayList<SystemFileElement> aux = new  ArrayList<SystemFileElement>();
		 if(f.filtrate(this)) {
			 aux.add(this);
		 }
		return aux;
	}
	
	public String toString() {
		return super.toString()+"."+extension;
	}
}