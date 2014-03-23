instrumentit
============

Dynamically get metrics from your Java application

Currently just a POC to play with AspectJ dynamically adding instrumentation to any Java application using a simple Java agent.

It will print out the name of any class that is loaded by the classloader and the time taken to execute a method.

Usage
=====

```mvn install```

```java -javaagent:uber-instrumentit-0.0.1-SNAPSHOT.jar -jar ~/Downloads/dummy-app.jar```
