/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. */
import java.util.Locale;
import java.util.Scanner;
public class forEx4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
System.out.println("Digite N");
int N = sc.nextInt();
double valor1,valor2,valor3, media;
        for(int i = 0; i<N;i++){
            valor1= sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();
            media = (double)(valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0)/10;
            System.out.printf("Media: %.2f%n", media);
        }
    sc.close();
    }
}
