package extendproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/20 09:25
 */
public class Proxyer extends Proxyee {

    @Override
    public void sayHello(String str) {
        System.out.println("------Log.log()------");
        super.sayHello(str);
        System.out.println("------Log.log()------");
    }
}

class Test{
    public static void main(String[] args) {
        final Proxyer proxyer = new Proxyer();
        proxyer.sayHello("Spongecaptain");
    }
}
