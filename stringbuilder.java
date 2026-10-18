public class stringbuilder
{
    void main()
    {
        String str =" hello" ;
        str.concat(" word");

        //StringBuilder is mutable class and String is immutable class
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" word");
        System.out.println(sb.toString());
    }
}
