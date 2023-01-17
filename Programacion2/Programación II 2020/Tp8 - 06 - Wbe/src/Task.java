import java.time.LocalDate;
import java.util.ArrayList;

public class Task extends Worck{
	private ArrayList<Worck> worcks;
	private LocalDate expectedStartDate;
	private LocalDate expectedFinishtDate;
	private LocalDate startDate;
	private LocalDate finishtDate;

	public Task(String expectedStartDateString, String expectedFinishtDateString) {
		this.worcks = new ArrayList<Worck>();
		this.expectedStartDate = LocalDate.parse(expectedStartDateString);
		this.expectedFinishtDate = LocalDate.parse(expectedFinishtDateString);
	}
	
	
	public LocalDate getStartDate() {
		LocalDate ld1 = expectedFinishtDate;
		for (Worck worck : worcks) {
			LocalDate ld2 = worck.getStartDate();
			if (ld1.compareTo(ld2) > 0) {

				ld1 = ld2;
			}
		}
		return expectedFinishtDate;
	}

	public LocalDate getFinishDate() {
		LocalDate ld1 = expectedFinishtDate;
		for (Worck worck : worcks) {
			LocalDate ld2 = worck.getFinishDate();
			if (ld1.compareTo(ld2) < 0) {
				ld1 = ld2;
			}
		}
		return expectedFinishtDate;
	}

	public ArrayList<Task> getUnfinihTasksList() {
		ArrayList<Task> aux =  new ArrayList<Task>();
		boolean flag = false;
		for (Worck worck : worcks) {
			if(worck.getResourcesList().isEmpty() && this.getSatus() < 1) {
				aux.add(this);
			}
		}
		if(aux.isEmpty()) {
			aux =  null;
		}
		return aux;
	}
	
	@Override
	public ArrayList<Task> getTasksList(Resource resourses) {
		ArrayList<Task> aux =  new ArrayList<Task>();
		boolean flag = false;
		for (Worck worck : worcks) {
			if(worck.getTasksList(resourses) != null) {
				aux.addAll(worck.getTasksList(resourses));
				if(flag == false) {
					aux.add(this);
					flag = true;
				}
			}
		}
		return aux;
	}

	@Override
	public ArrayList<Resource> getResourcesList() {
		ArrayList<Resource> re1 =  new ArrayList<Resource>();
		for (Worck worck : worcks) {
			ArrayList<Resource> re2 = worck.getResourcesList();
			for (Resource resourse : re2) {
				if (!re1.contains(resourse)) {
					re1.add(resourse);
				}
			}
		}
		return re1;
	}
	
	public int  getSatus() {
		if (this.getResourcesList().size() < 0) {
			return -1;
		} else if (this.getResourcesList().size() == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	/*
	 * 	
	 * @Override
	public ArrayList<Task> getTasksList(Resourse resourses) {
		ArrayList<Task> aux =  new ArrayList<Task>();
		for (Worck worck : worcks) {
			aux.addAll(worck.getTasksList(resourses));
		}
		if (!aux.is) {
			aux.add(this);
		}
		return aux;
	}

*/
	
	public void addWorck(Worck w) {
		this.worcks.add(w);
	}
	
	public LocalDate getExpectedStartDate() {
		return expectedStartDate;
	}
	public void setExpectedStartDate(LocalDate expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}
	public LocalDate getExpectedFinishtDate() {
		return expectedFinishtDate;
	}
	public void setExpectedFinishtDate(LocalDate expectedFinishtDate) {
		this.expectedFinishtDate = expectedFinishtDate;
	}
}
