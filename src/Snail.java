import java.io.*;

public class Snail {
    //direction > 0
    static int d = 0;
    //하, 우, 상, 좌 반복임
    // (direction)%4 = 0 1 2 3
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int r = 0, c = 0;
    public static void main(String[] args) throws IOException {
//        System.out.println("Snail");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N][N];

        for(int i=N*N; i>0; i--){

            matrix[r][c] = i;

            int nr = r +dr[d];
            int nc= c + dc[d];

            if(nr < 0 || nr >= N || nc < 0 || nc >= N || matrix[nr][nc] !=0){
                d = (d + 1) % 4; //방향 전환
                nr = r + dr[d]; // 새로운 좌표는 꺾인 좌표
                nc = c + dc[d];
            }

            r = nr;
            c = nc;

        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
