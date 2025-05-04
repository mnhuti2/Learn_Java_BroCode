public class Triangle extends Shape
{
    double height;
    double width;

    Triangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    double area()
    {
        return 0.5 * height * width;
    }
}
