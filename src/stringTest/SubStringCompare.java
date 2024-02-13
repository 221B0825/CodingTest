package stringTest;

import java.io.*;

public class SubStringCompare {

    // input ex)
    // 3141592
    // 271
    // ----------
    // output ex)
    // 2

    //예를 들어, t="3141592"이고 p="271" 인 경우,
    // t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
    // 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        String t = bf.readLine();
        String p = bf.readLine();

        Long pLong = Long.parseLong(p);
        int answer = 0;

        for(int i = 0; i<t.length() - p.length() + 1; i ++){
            long subLong = Long.parseLong(t.substring(i, i+p.length()));
            //System.out.println("case: "+i+" : "+subInt);
            if( subLong <= pLong ){
                answer++;
            }
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
    }
}
