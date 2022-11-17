import java.io.*;
import java.util.*;
import java.util.ArrayList;

class ArrayNames
{
    public static void main(String args[])
    {
        ArrayNames<String> names=new ArrayNames<> names();
        names.add("Cdac");
        names.add("Mumbai");
        names.add("DBDA");
        System.out.println(names);
        for(String names:names)
        {
            System.out.println("Array is " +names);
        }
    }
}