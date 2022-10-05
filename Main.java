package Atividade4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        
        double nota1, nota2, nota3, nota4;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

        System.out.println("Sua média foi: " + media);

        sc.close();

    }

}