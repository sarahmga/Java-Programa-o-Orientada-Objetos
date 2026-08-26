/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
import java.util.Locale;
import java.util.Scanner;
public class forEx5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double num1, num2;
        for(int i=0;i<N;i++){
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            if(num2 !=0){
            System.out.println("Divisao:"+ (double)(num1/num2));
            } else {
                System.out.println("Divisao impossivel.");
            }
        }
    sc.close();
    }
}
