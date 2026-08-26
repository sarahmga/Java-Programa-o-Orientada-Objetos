/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo */
import java.util.Locale;
import java.util.Scanner;
public class forEx8 {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc =  new Scanner(System.in);

System.out.println("Digite um numero inteiro positivo N:");
int N = sc.nextInt();
int quad, cubo;
for(int i = 1; i<=N ; i++){
quad = i * i;
cubo = i * i * i;
System.out.println(i + "  " + quad + "  " + cubo + "  ");
}

    sc.close();
}
}
