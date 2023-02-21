package graph;

import java.util.*;
class Graphs{
	Scanner sc=new Scanner(System.in);
	int numOfVertices;
	ArrayList<Edge>[] graph;
	
	private class Edge{
		int source;
		int destination;
		int weight;
		Edge(int source,int destination,int weight){
			this.source=source;
			this.destination=destination;
			this.weight=weight;
		}
	}
	Graphs(){
//		System.out.println("Enter number of Vertices:");
		numOfVertices=sc.nextInt();
		graph=new ArrayList[numOfVertices];
	}
	
	void createGraph() {
		int numOfEdges;
		for(int i=0;i<numOfVertices;i++)
		{
//			System.out.println("Enter num of neighbours of vertex"+i);
			numOfEdges=sc.nextInt();
			graph[i]=new ArrayList<Edge>();
//			System.out.println("Enter neighbours of vertex"+i);
//			if(numOfEdges>0) {
				for(int j=0;j<numOfEdges;j++)
				{
					graph[i].add(new Edge(i,sc.nextInt(),sc.nextInt()));
				}
				
//			}
		}
	}
	
	void displayNeighbour()
	{
		int neighbourOf;
//		System.out.println("Whose neighbour do you want?");
		neighbourOf=sc.nextInt();
		int neighbour;
		for(int i=0;i<graph[neighbourOf].size();i++)
		{
			Edge e=graph[neighbourOf].get(i);
			neighbour=e.destination;
			System.out.print(neighbour+" ");
		}
		System.out.println();
		
	}
	
	void bfs(boolean[] visited, int start)
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int current=q.remove();
			if(visited[current]==false) {
				System.out.print(current+" ");
				visited[current]=true;
				for(int i=0;i<graph[current].size();i++)
				{
					Edge e=graph[current].get(i);
					q.add(e.destination);
				}
			}
		}
	}
	void bfs() {
		boolean[] visited=new boolean[numOfVertices];
		for(int i=0;i<numOfVertices;i++)
			{if(visited[i]==false)bfs(visited,i);}
		System.out.println();
	}
	
	
	void dfs(boolean[] visited,int start) {
		System.out.print(start+" ");
		visited[start]=true;
		for(int i=0;i<graph[start].size();i++)
		{
			Edge e=graph[start].get(i);
			if(visited[e.destination]==false) dfs(visited,e.destination);
		}
	}
	void dfs() {
		boolean[] visited=new boolean[numOfVertices];
		for(int i=0;i<numOfVertices;i++)
			{if(visited[i]==false)dfs(visited,i);}
		System.out.println();
		
	}
	private class Pair implements Comparable<Pair>{
		int vertex;
		int distance;
		Pair(int vertex, int distance){
			this.vertex=vertex;
			this.distance=distance;
		}
		@Override
		public int compareTo(Pair p) {
			return this.distance-p.distance;
		}
	}
	int[] dijkstra(int source) {
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		int[] distance=new int[numOfVertices];
		for(int i=0;i<numOfVertices;i++) {
			if(i!=source) distance[i]=Integer.MAX_VALUE;
		}
		boolean[] visited=new boolean[numOfVertices];
		pq.add(new Pair(source,0));
		while(!pq.isEmpty()) {
			Pair current=pq.remove();
			if(!visited[current.vertex]) {
				visited[current.vertex]=true;
				for(int i=0;i<graph[current.vertex].size();i++) {
					Edge e= graph[current.vertex].get(i);
					int x=e.source;
					int y=e.destination;
					if(distance[x]+e.weight<distance[y]) {
						distance[y]=distance[x]+e.weight;
						pq.add(new Pair(y,distance[y]));
					}
				}
			}
		}
		return distance;
	}
	
	
	
	void dijkstra()
	{
		int source=sc.nextInt();
		int[] distance=dijkstra(source);
		for(int i=0;i<distance.length;i++)
			System.out.print(distance[i]+" ");
		System.out.println();
	}
	/*
	6
	2
	1 100 2 2
	2
	2 1 3 2
	1
	4 1
	1
	5 5
	0
	0
	0
		
	 */	
	int[] bellmanFord(int source) {
		int[]distance=new int[numOfVertices];
		for(int i=0;i<numOfVertices;i++) {
			if(i!=source) distance[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<numOfVertices;i++)
			for(int j=0;j<graph[i].size();j++) {
				Edge e= graph[i].get(j);
				int x=e.source;
				int y=e.destination;
				if(distance[x]!=Integer.MAX_VALUE && distance[x]+e.weight<distance[y])
					distance[y]=distance[x]+e.weight;
			}
		return distance;
	}
	
	void bellmanFord(){
		int source=sc.nextInt();
		int[] distance=bellmanFord(source);
		for(int i=0;i<distance.length;i++)
			System.out.print(distance[i]+" ");
		System.out.println();

	}
/*
6
2
1 1 2 2
2
2 -2 3 2
1
4 1
1
5 -1
2
3 3 5 4
0
0
0
	
 */
	
	
}
public class GraphsDS {

	public static void main(String[] args) {
		Graphs g= new Graphs();
		g.createGraph();
////		g.displayNeighbour();
//		g.bfs();
//		g.dfs();
		g.dijkstra();
		g.bellmanFord();
	}

}
/*
		   2
		 /   \
 		0     1 - 4    5-6-7    //disconnected graphs   
 		 \  /
 		   3 
 */
/*
 *  
 *  print ->0 2 3 1 4 5 6 7 bfs
 *  print -> 0 2 1 3 4 5 6 7 dfs
 *  
 *  
 *  
 */

/*
		   1
		 /   \
		9     7 - 11    4-8-19    //disconnected graphs   
		 \   /
		   2 
*/
/*
 *  
 *  print ->9 1 2 7 11 4 8 19 bfs
 *  print -> 9 1 7 2 11 4 8 19 dfs
 *  
 *  {{9,1},{9,2},{1,9},{1,7}..........{8,19}}
 *  
 */


/*
0 -> {{0,2},{0,3}}
1 -> {{1,2},{1,3},{1,4}}
2 -> {{2,0},{2,1}}
3 -> {{3,0},{3,1}}
4 -> {{4,1}}
*/
/*
8
2
2 3
3
2 3 4
2
0 1
2
0 1
1
1
1
6
2
5 7
1
6
*/



/*
 G22
 
 1155
 1555
 1603
 
 
 G23
 
 1627
 3626
 1671
 1737
 1735
 1676
 1762
 1651
 1754
 1951
 3660
 1666
 1726
 1757
 
 
 
 
 */



