public class Movie {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacao;


    void exibeFichaTecnica(){
        System.out.printf("Filme: %s", nome);
        System.out.printf("\nAno de lançamento: %d\n", anoDeLancamento);
        if (incluidoNoPlano){
            System.out.println("O filme " + nome + " está incluso no seu plano\n");
        } else {
            System.out.println("Infelizmente o filme " + nome + " não está incluso no seu plano\n");
        }
        System.out.println("Total de avaliações: " + totalDeAvaliacao);
        System.out.printf("Média de avaliações do filme: %.2f", pegaMedia());
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaAvaliacao / totalDeAvaliacao;
    }

}