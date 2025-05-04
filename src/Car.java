public class Car
{
    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price)
    {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getModel()
    {
        return this.model;
    }
    String getColor()
    {
        return this.color;
    }
    String getPrice()
    {
        return "$" + this.price;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    void setPrice(int price)
    {
        this.price = price;
    }
}
