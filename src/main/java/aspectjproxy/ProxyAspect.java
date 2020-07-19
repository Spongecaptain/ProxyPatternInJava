package aspectjproxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author SpongeCaptain
 * @date 2020/7/18 11:23
 */
@Aspect
public class ProxyAspect {
    //定义切点
    @Pointcut("execution(* aspectjproxy.Proxyee.sayHello(..))")
    public void jointPoint(){}
    //定义前置通知
    @Before("jointPoint()")
    public void before(){
        System.out.println("-------Log.log()-------");
    }
    //定义后置通知
    @After("jointPoint()")
    public void after(){
        System.out.println("-------Log.log()-------");
    }
}
