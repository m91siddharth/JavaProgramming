package stringProblems;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ma = {{1,2,3,4},{4,5,6,7},{5,7,64,2},{9,0,2,1}};
		for(int i=0; i<ma.length; i++) {
			for(int j=0; j <ma.length;j++ ) {
				System.out.print(ma[i][j]+",");
			}
			System.out.println("");
		}
		int[][] ra = rotatedArray(ma);
		System.out.println("Rotated array : ");
		for(int i=0; i<ra.length; i++) {
			for(int j=0; j <ra.length;j++ ) {
				System.out.print(ra[i][j]+",");
			}
			System.out.println("");
		}
	}

	private static int[][] rotatedArray(int[][] ma) {
		// TODO Auto-generated method stub
		int n = ma.length;
		for(int layer=0; layer < n/2; layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i=first; i <last;i++ ) {
				int offset = i-first;
				int top = ma[first][i];
				ma[first][i] = ma[last-offset][first];
				ma[last-offset][first] = ma[last][last-offset];
				ma[last][last-offset]=ma[i][last];
				ma[i][last]=top;
			}
		}
		return ma;
	}

}
