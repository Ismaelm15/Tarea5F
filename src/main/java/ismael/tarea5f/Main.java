/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea5f;

import java.util.ArrayList;

/**
 *
 * @author ismael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<CuadradoMagico> cuadrados = new ArrayList<CuadradoMagico>();
        for (int i = 0; i < 15; i++) {
            cuadrados.add(new CuadradoMagico());
        }
        for (CuadradoMagico a : cuadrados) {
            if (a.esCuadradoMagico()) {
                System.out.println("Es un cuadrado magico");
            } else {
                System.out.println("No es un cuadrado magico");
            }
            a.imprimirCuadrado();
        }
    }
}
