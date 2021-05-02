<h1 align="center" id="home"><u>CheckPoint Answers</u></h1>

[Section 11.1: Lists](#1)  
[Section 11.2: Sets](#2)  
[Section 11.3: Maps](#3)

<h3 align="center" id="1"><u>Section 11.1: Lists</u><a href="#home"> 👆</a></h3>

> 1. When should you use a `LinkedList` instead of an `ArrayList`?
>    > When adding/removing is don't frequently either in the beginning or the end of the
>    > list. Using `LinkedList` element shifting is not required when add/remove operation
>    > is executed because LinkedList DS is not sequentially stored in the memory unlike `ArrayList`
>    > which has an array object backing it up.
>    > More over, when filtering is required often then `LinkedList` is preferable.

> 2. Would a `LinkedList` or an `ArrayList` perform better when run on the following code? Why?
>    > ```java
>    > public static int min(List<Integer> list) {
>    >  int min = list.get(0);
>    >  for (int i = 1; i < list.size(); i++) {
>    >    if (list.get(i) < min) {
>    >      min = list.get(i);
>    >    }
>    >  }
>    > }
>    > ```
>    >
>    > `ArrayList` is better in this case because of the two `get(int)` methods within the for loop  
>    > With `ArrayList` we can get the value at index i **instantly** without scanning the list from the  
>    > beginning all the times e.g. if `iterator` is not used in `LinkedList` every time we want  
>    > to get value at index i we most scan from the head of the list.

> 3. What is an `iterator`?  
>     Why are iterators often used with linked lists?
>    > An `iterator` is an object that represents a position within a list and enables you to  
>    > view or make changes to the elements at that position.  
>    > Iterators are often used with linked lists because they retain the position in the list,  
>    > so you don't have to call expensive list methods like `get`, `add`, or `remove` many times  
>    > on the middle or end of the list.

> 4. Write a piece of code that counts the number of duplicate elements in a linked list, that is,  
>     the number of elements whose values are repeated at an earlier index in the list.  
>     Assume that all duplicates in the list occur consecutively.  
>     For example, the list `[1, 1, 3, 5, 5, 5, 5, 7, 7, 11]` contains five duplicates:  
>     one duplicate of element value 1, three duplicates of element value 5,  
>     and one duplicate of element value 7.
>    > ```java
>    > public static int countDuplicates(List<Integer> list) {
>    >   int count = 0;
>    >   Iterator<Integer> iterator = list.iterator();
>    >   int prev = iterator.next();
>    >
>    >   while (iterator.hasNext()) {
>    >     int value = iterator.next();
>    >     if (value == prev) {
>    >       count++;
>    >     }
>    >     prev = value;
>    >   }
>    >
>    >   return count;
>    > }
>    > ```

> 5. Write a piece of code that inserts a `String` into an ordered linked list of Strings,  
>     maintaining sorted order.
>    For example, for the list `["Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"]`,  
>     inserting `"Charlie"` in order would produce the list  
>     `["Alpha", "Baker", "Charlie", "Foxtrot", "Tango", "Whiskey"]`.
>    > ```java
>    > public static void insertInOrder(List<String> list, String value) {
>    >   ListIterator<String> it = list.listIterator();
>    >   while (it.hasNext()) {
>    >     if (it.next().compareTo(value) >= 0) {
>    >       it.previous(); // move cursor one step backwards
>    >       it.add(value); // insert right after current element
>    >       break;
>    >     }
>    >   }
>    > }
>    > ```

> 6. Write a method called `removeAll` that accepts a linked list of integers as a parameter  
>     and removes all occurrences of a particular value.  
>     You must preserve the original relative order of the remaining elements of the list.  
>     For example, the call `removeAll(list, 3)` would change the list  
>     `[3, 9, 4, 2, 3, 8, 17, 4, 3, 18, 2, 3]` to `[9, 4, 2, 8, 17, 4, 18, 2]`
>    > ```java
>    > public static void removeAll(List<Integer> list, int value) {
>    >   list.removeIf(i -> value == i);
>    > }
>    > ```

> 7. Write a method called `wrapHalf` that accepts a linked list of integers as a parameter and moves  
>     the first half of the list to the back of the list.  
>     If the list contains an **_odd number_** of elements, the smaller half is wrapped  
>     (in other words, for a list of size N, the middle element, N/2, becomes the first element in all cases).  
>     For example, calling `wrapHalf` on the list `[1, 2, 3, 4, 5, 6]`, would change that list into  
>     `[4, 5, 6, 1, 2, 3]`.  
>     For the list `[5, 6, 7, 8, 9]`, the result would be `[7, 8, 9, 5, 6]`.
>    > ```java
>    > public static void wrapHalf(Deque<Integer> list) {
>    >   int middle = list.size() / 2;
>    >   for (int i = 0; i < middle; i++) {
>    >     list.addLast(list.getFirst());
>    >     list.removeFirst();
>    >   }
>    > }
>    > ```

> 8. What is an abstract data type (**_ADT_**)?  
>     What ADT does a linked list implement?
>    > Defines the type of data a collection can hold and the operations it can perform on that data.  
>    > Linked lists implement the `List` abstract data type (interface).

---

<h3 align="center" id="2"><u>Section 11.2: Sets</u><a href="#home"> 👆</a></h3>

> 10. A `List` has every method that a Set has, and more.  
>      So why would you use a `Set` rather than a `List`?
>     > `Set` helps to element duplicate values, it supports fast adding, removing and contains methods  
>     > where's `List` is much slower because of element shifting.

> 11. When should you use a `TreeSet`, and when should you use a `HashSet`? > Use `HashSet` when order of elements is not important (elements order will be unpredictable).
>     > Use `TreeSet` when order of element is important e.g. alphabetical order of strings.
>     > You should use a TreeSet when you want to keep the data in sorted natural order.  
>     > You should use `HashSets` with non-`Comparable` types or when order doesn't matter,  
>     > to get the fastest searching time.

> 12. A `Set` doesn’t have the `get` and `set` methods that an `ArrayList` has.  
>      How do you examine every element of a `Set`?
>     > Using the `Iterator` one can examine each element of a `Set`.  
>     > `for-each` loop construct can be used as-well (also using the iterator)

> 13. What elements are contained in the following set after this code executes?
>     > ```java
>     > Set<Integer> set = new HashSet<Integer>(); // []
>     > set.add(74);     // [74]
>     > set.add(12);     // [12, 74]
>     > set.add(74);     // [12, 74]
>     > set.add(74);     // [12, 74]
>     > set.add(43);     // [12, 74, 43]
>     > set.remove(74);  // [12, 43]
>     > set.remove(999); // [12, 43]
>     > set.remove(43);  // [12]
>     > set.add(32);     // [12, 32]
>     > set.add(12);     // [12, 32]
>     > set.add(9);      // [12, 32, 9]
>     > set.add(999);    // [999, 12, 32, 9] in some order
>     > ```

> 14. How do you perform a **_union_** operation on two sets?  
>      An **_intersection_**?
>     Try to give an answer that doesn’t require any loops.
>     > `Set` interface defines set-operations for each implementing class:  
>     > `addAll` - Union  
>     > `retainAll` - Intersection  
>     > `removeAll` - Difference  
>     > `containsAll` - Superset, subset
>     >
>     > ```java
>     > Set<Integer> set1 = new HashSet<>(Arrays.asList(0, 2, 4, 6, 8, 10, 12));
>     > Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 3, 5, 7, 9, 12));
>     > Set<Integer> intersection = new HashSet<>(set1);
>     > Set<Integer> union = new HashSet<>(set1);
>     > Set<Integer> difference = new HashSet<>(set1);
>     > intersection.retainAll(set2);
>     > union.addAll(set2);
>     > difference.removeAll(set2);
>     > System.out.println("Intersection: " + intersection); // => Intersection: [0, 12]
>     > System.out.println("Union: " + union);               // => Union: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12]
>     > System.out.println("Difference: " + difference);     // => Difference: [2, 4, 6, 8, 10]
>     > ```

> 15. Write the output produced when the following method is passed each of the following lists:
>     > `[amanda, helene, jessica]`  
>     > `[riley]`  
>     > `[alex, charlie, phil, roy, tyler]`

---

<h3 align="center" id="3"><u>Section 11.3: Maps</u><a href="#home"> 👆</a></h3>

> 16. Write the code to declare a `Map` that associates people’s names with their ages.  
>      Add mappings for your own name and age, as well as those of a few friends or relatives.
>     > ```java
>     > Map<String, Integer> nameAge = new HashMap<>();
>     > nameAge.put("John Doe", 42);
>     > nameAge.put("Jane Smith", 32);
>     > nameAge.put("Karen Go", 25);
>     > System.out.println(nameAge); // => {John Doe=42, Karen Go=25, Jane Smith=32}
>     > ```

> 17. A Map doesn’t have the `get` and `set` methods that an `ArrayList` has.  
>      It doesn’t even have an `iterator` method like a `Set` does, nor can you use a `for-each`  
>      loop on it directly.  
>      How do you examine every key (or every value) of a `Map`?
>     > Using the `keySet()` method one can get a `Set<T>` of all the keys from the map.  
>     > Using the `values()` method one can get a `Collection<T>` of the values.  
>     > We can also get an `Entry<K, V>` set and use for-each loop e.g.:
>     >
>     > ```java
>     > Map<String, Integer> nameAge = new HashMap<>();
>     > nameAge.put("John Doe", 42);
>     > nameAge.put("Jane Smith", 32);
>     > nameAge.put("Karen Go", 25);
>     > for (Map.Entry<String, Integer> e : nameAge.entrySet()) {
>     >   System.out.println("\"" + e.getKey() + "\" age is " + e.getValue());
>     > }
>     > // => "John Doe" age is 42
>     > // => "Karen Go" age is 25
>     > // => "Jane Smith" age is 32
>     > ```

> 18. What keys and values are contained in the following map after this code executes?
>     > ```java
>     > Map<Integer, String> map = new HashMap<Integer, String>(); // {}
>     > map.put(8, "Eight");         // { 8=Eight }
>     > map.put(41, "Forty-one");    // { 8=Eight, 41=Forty-one }
>     > map.put(8, "Ocho");          // { 8=Ocho, 41=Forty-one }
>     > map.put(18, "Eighteen");     // { 8=Ocho, 41=Forty-one, 18=Eighteen }
>     > map.put(50, "Fifty");        // { 8=Ocho, 41=Forty-one, 18=Eighteen, 50=Fifty }
>     > map.put(132, "OneThreeTwo"); // { 8=Ocho, 41=Forty-one, 18=Eighteen, 50=Fifty, 132=OneThreeTwo }
>     > map.put(28, "Twenty-eight"); // { 8=Ocho, 41=Forty-one, 18=Eighteen, 50=Fifty, 132=OneThreeTwo, 28=Twenty-eight }
>     > map.put(79, "Seventy-nine"); // { 8=Ocho, 41=Forty-one, 18=Eighteen, 50=Fifty, 132=OneThreeTwo, 28=Twenty-eight, 79=Seventy-nine }
>     > map.remove(41);              // { 8=Ocho, 18=Eighteen, 50=Fifty, 132=OneThreeTwo, 28=Twenty-eight, 79=Seventy-nine }
>     > map.remove(28);              // { 8=Ocho, 18=Eighteen, 50=Fifty, 132=OneThreeTwo, 79=Seventy-nine }
>     > map.remove("Eight");         // return null, there is no such key
>     > map.put(50, "Forty-one");    // { 8=Ocho, 18=Eighteen, 50=Forty-one, 132=OneThreeTwo, 79=Seventy-nine }
>     > map.put(28, "18");           // { 8=Ocho, 18=Eighteen, 50=Forty-one, 132=OneThreeTwo, 79=Seventy-nine, 28=18 }
>     > map.remove(18);              // { 8=Ocho, 50=Forty-one, 132=OneThreeTwo, 79=Seventy-nine, 28=18 } in some order
>     > ```

> 19. Write the output produced when the following method is passed each of the following maps:
>     > ```java
>     > public static void mystery(Map<String, String> map) {
>     >   Map<String, String> result = new TreeMap<String, String>(); // natural order by key
>     >   for (String key : map.keySet()) {
>     >     if (key.compareTo(map.get(key)) < 0) {
>     >       result.put(key, map.get(key));
>     >     } else {
>     >       result.put(map.get(key), key);
>     >     }
>     >   }
>     >   System.out.println(result);
>     > }
>     >
>     > // a. {two=deux, five=cinq, one=un, three=trois, four=quatre}           => {cinq=five, deux=two, four=quatre, one=un, three=trois}
>     > // b. {skate=board, drive=car, program=computer, play=computer}         => {board=skate, car=drive, computer=play}
>     > // c. {siskel=ebert, girl=boy, H=T, ready=begin, first=last, begin=end} => {begin=end, boy=girl, ebert=siskel, first=last, heads=tails}
>     > // d. {cotton=shirt, tree=violin, seed=tree, light=tree, rain=cotton}   => {cotton=rain, light=tree, seed=tree, tree=violin}
>     > ```

> 20. Write the output produced when the following method is passed each of the following maps:
>     > ```java
>     > public static void mystery(Map<String, String> m) {
>     >   Set<String> s = new TreeSet<String>();
>     >   for (String key : m.keySet()) {
>     >     if (!m.get(key).equals(key)) {
>     >       s.add(m.get(key));
>     >     } else {
>     >       s.remove(m.get(key));
>     >     }
>     >   }
>     >   System.out.println(s);
>     > }
>     >
>     > // a. {sheep=wool, house=brick, cast=plaster, wool=wool}                  // => {brick, plaster}
>     > // b. {ball=blue, winkie=yellow, corn=yellow, grass=green, emerald=green} // => {blue, green, yellow}
>     > // c. {pumpkin=peach, corn=apple, apple=apple, pie=fruit, peach=peach}    // => {fruit}
>     > // d. {lab=ipl, lion=cat, corgi=dog, cat=cat, emu=animal, nyan=cat}       // => {animal, cat, dog, ipl}
>     > ```

> 21. Write the map returned when the following method is passed the following maps:
>     > ```java
>     > public Map<String, String> mystery(Map<String, Integer> map1, Map<Integer, String> map2) {
>     >   Map<String, String> result = new TreeMap<>();
>     >   for (String s1 : map1.keySet()) {
>     >     if (map2.containsKey(map1.get(s1))) {
>     >       result.put(s1, map2.get(map1.get(s1)));
>     >     }
>     >   }
>     >   return result;
>     > }
>     >
>     > // a. map1: {bar=1, baz=2, foo=3, mumble=4},
>     > //    map2: {1=earth, 2=wind, 3=air, 4=fire}                            // => {bar=earth, baz=wind, foo=air, mumble=fire}
>     > // b. map1: {five=105, four=104, one=101, six=106, three=103, two=102},
>     > //    map2: {99=uno, 101=dos, 103=tres, 105=quatro}                     // => {five=quatro, one=dos, three=tres}
>     > // c. map1: {a=42, b=9, c=7, d=15, e=11, f=24, g=7},
>     > //    map2: {1=four, 3=score, 5=and, 7=seven, 9=years, 11=ago}          // => {b=years, c=seven, e=ago, g=seven}
>     > ```

> 22. Modify the `WordCount` program so that it prints the most frequently occurring words sorted  
>      by number of occurrences.
>     > ```java
>     > Map<Integer, String> occurrenceWord = new TreeMap<>(Comparator.reverseOrder());
>     > for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
>     >   occurrenceWord.put(entry.getValue(), entry.getKey());
>     > }
>     >
>     > for (Map.Entry<Integer, String> entry : occurrenceWord.entrySet()) {
>     >   if (entry.getKey() > OCCURRENCES) {
>     >     System.out.println("\"" + entry.getValue() + "\" occurs " + entry.getKey() + " times");
>     >   }
>     > }
>     >
>     > // => "the" occurs 14092 times
>     > // => "of" occurs 6408 times
>     > // => "and" occurs 6182 times
>     > // => "a" occurs 4571 times
>     > // => "to" occurs 4448 times
>     > // => "in" occurs 3992 times
>     > // => "that" occurs 2729 times
>     > // => "his" occurs 2459 times
>     > ```
