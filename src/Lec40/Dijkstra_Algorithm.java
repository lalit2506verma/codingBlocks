package Lec40;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra_Algorithm(int v) {
        map = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class DijkstraPair{
        int vtx;
        String acqPath;
        int cost;

        public DijkstraPair(int vtx, String acqPath, int cost) {
            this.vtx = vtx;
            this.acqPath = acqPath;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return  this.vtx + " " + acqPath + " @ " + cost;
        }
    }

    public void Dijkstra(int src){
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2) {
                return o1.cost - o2.cost;
            }
        });

        HashSet<Integer> visited = new HashSet<>();

        pq.add(new DijkstraPair(src, ""+src, 0));
        while(!pq.isEmpty()){
            DijkstraPair rp = pq.poll();
            if(visited.contains(rp.vtx)){
                continue;
            }

            visited.add(rp.vtx);
            System.out.println(rp);

            for (int nbrs: map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs, rp.acqPath + nbrs, rp.cost + cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Dijkstra_Algorithm pa = new Dijkstra_Algorithm(7);
        pa.addEdge(1, 2, 2);
        pa.addEdge(2, 3, 3);
        pa.addEdge(1, 4, 10);
        pa.addEdge(4, 5, 8);
        pa.addEdge(3, 4, 1);
        pa.addEdge(5, 6, 5);
        pa.addEdge(5, 7, 6);
        pa.addEdge(6, 7, 4);
        pa.Dijkstra(1);

    }
}
