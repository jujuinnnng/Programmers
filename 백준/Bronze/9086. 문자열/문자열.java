import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            String word = sc.nextLine();
            int len = word.length();
            System.out.println(word.charAt(0)+""+word.charAt(len-1));
        }

        sc.close();

    }
}