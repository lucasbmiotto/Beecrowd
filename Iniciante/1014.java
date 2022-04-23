import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double y = scan.nextDouble();
        double media = x / y;
        
        System.out.println(String.format("%.3f km/l", media));   
    }
	
}