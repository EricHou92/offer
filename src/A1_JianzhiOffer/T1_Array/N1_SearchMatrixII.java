package A1_JianzhiOffer.T1_Array;

public class N1_SearchMatrixII {

	//给定M×N矩阵，每一行、每一列都按升序排列，判断是否存在某元素。
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0)
			return false;
		int row = matrix.length-1;
		int column = 0;
		while (row >= 0 && column <= matrix[0].length-1) {
			if(target < matrix[row][column])
				row--;
			else if(target > matrix[row][column])
				column++;
			else
				return true;
		}
		return false;
	}

	//返回所查找元素的二元数组
	public int[] findElement(int[][] matrix, int target) {
		int row = matrix.length-1;
		int column = 0;
		while (row >= 0 && column <= matrix[0].length-1) {
			if(target < matrix[row][column])
				row--;
			else if(target > matrix[row][column])
				column++;
			else
				return new int[]{row,column};
		}
		return new int[]{};
	}

}
