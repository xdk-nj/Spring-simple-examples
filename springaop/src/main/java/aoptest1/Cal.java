package aoptest1;

import aoptest1.annotation.Action;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Cal {

    @Action
    public int add(int x, int y) {
        return x + y;
    }
    @Action
    public int sub(int x, int y) {
        return x - y;
    }
    @Action
    public int mul(int x, int y) {
        return x * y;
    }

    @Action
    public int div(int x, int y) {
        return x / y;
    }
}
