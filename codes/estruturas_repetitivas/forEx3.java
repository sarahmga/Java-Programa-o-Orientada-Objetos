/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */
import java.util.Scanner;
public class forEx3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
       System.out.println("Digite N:");
       int N = sc.nextInt();
       int X, d = 0, f = 0;

       for(int i=0 ; i<N; i++){
        X = sc.nextInt();
            if(X>=10 && X<=20){
            d++;
        } else {
            f++;
        }
       }
    System.out.println(d + " dentro " + f + " fora ");
        sc.close();

    }
}
