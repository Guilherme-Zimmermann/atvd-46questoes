package entidades;

public class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        diaNascimento = dia;
        mesNascimento = mes;
        anoNascimento = ano;
    }
}
