package aula3;

import com.sun.source.util.SourcePositions;

import java.awt.image.ImagingOpException;
import java.util.Scanner;


public class ifelsepratica1 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("digite sua 1 nota"); // saida de texto no terminal
        double nota1 = sc.nextDouble();
        IO.println("digite sua 2 nota");
        double nota2 = sc.nextDouble();
        IO.println("digite sua 3 nota");
        double nota3 = sc.nextDouble();

        double media = (nota1+nota2+nota3) /3; // calculo media
        IO.println(media);

        if (media <4){
            IO.println("você foi : reprovado ");
        } else if (media <=6) {
            IO.println("você foi : recuperação ");
        }else {
            IO.println(" você foi : aprovado");
        }


    }
}