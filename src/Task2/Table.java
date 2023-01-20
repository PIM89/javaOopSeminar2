package Task2;
/**Класс столы*/
class Table extends Furniture {
    int workingSurfaceArea;         // Площадь рабочей поверхности

    public Table(String type, String manufacturer, String material, int price, int workingSurfaceArea) {
        super(type, manufacturer, material, price);
        this.workingSurfaceArea = workingSurfaceArea;
    }

    public int getWorkingSurfaceArea() {
        return workingSurfaceArea;
    }

    public void setWorkingSurfaceArea(int workingSurfaceArea) {
        this.workingSurfaceArea = workingSurfaceArea;
    }
}
