package main.java.test;

import org.checkerframework.checker.igj.qual.Immutable;
import org.checkerframework.checker.nullness.qual.NonNull; 


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        @Immutable String foo = "foo";
        foo = "bar";

        @NonNull String apud = null;
    }
}
