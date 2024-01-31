import java.io.*;

public class Snail2 {

    static int r = 0, c = 0, d = 0;
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][N];


        matrix[r][c] = N*N;

        for(int i = N*N-1; i>0; i++){
            for(int j = 0; j<2; j++){

            }
        }

    }
}
