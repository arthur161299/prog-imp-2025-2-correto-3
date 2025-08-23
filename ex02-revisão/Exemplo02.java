import java.util.Scanner;
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<100; i++){
            System.out.print(i+" ");
        }
        for(int i=1; i<100; i+=2){
            System.out.print(i+", ");
        }    
        for(int i = 2; i<100; i+=2){
            System.out.print( i+", ");
        }
        for(int i=0; i<100; i++){
            if(i%3==0){
                System.out.print(i+", ");
            }
        }
        for(int i=0; i<100; i++){
            if(i%3==0 || i%10==0){
                System.out.print(i+", ");
            }
        }
        scanner.close();

        
    }
}