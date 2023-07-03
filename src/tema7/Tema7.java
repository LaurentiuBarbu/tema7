package tema7;

public class Tema7 {

    public static void main(String[] args) {
        //ex 1-2
        Person first = new Person("Cornel", 30, false);
        Person second = new Person("Maria", 25, true);
        Person third = new Person("Vasile", 49, true);
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        System.out.println("------------------------------------------");

        //ex 3-4
        Product cola = new Product("Coca Cola" , 9.99D, 100, "suc");
        Product sprite = new Product("Sprite", 9.49D, 100, "suc");
        Product salamSinaia = new Product("Salam Sinaia", 30D, 50, "mezeluri");
        Product salamSibiu = new Product("Salam Sibiu", 90D, 0, "mezeluri");
        System.out.println(cola.hasStock());
        System.out.println(sprite.hasStock());
        System.out.println(salamSinaia.hasStock());
        System.out.println(salamSibiu.hasStock());
        System.out.println("------------------------------------------");
        System.out.println(cola.isCategory("suc"));
        System.out.println(cola.isCategory("mezeluri"));
        System.out.println("------------------------------------------");

        //ex 5-6
        Bottle water = new Bottle(500, 400, false);
        System.out.println("Empty capacity: " + water.getEmptyCapacity());
        water.drinkAmount(100);
        water.openBottle();
        water.drinkAmount(100);
        water.closeBottle();
        water.drinkAmount(500);
        water.openBottle();
        water.drinkAmount(500);
        water.drinkAmount(100);
        water.drinkAmount(100);
        water.drinkAmount(100);
        System.out.println("_____BOTTLE SHOULD BE EMPTY ________");
        water.drinkAmount(100);
        water.drinkAmount(100);
        water.drinkAmount(100);
    }
}
