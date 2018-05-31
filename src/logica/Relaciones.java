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
public class Relaciones {

    int[] elementos, parejas;
    String reflexiva = "", simetrica = "", antisimetrica = "", transiiva = "";
    int contador = 0;

    public Relaciones() {
    }

    public Relaciones(String[] elementos, String[] parejas) {
        this.elementos = new int[elementos.length];
        this.parejas = new int[parejas.length];
        for (int i = 0; i < elementos.length; i++) {
            this.elementos[i] = Integer.valueOf(elementos[i]);
        }
        for (int i = 0; i < parejas.length; i++) {
            this.parejas[i] = Integer.valueOf(parejas[i]);
        }
        reflexiva();
        simetrica();
        antisimetrica();
        transitiva();
    }

    public void reflexiva() {
        for (int i = 0; i < elementos.length; i++) {
            for (int j = 0; j < parejas.length; j = j + 2) {
                if (elementos[i] == parejas[j] && elementos[i] == parejas[j + 1]) {
                    contador++;
                }
            }
            if (contador == elementos.length) {
                reflexiva = "Es reflexiva";
            } else {
                reflexiva = "No es reflexiva";
            }
        }
    }

    public void simetrica() {
        int a, b;
        contador = 0;
        for (int j = 0; j < parejas.length; j = j + 2) {
            a = parejas[j];
            b = parejas[j + 1];
            simetrica = buscar(a, b);
        }
    }

    public String buscar(int x, int y) {
        for (int i = 0; i < parejas.length; i = i + 2) {
            if (parejas[i] == y && parejas[i + 1] == x) {
                contador++;
            }
        }
        if (contador == (parejas.length) / 2) {
            return "Es simetrica";
        } else {
            return "No es simetrica";
        }
    }

    public void antisimetrica() {
        int a, b;
        contador = 0;
        for (int j = 0; j < parejas.length; j = j + 2) {
            a = parejas[j];
            b = parejas[j + 1];
            antisimetrica = buscarAntisimetrica(a, b);
            if (antisimetrica == "No es antisimetrica") {
                j = 100;
            }
        }
    }

    public String buscarAntisimetrica(int x, int y) {
        String s = "";
        for (int i = 0; i < parejas.length; i = i + 2) {
            if (parejas[i] == y && parejas[i + 1] == x && x != y) {
                s = "No es antisimetrica";
                i = 100;
            } else {
                s = "Es antisimetrica";
            }
        }
        return s;
    }

    public void transitiva() {
        int x, y, z;
        for (int i = 0; i < parejas.length; i = i + 2) {
            x = parejas[i];
            y = parejas[i + 1];
            z = buscarZ(y);
            System.out.println("(" + x + "," + y + ") y (" + y + "," + z + ") entonces (" + x + "," + z + ")");
            if (z != 111 && buscarXZ(x, z) == true) {
                transiiva = "Es transitiva";
            } else {
                transiiva = "No es transitiva";
            }
        }
    }

    public int buscarZ(int y) {
        int z = 111;
        for (int i = 0; i < parejas.length; i = i + 2) {
            if (parejas[i] == y) {
                z = parejas[i + 1];
                i = 100;
            }
        }
        return z;
    }

    public boolean buscarXZ(int x, int z) {
        boolean estado = false;
        for (int i = 0; i < parejas.length; i = i + 2) {
            if (parejas[i] == x && parejas[i + 1] == z) {
                estado = true;
            } else {
                estado = false;
            }
        }
        return estado;
    }

    public String getReflexiva() {
        return reflexiva;
    }

    public String getSimetrica() {
        return simetrica;
    }

    public String getAntisimetrica() {
        return antisimetrica;
    }

    public String getTransiiva() {
        return transiiva;
    }
}
