import java.time.LocalDate;
import java.util.ArrayList;

public abstract class SystemFileElement {
	protected String name;
	protected LocalDate creationDate;
	protected LocalDate lastUpdate;
	protected double fileSize;
	protected Folder perent;
	
	public SystemFileElement(String  name) {
		this.name = name;
		creationDate = LocalDate.now(); 
		lastUpdate = LocalDate.now(); 
	}
		
	public String getName() {
		return name;
	}

	public void setFathere(Folder fs) {
		this.perent = fs;
	}
	
	public void creationNewLink() {
		// new Link();
	}
	
	public abstract double getFileSize();
	
	public abstract ArrayList<SystemFileElement> search(Filter f);
	
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(LocalDate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String toString() {
		return name;
	}
}
