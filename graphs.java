 import java.util.*;
 public class graphs{
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void CreateGraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }

       /*  graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[2].add(new edge(2, 4, 1));
        graph[2].add(new edge(2, 0, 1));

        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 5, 1));

        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));
        */

        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));
        graph[0].add(new edge(0, 3, 1));

        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 0, 1));

        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 0, 1));

        graph[3].add(new edge(3, 0, 1));
        graph[3].add(new edge(3, 4, 1));

        graph[4].add(new edge(4, 3, 1));


    }







    public static void bfs(ArrayList<edge> [] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]= new boolean[graph.length];
        q.add(0); //source=0

        while(!q.isEmpty()){
            int curr= q.remove();

            if(!vis[curr]){ //visit curr
                System.out.print(curr+ " ");
                vis[curr]=true;

            for(int i=0; i<graph[curr].size(); i++){
                edge e=graph[curr].get(i);
                q.add(e.dest);
            }    

         }
     }
 }




      public static void dfs(ArrayList<edge>[] graph, int curr, boolean vis[]){
        // visit
        System.out.print(curr + " ");
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e=graph[curr].get(i);

            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
      }




    public static boolean HasPath(ArrayList<edge> [] graph , int src, int dest, boolean[] vis){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0; i<graph[src].size(); i++){
            edge e=graph[src].get(i);
            if(!vis[e.dest]&& HasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }







    public static void boolean detectcyle(ArrayList<edge> [] graph){
        boolean vis[]=new boolean[graph.length];
        if(!vis[i]){
            if(detectcyleUtil(graph, vis, i, -1)){
                return true;
            }
        }
    }
    return false;



public static boolean detectcycleUtil(ArrayList<edge> [] graph, boolean vis[], cur, i){
    vis[cur]=true;
    for(int i=0; i<graph[cur].size(); i++){
        edge e=graph[graph].get(i);
        if(!vis[e.dest]){
            if(detectcycleUtil(graph, vis, e.dest , int cur)){
                return ture;
            }
        }
    }
    return false;
}







    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>[] graph = new ArrayList[v];
     /*  for(int i=0; i<v; i++){
            graph[i]= new ArrayList<>();
        }

        // 0-vetex
        graph[0].add(new edge(0, 1, 5));
        
        //1-vertex
        graph[1].add(new edge(1, 0,5));
        graph[1].add(new edge(1, 2,1));
        graph[1].add(new edge(1, 3,3));

        //2-vetex
        graph[2].add(new edge(2, 1,1));
        graph[2].add(new edge(2, 3,1));
        graph[2].add(new edge(2, 4,4));

        //3-vetex
        graph[3].add(new edge(3,1,3));
        graph[3].add(new edge(3, 2, 1));

        //4-vertex
        graph[4].add(new edge(4, 2, 1));

        // 2- neighbours
        for(int i=0; i<graph[2].size(); i++){
            edge e=graph[2].get(i);
            System.out.println(e.dest);

            */

        CreateGraph(graph);
        //bfs(graph);

        //dfs(graph, 0, new boolean[v]);

        //System.out.print(HasPath(graph, 0, 5, new boolean[v]));

        System.out.println(detectcyle(graph));

        }

    }








    



   /*  static class edge {
        int src;
        int dest;

        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void CreateGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 0));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3));
    }

    // ----------------------------------------------------
    // FIXED CYCLE DETECTION (UNDIRECTED GRAPH)
    // ----------------------------------------------------
    public static boolean detectcycle(ArrayList<edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectcycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectcycleUtil(ArrayList<edge>[] graph, boolean vis[], int curr, int parent) {
        vis[curr] = true;

        for (edge e : graph[curr]) {

            if (!vis[e.dest]) {
                if (detectcycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            else if (e.dest != parent) {
                // visited but not parent → cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];

        CreateGraph(graph);

        System.out.println("Cycle present: " + detectcycle(graph));
    }
}
    */
