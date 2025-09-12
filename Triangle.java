package puckage1;

public class Triangle
{
    private Point p1;
    private Point p2;
    private Point p3;

    public Point getP1()
    {
        return p1;
    }

    public void setP1(Point p1)
    {
        this.p1=p1;
    }

    public Point getP2()
    {
        return p2;
    }

    public void setP2(Point p2)
    {
        this.p2=p2;
    }

    public Point getP3()
    {
        return p3;
    }

    public void setP3(Point p3)
    {
        this.p3=p3;
    }

    public Triangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if(square()==0)
        {
            p1.setZero();
            p2.setZero();
            p3.setZero();
            throw new ArithmeticException("wrong points");
        }
    }
    public double square()
    {
        return Math.abs(0.5*(p1.x+(p2.y-p3.y)+p2.x*(p3.y-p1.y)+p3.x*(p1.y-p2.y)));
    }
}
