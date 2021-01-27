package cglib;

import org.junit.Test;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

public class CglibTest {
    @Test
    public void test1() {
        //1.创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //2.通过setSuperclass来设置父类型，即需要给哪个类创建代理类
        enhancer.setSuperclass(Service1.class);
        /**
         * 3.设置回调，需实现org.springframework.cglib.proxy.Callback接口，
         * 此处使用的是org.springframework.cglib.proxy.MethodInterceptor接口，
         * 实现了Callback接口，当调用代理对象的任何方法的时候，
         * 都会被MethodInterceptor接口的invoke方法处理
         */
        enhancer.setCallback(new MethodInterceptor() {
            /**
             * 代理对象方法拦截器
             * @param o 代理对象
             * @param method 被代理的类的方法，即Service1中的方法
             * @param objects 调用方法传递的参数
             * @param methodProxy 方法代理对象
             * @return * @throws Throwable
             * */
            @Override
            public Object intercept(Object o,
                                    Method method,
                                    Object[] objects,
                                    MethodProxy methodProxy) throws Throwable {
                System.out.println("调用的方法 " + method);
                Object res = methodProxy.invokeSuper(o, objects);
                return res;
            }
        });
        //获取代理对象
        Service1 proxy = (Service1) enhancer.create();
        proxy.m1();
        proxy.m2();
    }

    @Test
    public void test2() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service2.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o,
                                    Method method,
                                    Object[] objects,
                                    MethodProxy methodProxy) throws Throwable {
                System.out.println("调用的方法 " + method);
                Object res = methodProxy.invokeSuper(o, objects);
                return res;
            }
        });
        Service2 proxy = (Service2) enhancer.create();
        proxy.m1();
    }

    @Test
    public void test3() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service3.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "hello cglib";
            }
        });
        Service3 proxy = (Service3) enhancer.create();
        System.out.println(proxy.m1());
        System.out.println(proxy.m2());
        System.out.println(proxy.toString());
    }

    @Test
    public void test6() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service3.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Service3 proxy = (Service3) enhancer.create();
        System.out.println(proxy.m1());
        System.out.println(proxy.m2());
    }
}
