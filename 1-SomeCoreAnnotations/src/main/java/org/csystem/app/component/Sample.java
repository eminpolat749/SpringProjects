package org.csystem.app.component;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("emin")
@Lazy
public class Sample {
    public Sample()
    {
        System.out.println("I am a default ctor of Sample");
    }

    @PostConstruct
    public void foo()
    {
        System.out.println("foo");
    }
}
// buradaki foo metodu Sample nesnesi yaratıldıktan sonra çağrılacak
// Lazy olduğu için ben istemeden yaratılmayacak
