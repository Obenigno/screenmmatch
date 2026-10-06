package br.com.alura.screenmatch.screenmatch.calculadora;

public class FiltraRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4 ){
            System.out.println("Esta entre os preferidos do momentos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("E muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
