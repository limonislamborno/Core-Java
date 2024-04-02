package productpricetotal;

import java.util.Scanner;
import price.Price;

public class ProductPriceTotal {

    public static void main(String[] args) {
        Price price = new Price();
        Scanner sc = new Scanner(System.in);

        System.out.println("Pls enter Unit Price");
        double unitPrice = sc.nextDouble();

        System.out.println("Pls enter Quantity");
        int quantity = sc.nextInt();

        price.setUnitPrice(unitPrice);
        price.setQuantity(quantity);

        double totalPrice = price.calcuateTotalPrice();
        double discount = 0.0;
        double actualPrice = 0.0;
        if (totalPrice >= 100) {

            discount = totalPrice * 0.05;
            actualPrice = totalPrice - discount;
            System.out.println("Hurray You got 5% discount");
        } else {
            actualPrice = totalPrice;

        }

        System.out.println("You have to payment " + (int) actualPrice);

    }

}
