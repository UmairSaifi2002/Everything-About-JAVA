# What is a proramming language?
To communicate with a person, we need a specific language, similarly to communicate with computers, 
programmers also need a language which is called Programming language.

It is a set of instructions written in any specific language

# A. Machine Language
1. Machine language is a type of low-level programming language.
2. It is a series of 0s and 1s.
3. Needs no translation.

# B. Assembly Language
1. It is also a type of low-level programming language that is designed for specific processors.
2. It represents the set of instructions in a symbolic and human-understandable form. 
3. It uses an assembler to convert the assembly language to machine language.

# C. High level Language
1. It is a developer friendly language.
2. This programming language requires a compiler or interpreter to 
translate the program into machine language.

# Some More Types:
# A Procedural Proramming Language
1. List of instructions to tell the computer, what to do step by step.
2. It divides a program into small procedures called routines or functions.
3. It is also called structured programming.
4. Examples are FORTRAN AND C.

# B. Functional Programming Language
1. It is an approach to problem solving.
2. It treats every computation as a mathematical function.
3. It allows you to write a mathematical function, i.e. a function 
that takes n arguments and returns a value.
If the program is executed, this function is logically evaluated as needed.
4. Examples are Python, Haskel

# C. Object Oriented Programming Language
1. Object-Oriented Programming (OOP) language is based upon the objects. 
2. In this language, programs are divided into small parts called objects.
3. It uses an object-oriented programming technique that binds related data and functions 
into an object and encourages reuse of these objects within the same and other programs.
4. Example is JAVA

# D. Scripting Language
1. scripting language is a programming language that employs a high-level construct to interpret 
and execute one command at a time. 
2. In general, scripting languages are easier to learn and faster to code in 
than more structured and compiled languages such as C and C++.

# E. Statically Typed Language
1. Performs type checking at the time of compilation
2. Declaration of data type is compulsion

# F. Dynamically Typed Language
1. Performs type checking at Run time.
2. No need to declare data types.



# Memory Management 
In Java, memory management is the process of allocation and de-allocation of objects, called Memory management. 
Java does memory management automatically. Java uses an automatic memory management system called a garbage collector.

# Stack Memory vs Heap Memory:
1. Varaibles are stored in stack memory.
2. Objects are stored in Heaps.


# What is Java?
Java is a programming language which is object oriented by nature.

1. It is owned by Oracle.
2. It is open-source and free
3. Java is an object oriented language which gives a clear structure to programs 
and allows code to be reused, lowering development costs.

But wait, what is the history of java?
1. Java was developed by James Gosling, who is also known as the father of java,
and his team ( also known as green team ) at Sun Microsystems 
(which is now a subsidiary of Oracle Corporation) and released in 1995

2. First it was called as "Greentalk" and It was originally designed for interactive television, 
but it was too advanced technology for the digital cable television industry at the time.

3. However, it was best suited for internet programming. 

4. After some time The name "Greentalk" was changed to "Oak", 
and then in 1995, it was finally renamed to "Java"!

5. But why Java?
Java is an island in Indonesia where the first coffee was produced (called Java coffee). 
It is a kind of espresso bean.
Java name was chosen by James Gosling while having a cup of coffee nearby his office.

# Why coffee Logo?
The Java logo is prototyped as a blue coffee cup with red steam above it. 
The logo was a recognition for the Java engineers, who have a lot of coffee 
while developing the Java programming language. 
The coffee that they have consumed was Java coffee beans. It is a variety of coffee.

# What is JDK?
JDK, or Java Development Kit, consist of tools that are used to develop and run Java code. 
Before develop and run Java code, you should install it in your computer or system.
JDK consists of JRE and Java development tools.

JRE or Java Runtime Environment is a package that provides an environment to only run 
the Java program on your machine. It is only used to run Java programs.

JDT or Java Development tools consist of many tools like 
compiler, debugger, and other development tools.

To run code, we need JVM. JVM in each OS is different and to running Java, 
We require an JVM compatible with the operating system.
JVM is nothing but a interpreter

