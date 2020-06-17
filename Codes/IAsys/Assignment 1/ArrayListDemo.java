import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int pId;
    String pName;
    int pValue;
    Product(int pId, String pName, int pValue) {
        this.pId=pId;
        this.pName = pName;
        this.pValue = pValue;
    }

    int getId() {
    
        return pId;
    }

    void setId(int pId) {
    
        this.pId = pId;
    }

    String getpName() {
    
        return pName;
    }

    void setpName(String pName) {

        this.pName = pName;
    }

    int getValue() {

        return pValue;
    }

    void setpValue(int pValue) {

        this.pValue= pValue;
    }

    
    public String toString() {
        return ""+pValue;       
    }
    public static void main(String[] args) {
        
        List<Product> arr1 = new ArrayList<>();
        List<Product> arr2 = new ArrayList<>();

        arr1.add(new Product(1, "CPU", 250));
        arr1.add(new Product(2, "GPU", 350));
        arr1.add(new Product(3, "MIC", 550));
        arr1.add(new Product(4, "LPU", 250));
        arr2.add(new Product(1, "MICRO", 450));
        arr2.add(new Product(2, "GPU", 350));
        arr2.add(new Product(3, "LIST", 150));

        ArrayList<Product> arr3 =  new ArrayList<>(arr1);
        
        
        for(Product p1: arr1){

            for(Product p2: arr2) {
                if(p1.pId == p2.pId) {
                    arr3.remove(p1);
                }
            }
        }
        
        System.out.println(arr3);

    }
}