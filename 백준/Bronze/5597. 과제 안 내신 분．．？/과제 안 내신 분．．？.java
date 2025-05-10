import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] attendance = new boolean[31];

        //출석 안한 사람 체크
        for (int i=0; i<28; i++){
            int num = sc.nextInt();
            if (num >= 1 && num <= 30) {
                attendance[num] = true;
            }
        }

        //없는 사람 출력하깅
        for (int i=1; i<=30; i++){
            if(!attendance[i]){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}