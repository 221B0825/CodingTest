package stringAlgorithm;

import java.io.*;

public class BruteForceSearch {

    static String text;
    static String target;
    static int startIndex = -1; // not found

    // input ex)
    // hello world!
    // rld
    // ----------
    // output ex) (return startIndex)
    // 8

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        text = bf.readLine();
        target = bf.readLine();

        int n = text.length();
        int m = target.length();

        for(int i = 0; i< n-m+1; i++){
            int count = 0;
            for(int j = 0; j< m; j++){
                if(text.charAt(i+j) == target.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            if(count == m){
                startIndex = i;
                break;
            }

        }

        bw.write(Integer.toString(startIndex));
        bw.flush();
        bw.close();
    }

}
