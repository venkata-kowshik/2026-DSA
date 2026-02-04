import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
class StreamsEXAMPLE2
{
    public static void main(String args[])
    {
        // List<Integer> li=List.of(1,23,4,3,12);

        // li.stream().map(t->t*t*t).forEach(System.out::println);

        // //we can create streams to the primitive data type such as int ,long,boolen

        // // IntStream.of(1,2,3,4,5,6,67,78,89,9,9,78).forEach(System.out::println);

        // IntStream.iterate(1, n->n+5).limit(30).forEach(System.out::println);
        IntPredicate data= new IntPredicate() {
            @Override
            public boolean test(int data)
            {
                return data<=20;
                        }
        };
        
        IntStream.iterate(2,data, n->n+4).forEach(System.out::println);
        //or

       // IntStream.iterate(2,data ->data<20, n->n+4).forEach(System.out::println);
       IntSupplier si =new IntSupplier()
        {
        @Override
        public int getAsInt()
        {
            return 55;
        }
       };
       IntStream.generate(si).limit(10).forEach(System.out::println);
       IntStream.generate(()->new Random().nextInt(100)).limit(10).forEach(System.out::println);

    }
}