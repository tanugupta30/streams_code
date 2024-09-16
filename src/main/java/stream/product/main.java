package stream.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List< Product > productsList = new ArrayList< Product >();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        /*Q1: get the Name of assest whose price is 30000 by using streams */
        productsList.stream().filter( p->p.getPrice()==30000)
                .forEach(e-> System.out.println(e.getName()));

        //*Q2: extract the price whose price is less than 30000 and keep unique
        Set<Float> productList= productsList.stream().filter(p->p.getPrice()<30000)
                .map(e->e.getPrice()).collect(Collectors.toSet());
        System.out.println(productList);

        //*Q3: get max of product price
        Product productA = productsList.stream()
                .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println(productA);

        //*Q3: get min of product price
        Product productB = productsList.stream()
                .min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println(productB);





    }
}
