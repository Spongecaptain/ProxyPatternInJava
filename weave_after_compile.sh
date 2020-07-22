#!/usr/bin/env bash

## Setp1: use javac command to geneate ususal class file
javac -cp ~/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar  -d target/classes src/main/java/aspectjproxy/*.java

## Step2: use the ajc compiler to accept the usual class file, and then  it generates enhanced byte code(i.e. the new class file)
ASPECTJ_WEAVER=~/.m2/repository/org/aspectj/aspectjweaver/1.8.13/aspectjweaver-1.8.13.jar
ASPECTJ_RT=~/.m2/repository/org/aspectj/aspectjrt/1.8.9/aspectjrt-1.8.9.jar
ASPECTJ_TOOLS=~/.m2/repository/org/aspectj/aspectjtools/1.8.9/aspectjtools-1.8.9.jar

java -jar $ASPECTJ_TOOLS -cp $ASPECTJ_RT -source 1.5 -inpath target/classes/aspectjproxy -d target/classes