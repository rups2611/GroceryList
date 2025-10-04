import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList{
    private  ArrayList<String>  groceryList ;
    public GroceryList(){
        this.groceryList = new ArrayList<>();
    }

    private static Scanner sc = new Scanner(System.in);

    public  String Capitalize(String item){
        String capitalized_item = item.substring(0,1).toUpperCase() + item.substring(1).toLowerCase();
        return capitalized_item;
    }

    public   boolean checkAvailability(String item){
//        item = Capitalize(item);
        int pos = groceryList.indexOf(item);
        return pos>=0;
    }

    public  void addItem(String additem){
        additem = Capitalize(additem);
        if(!checkAvailability(additem)){
            groceryList.add(additem);
            System.out.println(additem +" is added to the grocery list");
        }
        else{
            System.out.println(additem + " is already present in the grocery list");
        }
    }

    public void modifyItem(String currentItem , String newItem){
        currentItem = Capitalize(currentItem);
        newItem = Capitalize(newItem);
        if(checkAvailability(currentItem)){
            int pos = groceryList.indexOf(currentItem);
            groceryList.set(pos,newItem);
            System.out.println(newItem + " is added to the replacement");
        }
        else{
            System.out.println(currentItem + " is not present in the grocery list");
        }
    }

    public void removeItem(String remItem){
        remItem = Capitalize(remItem);
        if(checkAvailability(remItem)){
            groceryList.remove(remItem);
            System.out.println(remItem + " is deleted from the grocery list");
        }
        else{
            System.out.println(remItem + " is not present in the list");
        }
    }

    public void removeItem(int pos){
        if(groceryList.size()>=pos){
            String item = groceryList.get(pos);
            groceryList.remove(item);
            System.out.println("Item at " + pos +" index is deleted from the grocery list");
        }
        else{
            System.out.println("Invalid position");
        }
    }

    public void serachItem(String searchitem){
        searchitem = Capitalize(searchitem);
        if(checkAvailability(searchitem)){
            int pos = groceryList.indexOf(searchitem);
            System.out.println(searchitem + " is present at " + pos +" index in the grocery list");
        }
        else{
            System.out.println(searchitem + " is not present in grocery list");
        }
    }

    public void printGroceryList(){
        System.out.println("You have checked in " + groceryList.size() + " item.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

}