public class SortAlgorithms {
// Método para ordenar um array usando o algoritmo Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length; //Pega o tamanho do array
        for (int i = 1; i < n; ++i) { // Começa a partir do segundo elemento (posição 1) até o final
            int chave = arr[i]; // Guarda o valor atual (o que vamos posicionar)
            int j = i - 1; // Começa a comparar com os elementos anteriores
            while (j >= 0 && arr[j] > chave) {  // Enquanto o valor anterior for maior, vai empurrando os elementos pra frente
                arr[j + 1] = arr[j]; // Faz o "shift" (move os valores)
                j = j - 1;  	
            }
            // Quando achar o lugar certo, coloca a "chave"
            arr[j + 1] = chave;
        }
    }
    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) { //Condição de parada da recursão
            int p = particionar(arr, inicio, fim); // 	Divide o array com base no pivô
            quickSort(arr, inicio, p - 1); // Ordena a parte esquerda
            quickSort(arr, p + 1, fim); // Ordena a parte direita
        }
    }
// Método auxiliar para particionar o array (usado no Quick Sort)
    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim]; // Escolhe o pivô (último elemento do intervalo)
        int i = inicio - 1; 
        for (int j = inicio; j < fim; j++) { //Percorre o intervalo, trazendo os menores que o pivô pra esquerda
            if (arr[j] < pivo) {
                i++;
                // Vai trocando os elementos de lugar
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
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean trocou;
        for (int i = 0; i < n - 1; i++) { // 	Faz várias passadas pelo array
            trocou = false; //Flag para ver se teve alguma troca nesta passada
            // Percorre o array comparando pares de elementos
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Se os dois estão fora de ordem, troca eles de lugar
                     // Troca os elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true; //	Marca que houve pelo menos uma troca
                }
            }
            // Se não teve nenhuma troca na passada, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    }
}

