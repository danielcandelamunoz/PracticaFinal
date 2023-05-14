package aplicacion;
import dominio.Graph;

/**
 * The type Principal.
 */
public class Principal {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //printeamos los metodos de la clase graph
        Graph<String> grafo = new Graph<>();
        grafo.addVertex("A");
        grafo.addVertex("B");
        grafo.addVertex("C");
        grafo.addVertex("D");
        grafo.addVertex("E");
        grafo.addVertex("F");
        grafo.addVertex("G");
        grafo.addVertex("H");
        //ahora agregamos las aristas
        grafo.addEdge("A", "B");
        grafo.addEdge("A", "C");
        grafo.addEdge("A", "D");
        grafo.addEdge("B", "E");
        grafo.addEdge("B", "F");
        grafo.addEdge("C", "G");
        grafo.addEdge("C", "H");
        grafo.addEdge("D", "H");
        System.out.println(grafo);
        System.out.println(grafo.containsVertex("A"));


    }
}
