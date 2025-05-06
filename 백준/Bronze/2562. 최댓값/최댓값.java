import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];
        int max = 0;
        int index = 0;

        for (int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
            if(numbers[i] > max){
                max = numbers[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
        sc.close();
    }
}