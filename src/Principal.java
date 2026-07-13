
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Como treinar seu Dragao";
        meuFilme.anoDeLancamento = 2015;
        meuFilme.duracaoEmMinutos = 110;

        System.out.println("O nome do filme e: " +meuFilme.nome);
        System.out.println("O ano que o filme lancou foi em: " + meuFilme.anoDeLancamento);
        System.out.println("A duracao em minutos do filme e: "+ meuFilme.duracaoEmMinutos);
    }
}