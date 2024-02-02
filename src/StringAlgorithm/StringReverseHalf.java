package StringAlgorithm;

import java.io.*;

public class StringReverseHalf {

    // input ex) level
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
