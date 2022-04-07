import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 30};
        int[] newArr = duplicates(arr);
        System.out.println(Arrays.toString(newArr));
    }

    static int[] duplicates(int[] arr) {
        int[] newArr = new int[0];
        int temp = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1] = 0;
            }

            if (arr[i] != 0) {
                temp++;
            }
        }
        newArr = new int[temp];
        for (int k : arr) {
            for (int j = 0; j < newArr.length; j++) {
                if (k != 0) {
                    newArr[j] = k;
                } else {
                    break;
                }
            }
        }
        return newArr;
    }
}
