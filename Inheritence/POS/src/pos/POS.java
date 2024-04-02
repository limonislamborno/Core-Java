package pos;

import java.util.Scanner;
import price.Price;

public class POS {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Price price = new Price();
        System.out.println("Enter Unit Price ");
        double unitPrice = s.nextDouble();
        System.out.println("Enter Quantity ");
        double quantity = s.nextDouble();
        
        double actualPrice=0.0;
        
        price.setQuantity(quantity);
        price.setUnitPrice(unitPrice);
        
        double totalPrice=price.calculateTotalPrice();
        double discount=0.0;
        if(totalPrice>=100){
            discount=totalPrice*.05;
            actualPrice= totalPrice-discount;
        }else{
            actualPrice= totalPrice;
        }

        System.out.println("You have to pay "+Math.round(actualPrice)+"\nDiscount Amount is "+discount);
        System.out.println("Thanks, stay with us ");
    }

}
