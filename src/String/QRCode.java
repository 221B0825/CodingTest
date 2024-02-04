package String;

import java.io.*;
import java.util.*;

public class QRCode {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int Q, R;
    static String code;
    static char[] codeChar;

    // programmers QR code
    // input ex)
    // 3 1
    // qjnwezgrpirldywt
    // ----------
    // output ex)
    // jerry
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(bf.readLine());

        Q = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        code = bf.readLine();
        codeChar = code.toCharArray();
        String answer = "";

        for(int i = 0; i<codeChar.length; i++){
            if( i%Q == R){
                answer = answer+codeChar[i];
            }
        }

        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
