public class reverseArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void revArr(int[] number) {
        int F = 0;
        int L = number.length - 1;
        while (F < L) {   
            swap(number, F, L); 
            F++;
            L--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {41, 25,96, 10};
        revArr(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");   
        }
    }
}
