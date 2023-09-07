package Pizza.Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pizza {

    private String name;
    //private double price;
    private List<Topping> toppings = new ArrayList<>();
    private List<String> pizzaLog = new ArrayList<>();
    private String size;

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, String size, Topping... toppings) {
        this.name = name;
        this.size = size;

        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public double getPizzaPrice(){
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrecio();
        }
        return price;
    }

    public double getPizzaPriceS() {
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrecio();
        }

        // Aplicar el aumento de precio según el tamaño
        if ("medium".equalsIgnoreCase(size)) {
            price *= 1.20; // Aumento del 20%
        } else if ("large".equalsIgnoreCase(size)) {
            price *= 1.35; // Aumento del 35%
        } else if ("small".equalsIgnoreCase(size)) {
            price *= 1.0; // Aumento del 10%
        }

        return price;
    }

    public List<String> getPizzaLog() {
        return Collections.unmodifiableList(new ArrayList<>(pizzaLog));
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
        String message = "Added topping: " + topping.getNombre();
        pizzaLog.add(message);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

 /*   public double getPrice() {
        return price;
    }*/

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' +", size='" + size + '\'' + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("\nPreparing..... " + name);
        System.out.println("Size: " + size);
        System.out.println("Adding toppings:");

        int totalToppings = toppings.size();
        int currentTopping = 0;

        for (Topping topping : toppings) {
            currentTopping++;
            System.out.println("Progress: " + currentTopping + " out of " + totalToppings);
            System.out.println("- " + topping.getNombre());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String message = "The Pizza is ready!";
        pizzaLog.add(message); // Registrar mensaje

        System.out.println(message);


    }

    public void prepareB() {
        System.out.println("\nPreparing..... " + name);
        System.out.println("Size: " + size);
        System.out.println("Adding toppings:");

        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + " ($" + topping.getPrecio() + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The Pizza is ready!");}
}
