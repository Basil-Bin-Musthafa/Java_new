class Rectangle
{
    int l,b;
    int findArea(int l , int b)
    {
        return (l*b);
    }
}
class AreaOfRectangleP2
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle is "+r.findArea(20,10));
    }
}