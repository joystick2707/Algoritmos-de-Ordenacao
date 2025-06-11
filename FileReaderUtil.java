import java.io.*;

public class FileReaderUtil {
    public static MyArrayList<Integer> readIntegers(String filePath) throws IOException {
        MyArrayList<Integer> numbers = new MyArrayList<>(10);
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                numbers.adicionar(Integer.parseInt(line.trim()));
            }
        }
        reader.close();
        return numbers;
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
