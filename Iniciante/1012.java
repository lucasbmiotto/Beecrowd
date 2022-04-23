import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        double valorA = scan.nextDouble();
        double valorB = scan.nextDouble();
        double valorC = scan.nextDouble();
        
        double quadrado = valorB * valorB;
        double circulo = 3.14159 * (valorC * valorC);
        double triangulo = valorA * valorC / 2.0;
        double trapezio = ((valorA + valorB) * valorC) / 2;
        double retangulo = valorA * valorB;
        
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  
    }
	
}