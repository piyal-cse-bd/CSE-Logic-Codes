import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int originalNum = num;
        int temp = num;
        int digits = 0;
        double result = 0;

        // ১. প্রথমে বের করতে হবে সংখ্যাটিতে কয়টি অংক (digit) আছে
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;

        // ২. প্রতিটি অংকের পাওয়ার (digits) বের করে যোগ করা
        while (temp != 0) {
            int remainder = temp % 10;
            result = result + Math.pow(remainder, digits);
            temp /= 10;
        }

        // ৩. রেজাল্ট চেক করা
        if ((int)result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        input.close();
    }
}