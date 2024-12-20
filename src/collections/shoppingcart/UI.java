package collections.shoppingcart;

import java.util.List;
import java.util.Scanner;

public class UI {
    Cart cart = new Cart();
    private int ch = 0;

    public UI(){
        menu();
    }
    public void startScreen(){
        System.out.println("1. Display store Products");
        System.out.println("2. Display Cart");
        System.out.println("0 Exit");
    }
    public void storeProductMenu(){
        System.out.println("1. Add to cart");
        System.out.println("2. Remove  From Cart");
        System.out.println("0. Exit");
    }
    public void menu(){
        do{
            startScreen();
            getUserInput();
            switch (ch){
                case 1:
                    displayStoreProducts();
                    storeProductMenu();
                    getUserInput();
                    innerChoice1();
                break;
                case 2:
                    showCart();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while (ch!=0);
    }
    private void innerChoice1(){
        switch (ch){
            case 1:
                addProductToCart();
                showCart();
                break;
            case 3:
                removeProductFromCart();
                break;
            default:
                break;
        }
    }
    private int getUserInput() throws NumberFormatException{
        Scanner in = new Scanner(System.in);
        ch= Integer.parseInt(in.nextLine());
        return ch;
    }
    private void displayStoreProducts(){
        List<Product> products = new Products().getProductList();
        for(Product prod: products){
            System.out.println(prod.getPid() + " -" + prod.getName()+" -" + prod.getPrice()+ " -"+prod.getStock());
        }
    }
    private void addProductToCart(){
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }
    private void showCart(){
        cart.printCartItems();
    }
    private void removeProductFromCart(){
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}
