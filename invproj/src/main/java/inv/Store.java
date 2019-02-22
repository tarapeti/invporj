package inv;

public abstract class Store {

    public void store(Product product){
        saveToXml(product);
        storeProduct(product);

    }

    protected Product createProduct(String type, String name, int price, int size) {

        if ("CD".equals(type)) {
            return new CDProduct(name, price, size);
        } else if ("Book".equals(type)) {
            return new BookProduct(name, price, size);
        }
        return null;
    }

    protected void storeProduct(Product product) {
        if (product instanceof BookProduct) {
            storeBookProduct(product.getName(), product.getPrice(), ((BookProduct) product).getpagesnum());
        } else if (product instanceof CDProduct) {
            storeCDProduct(product.getName(), product.getPrice(), ((CDProduct) product).gettracksnum());
        }
    }

    protected abstract void storeBookProduct(String name, int price, int getpagesnum);

    protected abstract void storeCDProduct(String name, int price, int gettracksnum);

    private void saveToXml(Product product) {}

}
