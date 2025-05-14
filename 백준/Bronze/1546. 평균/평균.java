import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //0.N개 과목수 입력
        int N = sc.nextInt();
        double[] scores = new double[N];
        double max = 0;

        //1-1. N개 갯수 만큼 과목 점수 입력
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
            //1-2. 과목점수 중에 최댓값구하기 !
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        //2. 평균값구하기
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scores[i] / max * 100;
        }

        System.out.println(sum/N);

        sc.close();

    }
}