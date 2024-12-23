int i = 0;
        List<Integer> ans = new ArrayList<>();

        // Rearrange array using cycle sort logic
        while (i < arr.length) {
            // Only process values in the range [1, n]
            int in = arr[i] - 1; // Calculate target index for current value
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[in]) {
                swap(arr, i, in); // Swap values to their correct positions
            } else {
                i++;
            }
        }

        // Identify duplicates by checking if values are not in their correct positions
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 && !ans.contains(arr[index])) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }