import java.util.Scanner;

import entidades.ArrayNumeroInteiro;

public class Atividade45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o tamanho N do array que você quer instanciar? ");
        int N = sc.nextInt();
        ArrayNumeroInteiro array = new ArrayNumeroInteiro(N);

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = sc.nextInt();
            array.adicionar(num);
        }
        System.out.println("A média aritmética é: " + array.calculaMedia());

        sc.close();
    }
}
