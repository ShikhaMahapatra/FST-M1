package activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] randomNums = {4, 3, 2, 10, 12, 1, 5, 6};
        System.out.println("Array before sorting ");
        displayArray(randomNums);
        int[] sortedArray=sort(randomNums);
        System.out.println("Sorted Array ");
        displayArray(sortedArray);
    }
    public static void displayArray(int[] elements)
    {
        for (int m=0;m<elements.length;m++)
        {
            System.out.print(elements[m]+" ");
        }
        System.out.print("\n");
    }
    public static int[] sort(int[] unsortedArray)
    {
        int[] array=unsortedArray;
        int len = array.length;
        int j, temp;
        for (int i=1; i<len; i++) {
            int ele = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > ele)
            {
                array[j + 1] = array[j];
                --j;
            }
            array[j+1] = ele;
        }
        return array;
    }
}
