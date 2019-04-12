package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        logger.log(new App().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
