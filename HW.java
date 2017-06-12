import java.util.Arrays;
import java.util.Scanner;

/*import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Linkin on 12.06.2017.
 */
public class HW {
    public static void main(String[] args) {
        int numberMenu;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int x = reader.nextInt();
        int[] n = new int[x];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter numbers to array ");
            n[i] = reader.nextInt();
        }
        String arrayNumber = Arrays.toString(n);
        System.out.println("Your array :" + arrayNumber);
        System.out.println("Menu ");
        System.out.println("1.Sort array ");
        System.out.println("2.Find number to array ");
        System.out.println("Please enter number of menu : ");

        numberMenu = reader.nextInt();
        switch (numberMenu) {
            case 1:
                String s = Arrays.toString(n);
                System.out.println("Not sorted array : " + s);
                Arrays.sort(n);
                String res = Arrays.toString(n);
                System.out.println("Sorted arrays :" + res);
                break;
            case 2:
                System.out.println("Enter your number ");
                int findNumberToArray;
                int v = 0;
                findNumberToArray = reader.nextInt();
                for (int i = 0; i < n.length; i++) {
                    if (findNumberToArray == n[i]) {
                        System.out.println("Your element" + findNumberToArray + " in array on position # " + (i+1));
                        v = v + 1;
                    }
                }
                if (v == 0) {
                    System.out.println("Element not found in array ");
                }
        }
    }
}
