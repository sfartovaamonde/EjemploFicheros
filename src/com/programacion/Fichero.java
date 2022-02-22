package com.programacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero {

    File fichero = new File("C:\\Users\\Usuario\\Documents\\Fichero.txt");

    Scanner sc = null;

    public void leerFicheiro() {

        System.out.println(" ...... Leemos el contenido del fichero ......");

        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();    // Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea
            }
        } catch (
                FileNotFoundException e) {
            System.out.println(" Mensaje " + e.getMessage());
        } finally {
            try {
                if (sc != null)
                    sc.close();
            } catch (Exception e2) {
                System.out.println("Mensaje 2: " + e2.getMessage());
            }
        }
    }
}


