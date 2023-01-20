package Task2;

/**Мебель*/
class Furniture {
    private String type;            // Тип мебели (стол, стул, шкаф и т.д.)
    private String manufacturer;    // Производитель
    private String material;        // Материал
    private int price;              // Цена

    public Furniture(String type, String manufacturer, String material, int price) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.material = material;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
