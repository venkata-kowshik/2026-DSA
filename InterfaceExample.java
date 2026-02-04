interface Laptop
{
    public void  copy();
    public void paste();
    public void cut();
    default void security()
    {
        System.out.println("hi this is ban interface");
        prize();
    }
    static void prize()
    {
        System.out.println("1000");
    }
    private static void model()
    {
        System.out.println("2025 DEC");
    }
}
class Apple implements Laptop
{
    @Override
    public void copy()
    {
        System.out.println("copy");
    }
    @Override
    public void paste()
    {
        System.out.println("paste");
    }
    @Override
    public void cut()
    {
        System.out.println("cut");
    }
    @Override
    public void security()
        {
            System.out.println("hi this is ban interface and welcome to java world");
        }
}
class InterfaceExample
{
    public static void main(String args[])
    {
        Apple app=new Apple();
        app.copy();
        app.paste();
        Laptop.prize();
        app.security();
    }
}

/*@FunctionalInterface
interface Car
{
    void drive();
}

class Main
{
    public static void main(String args[])
    {
        Car cc = new Car()
        {
            @Override
            public void drive()
            {
                System.out.println("This is an Audi car");
            }
        };

        cc.drive();
    }
}*/ 
