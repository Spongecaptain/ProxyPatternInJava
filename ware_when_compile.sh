#!/usr/bin/env bash
# 编译时织入，即使用的是 ajc 编译器直接来编译 java 文件，生产 class 文件
ASPECTJ_WEAVER=/Users/wjjiang/.m2/repository/org/aspectj/aspectjweaver/1.8.13/aspectjweaver-1.8.13.jar
ASPECTJ_RT=/Users/wjjiang/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar
ASPECTJ_TOOLS=/Users/wjjiang/.m2/repository/org/aspectj/aspectjtools/1.8.9/aspectjtools-1.8.9.jar

java -jar $ASPECTJ_TOOLS -cp $ASPECTJ_RT -source 1.5 -sourceroots src/main/java/aspectjproxy -d target/classes