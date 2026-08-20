package br.com.alura.screenmatach.modelos;

public class Serie extends Titulo{
    private int temporada;
    private int episodiosPorTemporadas;
    private boolean ativa;
    private int minutoPorEpisodio;

    public void setTemporada(int temporada) {
        this.temporada = temporada;
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
}
