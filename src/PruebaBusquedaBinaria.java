public class PruebaBusquedaBinaria {
    public static void main(String[] args) {
        int [] array = new int[20];
        int min = 1;
        int max = 50;

        //CREA ARREGLO DE NUMEROS ALEATORIOS
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*((max - min) + 1) + min);
        }

        //ORGANIZA LOS ELEMENTOS DE MENOR A MAYOR
        int ultimaPos = array.length-1;
        for (int i = 0; i < ultimaPos; i++) {
            for (int j = 0; j < ultimaPos - i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //IMPRIME EL ARREGLO
        for (int i = 0; i < array.length; i++) {
            System.out.println("ARRAY ["+i+"] = "+array[i]);
        }


    }
}
