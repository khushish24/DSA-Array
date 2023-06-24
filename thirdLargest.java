import java.util.Arrays;

public class thirdLargest {
    // method-1
    static int findNthLargest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        int arr[] = { 50, 20, 40, 18, 30, 60, 78, 38 };
        int result = findNthLargest(arr);
        System.out.println("Third largest element from method 1: "+result);

        // method-2
        int first = 0;
        int sec = -2;
        int third = -3;
        // first find first largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[first]) {
                first = i;
            }
        }
        // for second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[first]) {
                if (sec < 0) {
                    sec = i;
                } else if (arr[i] > arr[sec]) {
                    sec = i;
                }
            }
        }
        // find third largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[first] && arr[i] != arr[sec]) {
                if (third < 0) {
                    third = i;
                } else if (arr[i] > arr[third]) {
                    third = i;
                }
            }
        }
        System.out.println("Third largest element from method 2: "+arr[third]);
    }
}
