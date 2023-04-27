package HW_3.task1;

public class ProductForHW3 {
    public String name;
    public Integer price;
    public Integer quality;
    String country;
    Integer weight;


    public ProductForHW3(String name, Integer price, Integer quality, String country, Integer weight) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.country = country;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ProductForHW3{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                '}';
    }
}
