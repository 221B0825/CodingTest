import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.StringTokenizer;

public class adjMatrix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] adj;
    static int V;
    static int E;

    static void print(int[][] graph){
        for(int i = 0; i<graph.length; i++){
            for(int j=0; j<graph.length; j++){
                System.out.print(graph[i][j]+" ");
            }
        System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer((br.readLine()));
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        adj = new int[V+1][V+1]; // 인덱스와 노드번호 맞추기(노드번호가 1부터 시작)

        for(int i=0; i< E ;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start][end] = 1;
            adj[end][start] = 1;
        }

        print(adj);


    }
}
