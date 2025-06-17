import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caminhoPasta = "C:/Users/miche/Downloads/Algoritmos-de-Ordenacao-main/Algoritmos-de-Ordenacao-main/ArquivosCsv/";
   
        // Lista com os nomes dos arquivos CSV que serão processados
        String[] arquivos = {
                "aleatorio_100.csv", "aleatorio_1000.csv", "aleatorio_10000.csv",
                "crescente_100.csv", "crescente_1000.csv", "crescente_10000.csv",
                "decrescente_100.csv", "decrescente_1000.csv", "decrescente_10000.csv"
        };
 // Laço que vai ler e ordenar os dados de cada arquivo, um por vez
        for (String arquivo : arquivos) {
            try {
                 // Lê os dados do arquivo e armazena em um array de inteiros
                int[] dados = FileReaderUtil.readIntegersAsArray(caminhoPasta + arquivo);

                System.out.println("Arquivo: " + arquivo); //Exibe qual arquivo está sendo processado

                // Insertion Sort
                int[] copia = MyArray.copiar(dados); //Faz uma cópia dos dados 
                long inicio = System.nanoTime();
                SortAlgorithms.insertionSort(copia); //Chama o método que ordena o array usando o Insertion Sort
                long fim = System.nanoTime();
                System.out.println(new SortResult(arquivo, "Insertion Sort", fim - inicio));

                // Quick Sort
                int[] copia2 = MyArray.copiar(dados);
                inicio = System.nanoTime(); 
                SortAlgorithms.quickSort(copia2, 0, copia2.length - 1); //O array, O índice inicial 0 e índice final (ulti posição do array) 
                fim = System.nanoTime();
                System.out.println(new SortResult(arquivo, "Quick Sort", fim - inicio));

                // Bubble Sort
                int[] copia3 = MyArray.copiar(dados);
                inicio = System.nanoTime();
                SortAlgorithms.bubbleSort(copia3);
                fim = System.nanoTime();
                System.out.println(new SortResult(arquivo, "Bubble Sort", fim - inicio));


                System.out.println("------------------------------------");

            } catch (IOException e) {
                // Caso ocorra algum erro na leitura do arquivo, exibe uma mensagem de err
                System.out.println("Erro ao ler o arquivo " + arquivo + ": " + e.getMessage());
            }
        }
    }
}
