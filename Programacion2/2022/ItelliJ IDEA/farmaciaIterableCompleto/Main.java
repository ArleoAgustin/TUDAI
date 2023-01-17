package farmaciaIterableCompleto;

public class Main {

    public static void main(String[] args) {
        Farmacia farm = new Farmacia("Cruz verde");

        Medicamento ibu = new Medicamento("Ibuprofeno", "Bayer", 500.0);
        Medicamento tafirol = new Medicamento("Tafirol", "Bayer", 900.0);
        Medicamento ibuevanol = new Medicamento("Ibuevanol", "XX", 600.0);
        farm.addMedicamento(ibu);
        farm.addMedicamento(tafirol);
        farm.addMedicamento(ibuevanol);
        farm.addMedicamento(new Medicamento("diclofenac", "XX", 400.5));

        Medicamento med = new Medicamento("Diclofenac", "XX", 400.5 );

        System.out.println(farm.tieneMedicamento(med));

        for(Medicamento medicamento:farm)
            System.out.println("Medicamento: "+medicamento);

    }
}
