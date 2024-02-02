package StringAlgorithm;

import java.io.*;

public class StringReverseWord {
    // baekjoon # 10988

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = bf.readLine();

        StringBuilder st = new StringBuilder();

        for(int i=word.length()-1; i >= 0; i--){
            st.append(word.charAt(i));
        }

        String reverseWord = st.toString();

        if(reverseWord.equals(word)){
            bw.write("1");
        }else{
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
