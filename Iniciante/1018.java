import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner(System.in);
        
        int notasInseridas = leitor.nextInt();
        
        int notasFinal = notasInseridas;
        
        int notas100 = notasFinal / 100;
        notasFinal -= notas100 * 100;
        
        int notas50 = notasFinal / 50;
        notasFinal -= notas50 * 50;
        
        int notas20 = notasFinal / 20;
        notasFinal -= notas20 * 20;
        
        int notas10 = notasFinal / 10;
        notasFinal -= notas10 * 10;
        
        int notas5 = notasFinal / 5;
        notasFinal -= notas5 * 5;
        
        int notas2 = notasFinal / 2;
        notasFinal -= notas2 * 2;
        
        int notas1 = notasFinal;
        
        System.out.println(notasInseridas);
        
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
	
}