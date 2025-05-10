import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        //바구니 번호 초기화
        for(int i=0; i< N; i++){
            basket[i] = i + 1;
        }

        for(int t=0; t<M; t++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while (i<j){
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }
        for (int num:basket){
            System.out.print(num + " ");
        }
        sc.close();

    }
}