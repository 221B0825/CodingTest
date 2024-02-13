package stringAlgorithm;

import java.io.*;
import java.util.*;

public class TwoNumSum {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, X, count;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(bf.readLine());
        int[] numbers = new int[N];

        // init input numbers
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        X = Integer.parseInt(bf.readLine());
        // sorting
        Arrays.sort(numbers);

        // two-pointer
        int start = 0;
        int end = N - 1; // index

        while (start < end) {
            int sum = numbers[start]+numbers[end];
            if(sum == X){
                count++;
                start++;
                end--;
            }else if(sum < X){
                start++;
            }else{
                end--;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();


    }
}
