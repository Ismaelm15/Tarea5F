/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea5f;

import java.util.Random;

/**
 *
 * @author ismael
 */
public class CuadradoMagico {

    int cuadrado[][] = new int[3][3];
    Random rnd = new Random();

    public CuadradoMagico() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = rnd.nextInt(9) + 1;
            }
        }
    }

    public int sumarFila(int nfila) {
        nfila--;
        int sumaFila = 0;
        for (int i = 0; i < 3; i++) {
            sumaFila += cuadrado[nfila][i];
        }
        return sumaFila;
    }

    public int sumarColumna(int ncol) {
        ncol--;
        int sumaCol = 0;
        for (int i = 0; i < 3; i++) {
            sumaCol += cuadrado[i][ncol];
        }
        return sumaCol;
    }

    public int sumarDiagonalP() {
        int sumaDiaP = 0;
        for (int i = 0; i < 3; i++) {
            sumaDiaP += cuadrado[i][i];
        }
        return sumaDiaP;
    }

    public int sumarDiagonalS() {
        int sumaDias = 0;
        int j = 3;
        for (int i = 0; i < 3; i++) {
            {
                j--;
                sumaDias += cuadrado[i][j];
            }
        }
        return sumaDias;

    }

    public boolean esCuadradoMagico() {
        if (sumarDiagonalP() != sumarDiagonalS()) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (sumarDiagonalP() != sumarColumna(i)) {
                return false;
            }
            if (sumarDiagonalP() != sumarFila(i)) {
                return false;
            }
        }
        return true;
    }

    public void imprimirCuadrado() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + cuadrado[i][j] + "|");
            }
            System.out.println("");
        }

    }
}
