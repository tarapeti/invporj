package inv;

public class BookProduct extends Product {

    private int pagesnum;

    public BookProduct(String name, int price, int pagesnum) {
        super(name, price);
        this.pagesnum = pagesnum;
    }

    public int getpagesnum() {
        return pagesnum;
    }
}
