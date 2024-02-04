package oneDimensionalList;

import java.io.*;
import java.util.*;

public class MinAndMax {

    static int maxNum = -1_000_001; // 최댓값 갱신용
    static int minNum = 1_000_001; // 최솟값 갱신용
    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, num);
            minNum = minNum > num ? num : minNum; // Math.min 권장
        }
        System.out.print(minNum + " ");
        System.out.println(maxNum);
    }
}
