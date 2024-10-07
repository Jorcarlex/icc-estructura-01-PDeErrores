import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: El metodo retotna un arreglo vacio (return new int[] {};)
    // en lugar de devolver un arreglo ordenado.
    // Correcion: Cambiar el (return new int[] {};) por un (return arreglo;) para que me
    // devuelva el arreglo.

    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Dentro del segundo ciclo for, la condicion del
    // if el signo es "<" en lugar de ">".
    // Correccion: Se cambio el signo a ">" para que el arreglo se ordene
    // de menor a mayor.

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Dentro del segundo ciclo for y el if se 
    // se encontro varios errores, como la "i" y la "j" estaban mezclados.
    // Correcion: Se realizo el cambio de (int j = 0) por el (int j = i+1),
    // dentro de la condicion del if se cambio (arreglo[j] > arreglo[j+1])
    // por (arreglo[i] > arreglo[j]), tambien dentro del intercambio de los elementos
    // (int temp = arreglo[j]) por (int temp = arreglo[i])/(arreglo[j] = arreglo[j+1])
    // por (arreglo[i] = arreglo[j]) y por ultimo (arreglo[j + 1] = temp) por 
    // (arreglo[j] = temp).

    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {   //j=i+1
                if (arreglo[i] > arreglo[j]) {  //j-i / j
                    // Intercambio de elementos
                    int temp = arreglo[i];  //i
                    arreglo[i] = arreglo[j]; //j-i / j
                    arreglo[j] = temp;  //j
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: En  la clase "seleccionPrimero" no retorna nada
    // Correccion: Agregar un "return arreglo;" para que me de el arreglo.
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Dentro del primer for hay un (i--).
    // Correccion: Se cambio los signos para que funcione el codigo,
    // de (i--) a (i++).
    
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: En las variables del primer ciclo for 
    // (int smallerNumber = arreglo[i];) y (arreglo[indiceMinimo] = smallerNumber;)
    // Correccion: Se realizo el camcio de las posiciones de las variables 
    // de (arreglo[i]) por (arreglo[indiceMinimo]) y de (arreglo[indiceMinimo]) por
    // (arreglo[i]).

    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i > 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: En el posicion de "i" y de "j"
    // Correccion: Se cambio la variable "j" por la de "i" en el primer ciclo for,
    // ademas se cambio la letra "i" por "j" en las variables (int actual = arreglo[j])
    // por (int actual = arreglo[i]) tambien de (arreglo[i + 1] = actual) por 
    // (arreglo[j + 1] = actual;) y por ultimo de (int i = j - 1) por (int j = i - 1)

    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 1; i < arreglo.length; i++) {
            int actual = arreglo[i];

            int j = i - 1;
            for (; j >= 0 && arreglo[j] > actual; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[j + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i > 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
