package br.com.alura.screenmatch.screenmatach.modelos;

import br.com.alura.screenmatch.screenmatch.calculadora.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalvisualizacoes;

    public int getTotalvisualizacoes() {
        return totalvisualizacoes;
    }

    public void setTotalvisualizacoes(int totalvisualizacoes) {
        this.totalvisualizacoes = totalvisualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalvisualizacoes >= 300){
          return 4;
        }
        else{
            return  2;
        }
    }
}
