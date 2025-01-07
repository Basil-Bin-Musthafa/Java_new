class Rectangle
{
    int l,b;
    Rectangle(int l, int b)
    {
        this.l = l;
        this.b = b;
    }
    int findArea()
    {
        return (l*b);
    }
}
class AreaOfRectangleP1
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(20,10);
        System.out.println("Area of Rectangle is "+r.findArea());
    }
}