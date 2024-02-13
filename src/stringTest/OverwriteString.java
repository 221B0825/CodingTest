package stringTest;

import java.io.*;

public class OverwriteString {

    // input ex)
    // He11oWor1d
    // lloWorl
    // 2
    // output ex)
    // HelloWorld

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String my_string = bf.readLine();
        String overwrite_string = bf.readLine();

        int s = Integer.parseInt(bf.readLine());

        char[] basicChar = my_string.toCharArray();
        char[] overChar = overwrite_string.toCharArray();


        for(int i = s; i< s+ overChar.length; i++){
            basicChar[i] = overChar[i - s];
        }

        String answer = new String(basicChar);

        bw.write(answer);
        bw.flush();
        bw.close();

    }
}
