// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int Binary(int t, int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 67, 75, 85, 95};
        int target = 75;
        System.out.println(Binary(target, arr) + " " + target);
    }
}
