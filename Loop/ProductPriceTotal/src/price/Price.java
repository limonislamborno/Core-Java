
package price;


public class Price {
    
    private double unitPrice;
    private int quantity;

    public Price() {
    }

    public Price(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double calcuateTotalPrice(){
        double totalPrice=unitPrice*quantity;
        
        return totalPrice;
    
    
    }
    
}
