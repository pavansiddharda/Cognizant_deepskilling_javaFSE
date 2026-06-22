/**Java is a high-level, object-oriented programming language and computing platform developed by Sun Microsystems in 1995 (now owned by Oracle Corporation).
It is one of the most widely used programming languages in the world because of its portability, reliability, and security.
*components of java:
1.	Java Development Kit (JDK)
o	The complete package for Java development.
o	Includes tools and libraries to write, compile, debug, and execute Java programs.
o	Contains:
	Compiler (javac) – converts source code into bytecode.
	Java Runtime Environment (JRE)
	Development tools (debugger, jar, etc.).
________________________________________
2.	Java Runtime Environment (JRE)
o	Provides the environment to run Java applications.
o	Includes:
	Java Virtual Machine (JVM)
	Core libraries (API classes like java.lang, java.util, etc.).
o	It does not include development tools like compiler/debugger.
o	Example: If you just want to run Java programs (not develop), you only need JRE.
________________________________________
3.	Java Virtual Machine (JVM)
o	The engine that runs Java programs.
o	Converts bytecode (.class files) into machine code for the host system.
o	Makes Java platform-independent (WORA).
o	Handles:
	Memory management (Garbage Collection).
	Security checks.
	Execution of code.
Java is platform independent:
Java is called platform independent because the same Java program can run on any operating system (Windows, Linux, Mac, etc.) without modification.
 Structure of a java class:
Public class Main{
Public static void main(string[] args{    }   }
Public: this keyword specifies the visibility of thr class can be accessed from other classes
Class:this keyword is used to declare a class in java
Main: this is the name of the class in java,the name of the class must match the filename
•	System.out.println() to print something in console ,ln is for new line
•	Primitive-> byte, short,  int, long, float, double, char, bool
•	Non primitive->string, arrays, classes
•	1 byte is 8 bits
•	Float 8 bytes, double 8 bytes 
•	Default value of Boolean is FALSE
•	A variable is a container that stores a value(it can change)
•	Must start with $ or _ !( numbers,special characters)
•	
 */
/* default values
 * byte:0
 * short:0
 * double:0.0d
 * float:0.0f
 * char:\u0000'(nullcharacter)
 * long:0l
 * boolean:false
 * int:0
 * local val will not have a default value
 * type casting->narrowing (explicit conversertion),widening(implicit conversertion)
*/
public class widening {
    public static void main(String[] args) {
        int x=7;
        long y = x;
        float z=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
 /*in narrowing data may be lost trancated(eliminated) 
 double->float->long->int->char->short->byte*/
 public class narrowing {
    public static void main(String[] args) {
        double d=166.66;
        long l=(long)d;
        int i=(int)l;
        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
    }
}
/*
 * operator represents an operation that may be performed on one or more operands
 * 
 */

