package oneDimensionalList;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinAndMaxSort {
    // baekjoon # 10818
    // input ex)
    // 5
    // 20 10 35 30 7
    // ----------
    // output ex)
    // 7 35

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int size = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] input = new int[size];

        for(int i=0; i<size; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(input);
        String answer = new String(input[0]+ " " + input[size-1]);
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
