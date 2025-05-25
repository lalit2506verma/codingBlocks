package Lec40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph_Valid_Tree {

    public boolean validTree(int n, int[][] edges){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];

            map.get(a).add(b);
            map.get(b).add(a);
        }

        return BFT(map);
    }

    public boolean BFT(HashMap<Integer, List<Integer>> map){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int c = 0;
        for(int src : map.keySet()){
            if(visited.contains(src)){
                continue;
            }
            c++;
            q.add(src);
            while(!q.isEmpty()) {
                // 1. remove
                int v = q.poll();

                // 2. Ignore if already visited
                if(visited.contains(v)){
                    return false;
                }

                // 3. marked visited
                visited.add(v);

                // 4. self work
                System.out.println(v + " ");

                // 5. add unvisited nbrs
                for(int nbrs : map.get(v)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }

        return c == 1;
    }
}
