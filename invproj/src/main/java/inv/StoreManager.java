package inv;

public class StoreManager {

    private StorageCapable storage;

    public void addStorage(StorageCapable storage) {
        this.storage = storage;
    }

    public void addCDProduct(String name, int price, int tracks){
        storage.storeCDProduct(name, price, tracks);

    }

    public void addBookProduct(String name, int price, int pages){
        storage.addCDProduct(name, price, pages);

    }

    public String listProducts(){
        return "";
    }

    public int getTotalProductPrice(){
        return 1;
    }
}
