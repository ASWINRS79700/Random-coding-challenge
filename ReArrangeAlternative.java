import java.util.Arrays;




// Given an array arr = [1, 2, 3, -1, -3, -4], rearrange it in-place so that positive and negative numbers appear alternately, while maintaining their relative order. Extra space is not allowed (O(1) space). 
// Expected Output: // [1, -1, 2, -3, 3, -4]
class ReArrangeAlternative {

    // Function to right rotate subarray from outOfPlace to current
    private static void rightRotate(int[] arr, int outOfPlace, int current) {
        int temp = arr[current];
        for (int i = current; i > outOfPlace; i--) {
            arr[i] = arr[i - 1];
        }
        arr[outOfPlace] = temp;
    }

    public static void rearrange(int[] arr) {

        int n = arr.length;
        int outOfPlace = -1;

        for (int index = 0; index < n; index++) {

            // If no outOfPlace found yet
            if (outOfPlace == -1) {

                // Check if current index is wrongly placed
                if ((arr[index] >= 0 && index % 2 == 1) ||
                    (arr[index] < 0 && index % 2 == 0)) {

                    outOfPlace = index;
                }
            }

            // If we already found an out-of-place element
            if (outOfPlace >= 0) {

                // Check if current element can fix it
                if ((arr[outOfPlace] >= 0 && arr[index] < 0) ||
                    (arr[outOfPlace] < 0 && arr[index] >= 0)) {

                    // Right rotate
                    rightRotate(arr, outOfPlace, index);

                    // Update outOfPlace
                    if (index - outOfPlace > 2) {
                        outOfPlace = outOfPlace + 2;
                    } else {
                        outOfPlace = -1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -1, -3, -4};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
}