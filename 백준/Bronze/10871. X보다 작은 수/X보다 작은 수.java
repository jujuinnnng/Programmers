import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int number = sc.nextInt();

        for (int i=0; i<count; i++){
            int numbers = sc.nextInt();
            if (numbers < number) {
                System.out.print(numbers + " ");
            }
        }

        sc.close();
    }
}