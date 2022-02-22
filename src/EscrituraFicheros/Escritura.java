package EscrituraFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public void EscrituraFichero() {
        String[] lineas = {" Gon ", " Killua ", " Luffy ", " Ace ", " Sabo"};

        FileWriter fichero = null;


        try {
            fichero = new FileWriter("fichero_escritura.txt");

            for ( String linea : lineas){
                fichero.write(linea + "\n");
            }
            fichero.close();
        } catch (IOException e) {
            System.out.println(" ERROR " + e.getMessage());
        }
    }



}
