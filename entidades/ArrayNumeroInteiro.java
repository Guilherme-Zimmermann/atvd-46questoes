package entidades;

public class ArrayNumeroInteiro {
    
    private int[] array;
    private int atual = 0;
    private int max;

    public ArrayNumeroInteiro(int tamanho) {
        this.array = new int[tamanho];
        this.max = tamanho;
    }

    public boolean adicionar(int n) {
        if (atual < max) {
            array[atual] = n;
            atual++;
            return true;
        } else {
            return false;
        }
    }

    public double calculaMedia() {
        int soma = 0;
        for (int i = 0; i < atual; i++) {
            soma += array[i];
        }
        return (double) soma / atual;
    }
}
