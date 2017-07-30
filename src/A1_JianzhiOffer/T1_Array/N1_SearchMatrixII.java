package A1_JianzhiOffer.T1_Array;

public class N1_SearchMatrixII {

	public boolean Find(int[][] matrix, int target) {
		//思路：首先我们选择从左下角开始搜寻，
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
