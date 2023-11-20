import entidades.Pessoa;

public class Atividade46 {
    public static void main(String[] args) {

        Pessoa einstein = new Pessoa();
        einstein.ajustaDataDeNascimento(14, 3, 1879);
        einstein.calculaIdade(20, 11, 2023);
        System.out.println("Se estivesse vivo, Einstein teria " + einstein.informaIdade() + " anos.");

        Pessoa newton = new Pessoa();
        newton.ajustaDataDeNascimento(4, 1, 1643);
        newton.calculaIdade(20, 11, 2023);
        System.out.println("Se estivesse vivo, Newton teria " + newton.informaIdade() + " anos.");
    }
}
