#!/usr/bin/env bash
# 编译后织入，即使用的是 ajc 编译器间接来编译 class 文件，前置的 class 文件由 javac 编译器生成

## 这一步使用 javac 命令先生产原始的 class 文件
javac -cp /Users/wjjiang/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar  -d target/classes src/main/java/aspectjproxy/*.java

## 接着使用 ajc 编译器接收上述 class 文件，然后生产新的 class 文件并覆盖原文件
ASPECTJ_WEAVER=/Users/wjjiang/.m2/repository/org/aspectj/aspectjweaver/1.8.13/aspectjweaver-1.8.13.jar
ASPECTJ_RT=/Users/wjjiang/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar
ASPECTJ_TOOLS=/Users/wjjiang/.m2/repository/org/aspectj/aspectjtools/1.8.9/aspectjtools-1.8.9.jar

java -jar $ASPECTJ_TOOLS -cp $ASPECTJ_RT -source 1.5 -inpath target/classes/aspectjproxy -d target/classes