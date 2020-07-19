package jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/16 22:08
 */
public class Proxyer {
    public static void main(String[] args) {
        final Proxyee proxyee = new Proxyee();
        final ClassLoader classLoader = Proxyee.class.getClassLoader();
        final Class<?>[] interfaces = Proxyee.class.getInterfaces();
        InvocationHandler myInvocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //你应当将此路径修改为你电脑上向存放该文件的路径，文件名可以不变
                addClassToDisk(proxy.getClass().getName(),Proxyee.class,"/Users/wjjiang/Desktop/$Proxy0.class");
                System.out.println("--------Log.log()---------");
                method.invoke(proxyee, args[0], args[1]);
                System.out.println("--------Log.log()---------");
                return "From Proxyer";
            }
            //此方法用于生产代理对象对$ProxyeeCGLIB0.class应 Class 类的字节码
            private void addClassToDisk(String className, Class<?> cl, String path) {
                byte[] classFile = ProxyGenerator.generateProxyClass(className, cl.getInterfaces());
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(path);
                    //将代理对象的class字节码写到硬盘上
                    out.write(classFile);
                    out.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Foo proxyer = (Foo) Proxy.newProxyInstance(classLoader, interfaces, myInvocationHandler);

        String result = proxyer.bar("hello", 2020);
        System.out.println(result);

    }
}
