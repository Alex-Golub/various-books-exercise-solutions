<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[Section 10.1: ArrayLists](#1)  
[Section 10.2: The Comparable Interface](#2)

<h3 align="center" id="1"><u>Section 10.1: ArrayLists</u><a href="#home"> 👆</a></h3>

> 1. What is an `ArrayList`? In what cases should you use an `ArrayList` rather than an array?
>    > `ArrayList` is a class located in `java.util` package.  
>    > `ArrayList<E>` can store object elements such as `String`, `Integer`, `Date` etc.  
>    > We would use `ArrayList` data structure if the number of elements is not known before hand
>    > and we want to allow dynamic grow/shrink of the underlying structure.

> 2. Which of the following is the correct syntax to construct an ArrayList to store integers?
>    > ```java
>    > ArrayList list = new ArrayList();                   // ✔, it will create a list of Object
>    > ArrayList[int] list = new ArrayList[int]();         // ✖, ArrayList<E>
>    > ArrayList list<integer> = new ArrayList<integer>(); // ✖, improper location of <integer> in left side
>    > ArrayList<Integer> list = new ArrayList();          // ✖, <> operator is missing in rhs
>    > ArrayList<Integer> list = new ArrayList<Integer>(); // ✔
>    > ```

> 3 - 7. `["It", "was", "a", "stormy", "night"]`  
>  Write the code to declare an `ArrayList` containing these elements.  
>  What is the `size` of the list? What is its type?
>
> > ```java
> > List<String> list = new ArrayList<>(Arrays.asList("It", "was", "a", "stormy", "night"));
> > list.size();                          // 5
> > list.add(3, "dark");                  // [It, was, a, dark, stormy, night]
> > list.add(4, "and");                   // [It, was, a, dark, and, stormy, night]
> > list.set(1, "IS");                    // [It, IS, a, dark, and, stormy, night]
> > list1.removeIf(s -> s.contains("a")); // [It, IS, stormy, night]
> >
> > List<Integer> nums = IntStream.range(0, 10)
> >                               .mapToObj(i -> 2 * i)
> >                               .collect(Collectors.toList()); // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
> > ```

> 8. Write a method `maxLength` ...
>    > ```java
>    > public static int maxLength(ArrayList<String> list) {
>    >   OptionalInt max = list.stream().mapToInt(String::length).max();
>    >   return max.isPresent() ? max.getAsInt() : 0;
>    > }
>    > ```

> 9. Whether or not a list of Strings contains the value `"IS"`...
>    > ```java
>    > System.out.println(list.contains("IS"));
>    > ```

> 10 - 11 Find `"stormy"` and `"dark"` indices. UpperCase each `String` element.
>
> > ```java
> > List<String> list = new ArrayList<>(Arrays.asList("It", "was", "a", "dark", "stormy", "night"));
> > System.out.println(list.indexOf("stormy")); // 4
> > System.out.println(list.indexOf("dark"));   // 3
> > list.forEach(s -> System.out.println(s.toUpperCase()));
> > ```

> 12. it throws an exception. Why?
>     > ```java
>     > for (String s : words) {
>     >   System.out.println(s);
>     >
>     >   if (s.equals("hello"))
>     >     words.add("goodbye");
>     > }
>     > ```
>     >
>     > Using For-Each loop list can't be traversed and modified at the same time.
>     > This will cause `ConcurrentModificationException`

> 13. The code that follows does not compile. Why not? Explain how to fix it.
>     > ```java
>     > ArrayList<int> numbers = new ArrayList<int>(); // primitive type as E, should be <Integer> wrapper class
>     > numbers.add(7);
>     > numbers.add(19);
>     > System.out.println(numbers);
>     > ```

> 14. What is a wrapper class? Describe the difference between an `int` and an `Integer`.
>     > primitive types can be treated as objects using their corresponding wrapper classes  
>     > `Integer` class have static methods that allow to do operations on int type.  
>     > if we want to use `int` type within a list collection we must use the wrapper class  
>     > otherwise we will get a compile-time error.

> 15. Write the output ...
>     > ```java
>     > public static void mystery1(ArrayList<Integer> list) {
>     >   for (int i = list.size() - 1; i > 0; i--) {
>     >     if (list.get(i) < list.get(i - 1)) {
>     >       int element = list.get(i);
>     >       list.remove(i);
>     >       list.add(0, element);
>     >     }
>     >   }
>     >   System.out.println(list);
>     > }
>     > ```
>     >
>     > [2, 6, 1, 8] => `[1, 2, 6, 8]`  
>     > [30, 20, 10, 60, 50, 40] => `[10, 30, 40, 20, 60, 50]`  
>     > [-4, 16, 9, 1, 64, 25, 36, 4, 49] => `[-4, 1, 25, 4, 16, 9, 64, 36, 49]`

> 16. Write the output ...
>     > ```java
>     > public static void mystery2(ArrayList<Integer> list) {
>     >   for (int i = list.size() - 1; i >= 0; i--) {
>     >     if (i % 2 == 0) list.add(list.get(i));
>     >     else            list.add(0, list.get(i));
>     >   }
>     >   System.out.println(list);
>     > }
>     > ```
>     >
>     > [10, 20, 30] => `[20, 10, 20, 30, 30, 20]`  
>     > [8, 2, 9, 7, 4] => `[8, 7, 8, 2, 9, 7, 4, 4, 2, 8]`  
>     > [-1, 3, 28, 17, 9, 33] => `[33, 28, 33, -1, 3, 28, 17, 9, 33, 17, -1, 33]`

> 17. Write the output ...
>     > ```java
>     > public static void mystery3(ArrayList<Integer> list) {
>     >   for (int i = list.size() - 2; i > 0; i--) {
>     >     int a = list.get(i);
>     >     int b = list.get(i + 1);
>     >     list.set(i, a + b);
>     >   }
>     >   System.out.println(list);
>     > }
>     > ```
>     >
>     > [72, 20] => `[72, 20]`  
>     > [1, 2, 3, 4, 5, 6] => `[1, 20, 18, 15, 11, 6]`  
>     > [10, 20, 30, 40] => `[10, 90, 70, 40]`

> 18. Write the output ...
>     > ```java
>     > public static void mystery4(ArrayList<Integer> list) {
>     >   for (int i = 0; i < list.size(); i++) {
>     >     int element = list.get(i);
>     >     list.remove(i);
>     >     list.add(0, element + 1);
>     >   }
>     >   System.out.println(list);
>     > }
>     > ```
>     >
>     > [10, 20, 30] => `[31, 21, 11]`  
>     > [8, 2, 9, 7, 4] => `[5, 8, 10, 3, 9]`  
>     > [-1, 3, 28, 17, 9, 33] => `[34, 10, 18, 29, 4, 0]`

---

<h3 align="center" id="2"><u>Section 10.2: The Comparable Interface</u><a href="#home"> 👆</a></h3>

> 19. Describe how to arrange an `ArrayList` into sorted order.  
>      What must be true about the type of elements in the list in order to sort it?
>     > To be able to sort list of types those types must be comparable.  
>     > The be comparable each class must implement the `Comparable<T>` interface and  
>     > provide own implementation of the `int compareTo(T other)` method.

> 20. What is a natural ordering?  
>      How do you define a natural ordering for a class you’ve written?
>     > Natural ordering of objects its when we can determine for two object which on is "less then",  
>     > "equal" or "greater then".

> 21. Consider the following variable declarations:
>     Indicate whether the result of each of the following comparisons is positive, negative, or 0:
>     > ```java
>     > Integer n1 = 15;
>     > Integer n2 = 7;
>     > Integer n3 = 15;
>     > String s1 = "computer";
>     > String s2 = "soda";
>     > String s3 = "pencil";
>     >
>     > n1.compareTo(n2); // 15 - 7 = 8  => +ve
>     > n3.compareTo(n1); // 15 - 15 = 0 => 0
>     > n2.compareTo(n1); // 7 - 15 = -7 => -ve
>     > s1.compareTo(s2); // 'c' - 's'   => -ve
>     > s3.compareTo(s1); // 'p' - 'c'   => -ve
>     > s2.compareTo(s2); //             => 0
>     > ```

> 22. Use the `compareTo` method to write...
>     > ```java
>     >     Scanner scanner = new Scanner(System.in);
>     >     System.out.print("Type a name: ");
>     >     String name1 = scanner.nextLine();
>     >     System.out.print("Type a name: ");
>     >     String name2 = scanner.nextLine();
>     >     int compare = name1.compareTo(name2);
>     >     if (compare < 0) {
>     >       System.out.println(name1 + " goes before " + name2);
>     >     } else if (compare > 0) {
>     >       System.out.println(name1 + " goes after " + name2);
>     >     } else {
>     >       System.out.println(name1 + " is the same as " + name2);
>     >     }
>     > ```

> 23. Write code to read a line of input from the user ....
>     > ```java
>     > Scanner scanner = new Scanner(System.in);
>     > System.out.print("Type a message to sort: ");
>     > String line = scanner.nextLine();
>     > String[] words = line.split("\\s+");
>     > Arrays.sort(words);
>     > System.out.print("Your message sorted: " + String.join(" ", words));
>     > ```
