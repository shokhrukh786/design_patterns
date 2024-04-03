package factory.factory.abstractFactory;

import factory.factory.abstractFactory.q.*;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Clams clam;
    Pepperoni pepperoni;

    public abstract void prepare();
    public void bake(){
        System.out.println("25 daqiqa davomida 350 daraja pishiring");
    }
    public void cut(){
        System.out.println("Pitsani diagonal bo'laklarga kesib oling");
    }
    public void box(){
        System.out.println("Pizzani rasmiy PizzaStore qutisiga joylashtiring");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}