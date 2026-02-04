class TestThreading1 {
    public static void main(String args[]) {

        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) 
                {
            System.out.println("hello");
           // System.out.println(Thread.currentThread().getName());
                }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 20; i++) 
                {
            System.out.println("world");
                }
        };

        Thread t1 = new Thread(r1,"T1");
        Thread t2 = new Thread(r2);
        System.out.println(t1.getState());
         System.out.println(t1.getName());

        t1.start();
         System.out.println(t1.getState());
        try
        {
        t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         System.out.println(t1.getState());
        t2.start();

       // System.out.println(Thread.activeCount());
    }
}
