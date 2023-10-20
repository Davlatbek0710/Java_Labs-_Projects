import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int num;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number to check if it's prime or not: ");
            num = sc.nextInt();
            try {
                int count = 0;
                for(int i = 1; i <= num; i++){
                    if(num%i==0){
                        count++;
                    }
                }
                if (count == 2) {
                    throw new PrimeNumber(num + " is a prime number");
                }
                else{
                    System.out.println(num + " isn't a prime number");
                }
            }
            catch (PrimeNumber ex){
                System.out.println(ex.getMessage());
            }
            System.out.println("Press 1 to continue");
            System.out.println("Press 0 to exit");
            num = sc.nextInt();
        }while(num != 0);
        System.out.println("Goodbye!");
    }
}
