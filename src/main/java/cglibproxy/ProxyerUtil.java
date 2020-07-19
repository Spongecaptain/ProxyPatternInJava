package cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.core.DefaultGeneratorStrategy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author SpongeCaptain
 * @date 2020/7/17 14:24
 */
public class ProxyerUtil implements MethodInterceptor {

    private static Enhancer enhancer = new Enhancer();

    // Object obj (被)代理的对象，在 CGLIB 的语义中就是已经增强了的对象
    // Method method 代理方法
    // Object[] args 方法参数
    // MethodProxy proxy 代理方法
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("--------Log.log()---------");
        final Object o1 = proxy.invokeSuper(obj, args);
        System.out.println("--------Log.log()---------");
        return o1;
    }

    public Object newProxyInstance(Class<?> clazz) {
        //设置产生的代理对象的父类，也就是被代理对象（被增强对象）
        enhancer.setSuperclass(clazz);
        //设置代理类的代理方法（代理方法作为回调封装在 MethodInterceptor 实例中）
        enhancer.setCallback(this);
        //使用默认无参数的构造函数创建目标对象
        return enhancer.create();
    }
}

class Test {
    public static void main(String[] args) {
        //开启 CGLIB 的 DEBUG 模式
//        String location =  ProxyerUtil.class.getResource("").getPath() + "debugging/";
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, location);
        //代理类创建和使用
        final ProxyerUtil proxyerUtil = new ProxyerUtil();
        Proxyee proxyer = (Proxyee) proxyerUtil.newProxyInstance(Proxyee.class);
        proxyer.sayHello("SpongeCaptain");
        proxyer.year(2020);
    }
}