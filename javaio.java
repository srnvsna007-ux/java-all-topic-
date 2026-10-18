import java.io.*;
public class javaio
{
    void main()
    {
        //
        try(FileOutputStream byteout = new FileOutputStream("bytedata.bin");
        FileWriter charout = new FileWriter("chardata.txt"))
        {
            byteout.write(65);
            charout.write("A");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}