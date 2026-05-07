import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // ইউজার থেকে ইনপুট নেয়ার জন্য Scanner ক্লাস
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // কন্ডিশনাল লজিক
        if (num % 2 == 0) {
            System.out.println(num + " is Even (জোড়)");
        } else {
            System.out.println(num + " is Odd (বিজোড়)");
        }
        
        input.close();
    }
}