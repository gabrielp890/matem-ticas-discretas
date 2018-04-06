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
public class NumerosPrimos {

    String primos, primosTemp = "";
    String estado = "primo";
    int cont = 0;

    public NumerosPrimos() {

    }

    /**
     *
     * @param numero es el valor a calcular
     * @return cadena de strings con los factores primos
     */
    public String nprimos(String numero) {
        double residuo, num, i = 2, temp = 0;
        num = Double.parseDouble(numero);
        int raiz = (int) Math.sqrt(num);
        primos = "";
        while (i <= raiz) {
            residuo = num % i;
            if (residuo == 0) {
                estado="compuesto";
                num = num / i;
                primos = primos + " " + (int) i;
                raiz = (int) Math.sqrt(num);
                i = 1;
            }
            if (i == raiz) {
                primos = primos + " " + (int) num;
            }
            i++;
        }
        return primos;
    }

    /**
     *
     * @return retorna el estado de la variable estado, puede ser primo o
     * compuesto
     */
    public String getEstado() {
        return estado;
    }

}
