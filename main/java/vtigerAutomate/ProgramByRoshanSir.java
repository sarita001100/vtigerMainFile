package vtigerAutomate;

public class ProgramByRoshanSir {

	public static void main(String[] args) {
//finding maximum number
		int a[] = { 2, 4, 5, 3, 7, 8, 9, 21 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("maximun number is" + max);

// finding minimum number
		int ar[] = { 2, 4, 5, 3, 7, 8, 9, 21 };
		int mini = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < mini) {
				mini = ar[i];
			}
		}
		System.out.println("minimum number is" + mini);

// Ascending Order
		int[] arr = { 12, 43, 3, 54, 23, 14 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();

// Descending order
		int[] arra = { 2, 34, 12, 32, 15, 17, 19 };
		int temp1 = 0;
		for (int i = 0; i < arra.length; i++) {
			for (int j = i + 1; j < arra.length; j++) {
				if (arra[i] < arra[j]) {
					temp1 = arra[i];
					arra[i] = arra[j];
					arra[j] = temp1;
				}
			}
			System.out.print(arra[i] + " ");
		}
		System.out.println();

// find the duplicate number
		int array[] = { 1, 32, 43, 44, 32, 12 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("duplicate number is " + array[i]);
				}
			}
		}

	}

}
