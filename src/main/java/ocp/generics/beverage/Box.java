package ocp.generics.beverage;


import java.util.ArrayList;
import java.util.List;

public class Box <T extends Beverage>{

    private List<T> beverages = new ArrayList<>();

    public void add(T t) {
        this.beverages.add(t);

        System.out.println("Added a beverage with alc. "+t.getAlcoholPercentage());
    }

    public T getElementAtIndex(int index) {
        return this.beverages.get(index);
    }

    public void showContents(){
        for( T t: beverages){
            System.out.println(t.toString());
        }
    }
}
