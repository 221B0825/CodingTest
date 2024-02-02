import java.util.*;
import java.io.*;

public class StackAdjList {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList[] adj;
    static boolean[] visited;
    static ArrayList<Integer> track = new ArrayList<>();
    static int V;
    static int E;
    static int startNode = 1;


    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        visited = new boolean[V+1];

        // list Init
        adj = new ArrayList[V+1];
        for(int i=0; i<V+1; i++){
            adj[i] = new ArrayList<>();
        }

        // set list
        for(int i = 0; i < E; i++){
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start].add(end);
            adj[end].add(start);
        }

        System.out.println(Arrays.toString(adj));

        ArrayDeque<Integer> stack = new ArrayDeque<>(Arrays.asList(startNode));

        while(!stack.isEmpty()){
            // logic 1
            int current = stack.removeLast();
            if(!visited[current]){
                visited[current] = true;
                track.add(current);
            }

            // logic 2
            for(int i=1; i < V+1; i++){
                for(Object destination : adj[i]){
                    if(!visited[(int) destination]){
                        stack.addLast((int) destination);
                    }
                }
            }
        }
        System.out.println(track);
    }
}
