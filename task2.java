package javabasics;
import java.util.*;

class Item {
    int id;
    int quantity;
    int price;

    Item(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    void setPrice(int price) {
        this.price = price;
    }


    boolean Discount() {
        if (id == 5004 || id == 5005)
        	return true;
        return false;
    }
}

public class task2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int n = s.nextInt();
        
        Item[] items = new Item[n];
        
        System.out.println("Enter ID and quantity:");
        for (int i = 0; i < n; i++) {
            int id = s.nextInt();
            int quantity = s.nextInt();
            items[i] = new Item(id, quantity);
        }

        System.out.println("Enter price for each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Price of " + items[i].id + ": ");
            int price = s.nextInt();
            items[i].setPrice(price);
        }


        Item top = items[0];
        for (int i = 1; i < n; i++) {
            if (items[i].quantity > top.quantity) {
                top = items[i];
            }
        }

        System.out.println("Item " + top.id + " is top-selling item");

        if (top.Discount()) {
            System.out.println("Billing price: " + top.quantity * top.price * 0.8 );
        } else {
            System.out.println("Billing price: " + top.quantity * top.price);
        }
    }
}
