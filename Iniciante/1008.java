import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int horas = scan.nextInt();
        int funcionarios = scan.nextInt();

        double valorHora = scan.nextDouble();
        double salario = horas * valorHora;

        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
	
}