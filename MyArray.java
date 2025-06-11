public class MyArray {

    public static int[] copiar(int[] original) {
        if (original == null) {
            return null;
        }
        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        return copia;
    }

    public static void imprimir(int[] array) {
        if (array == null) {
            System.out.println("Array nulo");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
