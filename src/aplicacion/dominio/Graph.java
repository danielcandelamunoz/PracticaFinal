package aplicacion.dominio;
import java.util.*;
public class Graph<V> {
    private Map<V, Set<V>> adjacencyList = new HashMap<>();
    public boolean addVertex(V vertice){
        if (adjacencyList.containsKey(vertice)) {
            return false;
    }
    adjacencyList.put(vertice, new HashSet<>());
        return true;
}
    public boolean addEdge(V v1, V v2){
        if(!adjacencyList.containsKey(v1)){
            adjacencyList.put(v1, new HashSet<>());

        }
        if (!adjacencyList.containsKey(v2)){
            adjacencyList.put(v2, new HashSet<>());
        }
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
        return true;
    }
    

    
}