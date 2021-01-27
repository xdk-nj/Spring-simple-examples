package dyproxy;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalProxy {
    public static Object getInstance(CalImpl calImpl) {
        return Proxy.newProxyInstance(
                CalProxy.class.getClassLoader(),
                CalImpl.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("方法执行前");
                        int res = (int)method.invoke(calImpl, args);
                        System.out.println(res);
                        System.out.println("方法执行结束");
                        return res;
                    }
                });
    }
}
