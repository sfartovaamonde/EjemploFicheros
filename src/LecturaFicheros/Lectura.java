package LecturaFicheros;

import java.io.*;
import java.util.Scanner;

public class Lectura {

    FileReader fr = null;
public void lectura() {
    try {
        fr = new FileReader("C:\\Users\\Usuario\\Documents\\Fichero.txt");
        BufferedReader br = new BufferedReader(fr);
        String texto = br.readLine();
        while (texto != null){
            System.out.println(texto);
            texto = br.readLine();
        }

    } catch (FileNotFoundException e) {
        System.out.println("ERROR" + e.getMessage());
    } catch (IOException e) {
        System.out.println("ERROR" + e.getMessage());
    }
    finally{
        try {
            if (fr != null) {
                fr.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
}


