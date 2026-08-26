/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */
import java.util.Scanner;
public class whileEx2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int X,Y;
        System.out.println("Digite as coordenadas do seu ponto:");
        X = sc.nextInt();
        Y = sc.nextInt();

        while(X != 0 && Y != 0){ 
            

        if(X>0 && Y>0){
            System.out.println("Primeiro quadrante");
        } else if(X>0 && Y<0){
            System.out.println("Quarto quadrante");
        } else if(X<0 && Y<0){
            System.out.println("Terceiro quadrante");
        } else if(X<0 && Y>0){
            System.out.println("Segundo Quadrante");
        } 

        System.out.println("Digite as coordenadas do seu ponto:");
            X = sc.nextInt();
            Y = sc.nextInt();

    } 


    sc.close();
    }
}
