package DFS;

import java.util.Iterator;
import java.util.LinkedList;

 class graphDFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Graph creation
    graphDFS(int vert) {
        adjLists = new LinkedList[vert];
        visited = new boolean[vert];

        for (int i = 0; i < vert; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // DFS traversal
    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String args[]) {
        graphDFS g = new graphDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Traversal Output: "+
                "(Starting From Vertex 2)");

        g.DFS(2);
    }
}
