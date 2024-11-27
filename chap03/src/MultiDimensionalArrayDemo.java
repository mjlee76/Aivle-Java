import java.util.Arrays;

public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {

        // 3행 5열의 2차원 배열 선언 및 초기화
        int[][] scores = {
                {100, 90, 50, 95, 85},
                {70, 60, 82, 75, 40},
                {90, 80, 70, 60, 50}
        };

        // 첫 번째 행의 첫 번째 열에 있는 정수에 접근
        int firstRowFirstCol = scores[0][0];
        System.out.println("첫 번째 행의 첫 번째 정수: " + firstRowFirstCol);

        // 두 번째 행의 세 번째 열에 있는 정수에 접근
        int secondRowThirdCol = scores[2][3];
        System.out.println("두 번째 행의 세 번째 정수: " + secondRowThirdCol);

        // 배열의 크기 출력
        System.out.println("2차원 배열의 행의 수: " + scores.length);
        System.out.println("첫 번째 행의 크기: " + scores[0].length);

        // 2차원 배열의 모든 원소를 순회하며 출력
        System.out.println("2차원 배열의 모든 정수:");
        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(scores));
        System.out.println(Arrays.toString(scores[0]));

//        for (int[] score : scores) {
//            for (int i : score) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

    }
}
