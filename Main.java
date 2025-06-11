import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] arquivos = {
                "aleatorio_100.csv", "aleatorio_1000.csv", "aleatorio_10000.csv",
                "crescente_100.csv", "crescente_1000.csv", "crescente_10000.csv",
                "decrescente_100.csv", "decrescente_1000.csv", "decrescente_10000.csv"
        };

        for (String arquivo : arquivos) {
            try {
                int[] dados = FileReaderUtil.readIntegersAsArray(arquivo);

                System.out.println("Arquivo: " + arquivo);

                // Insertion Sort
                int[] copia = MyArray.copiar(dados);
                long inicio = System.nanoTime();
                SortAlgorithms.insertionSort(copia);
                long fim = System.nanoTime();
                System.out.println(new SortResult(arquivo, "Insertion Sort", fim - inicio));

                // Quick Sort
                int[] copia2 = MyArray.copiar(dados);
                inicio = System.nanoTime();
                SortAlgorithms.quickSort(copia2, 0, copia2.length - 1);
                fim = System.nanoTime();
                System.out.println(new SortResult(arquivo, "Quick Sort", fim - inicio));

                System.out.println("------------------------------------");

            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo " + arquivo + ": " + e.getMessage());
            }
        }
    }
}
