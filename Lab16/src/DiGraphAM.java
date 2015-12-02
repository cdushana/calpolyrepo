
public class DiGraphAM {
	
	private int[][] adjTable;
	
	/*
	 * Creates a new directed graph with an adjacency matrix array
	 */
	public DiGraphAM(int N) {
		adjTable = new int[N][N];
	}
	
	/*
	 * Adds an edge between the provided vertices on the graph
	 * @param int - first vertex (start)
	 * @param int - second vertex (end)
	 */
	public void addEdge(int vertex1, int vertex2) {
		adjTable[vertex1][vertex2] = 1;
	}
	
	/*
	 * Deletes the edge between the two provided vertices if it exists
	 * @param int - first vertex (start)
	 * @param int - second vertex (end)
	 */
	public void deleteEdge(int vertex1, int vertex2) {
		adjTable[vertex1][vertex2] = 0;
	}
	
	/*
	 * Returns the number of edges in the adjacency matrix
	 * @return int - number of edges in matrix
	 */
	public int edgeCount() {
		int edges = 0;
		
		for(int i = 0; i < adjTable.length; i++) {
			for(int j = 0; j < adjTable[i].length; j++) {
				if(adjTable[i][j] > 0) {
					edges++;
				}
			}
		}
		
		return edges;
	}

	/*
	 * Returns the number of vertices in the adjacency matrix (N)
	 * @return int - number of vertices in matrix
	 */
	public int vertexCount() {
		return adjTable.length;
	}
	
	/*
	 * Prints out the graph
	 */
	public void print() {
		System.out.println();
		
		for(int i = 0; i < adjTable.length; i++) {
			System.out.print(i + " is connected to: ");
			
			for(int j = 0; j < adjTable[i].length; j++) {
				if(adjTable[i][j] > 0) {
					System.out.print(j + ", ");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Returns an array of the indegree values of corresponding vertex indexes
	 * @return int[] - array of integers containing the indegrees of each vertex
	 */
	private int[] indegrees() {
		int[] indeg = new int[vertexCount()];
		int degree = 0;
		
		for(int i = 0; i < adjTable.length; i++) {
			for(int j = 0; j < adjTable.length; j++) {
				if(adjTable[j][i] != 0) {
					degree++;
				}
			}
			
			indeg[i] = degree;
			degree = 0;
		}
		
		return indeg;
	}
	
	/*
	 * Sorts vertices based on indegree values (height along the graph)
	 */
	public int[] topSort() {
		int[] sortVerts = new int[vertexCount()];
		int[] degrees = indegrees();
		
		for(int i = 0; i < sortVerts.length - 1; i++) {
			// use a sort algorithm here
		}
		
		return sortVerts;
	}
}
