
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Como treinar seu Dragao";
        meuFilme.anoDeLancamento = 2015;
        meuFilme.duracaoEmMinutos = 110;

        meuFilme.exibeFichaTecnica();


        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(7);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}