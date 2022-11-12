package class_object;

public class Apple {
    public Apple(){

    }
    public String color;
    public double price;
    public String taste;

    /*public String toString(){
        return "Apple{color: " + color + "," +
                        "price: " + price + "," +
                        "taste: " + price + ","

        */


    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}

