#!/usr/bin/env bash
# use java agent and AspectJ while loading the class to generate enhanced Class instance of Proxyer in memory.

ASPECTJ_WEAVER=~/.m2/repository/org/aspectj/aspectjweaver/1.8.13/aspectjweaver-1.8.13.jar
ASPECTJ_RT=~/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar
ASPECTJ_TOOLS=~.m2/repository/org/aspectj/aspectjtools/1.8.9/aspectjtools-1.8.9.jar

java -javaagent:$ASPECTJ_WEAVER -cp $ASPECTJ_RT:target/classes/ aspectjproxy.Proxyee