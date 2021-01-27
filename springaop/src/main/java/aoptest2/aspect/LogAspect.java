package aoptest2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    /**
     * 统一定义切点
     * 第一个* 代表任意返回值
     * 第二个* 代表包中的任意类
     * 第三个* 代表任意方法
     * 最后两. 代表参数任意，个数任意，类型任意
     * */
    @Pointcut("execution(* aoptest2.*.*(..))")
    public void pointCut() {}

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + " 方法开始执行");
    }

    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + " 方法执行结束");
    }

    @AfterReturning(value = "pointCut()", returning = "r")
    public void afterReturn(JoinPoint joinPoint, int r) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + " 方法返回值为" + r);
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void afterThrow(JoinPoint joinPoint, Exception e) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + " 方法出现异常" + e.getMessage());
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint pjp) {
        Object res = null;
        try {
            //前置通知
            System.out.println("around前置通知");
            //方法执行
            res = pjp.proceed();
            //返回通知
            System.out.println("around返回通知");

        } catch (Throwable throwable) {
            //异常通知
            System.out.println("around异常通知");
            throw new RuntimeException(throwable);
        } finally {
            //后置通知
            System.out.println("around后置通知");
        }
        return res;
    }
}
