package TPE2022.Comparadores;

import java.util.Comparator;

public class ComparadorInteger implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1 - o2; 
	}

}
