import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int seq = sc.nextInt()-1;

        System.out.println(word.charAt(seq));

        sc.close();

    }
}