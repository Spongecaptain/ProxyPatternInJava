#!/usr/bin/env bash
# use the ajc compiler to comlile .java file directly instead of javac, and then it generates the enhanced class file while compliing
ASPECTJ_WEAVER=~/.m2/repository/org/aspectj/aspectjweaver/1.8.13/aspectjweaver-1.8.13.jar
ASPECTJ_RT=~/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar
ASPECTJ_TOOLS=~/.m2/repository/org/aspectj/aspectjtools/1.8.9/aspectjtools-1.8.9.jar

java -jar $ASPECTJ_TOOLS -cp $ASPECTJ_RT -source 1.5 -sourceroots src/main/java/aspectjproxy -d target/classes