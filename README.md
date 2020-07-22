# README

## 1. Project Architecture
This project includes five packages:
- `extendproxy` uses the `extends` syntax in Java to implement proxy pattern;
- `staticproxy` uses the  `implements` syntax in Java to implement proxy pattern;
- `jdkproxy` uses the  `JDK proxy` library(i.e. `java.lang.reflect.Proxy` and `java.lang.reflect.InvocationHandler;`) to implement proxy pattern;
- `cglibproxy` uses the `CGLIB` third party library to implement proxy pattern;
- `aspectjproxy` uses the `AspectJ` third party library to implement proxy pattern;


## 2. About Shell Script

You may use shell script in this project to use AspectJ for generating proxyer class:

- ware_when_compile.sh
- ware_after_compile.sh
- ware_when_load.sh

> Other packages don't use these shell script, ONLY for AspectJ.
>
> Usually a GitHub repository doesn't include the `target/classes` directory, but right now we are talking about the byte code.  

## 3. What's More

If you are Chinese or you don't mind read in Chinese, you also read my personal blog to help for you understanding Proxy Pattern in Java, including a discussion of this project.

- https://spongecaptain.cool/post/java/proxypattern/
- https://spongecaptain.cool/post/java/cglibproxy/
- https://spongecaptain.cool/post/java/aspectjproxy/