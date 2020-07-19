package cglibproxy;

/**
 * @author SpongeCaptain
 * @date 2020/7/17 14:19
 */
public class Proxyee {

    public String sayHello(String name){
        System.out.println("hello "+ name);
        return  "hello "+ name;
    }

    public Integer year(int year){
        System.out.println("This is " + year);
        return year;
    }
}
