import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double vendas = scan.nextDouble();
        double total = ((vendas * 15) / 100) + salarioFixo;

        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
	
}