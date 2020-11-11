> _Object_
>
> > _Object_ as an entity that can do work for you when you call its methods.  
> > How the work is done is not important to the programmer using the object.  
> > You use an object by calling its methods.

> _Method_
>
> > A method is a sequence of instructions that accesses the data of an object.

> _Class_
>
> > A class describes a set of objects with the same behavior.  
> > Different classes have different responsibilities.

> _Variable_
>
> > A storage location in a computer program.  
> > Each variable has a `name` and holds a `value`.  
> > When declaring a variable, you usually want to **initialize** it.  
> > That is, you specify the `value` that should be stored in the variable.  
> > A variable in Java stores data of a **specific type** (statically typed language).  
> > You **must specify** the type whenever you declare a variable.

> _Variable Type Inference_
>
> > As of `Java 10`, you **need not specify** the type of a variable that you initialize.  
> > Java compiler infers the type of the variable from the type of the initial value.
> >
> > ```java
> > var milesPerGallon = 22.5; // double milesPerGallon = 22.5;
> > var greeting = "YoYoYo";   // String greeting = "YoYoYo";
> > ```

> _Public Interface of the Class_
>
> > What you can do with the objects of the class.  
> > A class also declares a _private implementation_, describing the data inside its  
> > objects and the instructions for its methods.  
> > Those details are hidden from the programmers who use objects and call methods.

> _Accessor and Mutator Methods_
>
> > A method that **accesses** an object and returns some information about it,  
> > **without changing the object**, is called an **_accessor_** method.  
> > A method whose purpose is to **modify the internal data of an object**
> > is called a **_mutator_** method.

> _Packages_
>
> > A package is a **collection of classes** with a related purpose.
> > `java.lang` package, and all classes from this package are **automatically imported**,  
> > so you never need to import them yourself.
> >
> > ```java
> > import java.awt.Rectangle; // import packageName.ClassName
> > ```

> _Object References i.e. memory location of an object_
>
> > An object variable (that is, a variable whose type is a class) does not actually  
> > hold an object.
> > It merely holds the **_memory location_** of an object.
> > It is **more efficient** to store only the memory location instead of the entire object.
> > When a variable contains the memory location of an object, we say that it **refers**
> > to an object.
> > _new_ operator returns a reference to the new object.
> >
> > ```java
> > Rectangle box = new Rectangle(5, 5, 10, 20); // box holds reference to Rectangle object
> > Rectangle box2 = box; // box2 refers to the same object in memory as box
> > ```

> _Primitives vs. Objects_
>
> > When we copy a number, the original and the copy of the number are **independent values**.  
> > But when you copy an object reference, both the original and the copy are **_references_**  
> > **_to the same object._**
