package chapter2.builder;

public class Main {
    public static void main(String[] args) {
        Pizza newYourPizza = new NewYorkPizza.Builder(Size.LAGER, false)
                .addTopping(Topping.HAM)
                .build();

        Pizza CalzonePizza = new CalzonePizza.Builder(Size.MEDIUM)
                .addTopping(Topping.ONION)
                .sauceInside()
                .build();
    }
}
