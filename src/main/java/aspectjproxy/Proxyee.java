package aspectjproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/18 11:18
 *
 *  Implement dynamic proxy by AspectJ
 *  the bytecode can be enhanced when while compiling, after compiling or class loading.
 *
 *  you can run the shell script in the top-level directory of this project
 *
 *  But! You may change the  Maven repository in you own computer first.
 */
public class Proxyee {

    public void sayHello(String str){
        System.out.println("Hello " + str);
    }

}
