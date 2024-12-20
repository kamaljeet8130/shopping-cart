package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

class Cart {
     List<Product> cartItems = new ArrayList<Product>();
     public void addProductToCartByPID(int pid){
         Product product = getProductByProductPID(pid);
         addToCart(product);
     }
     private Product getProductByProductPID(int pid){
         Product product = null;
         List<Product> products = new Products().getProductList();
         for(Product prod : products){
             if(prod.getPid() == pid){
                 product = prod;
                 break;
             }
         }
         return product;
     }
     private void addToCart(Product product){
         cartItems.add(product);
     }
     public void removeProductByPID(int pid){
         Product prod = getProductByProductPID(pid);
         cartItems.remove(prod);
     }
     void printCartItems(){
         for(Product prod: cartItems){
             System.out.println(prod.getName());
         }
     }

}
