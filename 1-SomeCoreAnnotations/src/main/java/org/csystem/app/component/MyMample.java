package org.csystem.app.component;

import org.springframework.stereotype.Component;

@Component
public class MyMample extends  Mample{
    public MyMample()
    {
        System.out.println("I am default ctor of MyMample");
    }
}
