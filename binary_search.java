import java.util.Scanner;  // Import this to use Arrays.sort()

public class binary_search {
    public static int binary_search1(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] > key) {
                end = mid - 1;
            } else if (num[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] ={10,20,30,55,65,210};
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element: ");
        target = sc.nextInt();
        int result = binary_search1(numbers, target);
        if (result == -1) {
            System.out.println("Target element not found!");
        } else {
            System.out.println("Your target element: " + target + " is at index " + result);
        }
        sc.close();
    }
}
