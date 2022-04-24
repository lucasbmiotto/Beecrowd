import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        int velocidade = scan.nextInt();
        int tempo = scan.nextInt();
        
        double km = tempo * velocidade;
        double media = km / 12;
        
        System.out.println(String.format("%.3f", media)); 
    }
 
}