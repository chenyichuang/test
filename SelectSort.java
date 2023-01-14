import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 2, 1, 9, 4, 10, 6, 7, 6, 1, 13, 36 };
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	//選擇排序
	public static void selectSort(int[] arr) {
		//依序走訪陣列中的每個數
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			//依序比較陣列中，每個數的後面所有數，紀錄最小數的位置
			for (int j = i + 1; j < arr.length; j++) {
				//只要循環到後方的數，小於原紀錄最小的數
				if (arr[minIndex] > arr[j]) {
					//就把最新一次紀錄的最小數存到minIndex
					minIndex = j;
				}
			}
			
			//如果  minIndex 不等於 i，表示i位置並不是最小，把i位置跟minIndex位置調換
			if (minIndex > i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}

		}

	}

}
//嘗試第2次修改
