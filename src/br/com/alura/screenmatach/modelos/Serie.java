package br.com.alura.screenmatach.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private boolean ativa;
    private int minutoPorEpisodio;

    public void setTemporadas(int temporada) {
        this.temporadas = temporada;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * minutoPorEpisodio * episodiosPorTemporadas;
    }
}
