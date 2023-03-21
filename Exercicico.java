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

// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 
     public void exercicio6(){

     System.out.println("Digite um número");
     int num = sc.nextInt();
     if(num>=10){
      System.out.println("É MAIOR QUE 10!");
     }
     else{
      System.out.println("NÃO É MAIOR QUE 10!");
     }

     }

    //  Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 2.500,00 
    //  mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total. 

     public void exercicio7() {
      System.out.println("Digite o seu salário para sabermos quanto sera sua comissão este mês");
      int salário = sc.nextInt();
      if (salário>2500) {
        System.out.println("Você receberá 5% de comissão " + (salário*5/100)+salário);
      } else {
        System.out.println("Você receberá 3% de comissão " + ((salário*3/100)+salário));
      }
     }

// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual 
// (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', 
// senão escrever a mensagem 'Saldo Negativo'.

    public void exercicio8() {
      System.out.println("Insira o valor de 1 e 2 existente em sua conta. (1- debito 2- credito)");
      double debito = sc.nextDouble();
      double credito= sc.nextDouble();
      System.out.println("Muito obrigada agora vamos somar para você!");
      double saldoA;
      double saldo;

      if (debito>=0) {
        System.out.println(" Seu saldo é Positivo " + (saldoA = - debito + credito));
      } else {
        System.out.println(" Seu saldo é Negativo");
      }
    }

    // Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
    public void exercicio9() {
      System.out.println("Insira tres valores quaisquer !");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (a>b && a>c) {
        System.out.println("Este foi maior valor digitado = " + (a));
      } 
      if (b>a && b>c ){
        System.out.println("Este foi maior valor digitado = " + (b));
      }
      else {
        System.out.println("Este foi maior valor digitado no momento = " + (c));
      }
    }
    
}
