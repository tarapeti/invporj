package inv;

import java.util.List;

public interface StorageCapable {

    List<Product> getAllProduct();
    void storeCDProduct(String name, int price, int tracks);
    void addCDProduct(String name, int price, int pages);
}
