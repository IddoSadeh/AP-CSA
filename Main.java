import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

         if (number%3 == 0)
         {
            System.out.print("fizz");
            if( number %5 == 0){
                
            }
        } 
         if (number%5 == 0){
            System.out.println("buzz");
        }
    }
}