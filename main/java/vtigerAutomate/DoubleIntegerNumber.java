package vtigerAutomate;

public class DoubleIntegerNumber {
//repeted number
	public static void main(String[] args) {
int arr[]= {2,3,4,6,3};
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
		}
		}}


int[][]arar={{12,23},{34,44}};
for (int i = 0; i < arar.length; i++) {
	for (int j = 0; j < arar[i].length; j++) {
	System.out.print(arar[i][j]+" ");	
	}
	System.out.println();	
}
//linearnumber

int sam[]= {3,4,5,6,7,2};
int index=5;
for (int i = 0; i < sam.length; i++) {
	if(sam[i]==index) {
		System.out.println("index number of 5 number is- "+i);
	}
}System.out.println();

int a[]= {34,54,65,3,34};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j])
		System.out.println(a[i]+" ");
	}
}


}

}
