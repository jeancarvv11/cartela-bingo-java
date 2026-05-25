import java.util.Random;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args){
        Scanner in=  new Scanner(System.in);
        int m[][] = new int[5][5];
        boolean usados[] = new boolean[100]; // usado para marcar os nmrs usados
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                int num;
                do {
                    num = r.nextInt(100);
                } while (usados[num]); // repete até achar um número não repetido

                usados[num] = true;   // marca como usado
                m[i][j] = num; 
            }
        }

        System.out.println("CARTELA DE BINGO: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[" + m[i][j] + "]");
            }
            System.out.println();
        }
    }
}
