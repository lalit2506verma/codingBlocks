package Lec40;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Graph_Bipartite {
    public static void main(String[] args) {

    }

    public boolean isBipartitle(int[][] graph){
        Queue<BipartitlePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();


        for (int vtx = 0; vtx < graph.length; vtx++) {
            if(visited.containsKey(vtx)){
                continue;
            }
            q.add(new BipartitlePair(vtx, 0));
            while(!q.isEmpty()){
                // 1. remove
                BipartitlePair pair = q.poll();

                // 2. Ignore
                if(visited.containsKey(pair.vtx)){
                    // check the dis is matching
                    if(visited.get(pair.vtx) != pair.dis){
                        return false; // odd length find
                    }
                    continue;
                }

                // 3. marked visited
                visited.put(pair.vtx, pair.dis);

                // 4. Self work
                // 5. mark unvisited nbrs
                for (int nbrs : graph[pair.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartitlePair(nbrs, pair.dis + 1));
                    }
                }
            }
        }
        return true;
    }

    class BipartitlePair{
        int vtx; // Vertics
        int dis; // distance from the stating node

        public BipartitlePair(int vtx, int dis){
            this.dis = dis;
            this.vtx = vtx;
        }
    }
}
