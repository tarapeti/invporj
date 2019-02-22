package inv;

public class CDProduct extends Product {

    private int tracksnum;

    public CDProduct(String name, int price, int tracksnum) {
        super(name, price);
        this.tracksnum = tracksnum;
    }

    public int gettracksnum() {
        return tracksnum;
    }
}