import java.util.*;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);

        float soma = 0;;
        float fração;
        float numerador = 1;
        float denominador = 1;
        int interaçao;

        System.out.println(" Informe o numero de interaçoes ");

        interaçao = in.nextInt();

        fração = (numerador / denominador);

        for ( int i = 0; i < interaçao; i++ ){
        
            soma = soma + numerador / denominador;

            numerador = numerador * -1;

            denominador = denominador + 2;

        }              System.out.println( soma * 4);    


    }
}
