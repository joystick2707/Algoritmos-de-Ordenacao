public class SortResult {
    private final String nomeArquivo;
    private final String algoritmo;
    private final long tempoExecucao;

    public SortResult(String nomeArquivo, String algoritmo, long tempoExecucao) {
        this.nomeArquivo = nomeArquivo;
        this.algoritmo = algoritmo;
        this.tempoExecucao = tempoExecucao;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %d ns", nomeArquivo, algoritmo, tempoExecucao);
    }
}
