import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] remainder = new boolean[42];

        // 나머지 배열 받기
        for (int i=0; i<10; i++){
            int num = sc.nextInt();
            remainder[num % 42] = true;
        }

        // 해당하는 값 갯수출력
        int count = 0;
        for(int i=0; i<42; i++){
            if(remainder[i]){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}