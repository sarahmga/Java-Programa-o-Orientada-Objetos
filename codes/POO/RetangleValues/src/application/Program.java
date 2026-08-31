package application;
import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

   System.out.println("Digite os valores de largura e altura de um retangulo: "); 
    Rectangle a;
    a = new Rectangle();
    a.width = sc.nextDouble();
    a.height = sc.nextDouble();


System.out.printf("AREA = %.2f \nPERIMETER = %.2f\nDIAGONAL = %.2f\n", a.AreaRet(), a.PerimetroRet(), a.DiagonalRet() );
sc.close();

}
}
