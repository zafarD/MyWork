package Array_list;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        int size = groceryList.size();
        System.out.println("You have "+size+" items in your grocery list.");
        for(String i : groceryList){
            System.out.println(i);
        }
    }

    public void modifyGroceryItem(String item, String newItem){
        int position = findItem(item);
        if(position>=0){
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position, String name){
        groceryList.set(position-1,name);
        System.out.println("Grocery item "+ (position)+" has been modified.");
    }
    public void removeGroceryItem(String newItem){
        int position = findItem(newItem);
        if(position>=0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item "+theItem+" has been removed.");
    }

    private int findItem(String searchItem){
//        boolean exits = groceryList.contains(searchItem); // return true or false
//        int position = ; // return -1 if not belongs
//        if(position>=0){
//            return groceryList.get(position);
//        }
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }else{
            return false;
        }
    }
}
