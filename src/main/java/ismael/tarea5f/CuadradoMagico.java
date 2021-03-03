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
                cuadrado[i][j] = rnd.nextInt();
            }
        }
    }
    
    
  
}
