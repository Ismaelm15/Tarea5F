/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea5f;

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

        CuadradoMagico a = new CuadradoMagico();
        System.out.println("El resultado de la suma de la fila 1 es:" + a.sumarFila(1));
        System.out.println("El resultado de la suma de la fila 2 es:" + a.sumarFila(2));
        System.out.println("El resultado de la suma de la fila 3 es:" + a.sumarFila(3));

        System.out.println("El resultado de la suma de la columna 1 es:" + a.sumarColumna(1));
        System.out.println("El resultado de la suma de la columna 2 es:" + a.sumarColumna(2));
        System.out.println("El resultado de la suma de la columna 3 es:" + a.sumarColumna(3));
        
        System.out.println("El resultado de la suma de la diagonal principal es:" + a.sumarDiagonalP());
        System.out.println("El resultado de la suma de la diagonal secundaria es:" + a.sumarDiagonalS());
//        a.imprimirCuadrado();
    }

}
