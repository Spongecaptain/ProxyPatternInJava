package staticproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/20 09:22
 */
public class Proxyer implements Foo {

    Proxyee proxyee;

    public Proxyer(Proxyee proxyee) {
        this.proxyee = proxyee;
    }

    @Override
    public String bar(String str, int i) {
        System.out.println("-------Log.log()--------");
        final String res = proxyee.bar(str, i);
        System.out.println("-------Log.log()--------");
        return res;
    }
}
//静态代理测试
class Test{
    public static void main(String[] args) {
        final Proxyer proxyer = new Proxyer(new Proxyee());
        proxyer.bar("hello ",2020);
    }
}
