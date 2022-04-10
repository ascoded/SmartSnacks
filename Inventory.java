/**
 * Inventory
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private ArrayList list;
    ArrayList<String> itemList = new ArrayList<>();

    public void addItem() {
        Scanner add = new Scanner(System.in);  
        System.out.println("Enter item");

        String newItem = add.nextLine();  
        System.out.println("New item: " + newItem); 
        itemList.add(newItem);
        System.out.println(itemList);
    }

    public void removeItem() {
        Scanner remover = new Scanner(System.in);  
        System.out.println("Enter item");

        String toRemove = remover.nextLine();  
        System.out.println("Removed item: " + toRemove); 
        itemList.remove(toRemove);
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}