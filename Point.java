package puckage1;

public class Point
{
    public int x=0;
    public int y=0;

    public Point()
    {
        x=y=0;
        System.out.println("x="+x+"y="+y);
    }

    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("constructor painter x="+x+"y="+y);
    }

    public int getX()
    {
         return x;
    }

    public void setX(int x)
    {
        this.x=x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y=y;
    }

public void setZero()
{
        x=y=0;
}

    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
