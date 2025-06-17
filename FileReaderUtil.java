import java.io.*;
// Classe utilitária para leitura de inteiros a partir de um arquivo
public class FileReaderUtil {
    // Método para ler inteiros de um arquivo e retornar uma lista do tipo MyArrayList<Integer>
    public static MyArrayList<Integer> readIntegers(String filePath) throws IOException {
        MyArrayList<Integer> numeros = new MyArrayList<>(10);
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        // Pula a primeira linha (cabeçalho)
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                numeros.adicionar(Integer.parseInt(line));
            }
        }
        reader.close();
        return numeros;
    }


    public static int[] readIntegersAsArray(String filePath) throws IOException {
        MyArrayList<Integer> list = readIntegers(filePath);
        int[] resultado = new int[list.tamanho()];
        for (int i = 0; i < list.tamanho(); i++) {
            resultado[i] = list.pegar(i);
        }
        return resultado;
    }
}
