package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array {//
  static void main() {
//
//        List<String> nomes = new ArrayList();
//
//        nomes.add("andre");
//        nomes.add("macaco");
//        nomes.add("monark");
//
//        IO.println(nomes);
//        IO.println(nomes.get(0));

      List<Integer> numeros = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        IO.println("digite um numero " );
        int n1 = teclado.nextInt();
      IO.println("digite outro numero");
        int n2 = teclado.nextInt();
        numeros.add(n1);
        numeros.add(n2);


      IO.println("a soma dos dois numeros é " + (numeros.get(0)+numeros.get(1)));
    }
}
