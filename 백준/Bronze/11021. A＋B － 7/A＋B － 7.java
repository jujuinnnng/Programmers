import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i=0; i<count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #"+(i+1)+": " + (a+b));
        }
        sc.close();
    }
}