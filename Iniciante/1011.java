import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double pi = 3.14159;
        
        double resultado = (4/3.0) * (pi * raio * raio * raio);
        
        System.out.printf("VOLUME = %.3f\n", resultado);
       
       
       
    }
   
}