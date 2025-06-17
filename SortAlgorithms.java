public class SortAlgorithms {
// Método para ordenar um array usando o algoritmo Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int chave = arr[i]; // Elemento que será inserido na posição correta
            int j = i - 1;
            // Move os elementos maiores que a chave uma posição para frente
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Insere a chave na posição correta
            arr[j + 1] = chave;
        }
    }

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(arr, inicio, fim);
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fim);
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        return i + 1;
    }
    // IMPLEMENTAÇÃO DO BUBBLE SORT
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se não teve nenhuma troca na passada, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    }
}

