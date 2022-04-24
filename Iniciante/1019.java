import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner(System.in);
        
        int tempo = leitor.nextInt();
        int horas = tempo / 3600;
        tempo -= horas * 3600;
        int minutos = tempo / 60;
        tempo -= minutos * 60;
        int segundos = tempo;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);		
    }
	
}