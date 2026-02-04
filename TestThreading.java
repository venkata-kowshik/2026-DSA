
class TestThreading
{
    public static void main(String args[])
    {
       Employee t1=new Employee();
         Manager t2=new Manager();
            t2.start();
            t1.start();
       System.out.println(Thread.activeCount());
    }
} 
class Employee extends  Thread
{
    // givivng own name to any thread 
   /* Employee(String name)
        {
            super(name);
        }*/
    @Override
   public void run()
    {
        System.out.println("hello");  
        System.out.println(Thread.currentThread().getName()); 
    }
}
class Manager extends  Thread
{
    @Override
   public void run()
    {
        System.out.println("world");   
    }
}