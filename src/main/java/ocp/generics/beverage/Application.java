package ocp.generics.beverage;

public class Application {

    public static void main(String[] args) {

        Box box = new Box();
        box.add(new Wine("Chateau Margaux", 14.1));

        box.showContents();


         Box<Beer> beerBox = new Box<>();
         beerBox.add( new Beer("Amstel",5));
         beerBox.add( new Beer("Heinken",6.2));
         beerBox.add( new Beer("Bavaria",7.5));
         Box<Wine>wineBox=new Box<>();
         wineBox.add(new Wine("Merlot",18.9));
         wineBox.add(new Wine("Shiraz",20.9));
         wineBox.add(new Wine("Roze",11.9));

       beerBox.showContents();
       wineBox.showContents();





        // Also try
        // Box<Beverage> beverageBox = new Box<>();
        // and add beers AND wines in the same box


    }
}
