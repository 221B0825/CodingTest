package stringAlgorithm;

import java.io.*;
import java.util.*;

public class KMP {

    // #1786 baekjoon
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String text = bf.readLine();
        String pattern = bf.readLine();
        int[] piTable = new int[text.length()];


        int index = 0;
        for(int i=1; i<text.length(); i++){
            while (index > 0 && text.charAt(i) != text.charAt(index)){
                index = piTable[index - 1];
            }
            if(text.charAt(i) == text.charAt(index)){
                index = index + 1;
                piTable[i] = index;
            }
        }

    }

}
