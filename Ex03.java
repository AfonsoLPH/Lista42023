import java.util.*;
public class Ex03{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero, somapar=0, somaimpar=0, multp3=0 , maiorvalor=0, menorvalor=99999999;

        for ( int i = 0; i <=5; i++){

            System.out.println(" Informe um numero : ");

            numero = in.nextInt();

             if( numero < 0){
                System.out.println(" Valor invalido tente novamente");

                i--;
                continue;}

            if( numero % 2==0 && numero >= 0 ){
                somapar++;
            }
            if( numero % 2 !=0 && numero >= 0) {
                somaimpar++;
            }
             if ( numero % 3==0 && numero >= 0 ){
                multp3++;
            }
             if (numero > maiorvalor){
                maiorvalor=numero;
             }
             if ( menorvalor  > numero){
                 menorvalor = numero;
             }
                
                
       }        
                 System.out.println( " somatorio de par : " + somapar );
                 System.out.println( " somatorio de impar : " + somaimpar );
                 System.out.println( " somatorio de multiplos de 3 :  "  + multp3 );
                 System.out.println( " o numero maior é  : " + maiorvalor );
                 System.out.println( " o menor numero é :  " + menorvalor );
    }
}              
