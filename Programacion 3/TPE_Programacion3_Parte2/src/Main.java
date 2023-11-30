import TPE_Parte1.Arco;
import TPE_Parte1.GrafoNoDirigido;

import java.io.File;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		GrafoNoDirigido<Integer> gNoDirigido = new GrafoNoDirigido<>();
		String dataset1 = "./datasets/dataset1.txt";
		String dataset2 = "./datasets/dataset2.txt";
		String dataset3 = "./datasets/dataset3.txt";

		File file = new File(dataset1);
		CSVReader reader = new CSVReader(file.getPath());
		reader.read(gNoDirigido);


///////////////////////////////////////////Greedy////////////////////////////////////////////////////////////

		Greedy greedy = new Greedy(gNoDirigido);
		List<Arco> resPrim = greedy.prim(1);    //comienza desde la estacion 1
		System.out.println("Greedy");
		int kms = 0;
		for (Arco<Integer> arco : resPrim) {
			kms += arco.getEtiqueta();
			System.out.print("E" +arco.getVerticeOrigen() + "-" + "E" + arco.getVerticeDestino() +", ");
		}
		System.out.println();
		System.out.println(kms +" Kms");
		System.out.println("Metrica: "+greedy.getIteraciones());


////////////////////////////////////////////////Backtracking//////////////////////////////////////////////////

		System.out.println(" ");
		System.out.println("BackTracking");

		BackTracking back = new BackTracking(gNoDirigido);

		List<Arco<Integer>> resBack = back.backtracking(1); //commienza desde la estacion 1
		int kmsB =0;
		for (Arco arco : resBack) {
			kmsB += (int) arco.getEtiqueta();
			System.out.print("E" +arco.getVerticeOrigen() + "-" + "E" + arco.getVerticeDestino() +", ");
		}
		System.out.println();
		System.out.println(kmsB +" Kms");
		System.out.println("Metrica: "+back.getIteraciones());
		
	}

}
