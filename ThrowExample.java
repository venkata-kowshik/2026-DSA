import java.util.ArrayList;
import java.util.List;

class ThrowExample {
    public static void main(String args[]) {

        List<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(23);
        li.add(64);
        li.forEach(i->System.out.println(i));
    }
}
