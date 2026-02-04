@FunctionalInterface
interface Car
{
public int drive(int speed);
}
class Audi implements Car
{
@Override
public int  drive(int speed)
{
    System.out.println("this is an audi");
    return speed;
}
}
class LambdaExample
{
    public static void main(String args[])
    {
        Audi au=new Audi();
        au.drive(100);
        Car c1=new Car()
        { 
            public int drive( int speed)
            {
            System.out.println("this is an tata");
            return speed;
            }
        };
        c1.drive(100);
        Car c2= (int speed)->{
            System.out.println("this is tata"+" "+speed);
            return speed;
        };
        c2.drive(100);
    }
}