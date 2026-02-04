import java.util.*;
class SteamEXAMPLE
{
    public static void main(String args[])
    {
        List<String> emp=Arrays.asList("kowshik","venkata","ben"," army ");

       emp.stream().filter(t->t.trim().length()>5).forEach(System.out::println);
    }
}