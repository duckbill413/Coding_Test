package swea;

import java.util.Arrays;
import java.util.Scanner;

// 2068. 최대수 구하기
public class SWEA2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int result = 0;
            for (int num : nums) {
                if (result < num) {
                    result = num;
                }
            }
            System.out.printf("#%d %d%n", test_case, result);
        }
    }
}
