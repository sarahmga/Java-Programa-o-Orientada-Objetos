import java.util.Scanner;

public class forEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N:");
        int N = sc.nextInt();
        int valor, soma = 0;

        for(int i=0;i<N;i++){
            valor = sc.nextInt();
            soma += valor;
        }
System.out.println(soma);

        sc.close();
    }
}
