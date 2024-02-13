package oneDimensionalList;

import java.util.*;
import java.io.*;

public class PrefixSum {
    // baekjoon # 11659
    // input ex)
    // 5 3 (input size, test case)
    // 5 4 3 2 1 (input number int[] num = {5, 4, 3, 2, 1})
    // 1 3 (index 1 ~ 3 sum)
    // 2 4
    // 5 5
    // ----------
    // output ex)
    // 12
    // 9
    // 1

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] prefixSum = new int[N+1];

        for (int i = 1; i < N+1; i++) {
            prefixSum[i] = Integer.parseInt(st.nextToken()) + prefixSum[i-1];
        }

        for(int k = 0; k < T; k++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int result = prefixSum[j]-prefixSum[i-1];
            bw.write(result+"\n");
            bw.flush();
        }
        bw.close();

    }

}