# Why is Java platform-independent?
Java is platform-independent because it uses a virtual machine.
Bytecodes are effectively platform-independent. 
The virtual machine takes care of the differences between the bytecodes for the different platforms,
thus JVM is platform dependent!

# How a Java Program compiles?
Java code involves a two-step execution, 
first through an OS-independent compiler; 
and second, in a virtual machine (JVM) which is custom-built 
for every operating system.

First, the source ‘.java’ file is passed through the compiler, 
which then encodes the source code into a machine-independent encoding,
known as Bytecode ( Generates ‘.Class’ files )

The class files generated by the compiler are independent of the machine or the OS,
which allows them to be run on any system.
To run, the main class file (the class that contains the method main) is passed 
to the JVM and then goes through three main stages before the 
final machine code is executed. 

# These stages are:
1. ClassLoader
The main class is loaded into the memory bypassing its ‘.class’ file to the JVM.
All the other classes referenced in the program are loaded through the class loader.
A class loader, itself an object, creates a flat namespace of class bodies
that are referenced by a string name. 

2. Bytecode Verifier
After the bytecode of a class is loaded by the class loader, 
it has to be inspected by the bytecode verifier,whose job 
is to check that the instructions don’t perform damaging actions.
Like ->
Variables are initialized before they are used.
Local variable accesses fall within the runtime stack, etc

3. Just-In-Time Compiler
This is the final stage encountered by the java program, 
and its job is to convert the loaded bytecode into machine code.
It's main purpose is to do heavy optimizations in performance.

# Link for JDK Installation
https://www.oracle.com/java/technologies/downloads/

# Link for Java Document 
https://docs.oracle.com/en/java/javase/19/

# Link for VS Code
https://code.visualstudio.com/download

# Link for IntelliJ Idea
https://www.jetbrains.com/idea/

# Link for Java Eclipse
https://www.eclipse.org/downloads/packages/


# What is entrypoint of a Java Program?
In Java programs, the point from where the program starts its execution 
or simply the entry point of Java programs is the main() method.

JVM Searches for a main method, if it is not found then the execution will not take place!
Also, when a java program starts, a daemon thread is attached to the main method, 
and this thread gets destroyed only when the Java program stops execution.

# Example of a function signature?
public static void main(String[] args)

- public is a access specifier!
- static is a keyword!
- void is a return type!
- main is the name of the method!
- () dennotes the function
- String is a data type
- [] dennotes an array
- args is the local variable name which is passed as a function parameter!

# Why main method uses public keyword?
Public is an Access modifier, which specifies from where and who can access the method. 
Making the main() method public makes it globally available. It is made public so that 
JVM can invoke it from outside the class as it is not present in the current class.

# Why is main method static?
It is a keyword that is when associated with a method, making it a class-related method. 
The main() method is static so that JVM can invoke it without instantiating the class. 
This also saves the unnecessary wastage of memory which would have been used by the 
object declared only for calling the main() method by the JVM.

# Why we use void in main()?
It is a keyword and is used to specify that a method doesn’t return anything. 
As the main() method doesn’t return anything, its return type is void but 
still we can use return keyword to return void from the function. 

As soon as the main() method terminates, the java program terminates too.
Hence, it doesn’t make any sense to return from the main() 
method as JVM can’t do anything with the return value of it.

# What is main?
It is the name of the Java main method. It is the identifier that the 
JVM looks for as the starting point of the java program. It’s not a keyword.

# Can we execute a java program without main method?

Yes, we can execute a java program without a main method by using a static block.
A static block in Java is a group of statements that gets executed only once 
when the class is loaded into the memory by ClassLoader, 
It is also known as a static initialization block, and it goes into the stack memory.
Won't run on java 8 and above!

Example ->
class JavaPlusDSA {
    static
    {
        System.out.println("Mai chala toh sbko current laga re!!!!");
    }
}


What are comments?
Comments can be used to explain Java code, and to make it more readable.

"Best use of comments is that you can comment the Bug in the program and 
the Bug will be resolved?" Wait, don't try this,I am just joking!
Bug will be gone but so will your job opportunity, lol!

Single Line Comments ->
Single-line comments start with two forward slashes (//).
Multi-line comments start with /* and ends with */.



