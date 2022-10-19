package Array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        printInstructions();
        boolean quit = false;
        int choice = 0;
        while(!quit){
            System.out.print("Enter your choice: ");
             choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\npress");
        System.out.println("0 - to print choices.");
        System.out.println("1- to print list of grocery.");
        System.out.println("2- to add an item to the list.");
        System.out.println("3 - to modify an item in the list.");
        System.out.println("4 - to remove an item from the list.");
        System.out.println("5- to search an item in the list.");
        System.out.println("6- to quit the application.");
    }
    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter item name: ");
        String item= sc.nextLine();
        System.out.print("Enter new item name: ");
        String newItem= sc.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }
    public static void removeItem(){
        System.out.print("Enter item name: ");
        String item = sc.nextLine();
        groceryList.removeGroceryItem(item);
    }
    public static void searchItem(){
        System.out.print("Enter name of search item: ");
        String item = sc.nextLine();
        if(groceryList.onFile(item)){
            System.out.println("Found "+item+ " in the grocery list.");
        }else{
            System.out.println(item+" not found in the grocery list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
