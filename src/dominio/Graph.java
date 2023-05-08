package dominio;
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
    public boolean containsVertex(V v){
        if(adjacencyList.containsKey(v)){
            return true;
        }
        return false;
    }
    public Set<V> obtainAdjacents(V v) throws Exception{
        if (!adjacencyList.containsKey(v)) {
            throw new Exception("El grafo no contiene el vértice dado");
        }

        return adjacencyList.get(v);
    }
    public String toString(){
        return adjacencyList.toString();
    }
    public static <V> void decodificar(V v1,V v2,Map<V,V> traza){
        Stack<V> pila = new Stack<>();
        pila.push(v2);
        V actual = v2;
        while(!actual.equals(v1)){
            actual = traza.get(actual);
            pila.push(actual);
        }
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
    public Map<V,V> onePath(V v1, V v2){
        Set<V> pisados = new HashSet<>();
        Map<V, V> traza = new HashMap<>();
        Stack abierta = new Stack();
        abierta.push(v1);
        traza.put(v1,v1);
        boolean encontrado = false;

        while(!abierta.isEmpty() && !encontrado){
            V actual=(V)abierta.pop();
            pisados.add(actual);
            if(actual.equals(v2)) {
                encontrado = true;
            }
            if(encontrado==false){
                for(V ady:adjacencyList.get(actual)){
                    if(!pisados.contains(ady)){
                        abierta.push(ady);
                        traza.put(ady, actual);
                    }
                }
            }

        }
        return traza;



    }

    
}