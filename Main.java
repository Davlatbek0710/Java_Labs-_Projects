
/*
   Lab Assignment # 4
   Kobiljonov Davlatbek
   id: u2210118
   date: 13/10/23 17:35
 */


import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputValues(arr, sc);
                    break;
                case 2:
                    retrieveByIndex(arr, sc);
                    break;
                case 3:
                    retrieveByValue(arr, sc);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid sc. Please try again.");
            }
        }
    }
    private static void displayMenu() {
        System.out.println("1. Insert value into the array");
        System.out.println("2. Retrieve value from the array by index");
        System.out.println("3. Retrieve value from the array by value");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void inputValues(int[] array, Scanner input) {
        System.out.println("Enter the index of the array");
        int index = input.nextInt();
        if (index >= 0 && index < array.length) {
            System.out.println("Enter the value of the array");
            int value = input.nextInt();
            array[index] = value;
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void retrieveByIndex(int[] array, Scanner input) throws Exception{
        System.out.println("Enter the index of the array");
        int index = input.nextInt();
        try{
        if (index >= 0 && index < array.length) {
            System.out.println("The value of the array at index " + index + " is " + array[index]);
        } else {
            throw new ArrayIndexOutOfBoundsException("The index " + index + " is out of bound of the array");
        }}
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void retrieveByValue(int[] array, Scanner input){
        System.out.println("Enter the value of the array");
        int value = input.nextInt();
        boolean found = false;
        try{
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("The value " + value + " is at index " + i);
                found = true;
            }
        }
        if (!found) {
            throw new NumberNotFoundException("Number "+value +" not found");
        }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}