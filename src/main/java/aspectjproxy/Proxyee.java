package aspectjproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/18 11:18
 */
public class Proxyee {

    public void sayHello(String str){
        System.out.println("Hello " + str);
    }

    public static void main(String[] args) {
        final Proxyee proxyee = new Proxyee();

        proxyee.sayHello("Spongecaptain");
    }
}
