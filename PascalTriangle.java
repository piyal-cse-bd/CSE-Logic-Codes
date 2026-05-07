import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            
            // স্পেস প্রিন্ট করার জন্য (পিরামিড শেপ দিতে)
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            int number = 1; // প্রতি লাইনের শুরুতে ১ হবে
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                
                // পরের সংখ্যা বের করার ফর্মুলা: number * (i - j) / (j + 1)
                number = number * (i - j) / (j + 1);
            }
            
            System.out.println();
        }
        
        input.close();
    }
}