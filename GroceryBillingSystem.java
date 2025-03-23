class Item{ // Parent Class
    String name;
    double pricePerKg;
    //Constructor
    Item ( String name, double pricePerKg){
        this.name = name;
        this.pricePerKg = pricePerKg;
    }
    double getPricePerKg(){
        return pricePerKg;
    }
}
class WeighedItem extends Item{ //Child Class
    double weight;
    // constructor
    WeighedItem(String name, double pricePerKg, double weight){
        super(name,pricePerKg);
        this.weight = weight;
    }
    double getTotalPrice() {
        return pricePerKg * weight;
    }
}
class DiscountedWeighedItem extends WeighedItem {
    double discountPercentage;
    DiscountedWeighedItem(String name, double pricePerKg, double weight, double discountPercentage) {
        super(name, pricePerKg, weight);
        this.discountPercentage = discountPercentage;
    }
    double getFinalPrice() {
        double totalPrice = getTotalPrice();
        double discount = (totalPrice * discountPercentage) / 100;
        return totalPrice - discount;
    }
}
public class GroceryBillingSystem {
    public static void main(String[] args) {
        DiscountedWeighedItem apples = new DiscountedWeighedItem("Apples", 100, 2, 10);
        System.out.println("Price per kg of " + apples.name + ": " + apples.getPricePerKg());
        System.out.println("Total Price before discount: " + apples.getTotalPrice());
        System.out.println("Final Payable Amount after discount: " + apples.getFinalPrice());
    }
}
