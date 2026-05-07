import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many terms? ");
        int n = input.nextInt();

        int firstTerm = 0, secondTerm = 1;
        
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");

            // পরবর্তী সংখ্যা বের করার লজিক
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        input.close();
    }
}