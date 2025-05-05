import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int count = 0;

        for (int i=0; i<n; i++){
            if(numbers[i] == x){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}