package LeetCode75;

import java.util.Arrays;

public class Day33_MatrixSimilarityAfterCyclicShifts {

	public static void main(String[] args) {
		int[][]mat= {{1,2,1},{21,12,1}};
		System.out.println(areSimilar(mat, 3));
	}
	  public static boolean areSimilar(int[][] mat, int k) {
		  int[][] temp = new int[mat.length][mat[0].length];
		    for (int i = 0; i < mat.length; i++) {
		        System.arraycopy(mat[i], 0, temp[i], 0, mat[i].length);
		    }
	        for(;k>0;k--)
	        {
	        	for(int i=0;i<mat.length;i++)
	        	{
	        		 if((i+1)%2==0)
	        		 {
	        			 int flag=mat[i][0], j=0;
	        			 for(;j<mat[i].length-1;j++)
	        			 {
	        				 mat[i][j]=mat[i][j+1];
	        			 }
	        			 mat[i][j]=flag;
	        		 }
	        		 else
	        		 {
	        			 int j=mat[i].length-1, flag=mat[i][j];
	        			 for(;j>0;j--)
	        			 {
	        				 mat[i][j]=mat[i][j-1];
	        			 }
	        			 mat[i][0]=flag;
	        		 }
	        	}
	        }

	        return Arrays.deepEquals(mat, temp);
	        
	    }
}
