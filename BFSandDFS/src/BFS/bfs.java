package BFS;

import java.util.Iterator;
import java.util.LinkedList;

 class graphBFS {

    private int Vert; //NUmber of Vertices
    private LinkedList<Integer> adj[]; //adjacency list

    graphBFS(int vert){ //constructor

        Vert = vert;
        adj = new LinkedList[vert];

        for (int i = 0; i< vert; ++i) {
            adj[i] = new LinkedList();
        }
    }

    //addEdge to graph function
     void addEdge(int v,int w)
     {
         adj[v].add(w);
     }

     //implement bfs traversal
     void BFS(int src)
     {

         boolean visit[] = new boolean[Vert];

         LinkedList<Integer> queue = new LinkedList<Integer>();

         visit[src]=true;
         queue.add(src);

         while (queue.size() != 0)
         {

             src = queue.pop();
             System.out.print(src+" ");

             Iterator<Integer> i = adj[src].listIterator();
             while (i.hasNext())
             {
                 int n = i.next();
                 if (!visit[n])
                 {
                     visit[n] = true;
                     queue.add(n);
                 }
             }
         }
     }

        public static void main (String[] args) {
            graphBFS g = new graphBFS(4);

            g.addEdge(0, 1); //add graph
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Breadth First Traversal Output: "+
                    "(Starting From Vertex 2)");

            g.BFS(2);//give starting vertex
        } // end main method
    } // end class

