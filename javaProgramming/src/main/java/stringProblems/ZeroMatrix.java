package stringProblems;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ma = {{1,2,3,0},{4,5,6,7},{5,7,64,2},{9,2,2,1}};
		for(int i=0; i<ma.length; i++) {
			for(int j=0; j <ma.length;j++ ) {
				System.out.print(ma[i][j]+",");
			}
			System.out.println("");
		}
		int[][] ra = checkZero(ma);
		System.out.println("Zerod checked : ");
		for(int i=0; i<ra.length; i++) {
			for(int j=0; j <ra.length;j++ ) {
				System.out.print(ra[i][j]+",");
			}
			System.out.println("");
		}
		}

	private static int[][] checkZero(int[][] ma) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<ma.length; i++) {
			for(int j=0; j <ma.length;j++ ) {
				if(ma[i][j]==0) {
					for(int k =0;k<ma.length;k++) {
						ma[i][k]=0;
					}
				}
			}
		
		}
		return ma;
	}

}
