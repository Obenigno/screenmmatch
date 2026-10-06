import br.com.alura.screenmatch.screenmatach.modelos.Episodio;
import br.com.alura.screenmatch.screenmatach.modelos.Filme;
import br.com.alura.screenmatch.screenmatach.modelos.Serie;
import br.com.alura.screenmatch.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.screenmatch.calculadora.FiltraRecomendacao;

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
        dexter.setTemporadas(8);
        dexter.setEpisodiosPorTemporadas(12);
        dexter.setMinutoPorEpisodio(50);
        System.out.println("Essa serie tem " +  dexter.getDuracaoEmMinutos() + " minutos.");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(210);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(dexter);
        System.out.println(calculadora.getTempoTotal());

        FiltraRecomendacao filtro = new FiltraRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(dexter);
        episodio.setTotalvisualizacoes(300);
        filtro.filtra(episodio);
    }
}