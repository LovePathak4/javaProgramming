import java.util.*;

public class graphtex {

    static class edge{
        int src;
        int dest;
    }
    
  public graphtex.edge(int s, int d){
      this.src=s;
      this.dest=d;
  }
    public static void creategraph(ArrayList<edge> [] graph){
        for(int i=0; i<v; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new egde(0 , 1));
        graph[0].add(new egde(0 , 2));
        
        graph[1].add(new egde(1 , 0));
        graph[0].add(new egde(1 , 3));
        
        graph[2].add(new egde(2 , 0));
        graph[2].add(new egde(2 , 4));
        
        graph[3].add(new egde(3 , 1));
        graph[3].add(new egde(3 , 4));
        
        graph[4].add(new egde(4 , 3));
        graph[4].add(new egde(4 , 2));
    }
    
    public static boolean isbipatite(ArrayList<edge> graph []){
        int col[]=new int [graph.length];
        for(int i=0; i<col.length; i++){
            col[i]=-1; // no colour
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i]==-1){ //bfs
                q.add(i);
                col[i]=0; //yellow
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        edge e= graph[curr].get(j); //e.dest
                        if(col[e.dest]==-1){
                            int nextcol=col[cur]==0? 1:0;
                            col[e.dest]=nextcol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest]==col[curr]){
                            return false; // no bipartite
                        }
                        
                    }
                }
            }
        }
        return true;
    }
    

    
    public static void main(String[] args) {
        v=5;
        ArrayList<edge>  graph [] = new ArrayList[v];
        creategraph(graph);
        System.out.println(isbipatite(graph));
        
    }
}

