package stringAlgorithm;

import java.io.*;

public class StringReverseTwoPointer {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = bf.readLine();
        int result = 1;

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                result = 0;
                break;
            }
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
