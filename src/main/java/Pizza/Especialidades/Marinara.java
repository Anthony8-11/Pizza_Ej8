package Pizza.Especialidades;

import Pizza.Base.Topping;
import Pizza.Base.Pizza;
import java.util.Arrays;

public class Marinara extends Pizza {

    private String salsa;

    public  Marinara(String name, double price, String salsa, Topping... toppings){
        super(name, Arrays.toString(toppings));
        this.salsa=salsa;

    }


    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

}
