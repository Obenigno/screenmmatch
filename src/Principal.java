import br.com.alura.screenmatach.modelos.Filme;
import br.com.alura.screenmatach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        double media = meuFilme.pegaMedia();
        meuFilme.setNome("Como treinar seu Dragao");
        meuFilme.setAnoDeLancamento(2015);
        meuFilme.setDuracaoEmMinutos(110);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(7);
        System.out.println("O numero total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie dexter = new Serie();
        dexter.setNome("Dexter");
        dexter.setAnoDeLancamento(2006);
        dexter.setDuracaoEmMinutos(5280);
        dexter.exibeFichaTecnica();

    }
}