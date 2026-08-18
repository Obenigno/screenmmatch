package br.com.alura.screenmatach.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("O nome do filme é: "+ nome);
        System.out.println("Meu filme foi lançado no dia: "+anoDeLancamento+ " e tem: " + duracaoEmMinutos + " minutos");
    }
    public void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double pegaMedia(){
        return
                somaDasAvaliacoes/ totalDeAvaliacoes;
    }
}
