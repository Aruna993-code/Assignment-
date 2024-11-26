//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sorting and Searching Application!");

        // Input the list of integers
        System.out.print("Enter the number of integers you want to sort: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Select sorting algorithm
        System.out.println("Choose a sorting algorithm:\n1. Bubble Sort\n2. Selection Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            arr = Bubblesort.sort(arr);
        } else if (choice == 2) {
            arr = SelectionSort.sort(arr);
        } else {
            System.out.println("Invalid choice! Exiting.");
            return;
        }

        // Display sorted array
        System.out.print("Sorted List: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Binary search
        System.out.print("Enter the number to search for in the sorted list: ");
        int target = scanner.nextInt();
        int result = BinarySearch.search(arr, target);
        if (result != -1) {
            System.out.println("Number found at position " + (result + 1) + ".");
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("Thank you for using the application!");
        scanner.close();
    }
}
