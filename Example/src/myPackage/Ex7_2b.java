package myPackage;

/* getSum(double[][] arr, int row) − returns the sum of elements in the indexed row of 2D array arr
   getAverage(double[][] arr, int column) − returns the average of elements in the indexed column of 2D array arr
*/

public class Ex7_2b {

	public static void main(String[] args) {
		
		double [][]arr ={{1.0,2.0,3.0},
						{4.0,5.0,6.0},
						{7.0,8.0,9.0},
						{10.0,11.0,12.0}};
	
		double sum1 = getSum(arr);
		double sum2 = getRowSum(arr,3);
		double avg1 = getAverage(arr);
		double avg2 = getColAverage(arr,2);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(avg1);
		System.out.println(avg2);
		
	}
	
	public static double getSum(double[][] arr) {
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j < arr[i].length; j++){
				sum += arr[i][j];
			}
		}
		return sum;	
	}
	
	public static double getRowSum(double[][] arr, int row) {
		double sum = 0.0;
		for(int i=0; i<arr[row].length; i++) {
				sum += arr[row][i];	
		}
		return sum;	
	}
	
	
	public static double getAverage(double[][] arr) {
		double sum=0.0;
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				sum += arr[i][j];
				count++;
			}
		}
		return sum/count;
	}
	
	public static double getColAverage(double[][] arr, int column) {
		double sum=0.0;
		int count=0;
		
		for(int i=0;i<arr.length;i++){
				sum += arr[i][column];
				count++;
		}
		return sum/count;
	}
}
