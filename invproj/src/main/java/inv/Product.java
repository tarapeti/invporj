package inv;

public abstract class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        if (this instanceof BookProduct) {
            return "Book";
        }
        else if (this instanceof CDProduct) {
            return "CD";
        }
        return null;
    }
}
