package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

   private  String downloadUrl;
   private  double fileSizeMB;



    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB ){

       // super(id,name,price);   // call the constructor in parent class  , without the correct parent constructor call, java cannot compile the subclass constructor if the implicit no-argument call is unavailable

        // rules in super
        this.downloadUrl= downloadUrl;
        this.fileSizeMB= fileSizeMB;
    }

    DigitalProduct(){}

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }


}
