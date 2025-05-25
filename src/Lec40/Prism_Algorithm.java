package Lec40;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prism_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prism_Algorithm(int v) {
        map = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void PrismAlgo(){
        PriorityQueue<PrismPair> pq = new PriorityQueue<>(new Comparator<PrismPair>() {
            @Override
            public int compare(PrismPair o1, PrismPair o2) {
                return o1.cost - o2.cost;
            }
        });

        HashSet<Integer> visited = new HashSet<>();

        pq.add(new PrismPair(1, 1,0));
        while(!pq.isEmpty()){
            // 1. remove
            PrismPair rp = pq.poll();

            // 2. Ignore if already existed
            if(visited.contains(rp.vtx)){
                continue;
            }
            // 3. marked visited
            visited.add(rp.vtx);
            // 4. self work
            System.out.println(rp);

            // 5. Add unvisited nbrs
            for (int nbrs : map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)) {
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new PrismPair(nbrs,  rp.vtx, cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Prism_Algorithm pa = new Prism_Algorithm(7);
        pa.addEdge(1, 2, 2);
        pa.addEdge(2, 3, 3);
        pa.addEdge(1, 4, 10);
        pa.addEdge(4, 5, 8);
        pa.addEdge(3, 4, 1);
        pa.addEdge(5, 6, 5);
        pa.addEdge(5, 7, 6);
        pa.addEdge(6, 7, 4);

        pa.PrismAlgo();
    }


    static class PrismPair{
        int vtx;
        int acqvtx;
        int cost;

        public PrismPair(int vtx, int acqvtx, int cost){
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }

        @Override
        public String toString(){
            return this.vtx+ " "+this.acqvtx+ " @ "+this.cost;
        }
    }
}
