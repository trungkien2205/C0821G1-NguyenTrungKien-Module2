package _17_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String producName;
    private String producer;
    private Double price;
    private String other;

    public Product() {
    }

    public Product(String productCode, String producName, String producer, Double price, String other) {
        this.productCode = productCode;
        this.producName = producName;
        this.producer = producer;
        this.price = price;
        this.other = other;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProducName() {
        return producName;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", producName='" + producName + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
}
