/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Gabriel
 */
public class Mcm {

    int x=0, y=0, residuo = 1, multiplo=0;

    public Mcm() {

    }

    /**
     *
     * @param x primer numero inicial
     * @param y segundo numero inicial
     * @return el valor mcd
     */
    public String euclides(String x, String y) {
        this.x = Integer.valueOf(x);
        this.y = Integer.valueOf(y);
        while (residuo != 0) {
            multiplo = this.x / this.y;
            residuo = this.x - (this.y * multiplo);
            this.x = this.y;
            if (residuo != 0 && residuo < this.y) {
                this.y = residuo;
                System.out.println(this.y);
            }
        }
        return String.valueOf(this.y);
    }
}
