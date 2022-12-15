package Servicios;

import Entidades.Arreglo;

import java.util.Arrays;

import java.text.DecimalFormat;

public class ArregloServicios {

    DecimalFormat decimales = new DecimalFormat("###,###,###.##");
    double[] vector;

    public Arreglo llenarArregloUno() {

        Arreglo a1 = new Arreglo();

        a1.setTamVector(50);

        vector = new double[a1.getTamVector()];


        System.out.println("Vector A sin organizar");

        for (int i = 0; i < a1.getTamVector(); i++) {

            vector[i] = Math.random() * 9;
            if (i == 0) {
                System.out.print("[" + decimales.format(vector[i]) + " - ");
            } else if (i < a1.getTamVector() - 1) {
                System.out.print(decimales.format(vector[i]) + " - ");
            } else {
                System.out.print(decimales.format(vector[i]) + "]");
            }
        }
        System.out.println();

        return a1;

    }

    public void ordenarNumVectorUno(Arreglo a1) {

        System.out.println("\nVector A con números ordenados de menor a mayor");
        Arrays.sort(vector);

        for (int i = 0; i < a1.getTamVector(); i++) {
            if (i == 0) {
                System.out.print("[" + decimales.format(vector[i]) + " - ");
            } else if (i < a1.getTamVector() - 1) {
                System.out.print(decimales.format(vector[i]) + " - ");
            } else {
                System.out.print(decimales.format(vector[i]) + "]");
            }
        }
        System.out.println();


    }

    public void llenarArregloDos() {

        Arreglo a2 = new Arreglo();

        a2.setTamVector(20);

        double[] vectorDos = new double[a2.getTamVector()];

        Arrays.sort(vector);

        System.out.println("\nVector B ");

        for (int i = 0; i < vectorDos.length; i++) {
            if (i < 10) {
                vectorDos[i] = vector[i];
            } else {
                vectorDos[i] = 0.5;
            }
            if (i == 0) {
                System.out.print("[" + decimales.format(vectorDos[i]) + " - ");
            } else if (i < vectorDos.length - 1) {
                System.out.print(decimales.format(vectorDos[i]) + " - ");
            } else {
                System.out.print(decimales.format(vectorDos[i]) + "]");
            }
        }

    }

}
