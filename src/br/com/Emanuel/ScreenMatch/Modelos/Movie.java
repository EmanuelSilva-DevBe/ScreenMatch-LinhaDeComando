package br.com.Emanuel.ScreenMatch.Modelos;

public class Movie {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
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

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return somaAvaliacao / totalDeAvaliacao;
    }

}