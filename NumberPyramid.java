import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            // ১. স্পেস প্রিন্ট করার জন্য লুপ (পিরামিডকে মাঝখানে রাখার জন্য)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // ২. সংখ্যা প্রিন্ট করার জন্য লুপ
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " "); 
            }

            // লাইন ব্রেক
            System.out.println();
        }
        
        input.close();
    }
}