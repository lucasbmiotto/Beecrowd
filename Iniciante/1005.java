import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        double valor1 = scan.nextDouble();
        double valor2 = scan.nextDouble();
        double media = ((3.5 * valor1) + (7.5 * valor2))/11;

        System.out.println(String.format("MEDIA = %.5f" , media));
    }
	
}