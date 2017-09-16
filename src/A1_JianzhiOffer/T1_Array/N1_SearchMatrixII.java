package A1_JianzhiOffer.T1_Array;

public class N1_SearchMatrixII {

	//一个二维数组中，每行从左到右递增排序，每列从上到下递增排序,输入一个二维数组和一个整数，判断数组中是否含有该整数。
	public boolean Find(int[][] matrix, int target) {
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
}
