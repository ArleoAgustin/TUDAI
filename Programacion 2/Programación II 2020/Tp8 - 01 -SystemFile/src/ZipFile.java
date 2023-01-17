import java.util.ArrayList;


public class ZipFile extends Folder{
	private String extension;
	private int compressionCup;
	
	public ZipFile(String  name, int compressionCup) {
		super(name);
		this.compressionCup = compressionCup;
	}
	public ZipFile(int compressionCup) {
		super("New ZIP File");
		this.compressionCup = compressionCup;
	}
	
	public String getName() {
		return super.getName()+extension;
	}
	
	@Override
	public double getFileSize() {
		return super.getFileSize() * compressionCup / 100;
	}
	@Override
	public ArrayList<SystemFileElement> search(Filter f) {
		ArrayList<SystemFileElement> aux = new  ArrayList<SystemFileElement>();
		for (SystemFileElement systemFile : files) {
			if(f.filtrate(systemFile)) {
				aux.add(this);
				return aux;
			}
		}
		return aux;
	}
}

