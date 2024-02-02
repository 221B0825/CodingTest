import java.io.*;
import java.util.*;

public class AdjList {

    static ArrayList[]adj;
    static int V;
    static int E;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(bf.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        // 인접리스트 초기화
        adj = new ArrayList[V+1];
        for(int i=0; i<V+1; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i<E; i++){
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start].add(end);
            adj[end].add(start);
        }

        System.out.println(Arrays.toString(adj));

    }
}
