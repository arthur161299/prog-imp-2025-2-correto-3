import java.util.Scanner;
public class Vetor {
    public static final int QTD =4;
    public static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
        
            //int [] Vetor = new int[10]; 
            int num, soma=0;
            double media;
            for( int i =1; i <= QTD; i+=1){
                System.out.printf("digite o %d número: ");
                num = input.nextInt();
                soma += num;
        }
        media = (double)soma/ QTD;;
         System.out.printf("á media destes %d números %f\n", QTD,media);

    }
}