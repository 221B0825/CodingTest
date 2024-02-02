import java.util.*;
import java.io.*;

public class StackAdjMatrix {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int V;
    static int E;
    static boolean[] visited;
    static int[][] adj;
    static int startNode = 1;

    //이동 궤적 기록용
    static ArrayList<Integer> track = new ArrayList<Integer>();

    static void print(int[][] graph){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph.length; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        // index num = node num
        adj = new int[V+1][V+1];

        // visitied check
        visited = new boolean[V+1];

        for(int i =0; i<E; i++){
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start][end] = 1;
            adj[end][start] = 1; //양뱡향 그래프
        }

        // stack 생성시, 초기 노드를 먼저 넣고 시작(startNode)
        ArrayDeque<Integer> stack = new ArrayDeque<>(Arrays.asList(startNode));

        while(!stack.isEmpty()){
            // logic 1
            // stack에서 한 노드를 뽑고 current에 넣고 삭제
            int current = stack.removeLast();
            // 방문 전이라면
            if(!visited[current]){
                visited[current] = true;
                track.add(current);
            }

            //logic 2
            // 행렬을 하나씩 돌면서
            for(int destination = 1; destination < V + 1; destination++){
                //아직 방문 전이고, 간선이 연결되어있으면
                if(!visited[destination] && adj[current][destination] == 1){
                    //stack에 추가
                    stack.addLast(destination);
                }
            }

        }
        System.out.println(track);
    }
}
