import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        double valor1 = scan.nextDouble();
        double valor2 = scan.nextDouble();
        double valor3 = scan.nextDouble();

        double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;

        System.out.println(String.format("MEDIA = %.1f" , media));
    }
	
}