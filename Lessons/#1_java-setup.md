

## Tools You Will Need

For setting up environment for performing java codes you need with a minimum of 64 MB of RAM.
You will also need the following softwares:
- Linux 5.14 or Windows XP/7/8/10 operating system
- [Java JDK 16](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)
- IDEs


## Java Architecture
Java Architecture combines the process of compilation and interpretation. It explains the various processes involved whilst formulating a Java program
The explaination of  the java architecture in simple steps are as follows:

- In Java, there is a process of compilation and interpretation.
- The code written in Java, is converted into byte codes which is done by the Java Compiler.
- The byte codes, then are converted into machine code by the JVM.
- The Machine code is executed directly by the machine.

### Components of Java Architecture
There are three main components of Java language:

- **JVM:** Java Virtual Machine 
- **JRE:** Java Runtime Environment 
- **JDK:** Java Development Kit

### Java Virtual Machine:
Java applications are called WORA(Write Once, Run Anywhere) because of their ability to run a code on any platform. This is done only because of JVM. The JVM is a Java platform component that provides an environment for executing Java programs. JVM interprets the bytecode into machine code which is executed in the machine in which the Java program runs.

So, in a nutshell, JVM performs the following functions:
- Loads the code
- Verifies the code
- Executes the code
- Provides runtime environment

### Java Runtime Environment:
The JRE software builds a runtime environment in which Java programs can be executed. The JRE is the on-disk system that takes your Java code, combines it with the needed libraries, and starts the JVM to execute it. The JRE contains libraries and software needed by your Java programs to run. JRE is a part of JDK but can be downloaded separately.

### Java Development Kit:
The Java Development Kit is a software development environment used to develop Java applications and applets. It contains JRE and several development tools, an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc) accompanied with another tool.


## Setting up Java development environment

Java SE is freely available from the link [Download Java](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html). You can download a version based on your 
operating system. Follow the instructions to download Java and run the `.exe` to install Java on your machine. Once Java is installed on your machine, you will need to set 
environment variables to point to correct installation directories:

### Setting Up the Path for Windows:

Assuming you have installed Java in *`C:\Program Files\Java\JDK* directory`:*
- Right-click on `This PC` and select `Properties`.
- Click the `Environment variables` button under the `Advanced` tab.
- Now, alter the `PATH` variable so that it also contains the path to the Java executable. Example, if the path is currently set to *`C:\WINDOWS\SYSTEM32`*, then change your 
path to read *`C:\WINDOWS\SYSTEM32;C:\Program Files\Java\JDK\bin`*

### Setting Up the Path for Linux, UNIX:

Environment variable `PATH` should be set to point to where the Java binaries have been installed. Refer to your shell documentation, if you have trouble doing this. Example, if
you use bash as your shell, then you would add the following line to the end of your *`.bashrc: export PATH = /path/to/java:$PATH`*.


## IDEs

It is a software development environment for writing, debugging, and testing Java programs. we can write code very smoothly using IDE. There are many IDE's available for java. for example, **[IntelliJ IDEA](https://www.jetbrains.com/idea/)**, [Eclipse](https://www.eclipse.org/downloads/), [Netbeans](https://netbeans.apache.org/download/nb120/nb120.html), etc.


After setting up JDK, install anyone of the of your favorite IDE just by clicking on the link and install it.


*It's really Simple!*
