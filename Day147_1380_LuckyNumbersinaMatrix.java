class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int num=0;
        List<Integer>list=new ArrayList();
        for(int i=0;i<matrix.length;i++)
            Row(i, matrix, list);
        return list;
    }
    public void Row(int row, int[][] matrix, List<Integer>list)
    {
        int min=Integer.MAX_VALUE, col=0;
        for(int i=0; i<matrix[row].length;i++)
            if(matrix[row][i]<min)
                {
                    min=matrix[row][i];
                    col=i;
                }
        Col(row, col, matrix, list);
    }
    public void Col(int row, int col, int[][] matrix, List<Integer>list)
    {
        for(int i=0;i<matrix.length;i++)
            if(matrix[i][col]>matrix[row][col])
            {
                return;
            }
        list.add(matrix[row][col]);
    }
}
