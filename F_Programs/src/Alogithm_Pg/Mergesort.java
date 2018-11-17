package Alogithm_Pg;

public class Mergesort {

	int[] array;
	int[] tempMergeArray;
	int length;

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 4, 6 };
		Mergesort ms = new Mergesort();
		ms.sort(a);
		for(int i : a)
		{
			System.out.println(i+ " ");
		}
	}

	private void sort(int[] a) {
		this.array = a;
		this.length = a.length;
		this.tempMergeArray = new int[length];
		divideArray(0, length - 1);

	}

	public void divideArray(int lowerindex, int higherindex) {
		if (lowerindex < higherindex) {
			int middle = lowerindex + (higherindex - lowerindex) / 2;
			
			divideArray(lowerindex, middle);
			
			divideArray(middle + 1, higherindex);
			mergeSort(lowerindex, middle, higherindex);
		}
	}

	public void mergeSort(int lowerindex, int middle, int higherindex) {
		for (int i = lowerindex; i <= higherindex; i++) {
			tempMergeArray[i] = array[i];
		}
		int i = lowerindex;
		int j = middle + 1;
		int k = lowerindex;

		while (i <= middle && j <= higherindex) {
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;

		}
		while(i<=middle)
		{
			array[k]=tempMergeArray[i];
		}

	}
}