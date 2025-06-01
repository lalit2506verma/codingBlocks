package Lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topological_Sort {
    private HashMap<Integer, List<Integer>> map;

    public Topological_Sort(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int v1, int v2){
        map.get(v1).add(v2);
    }

    public int[] inDegree(){
        int[] in = new int[map.size()];
        for (int v : map.keySet()){
            for (int nbrs: map.get(v)){
                in[nbrs]++;
            }
        }

        return in;
    }

    public void topological(){
        int[] in = inDegree();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if(in[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int r = q.poll();
            for(int nbrs : map.get(r)){
                in[nbrs]--;
                if(in[nbrs] == 0){
                    q.add(nbrs);
                }
            }
        }
    }

    public static void main(String[] args){
        Topological_Sort ts = new Topological_Sort(8);
        ts.addEdge(1, 2);
        ts.addEdge(1, 0);
        ts.addEdge(1, 4);
        ts.addEdge(4, 3);
        ts.addEdge(3, 2);
        ts.addEdge(4, 5);
        ts.addEdge(5, 7);
        ts.addEdge(6, 3);
        ts.addEdge(6, 7);
        ts.topological();
    }
}
