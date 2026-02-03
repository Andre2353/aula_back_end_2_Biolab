package aula_2;

import java.util.Scanner;

public class EntradaDeDados {
    static void main () {
        Scanner sc = new Scanner(System.in);
        IO.println("digite sua idade");
        int idade = sc.nextInt();
        IO.println("digite o seu nome ");
        String nome = sc.next();
        IO.println("digite seu peso");
        double peso = sc.nextDouble();
        IO.println("digite sua altura");
        double altura = sc.nextDouble();
        System.out.println("sua idade " + idade);
        System.out.println("seu nome " + nome);
        System.out.println("seu peso " + peso);
        System.out.println("seu altura " + altura);
        System.out.println("seu imc " + (peso / (altura * altura)));
    }
}
