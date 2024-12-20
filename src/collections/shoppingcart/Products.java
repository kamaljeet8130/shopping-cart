package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> productList = new ArrayList<Product>();

    public Products(){
        this.initStoreItems();
    }
    public List<Product> getProductList(){
        return productList;
    }
    public void initStoreItems(){
        String[] productName = {"lux soap","fair n lovely","Marinda"};
        Double[] productPrice = {40.00d,60.00d,30.00d};
        Integer[] productStock = {10,6,10};
        for(int i =0;i<productName.length;i++){
            this.productList.add(new Product(i+1,productName[i],productPrice[i],productStock[i]));
        }
    }
}
