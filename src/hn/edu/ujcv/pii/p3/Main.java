package hn.edu.ujcv.pii.p3;

import recursos.Conexion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
    try {
    Conexion co = new Conexion();
    System.out.println("Ingrese la cantidad de clases: ");
    int cantidad = teclado.nextInt();
    for (int i = 0; i < cantidad; i++) {
        System.out.println("Ingrese la clase " + (i + 1));
        co.conectar(teclado.next());
        }
    }catch (Exception e){
        System.err.println("Error" + e.getMessage());
        }
    }
}
