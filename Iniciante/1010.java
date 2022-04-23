import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
		
        int codigo1 = scan.nextInt();
        int n1 = scan.nextInt();
        double valor1 = scan.nextDouble();
		
        int codigo2 = scan.nextInt();
        int n2 = scan.nextInt();
        double valor2 = scan.nextDouble();
		
        double total = (n1 * valor1) + (n2 * valor2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}