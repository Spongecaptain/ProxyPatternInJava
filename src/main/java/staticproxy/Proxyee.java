package staticproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/20 09:20
 *
 * Here we use static proxy pattern to implement static proxy.
 */
public class Proxyee implements Foo{

    @Override
    public String bar(String str,int i) {
        System.out.println(str+i);
        return str+i;
    }
}
