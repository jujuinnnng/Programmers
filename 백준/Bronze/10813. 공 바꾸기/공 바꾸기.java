import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket= new int[n];

        //바구니 공 초기화
        for (int a = 0; a < n; a++){
            basket[a] = a + 1;
        }

        //공 n번 바꾸기
        for(int b = 0; b < m; b++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }

        //출력
        for (int array : basket){
            System.out.print(array + " ");
        }



        sc.close();
    }
}