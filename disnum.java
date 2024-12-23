import java.util.ArrayList;
import java.util.List;

public class disnum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        disnum obj = new disnum();
        List<Integer> missingNumbers = obj.cycle(arr);
        System.out.println(missingNumbers);
    }

    public List<Integer> cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int in = arr[i] - 1; // Adjusted for 1-based indexing
            if (arr[i] <= arr.length && arr[i] != arr[in]) {
                swap(arr, i, in);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
