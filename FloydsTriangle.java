import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        int number = 1; // শুরু হবে ১ থেকে

        System.out.println("Floyd's Triangle:");
        
        // আউটার লুপ: কতগুলো লাইন হবে তা নিয়ন্ত্রণ করে
        for (int i = 1; i <= rows; i++) {
            
            // ইনার লুপ: প্রতি লাইনে কয়টি সংখ্যা বসবে তা নিয়ন্ত্রণ করে
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // প্রতিবার সংখ্যা ১ করে বাড়বে
            }
            
            // প্রতি লাইন শেষ হওয়ার পর নতুন লাইনে যাওয়ার জন্য
            System.out.println();
        }
        
        input.close();
    }
}