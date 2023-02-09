package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food [] foods) {
        this.foods = foods;
    }
    public double getFullPrice(){
        double sum = 0;
        for (Food food : foods){
            sum += food.getAmount() * food.getPrice();
        }
        return  sum;

    }

    public double getDiscountPrice(){
        double sum = 0;
        for (Food food : foods){
            double discountPercent = (100 - food.getDiscount()) / 100.0;
            double priceWithDiscount = food.getAmount() * food.getPrice() * discountPercent;
            sum += priceWithDiscount;
        }
        return  sum;

    }

    public double getFullVegetarianPrice(){
        double sum = 0;
        for (Food food : foods){
            if(food.isVegetarian())
                sum += food.getAmount() * food.getPrice();
        }
        return  sum;

    }

}