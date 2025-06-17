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
 // Método principal do Quick Sort (versão recursiva)
    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            // Encontra a posição do pivô após a partição
            int p = particionar(arr, inicio, fim);
            // Ordena recursivamente os elementos antes e depois do pivô
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fim);
        }
    }
// Método auxiliar para particionar o array (usado no Quick Sort)
    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim]; // Define o pivô como o último elemento
        int i = inicio - 1; // Define o pivô como o último elemento
        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivo) {
                i++;
                // Troca arr[i] com arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Coloca o pivô na posição correta
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        return i + 1;
    }
    // IMPLEMENTAÇÃO DO BUBBLE SORT
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;
        // Loop externo controla o número de passadas
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            // Loop interno faz as comparações e trocas de pares adjacentes
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                     // Troca os elementos
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

