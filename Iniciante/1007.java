import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        int valor4 = scan.nextInt();

        int diferenca = valor1 * valor2 - valor3 * valor4;

        System.out.println("DIFERENCA = " + diferenca);
    }
	
}