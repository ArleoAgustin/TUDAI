public class Politician implements Comparable<Politician>{
	private String name;
	private String politicalParty;
	private String politicalAgrouping;

	public Politician(String name) {
		this.name = name;
	}

	public Politician(String name, String politicalParty,
			String politicalAgrouping) {
		this.name = name;
		this.politicalParty = politicalParty;
		this.politicalAgrouping = politicalAgrouping;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Politician p1 = this;
			Politician p2 = (Politician) o;
			return p1.getName().equals(p2.getName())
					&& p1.getPoliticalAgrouping().equals(
							p2.getPoliticalAgrouping())
					&& p1.getPoliticalParty().equals(p2.getPoliticalParty());
		} catch (Exception exc) {
			return false;
		}
	}
	
	@Override
	public int compareTo(Politician p2) {
		Politician p1 = this;
		if (p1.getName().compareTo(p1.getName()) != 0) {
			return p1.getName().compareTo(p1.getName());
		} else if (p1.getPoliticalAgrouping().compareTo(p1.getPoliticalAgrouping()) != 0){
			return p1.getPoliticalAgrouping().compareTo(p1.getPoliticalAgrouping());
		} else {
			return p1.getPoliticalParty().compareTo(p1.getPoliticalParty());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPoliticalParty() {
		return politicalParty;
	}

	public void setPoliticalParty(String politicalParty) {
		this.politicalParty = politicalParty;
	}

	public String getPoliticalAgrouping() {
		return politicalAgrouping;
	}

	public void setPoliticalAgrouping(String politicalAgrouping) {
		this.politicalAgrouping = politicalAgrouping;
	}
}
