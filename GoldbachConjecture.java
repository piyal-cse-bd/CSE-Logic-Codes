import java.util.Scanner;

public class GoldbachConjecture {

    // একটি সংখ্যা Prime কি না তা চেক করার মেথড
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an even number greater than 2: ");
        int num = input.nextInt();

        // ইনপুট ভ্যালিডেশন
        if (num <= 2 || num % 2 != 0) {
            System.out.println("Invalid input! Please enter an even number > 2.");
        } else {
            System.out.println("Goldbach Pairs are:");
            boolean found = false;

            // ২ থেকে শুরু করে সংখ্যার অর্ধেক পর্যন্ত লুপ চালানো
            for (int i = 2; i <= num / 2; i++) {
                // যদি i এবং (num - i) উভয়ই মৌলিক হয়
                if (isPrime(i) && isPrime(num - i)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No pairs found (which is theoretically impossible!).");
            }
        }
        
        input.close();
    }
}