import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW {

    public static void main(String[] args) {
        
        final int arraySize = 5;

        sortBuble(arrayHolder(arraySize));

    }
    
    private static int inputIntNumbers() throws Exception {
        
        int result;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            try {
                result = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Invalid input. Enter the number");
            }
        }
        return result;
    }


    private static int[] arrayHolder(int arraySize) {

        int arrayInt[] = new int[arraySize];

        int indexOfArray = 0;

        while (indexOfArray < arrayInt.length) {
            System.out.println("Array size: " + arraySize);
            System.out.println("Enter " + (indexOfArray + 1) + " element of the array");
            try {
                arrayInt[indexOfArray] = inputIntNumbers();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            indexOfArray++;
        }
        
        System.out.println("Initial array " + Arrays.toString(arrayInt));
        return arrayInt;
    }

    private static void sortBuble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            
            for (int j = arr.length - 2; j >= i; j--) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}
