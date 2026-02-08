import br.com.Emanuel.ScreenMatch.Modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie filme1 = new Movie();

        filme1.setNome("O poderoso Chefão");
        filme1.setAnoDeLancamento(1993);
        filme1.setIncluidoNoPlano(true);


        filme1.avalia(9);
        filme1.avalia(5);
        filme1.avalia(8);
        filme1.exibeFichaTecnica();


    }
}
