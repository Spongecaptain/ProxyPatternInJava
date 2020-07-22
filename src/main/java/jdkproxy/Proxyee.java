package jdkproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/16 22:07
 *
 * Here we use JDK Proxy to implement proxy pattern.
 */
public class Proxyee implements Foo {
    @Override
    public String bar(String str,int i) {
        System.out.println(str+i);
        return str+i;
    }
}
