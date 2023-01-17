import java.util.ArrayList;


public class Plant {
	private String sctificName;
	private ArrayList<String> commonName; 
	private String family;
	private String classOfPlant;
	private boolean houseplant;
	private int requirementSun;
	private int requirementWater;
	
	public Plant(String sctificName, String family, String classOfPlant, boolean houseplant,  int requirementSun, int requirementWater) {
		this.sctificName = sctificName;
		this.family = family;
		this.classOfPlant = classOfPlant;
		this.houseplant = houseplant;
		this.requirementSun = requirementSun;
		this.requirementWater = requirementWater;
		commonName = new ArrayList<String>();
	}
	
	public String getSctificName() {
		return sctificName;
	}
	public void setSctificName(String sctificName) {
		this.sctificName = sctificName;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getClassOfPlant() {
		return classOfPlant;
	}
	public void setClassOfPlant(String classOfPlant) {
		this.classOfPlant = classOfPlant;
	}
	public boolean isHouseplant() {
		return houseplant;
	}
	public void setHouseplant(boolean houseplant) {
		this.houseplant = houseplant;
	}
	public int getRequirementSun() {
		return requirementSun;
	}
	public void setRequirementSun(int requirementSun) {
		this.requirementSun = requirementSun;
	}
	public int getRequirementWater() {
		return requirementWater;
	}
	public void setRequirementWater(int requirementWater) {
		this.requirementWater = requirementWater;
	}

	public boolean coontainsWordinPlants(String word) {
		return this.commonName.contains(word);
	}
	public String toString() {
		return "Planta: "+sctificName+", "+family+", "+classOfPlant+", "+requirementSun+", "+requirementWater+"\n";
	}
}
