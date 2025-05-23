package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {

		showInlineArray(createAndInitializeArray(8));
	}

	public static int[] createAndInitializeArray(int num) {
		int[] array = new int[num];
		for (int i = 0; i<array.length; i++){
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] intArray) {
		for (int i = 0; i<intArray.length; i++){
			System.out.print(intArray[i]);
			if (i<intArray.length-1){
				System.out.print(" ");
			}
		}
	}
}
