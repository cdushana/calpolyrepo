
public class DiGraphAM {
	
	private int[][] adjTable;
	
	public DiGraphAM(int N) {
		adjTable = new int[N][N];
	}
	
	public void addEdge(int vertex1, int vertex2) {
		adjTable[vertex1][vertex2] = 1;
	}
	
	public void deleteEdge(int vertex1, int vertex2) {
		adjTable[vertex1][vertex2] = 0;
	}
	
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

	public int vertexCount() {
		return adjTable.length;
	}
	
	public void print() {
		for(int i = 0; i < adjTable.length; i++) {
			System.out.println(i + "is connected to: ");
			
			for(int j = 0; j < adjTable[i].length; j++) {
				if(adjTable[i][j] > 0) {
					System.out.print("x" + j + ", ");
				}
			}
		}
	}
	
	private int[] indegrees() {
		int[] indeg = new int[vertexCount()];
	
		return indeg;
	}
	
	public int[] topSort() {
		int[] sortVerts = new int[vertexCount()];
		
		return sortVerts;
	}
}
