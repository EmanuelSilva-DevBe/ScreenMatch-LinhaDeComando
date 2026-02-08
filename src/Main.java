public class Main {
    public static void main(String[] args) {
        Movie filme1 = new Movie();

        filme1.nome = "O poderoso Chefão";
        filme1.anoDeLancamento = 1993;
        filme1.incluidoNoPlano = true;


        filme1.avalia(9);
        filme1.avalia(5);
        filme1.avalia(8);
        filme1.exibeFichaTecnica();


    }
}
