import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Escreva um programa que imprima os números de 1 a 10
            // for(int i = 1; i <= 10; i++){
            //     System.out.print(i+" ");
            // }

        // 2. Crie um programa que imprima os números pares de 1 a 20.
            // for(int i=1; i<=20; i++) {
            //     if (i%2 == 0) {
            //         System.out.print(i+" ");
            //     }
            // }

        // 3. Faça um programa que calcule a soma dos números ímpares de 1 a 50.
            // for(int i=1; i<=50; i++) {
            //     if(i%2 == 1) {
            //         System.out.print(i+" ");
            //     }
            // }

        // 4. Crie um programa que leia 5 números do usuário e imprima o maior deles.
            // int maior = 0;
            // for(int i=1; i<=5; i++) {
            //     System.out.print("Insira o " + i + "º valor: ");
            //     int n = sc.nextInt();

            //     if (n > maior) {
            //         maior = n;
            //     }
            // }
            // System.out.println("O maior valor inserido foi " + maior);

        // 5. Escreva um programa que leia 10 números do usuário e imprima a média deles.
            // Double media = 0.0;
            // for (int i=1; i<=10; i++) {
            //     System.out.print("Insira o " + i + "º valor: ");
            //     int n = sc.nextInt();

            //     media += n;
            // }
            // media /= 10;
            // System.out.printf("A média dos valores inseridos é de: %.2f", media);

        // 7. Crie um programa que leia um array de números e, em seguida, imprima a soma dos números lidos.

            // List<Integer> list = new ArrayList<>();
            // int soma = 0;
            // int n;

            // do {
            //     System.out.print("Digite um número: (digite 0 para sair do programa) ");
            //     n = sc.nextInt();
                
            //     if (n != 0) {
            //         list.add(n);
            //     }

            // } while (n != 0);

            // for (Integer i : list) {
            //     soma += i;
            // }
            
            // System.out.println("A soma dos valores inseridos é de: " + soma);

		// 8. Implemente um programa que leia um número inteiro do usuário e imprima os seus divisores.

            // System.out.print("Digite um número inteiro: ");
            // int n = sc.nextInt();
            
            // System.out.print("Os divisores de " + n + " são: ");
            // for (int i = 1; i <= n; i++) {
            // 	    if(n % i ==0) {
            // 	    	System.out.print(i + " ");
            //         }
            // 	}
            
		// 9. Faça um programa que leia um array de números do usuário até que o usuário insira 0.
		// Em seguida, imprima a quantidade de números lidos.

            // List<Integer> list = new ArrayList<>();
            // int cont = 0;
            // int n;

            // do {
            // 	System.out.print("Digite um número: (digite 0 para sair do programa) ");
            // 	n = sc.nextInt();

            // 	if (n != 0) {
            // 		list.add(n);
            // 		cont++;
            // 	}
            // } while (n != 0);
            // System.out.println();
            // System.out.println("Quantidade de números lidos: " + cont);

	// 	10. Escreva um programa que leia um array de números do usuário até que o usuário insira
	// 	um número repetido. Em seguida, imprima a quantidade de números lidos antes da
	// 	repetição.
		
        // Set<Integer> list = new HashSet<>();
        // int cont = 0;

        // while (true) {
        //     System.out.print("Insira um número: ");
        //     int n = sc.nextInt();

        //     if (list.contains(n)) {
        //         break;
        //     }
        //     list.add(n);
        //     cont++;
        // }
        // System.out.println("Você inseriu um número duplicado, programa encerrado!");
        // System.out.println("A quantidade de números inseridos foi de: " + cont);

        // 11. Crie um programa que leia 10 números do usuário e imprima o menor deles.
            // int menor = 0;

            // System.out.println("Insira 10 números!");
            // for (int i = 1; i <= 10; i++) {
            //     System.out.printf("Insira o %dº número: ", i);
            //     int n = sc.nextInt();

            //     if (i == 1) {
            //         menor = n;
            //     } 
            //     else {
            //         if (n < menor) {
            //             menor = n;
            //         }
            //     }
            // }
            // System.out.println("O menor número inserido foi: " + menor);


        // 12. Faça um programa que leia um array de números do usuário até que o usuário insira um
        // número negativo. Em seguida, imprima a média dos números lidos.

            // ArrayList<Double> list = new ArrayList<>();
            
            // while (true) {
            //     System.out.print("Insira um número positivo: ");
            //     double n = sc.nextInt();

            //     if (n < 0) {
            //         break;
            //     }
            //     list.add(n);
            // }

            // Double soma = 0.0;

            // for (Double i : list){
            //     soma += i;
            // }
            // System.out.println("Você inseriu um número negativo, programa encerrado!");
            // System.out.printf("A média dos valores inseridos foi: %.2f", soma/list.size());

        // 13. Implemente um programa que leia um array de números do usuário até que o usuário
        // insira 999. Em seguida, imprima a soma dos números pares e a soma dos números ímpares
        // lidos.

            // int pares = 0;
            // int impares = 0;

            // while (true) {
            //     System.out.print("Insira um número: (999 para sair do programa) ");
            //     int n = sc.nextInt();

            //     if (n == 999) {
            //         break;
            //     }

            //     if (n % 2 == 0){
            //         pares += n;
            //     }
            //     else {
            //         impares += n;
            //     }
            // }

            // System.out.println("A soma dos valores pares é de: " + pares + " e dos valores impares: " + impares);

        // 14. Escreva um programa que leia 5 nomes do usuário e os imprima em ordem alfabética.

            // List<String> list = new ArrayList<>();
            
            // for (int i=1; i<=5; i++) {
            //     System.out.printf("Insira o %dº nome: ", i);
            //     list.add(sc.nextLine());
            // }

            // Collections.sort(list);
            // System.out.println("Aqui está os 5 nomes em ordem alfabética: ");
            // list.forEach(System.out::println);
            
        // 15. Crie um programa que leia um array de números do usuário até que o usuário insira um
        // número que seja maior que o anterior.
            // ArrayList<Integer> list = new ArrayList<>();
            // int n;

            // System.out.println("Digite um valor menor que o último para sair do programa");
            // while (true) {
            //     System.out.print("Insira um número: ");
            //     n = sc.nextInt();

            //     if (!list.isEmpty() && list.get(list.size() -1) > n) {
            //         break;
            //     }

            //     list.add(n);
            // }
            // System.out.println("Fim!");

        // 16. Faça um programa que leia um array de números do usuário até que o usuário insira um
        // número igual ao primeiro número lido.

            // ArrayList<Integer> list = new ArrayList<>();
            // int n;
        
            // System.out.println("Digite um número igual ao primeiro para sair do programa!");
            // while (true){ 
            //     System.out.print("Insira um número: ");
            //     n = sc.nextInt();
                
            //     if (!list.isEmpty() && list.get(0).equals(n)) {
            //         break;
            //     }

            //     list.add(n);
            // }
            // System.out.println("Fim");

        // 17. Implemente um programa que leia um array de números do usuário até que o usuário
        // insira um número primo.

            // System.out.println("Digite um número primo para sair do programa!");
            // while (true) {
            //     System.out.print("Insira um número: ");
            //     int n = sc.nextInt();

            //     if (isPrime(n)) {
            //         System.out.println(n + " é um número primo.");
            //         break;
            //     }
            // }

        // 18. Escreva um programa que leia um array de números do usuário até que o usuário insira
        // um número que seja a soma dos dois números anteriores.

            // ArrayList<Integer> list = new ArrayList<>();

            // System.out.println("Digite um número que seja a soma dos dois números anteriores para sair do programa.");
            // while (true) {
            //     System.out.print("Insira um número: ");
            //     int n = sc.nextInt();

            //     if (list.size() >= 2 && n == list.get(list.size() - 1) + list.get(list.size() - 2)) {
            //         System.out.println(n + " é a soma dos dois números anteriores.");
            //         break;
            //     }

            //     list.add(n);
            // }
            
        // 19. Crie um programa que leia um array de números do usuário e encontre o maior número
        // e sua posição no array

            // ArrayList<Integer> list = new ArrayList<>();

            // while (sc.hasNextInt()) {
            //     System.out.print("Insira um valor: ");
            //     list.add(sc.nextInt());
            // }

            // int maior = list.get(0);
            // int pos = 0;

            // for (int i = 1; i < list.size(); i++) {
            //     if (list.get(i) > maior) {
            //         maior = list.get(i);
            //         pos = i;
            //     }
            // }
            // System.out.println("O maior número é " + maior + " e sua posição no array é " + pos);

        // 20. Faça um programa que leia um array de números do usuário e encontre o menor
        // número e sua posição no array.

            // ArrayList<Integer> list = new ArrayList<>();
            // System.out.println("Insira números ou digite 'FIM' para sair do programa!");

            // while (sc.hasNextInt()) {
            //     list.add(sc.nextInt());
            // }

            // int menor = list.get(0);
            // int pos = 0;
            
            // for (int i = 1; i < list.size(); i++) {
            //     if (list.get(i) < menor) {
            //         menor = list.get(i);
            //         pos = i;
            //     }
            // }
            // System.out.println("O menor número é " + menor + " e sua posição no array é " + pos);

        // 21. Implemente um programa que leia um array de números do usuário e encontre a média
        // dos números e quantos números estão acima da média.

            // ArrayList<Integer> list = new ArrayList<>();
            // System.out.println("Insira números ou digite 'FIM' para sair do programa!");

            // while (sc.hasNextInt()) {
            //     list.add(sc.nextInt());
            // }

            // double sum = 0;

            // for (int n : list) {
            //     sum += n;
            // }
            
            // double media = sum / list.size();
            // int cont = 0;
            
            // for (int n : list) {
            //     if (n > media) {
            //         cont++;
            //     }
            // }
            // System.out.println("A média dos números é " + media + " e " + cont + " números estão acima da média.");

        // 22. Escreva um programa que leia um array de números do usuário e encontre o segundo
        // maior número no array.

            // ArrayList<Integer> list = new ArrayList<>();
            // System.out.println("Insira números ou digite 'FIM' para sair do programa!");

            // while (sc.hasNextInt()) {
            //     list.add(sc.nextInt());
            // }
            
            // Collections.sort(list);
            // int sMaior = list.get(list.size() - 2);

            // System.out.println("O segundo maior número é " + sMaior);

        // 23. Crie um programa que leia um array de nomes do usuário até que o usuário insira "FIM".
        // Em seguida, imprima os nomes em ordem inversa

            // ArrayList<String> list = new ArrayList<>();
            // System.out.println("Insira números ou digite 'FIM' para sair do programa!");

            // while (true) {
            //     System.out.print("Insira um nome: ");
            //     String nome = sc.nextLine();

            //     if (nome.equals("FIM") || nome.equals("fim")) {
            //         break;
            //     }

            //     list.add(nome);
            // }
            
            // Collections.reverse(list);
            // System.out.println("Nomes em ordem inversa:");
            // for (String nome : list) {
            //     System.out.println(nome);
            // }
        
        // 24. Faça um programa que leia um array de números do usuário até que o usuário insira um
        // número negativo. Em seguida, imprima a média dos números lidos e quantos números
        // foram pares.

            // ArrayList<Integer> list = new ArrayList<>();
            // int cont = 0;
            // System.out.println("Insira números e digite um número negativo quando terminar! ");

            // while (true) {
            //     int n = sc.nextInt();
            //     if (n < 0) {
            //         break;
            //     }

            //     list.add(n);
            //     if (n % 2 == 0) {
            //         cont++;
            //     }
            // }
            // double sum = 0;
            // for (int n : list) {
            //     sum += n;
            // }

            // double media = sum / list.size();
            // System.out.println("A média dos números é " + media + " e " + cont + " números foram pares.");

        // 25. Implemente um programa que leia um array de números do usuário até que o usuário
        // insira um número que seja a média dos números lidos até aquele ponto.
                
            // ArrayList<Integer> list = new ArrayList<>();
            // double sum = 0;

            // System.out.println("Insira um número que seja a média dos números lidos até aquele ponto para sair do programa.");
            // while (true) {
            //     System.out.println("Insira um número:");
            //     int num = sc.nextInt();

            //     if (list.size() > 0 && num == sum / list.size()) {
            //         System.out.println(num + " é a média dos números lidos até agora.");
            //         break;
            //     }
                
            //     list.add(num);
            //     sum += num;
            // }

        // 26. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        // mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        // (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

            // System.out.println("Insira a idade em anos, meses e dias (ex: 3 anos, 2 meses e 15 dias):");
            // String data = sc.nextLine();
            // String[] aux = data.split(" ");
            // int ano = Integer.parseInt(aux[0]);
            // int mes = Integer.parseInt(aux[2]);
            // int dia = Integer.parseInt(aux[5]);
            // int total = ano * 365 + mes * 30 + dia;
            // System.out.println("A idade expressa em dias é " + total);

        // 27. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        // números 4, 5 e 6. A soma das duas médias. A média das médias.

            // double media1 = (8.0 + 9.0 + 7.0) / 3;
            // double media2 = (4.0 + 5.0 + 6.0) / 3;
            // double sum = media1 + media2;
            // double mediaDasMedias = sum / 2;
            // System.out.println("A média de 8, 9 e 7 é: " + media1);
            // System.out.println("A média de 4, 5 e 6 é: " + media2);
            // System.out.println("A soma das duas médias é: " + sum);
            // System.out.println("A média das médias é: " + mediaDasMedias);
        
        // 28. Informar um saldo e imprimir o saldo com reajuste de 1%

            // System.out.print("Insira o saldo: ");
            // double saldo = sc.nextDouble();
            // double ajuste = saldo * 1.01;

            // System.out.printf("O saldo com reajuste de 1% é %.2f", ajuste);
            
        // 29. Escrever um algoritmo que lê:
        // - a porcentagem do IPI a ser acrescido no valor das peças
        // - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        // - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        // O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        // Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

            // System.out.println("Insira a porcentagem do IPI a ser acrescido no valor das peças:");
            // double ipi = sc.nextDouble();

            // System.out.print("Insira o código da peça 1: ");
            // int c1 = sc.nextInt();

            // System.out.print("Valor unitário da peça 1: ");
            // double v1 = sc.nextDouble();

            // System.out.print("Quantidade de peças 1: ");
            // int q1 = sc.nextInt();

            // System.out.print("Insira o código da peça 2: ");
            // int c2 = sc.nextInt();

            // System.out.print("Valor unitário da peça 2: ");
            // double v2 = sc.nextDouble();

            // System.out.print("Quantidade de peças 2: ");
            // int q2 = sc.nextInt();

            // double total = (v1 * q1 + v2 * q2) * (ipi / 100 + 1);
            // System.out.println("O valor total a ser pago é " + total);

        // 30. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        //     calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
        //     (1SM=R$1.500,00)

            // double salarioMinimo = 1500.0;

            // System.out.print("Insira o seu salário: ");
            // double salario = sc.nextDouble();

            // double quantidade = salario / salarioMinimo;

            // System.out.printf("A pessoa recebe %d salários minimos", Math.round(quantidade));

        // 31. Desenvolva um algoritmo que leia um número inteiro e imprima o seu
        // antecessor e seu sucessor

            // System.out.printf("Insira um valor para mostrar o seu antecessor e o seu sucessor: ");
            // int n = sc.nextInt();
            
            // System.out.println("Seu antecessor: " + (n-1));
            // System.out.println("Seu sucessor: " + (n+1));

        // 32. Tabuada: Escreva um programa em Java que exiba a tabuada de multiplicação do
        // número inteiro 1 até o número
        // inteiro 10.
            
            // for(int i = 1; i <= 10; i++) {
            //     for(int j = 1; j<= 10; j++) {
            //         System.out.println(i + " x " + j + " = " + i*j);
            //     }
            // }
        
        // 33. Troco: Fazer um programa em Java que implemente a solução de troco em uma
        // operação de venda/compra.

            // System.out.print("Insira o valor da venda: R$");
            // double venda = sc.nextDouble();

            // System.out.print("Insira o valor da compra: R$");
            // double compra = sc.nextDouble();

            // double troco = compra - venda;

            // if(troco > 0){
            //    System.out.printf("O valor do troco é de: R$%.2f", troco); 
            // }
            // else {
            //     System.out.println("Não tem troco");
            // }

        // 34. João está faturando uma nota fiscal e nesta está destacado os impostos federais ICMS, IPI, PIS e COFINS.
        // ICMS: 17,5 %
        // IPI: 7%
        // PIS: 3,75%
        // COFINS: 4%
        // O valor da base de cálculo da nota fiscal é R$1.372,22.
        // O valor total da nota fiscal inclui o imposto de ICMS, já os outros impostos são destacados
        // de forma individual.
        // Solução: Implemente um programa em Java para calcular e retornar o valor total da nota
        // fiscal e também o valor individual calculado de cada imposto.

            // double valorBase = 1372.22;

            // double valorIMCS = valorBase * 0.175;
            // double valorIPI = valorBase * 0.07;
            // double valorPIS = valorBase * 0.0375;
            // double valorCOFINS = valorBase * 0.04;

            // double valorTotal = valorBase + valorIMCS + valorIPI + valorPIS + valorCOFINS;

            // System.out.printf("Valor total da nota fiscal: R$%.2f%n", valorTotal);
            // System.out.printf("Valor do ICMS: R$%.2f%n", valorIMCS);
            // System.out.printf("Valor do IPI: R$%.2f%n", valorIPI);
            // System.out.printf("Valor do PIS: R$%.2f%n", valorPIS);
            // System.out.printf("Valor do COFINS: R$%.2f%n", valorCOFINS);
        
        // 35. Escreva um programa para somar dois números binários.

            // System.out.print("Insira o primeiro número binário: ");
            // String b1 = sc.nextLine();
            // System.out.print("Insira o segundo número binário: ");
            // String b2 = sc.nextLine();

            // int n1 = Integer.parseInt(b1, 2);
            // int n2 = Integer.parseInt(b2, 2);
            
            // int sum = n1 + n2; 
            // System.out.println("A soma entre os dois valores é de: " + Integer.toBinaryString(sum));

        // 36. Escreva um programa para multiplicar dois números binários.

            // System.out.print("Digite o primeiro número binário: ");
            // String b1 = sc.nextLine();
            // System.out.print("Digite o segundo número binário: ");
            // String b2 = sc.nextLine(); 

            // int n1 = Integer.parseInt(b1, 2);
            // int n2 = Integer.parseInt(b2, 2);

            // int product = n1 * n2;
            // System.out.println("O produto é: " + Integer.toBinaryString(product));
            
        // 37. Escreva um programa para converter um número decimal em um número binário.

            // System.out.print("Digite um número decimal: ");
            // int n = sc.nextInt();
            // System.out.println("O número binário é: " + Integer.toBinaryString(n));

        // 38. Escreva um programa para converter um número decimal em um número hexadecimal.

            // System.out.print("Digite um número decimal: ");
            // int numeroDecimal = sc.nextInt();
            // String numeroHexadecimal = Integer.toHexString(numeroDecimal);
            // System.out.println("O número hexadecimal correspondente é: " + numeroHexadecimal.toUpperCase());


        // 39. Escreva um programa para converter um número decimal em um número octal.

            // System.out.print("Digite um número decimal: ");
            // int numeroDecimal = sc.nextInt();
            // String numeroOctal = Integer.toOctalString(numeroDecimal);
            // System.out.println("O número octal correspondente é: " + numeroOctal);

        // 40. Escreva um programa Java para converter um número binário em um número decimal.

            // System.out.print("Digite um número binário: ");
            // String numeroBinario = sc.nextLine();
            // int numeroDecimal = Integer.parseInt(numeroBinario, 2);
            // System.out.println("O número decimal correspondente é: " + numeroDecimal);

        // 41. Escreva um programa Java para exibir a hora do sistema.

            // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            // LocalDateTime data = LocalDateTime.now();

            // System.out.println("A data do sistema é: " + data.format(dtf));
            
        // 42. Fazer uma classe Sorteio para:
        // ● Sortear um número de 0 a 1000 (dica: usar Math.random())
        // ● Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou menor do que o número sorteado.
        // ● Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em quantas tentativas ele acertou. 

            // int sorteio = (int) (Math.random() * 1001);
            // int tentativas = 0;
            // int n;

            // do {
            //     System.out.print("Digite um número entre 0 e 1000: ");
            //     n = sc.nextInt();
            //     tentativas++;

            //     if (sorteio > n) {
            //         System.out.println("O número sorteado é maior!");
            //     }
            //     if (sorteio < n) {
            //         System.out.println("O número sorteado é menor!");
            //     }
            // } while (sorteio != n);

            // System.out.println("Parabéns! você acertou, o número sorteado era: " + sorteio + " a quantidade de tentativas foi: " + tentativas);

        // 43. Faça um programa que receba um nome completo na forma de uma String e
        // mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
        // menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
        // Almeida Prado. Abreviatura: P. J. de A. P.

            // System.out.print("Insira o seu nome completo: ");
            // String nome = sc.nextLine();

            // String[] divisao = nome.split(" ");
            // for (int i = 0; i < divisao.length; i++) {
            //     if (divisao[i].length() > 2) {
            //         System.out.print(divisao[i].toUpperCase().charAt(0) + ". ");
            //     }
            //     else {
            //         System.out.print(divisao[i] + " ");
            //     }
            // }

        // 44. Um dos sistemas de encriptação mais antigos é atribuído a Júlio César: se uma
        // letra a ser encriptada é a letra de número N do alfabeto, substitua-a com a letra
        // (N+K), onde K é um número inteiro constante (César utilizava K = 3).
        // Usualmente consideramos o espaço como zero e todos os cálculos são
        // realizados com módulo-27. Dessa forma, para K = 1 a mensagem “Ataque ao
        // amanhecer” se torna “bubrfabpabnboifdfs”. Faça um programa que receba como
        // entrada uma mensagem e um valor de J e retorne a mensagem criptografada
        // pelo código de César.
            
            // System.out.print("Insira uma mensagem para criptografrar: ");
            // String msg = sc.nextLine().toLowerCase();

            // int k = 1;

            // System.out.println(criptografar(msg, k));

            sc.close();
    }

    // Método para ver se o número é primo
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    

    // Método criptografia cifra de César
    public static String criptografar(String msg, int k) {
        String alfabeto = " abcdefghijklmnopqrstuvwxyz";
        StringBuilder msgCriptografada = new StringBuilder();

        for (char caractere : msg.toCharArray()) {
            int posicaoOriginal = alfabeto.indexOf(caractere);
            int posicaoCriptografada = posicaoOriginal + k;
            char caractereCriptografado = alfabeto.charAt(posicaoCriptografada);
            msgCriptografada.append(caractereCriptografado);
        }
        return msgCriptografada.toString();
    }
}
