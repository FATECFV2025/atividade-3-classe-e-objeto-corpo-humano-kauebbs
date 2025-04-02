package main.java;
 
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
   
        CorpoHumano c1 = new CorpoHumano();
        System.out.println("Digite o seu peso: ");
        c1.SetMassa(read.nextFloat());
        System.out.println("Digite sua altura: ");
        c1.SetAltura(read.nextFloat());
        c1.calcularIMC();
        
        System.out.println(c1.getIMC());
    }
}
