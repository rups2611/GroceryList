import java.util.Scanner;

        public  class Main{
            public static Scanner sc = new Scanner(System.in);
            public static GroceryList groceryList = new GroceryList();

            public static void instructions(){
                System.out.println("\nPress: ");
                System.out.println("\t 0 - To print choice options.");
                System.out.println("\t 1 - To print the list of grocery items.");
                System.out.println("\t 2 - To add an item to the list.");
                System.out.println("\t 3 - To modify an item in the list.");
                System.out.println("\t 4 - To remove an item from the list.");
                System.out.println("\t 5 - To search for an item in the list.");
                System.out.println("\t 6 - To quit the application.");
            }

            public static  void add(){
                System.out.println("Enter the item name:");
                groceryList.addItem(sc.nextLine());
            }
            public static void modify(){
                System.out.println("Enter the current item");
                String currentItem = sc.nextLine();
                System.out.println("Enter the new item");
                String newItem = sc.nextLine();
                groceryList.modifyItem(currentItem,newItem);
            }
            public static void remove(){
                int choice;
                System.out.println("\npress");
                System.out.println("\t 1 - if you want to proceed with item number");
                System.out.println("\t 2 - if you want to proceed with item name");
                choice= sc.nextInt();
                sc.nextLine();
                if(choice==1){
                    System.out.println("Enter the item number you want to remove: ");
                    groceryList.removeItem(sc.nextInt()-1);
                }
                if(choice==2){
                    System.out.println("Enter the item name you want to remove");
                    groceryList.removeItem(sc.nextLine());
                }
                if(choice!=1 && choice !=2){
                    System.out.println("Invalid input!! Try Again");
                }
            }
            public static void search(){
                System.out.println("Enter the item you want to search");
                groceryList.serachItem(sc.nextLine());

            }

            public static void main(String[] args){
                boolean quit = false;
//                int choice =0;
                instructions();
                while(!quit){
                    System.out.println("Enter the choice");
                     int choice = sc.nextInt();
                    sc.nextLine();
                    switch(choice){
                        case 0:
                            instructions();
                            break;
                        case 1:
                            groceryList.printGroceryList();
                            break;

                        case 2:
                            add();
                            break;
                        case 3:
                            modify();
                            break;
                        case 4:
                            remove();
                            break;
                        case 5:
                            search();
                            break;
                        case 6:
                            quit=true;
                            break;

                    }
                }
            }

        }
