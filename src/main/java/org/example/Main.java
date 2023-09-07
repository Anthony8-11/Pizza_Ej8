package org.example;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;
import Pizza.Especialidades.Italiana;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Pizza Margarita", "medium");
        pizza.addTopping(new Topping("Tomate",10));
        pizza.addTopping(new Topping("Mozzarella",30));
        pizza.addTopping(new Topping("Brocoli",20));
        pizza.prepare();
        List<String> pizzaLog = pizza.getPizzaLog();
        for (String message : pizzaLog) {
            System.out.println(message);
        }
        System.out.println("Precio total: $"+pizza.getPizzaPriceS());

/*        Italiana ita = new Italiana("Italiana", 20, "Especial");
        ita.addTopping(new Topping("Tomato",13));
        ita.addTopping(new Topping("Mozzarella",15));
        ita.addTopping(new Topping("Brocoli",10));
        ita.prepare();
        System.out.println("Precio total$:"+ita.getPizzaPriceS());*/

/*        //Quitar mozzarela
        pizza.removeTopping(1);

        //Agregar Mozzarella de nuevo
        pizza.addTopping(new Topping("Mozzarella"));

        pizza.prepare();

        Italiana italiana = new Italiana("Italiana", 20, "Especial");
        italiana.addTopping(new Topping("Tomato"));
        italiana.prepare();*/
    }
}