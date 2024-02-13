package stringAlgorithm;

import java.io.*;

public class StringReverseHalf {

    // baekjoon # 10988
    // input ex)
    // level
    // ----------
    // output ex)
    // 1

    // if input = apple, output = 0

    static char[] input;
    static int result = 1;
    public static void main(String[] args) throws IOException {
        // same as TwoPointer
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = bf.readLine().toCharArray();

        for(int i = 0; i<input.length/2 ; i++){
            if(input[i] != input[input.length-1-i]){
                result = 0;
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
