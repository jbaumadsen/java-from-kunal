import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 42};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            swap(arr, start, end);
            end--;
            start++;
        }
//        for (int i = 0; i < arr.length/2; i++) {
//            swap(arr, i, arr.length - 1 -i);

//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 -i] = temp;
//        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
