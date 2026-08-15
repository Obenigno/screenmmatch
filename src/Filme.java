public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("O nome do filme é: "+ nome);
        System.out.println("Meu filme foi lançado no dia: "+anoDeLancamento+ " e tem: " + duracaoEmMinutos + " minutos");

    }
    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return
                somaDasAvaliacoes/ totalDeAvaliacoes;
    }
}
