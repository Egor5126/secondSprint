import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10,50, Colour.RED_COLOUR);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_COLOUR);
        Food[] foods = new Food[] {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println(cart.getFullPrice());
        System.out.println(cart.getDiscountPrice());
        System.out.println(cart.getFullVegetarianPrice());
    }
}
