package ej6;

import ej5.Ej5;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ej6 ej6 = new Ej6();

        ArrayList list = new ArrayList<>();

        list.add(44);
        list.add(12);
        list.add(110);
        list.add(3);
        list.add(78);
        list.add(22);
        list.add(45);
        list.add(98);


        System.out.println(ej6.porSeleccion(list));

        int [] arr = {44,12,110,3,78,22,45,98};
        System.out.println("");
       ej6.bubbleAdaptative(arr);

        for (int i : ej6.bubbleAdaptative(arr)) {
            System.out.print(i+ ", ");
        }
    }
}
