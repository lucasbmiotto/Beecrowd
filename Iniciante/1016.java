import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int km = scan.nextInt();
        int tempo = (60 * km) / 30;

        System.out.println(tempo + " minutos"); 
    }
	
}