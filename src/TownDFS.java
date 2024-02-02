import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TownDFS {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int N, curR, curC;
    static int[][] townMatrix;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static ArrayDeque<int[]> stack;
    static int groupMax;

    static void print(int[][] graph){
        for(int i=0; i< graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());

        townMatrix = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<N; j++){
                townMatrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //print(townMatrix);

        // 행 우선 탐색
        for(int r = 0; r < townMatrix.length; r++){
            for(int c = 0; c < townMatrix.length; c++){
                // 만약 1을 만나면
                if(townMatrix[r][c] == 1){
                    // 그 위치부터 델타탐색 시작
                    stack = new ArrayDeque<>();
                    stack.addLast(new int[] {r, c});

                    for(int j = 0; j < 4; j++){

                    }

                }
            }
        }

    }
}
