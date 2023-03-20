import java.util.Scanner;

/**
 * Exercicico
 */
public class Exercicico {
    Scanner sc = new Scanner(System.in);

 public void exercicico1() {
//     1. Escreva um programa para ler 2 valores (considere que não serão informados
// valores iguais) e escrever o maior deles.

      System.out.println("Digite o primeiro número");
      double N1 = sc.nextDouble();
      System.out.println("Digite o segundo número");
      double N2 = sc.nextDouble();

      if (N1>N2) {
        System.out.println("O maior valor é " + N1);
      } else {
        System.out.println("O maior valor é " + N2);
      }
 }
      public void exercicio2() {
    //     2. Escreva um programa para ler o ano de nascimento de uma pessoa e
    //     escrever uma mensagem que diga se ela podera ou não votar este ano (nãoé
    //     necessárioconsiderar o mês em que ela nasceu).
    // 

      System.out.println("Digite o ano de nascimento");
      int Nasc = sc.nextInt();

      if (Nasc>2007) {
        System.out.println("Volte na proxima votação");
      } else {
        System.out.println("Vote com consciencia");
      }
}
     public void exercicio3() {
//         6. Tendo como entrada a altura e o sexo (codificado da seguinte forma:
// 1:feminino; 2:masculino) de uma pessoa, construa um programa que calcule e
// imprima seu peso ideal, utilizando as seguintes.
// Fórmulas:
// - para homens: (72.7*Altura)– 58;
// - para mulheres: (62.1*Altura)– 44.7;

      System.out.println("Qual a sua altura?");
      double Alt = sc.nextDouble();

      System.out.println("Qual o seu sexo ? (1- Feminino 2- Masculino)");
      double Sex = sc.nextDouble();

      if (Sex==1) {
        System.out.println("Seu imc é de " + (62.1*Alt -44.7));
      } else {
        System.out.println("Seu imc é de " + ( 72.7*Alt -58));
      }
     }
     public void exercicio4() {

      System.out.println("Digite um número (Podendo ser positivo e negativo)");
      int Nu = sc.nextInt();
      if (Nu>=1) {
        System.out.println("Seu número é positivo ");
      } else {
        System.out.println("Seu núemero é negativo ");
      }

     }
     public void exercicio5() {

      System.out.println("Digite o número do item que você precisa: 1-Arroz por 3,00 2- Feijão por 2,00 3- Salsicha 5,00");
      int Produ = sc.nextInt();

      if (Produ==2) {
        System.out.println(" Sua compra ficou no total de 2,00. Obrigado por comprar conosco!!");
      } else {
        System.out.println("Infeliz não temos disponivel no momento");
      }
     }
}