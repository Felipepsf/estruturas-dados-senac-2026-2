import java.util.ArrayList;
import java.util.List;

public class GrafoMatriz {
    private int [][] matriz;
    private int numVertices;

    public GrafoMatriz(int numVertices) {
        this.numVertices = numVertices;
        this.matriz = new int [numVertices] [numVertices];
    }

public void adicionarAresta(int origem, int destino){
    matriz [origem] [destino] = 1; //grafo direcionado
    matriz [destino] [origem] = 1; //grafo nao direcionado (do 0(coluna) pro 3(linha))
}
public boolean existeAresta(int origem, int destino) {
    return matriz[origem][destino] == 1;
}

public void mprimir () {
    for(int i=0; i<numVertices; i++){
        for(int j=0; j<numVertices; j++){
            System.out.println(matriz[i][j] + " ");
        }
        System.out.println();
    }
}

public class GrafoLista{
    private List<List<Integer>> adj;
    private int numVertices;

    public GrafoLista(int numVertices) {
        this.numVertices = numVertices;
        this.adj = new ArrayList<>();
        for (int i = 0; i<numVertices; i++){
            adj.add(new ArrayList<>());
        }
    }
}

public void adicionarAresta (int origem, int destino) {
    adj.get(origem).add(destino);
    adj.get(destino).add(origem); //nao direcionado
}
public List<Integer> vizinhos(int v){
    return adj.get(v);
}
public int grau(int v){
    return adj.get(v).size();
}

public void imprimir() {
    for(int i=0; i<numVertices;i++) {
        System.out.println(i + "->" + adj.get(i));
    }
}

public static void main (String[]args) {
    GrafoLista g = new GrafoLista(5);
    g.adicionarAresta(0,1);
    g.adicionarAresta(0,2);
    g.adicionarAresta(1,2);
    g.adicionarAresta(1,3);
    g.adicionarAresta(3,4);
    g.imprimir();
    System.out.println("Grau de 1: " + g.grau(1));
}

}
