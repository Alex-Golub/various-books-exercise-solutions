```java
// ███████████████████████████████████ bigoh1 ██████████████████████████████████████████████████████

// a) => O(N)
int sum = 0;
for (int i = 1; i <= N + 2; i++) { sum++; }     // - N
for (int j = 1; j <= N * 2; j++) { sum += 5; }  // - 2N
System.out.println(sum);

// b) => O(N^2)
int sum = 0;
for (int i = 1; i <= N - 5; i++) { // N
    for (int j = 1; j <= N - 5; j += 2) { // N
        sum++;
    }
}
System.out.println(sum);

// c) => O(1)
int sum = N;
for (int i = 0; i < 1_000_000; i++) { // - 1
    for (int j = 1; j <= i; j++) {    // - 1
        sum += N;
    }
    for (int j = 1; j <= i; j++) { // - 1
        sum += N;
    }
    for (int j = 1; j <= i; j++) { // - 1
        sum += N;
    }
}
System.out.println(sum);

// d) => O(N^3)
ArrayList<Integer> list = new ArrayList<>();
for (int i = 1; i <= N * N; i++) { // - N^2
    for (int j = 1; j <= N; j++) { // - N
        list.add(i + j);
    }
}

for (int i = 1; i <= 2 * N; i++) { // - N
    list.remove(list.size() - 1);
}
System.out.println("done!");

// e) => O(N)
HashSet<Integer> set1 = new HashSet<>();
for (int i = 1; i <= N; i++) { set1.add(i); } // - N

TreeSet<Integer> set2 = new TreeSet<>();
for (int i = 1; i <= N; i++) { // - N
    set1.remove(i); // - logN
    set2.add(i + N);
}
System.out.println("done!");

// ███████████████████████████████████ bigoh2 ██████████████████████████████████████████████████████

// a) => O(N^2)
int sum = 0;
for (int i = 1; i <= N - 2; i++) { // - N
    for (int j = 1; j <= i + 4; j++) { // - N
        sum++;
    }
    sum++;
}
​
for (int i = 1; i <= 100; i++) { // - 1
    sum++;
}
System.out.println(sum);

// b) O(N * (N^2 + 1 + N)) = O(N^3)
int sum = 0;
for (int i = 1; i <= N; i++) { // - N
    for (int j = 1; j <= N * N; j++) { // N^2
        sum++;
    }
    for (int j = 1; j <= 100; j++) { // - 1
        sum++;
    }
    for (int j = 1; j <= N; j++) { // - N
        sum++;
    }
    sum++;
}
System.out.println(sum);

// c) O(N)
int sum = 0;
for (int i = 1; i <= N; i++) { // - N
    for (int j = 1; j <= 100; j++) { // - 1
        sum++;
    }
}
​
for (int k = 1; k <= 10000; k++) { // - 1
    sum++;
}
System.out.println(sum);

// d) O(NlogN)
TreeSet<Integer> set = new TreeSet<Integer>();
for (int i = 1; i <= N * 2; i++) { // - N
    set.add(i); // logN
}
​
for (int k : set) { // - N
    System.out.println(k);
}
System.out.println("done!");


// e) O(N)
ArrayList<Integer> vec = new ArrayList<Integer>();
for (int i = 1; i <= N + 100; i++) { // - N
    vec.add(i);
}
Stack<Integer> stack = new Stack<Integer>();
while (!vec.isEmpty()) { // - N
    stack.push(vec.get(vec.size() - 1));
    vec.remove(vec.size() - 1);
}
while (!stack.isEmpty()) { // - N
    stack.pop();
}
System.out.println("done!");

// ███████████████████████████████████ bigoh3 ██████████████████████████████████████████████████████

// a) O(N + NlogN) = O(NlogN)
HashSet<Integer> set1 = new HashSet<Integer>();
for (int i = 0; i < N; i++) { // - N
    set1.add(i);
}
TreeSet<Integer> set2 = new TreeSet<Integer>();
for (int n : set1) { // - N
    set2.add(n); // - logN
}
System.out.println("done!");

// b) O(N^2 + NlogN) = O(N^2)
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 0; i < N; i++) { // - N
    list.add(0, i * i); // - N, shifting N-1 elements to the right with every addition at start
}
TreeSet<Integer> set = new TreeSet<Integer>();
for (int k : list) { // - N
    set.add(k); // logN
}
System.out.println("done!");

// c) O(N + N^2) = O(N^2)
ArrayList<Integer> list1 = new ArrayList<Integer>();
for (int i = 0; i < N; i += 2) { // - N
    list1.add(i);
}
ArrayList<Integer> list2 = new ArrayList<Integer>();
for (int i = 0; i < N; i++) { // - N
    list2.add(0, list1.get(0)); // - N, shifting N-1 values to the right when insert at first position
    list1.remove(0); // - N, shift N-1 values to the left when remove first values
}
System.out.println("done!");

// d) O(N)
int sum = 0;
for (int i = 0; i < N * 2; i++) { // - N
    for (int j = 0; j < 100; j++) { // - 1
        for (int k = 0; k < j * j * j; k++) { // - 1
            sum++;
        }
    }
}
System.out.println(sum);

// e) O(N * N * N^2) = O(N^4)
int sum = 0;
for (int i = 0; i < N * 2; i++) { // - N
    for (int j = 0; j < i / 2; j++) { // - 0.5N = N
        for (int k = 0; k < N * N; k++) { // - N^2
            sum++;
        }
    }
}
System.out.println(sum);

// ███████████████████████████████████ bigoh4 ██████████████████████████████████████████████████████

// a) O(N)
int sum = 0;
for (int i = 0; i < N; i++) { // - N
    sum++;
}
for (int i = 100 * N; i >= 0; i--) { // - N
    sum++;
}
System.out.println(sum);

// b) O(N^2)
int sum = 0;
for (int i = 1; i < N - 2; i++) { // - N
    for (int j = 0; j < N * 3; j += 2) { // - N
        for (int k = 0; k < 1000; k++) { // 1
            sum++;
        }
    }
}
System.out.println(sum);

// c) O(N + N^2) = O(N^2)
ArrayList<Integer> v = new ArrayList<>();
for (int i = 0; i < N; i++) { // - N
    v.add(i);
}
while (!v.isEmpty()) { // - N
    v.remove(0); // - N, remove first values will shift N-1 elements to the left
}
System.out.println("done!");

// d) O(NlogN + N) = O(NlogN)
TreeSet<Integer> set = new TreeSet<>();
for (int i = 0; i < N / 2; i++) { // - N
    set.add(i); // - logN
}
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < N / 2; i++) { // - N
    set.remove(i);
    stack.push(i);
}
System.out.println("done!");

// e) O(N)
Queue<Integer> queue = new LinkedList<>();
for (int i = 1; i <= N; i++) { // - N
    queue.add(i * i);
}
HashMap<Integer, Integer> map = new HashMap<>();
while (!queue.isEmpty()) { // - N
    int k = queue.remove();
    map.put(k, N * N);
}
System.out.println("done!");

// ███████████████████████████████████ bigoh5 ██████████████████████████████████████████████████████

// a) O(N^2)
int sum = 0;
for (int i = 1; i <= N; i++) { // - N
    for (int j = 1; j <= 2 * N; j++) { // - N
        sum++;
    }
}
System.out.println(sum);

// b) O(N)
int sum = 0;
for (int i = 1; i <= 100_000; i++) { // - 1
    for (int j = 1; j <= i; j++) { // - 1
        for (int k = 1; k <= N; k++) { // - N
            sum++;
        }
    }
}
for (int x = 1; x <= N; x += 2) { // - N
    sum++;
}
System.out.println(sum);

// c) O(N^2)
ArrayList<Integer> v = new ArrayList<>();
for (int i = 1; i <= N; i++) { // - N
    v.add(0, i); // - N, add at start will shift N-1 elements to the right by one
}
HashSet<Integer> s = new HashSet<>();
for (int k : v) { // - N
    s.add(k); // - 1
}
System.out.println("done!");

// d) O(N + NlogN) = O(NlogN)
Queue<Integer> q = new LinkedList<>();
for (int i = 1; i <= 2 * N; i++) { // - N
    q.add(i);
}
​
TreeMap<Integer, Integer> map = new TreeMap<>();
while (!q.isEmpty()) { // - N
    int k = q.remove(); // - 1, remove first and update head to next element in queue
    map.set(k, -k); // - logN
}
System.out.println("done!");

// e) O(N^2)
HashMap<Integer, Integer> map = new HashMap<>();
for (int i = 1; i <= N * N; i++) { // - N^2
    map.put(i, i * i);
}
HashSet<Integer> set = new HashSet<>();
for (int k : map) {
    set.add(map.get(k)); // - 1(1) - 1
}
System.out.println("done!");

// ███████████████████████████████████ bigoh6 ██████████████████████████████████████████████████████

// a) O(N)
int sum = 0;
for (int i = 1; i <= N; i++) { // - N
    int k = 4000;
    for (int j = 1; j <= k; j++) { // - 1
        sum++;
    }
}
System.out.println(sum);

// b) O(N + N^3) = O(N^3)
int sum = 0;
for (int i = 1; i <= N; i++) { // - N
    sum += 2;
}
for (int i = 1; i <= N; i++) { // - N
    for (int j = 1; j <= N * N; j++) { // - N^2
        sum++;
    }
}
System.out.println(sum);

// c) O(N + NlogN) = O(NlogN)
Stack<Integer> stack = new Stack<>();
for (int i = 1; i <= N; i++) { // - N
    stack.push(i);
}
TreeSet<Integer> set = new TreeSet<>();
while (!stack.isEmpty()) { // - N
    int k = stack.pop();
    set.add(k); // - logN
}
System.out.println("done!");

// d) O(N + NlogN) = O(NlogN)
HashMap<Integer, Integer> map1 = new HashMap<>();
for (int i = 1; i <= N; i++) { // - N
    map1.put(i, i);
}

TreeMap<Integer, Integer> map2 = new TreeMap<>();
for (int i = 1; i <= N; i++) { // - N
    int k = map1.get(i); // - 1
    map2.put(k, k); // - logN
    map2.put(n + k, n + k); // - logN
}
System.out.println("done!");

// e) O(N^3 + N^2) = O(N^3)
ArrayList<Integer> v = new ArrayList<>();
for (int i = 1; i <= N; i++) { // - N
    for (int j = 1; j <= N; j++) { // - N
        v.add(0, i); // - N, add at first index will shift N-1 elements to the right
    }
    v.clear(); // - N
}
while (!v.isEmpty()) { // - N
    v.remove(0); // - N, remove from head will shift N-1 elements to the left
}
System.out.println("done!");

// ███████████████████████████████████ bigoh7 ██████████████████████████████████████████████████████

// a) O(N^2)
int sum = 0;
for (int i = 1; i <= N - 999; i++) { // - N
    for (int j = 1; j <= 0.0001 * N / 2; j++) { // - N
        sum++;
    }
}

// b) O(1)
int sum = 0;
for (int i = 1; i <= 1_000_000; i++) { // - 1
    sum++;
}
int x = 999_999;
for (int i = 1; i <= x; i++) { // - 1
    for (int j = 1; j <= 999; j++) { // - 1
        sum++;
    }
    for (int k = 1; k <= 999; k++) { // - 1
        sum++;
    }
}
System.out.println(sum);

// c) O(N^2 + NlogN) = O(N^2)
ArrayList<Integer> vecC = new ArrayList<>();
for (int i = 1; i <= N; i++) { // - N
    vecC.add(0, i); // - N, shift N-1 elements to the right by one
}
TreeSet<Integer> setC = new TreeSet<>();
for (int i = 0; i < vecC.size(); i++) { // - N
    setC.add(vecC.get(i)); // - logN
}

// d) O(NlogN + NlogN) = O(NlogN)
TreeMap<Integer, Integer> mapD = new TreeMap<>();
for (int i = 1; i <= N; i++) { // - N
    mapD.put(i, i / 2); // - logN
}
​
TreeSet<Integer> setD = new TreeSet<>();
for (int i = 1; i <= N; i++) { // - N
    int value = mapD.get(i); // - 1
    setD.add(value); // - logN
    mapD.remove(i); // - logN
}
System.out.println("done!");

// e) O(N)
ArrayList<Integer> vecE = new ArrayList<>();
for (int i = 1; i <= N; i++) { // - N
    vecE.add(i); // - 1 i.e. push as last element
}
Stack<Integer> stackE = new Stack<>();
while (!vecE.isEmpty()) { // - N
    stackE.push(vecE.get(vecE.size() - 1)); // - 1
    vecE.remove(vecE.size() - 1); // - 1, i.e. pop last element
}
System.out.println("done!");

// ███████████████████████████████████ bigoh8 ██████████████████████████████████████████████████████

// a) O(N)
int sum = 0;
for (int i = 0; i < 1_000; i++) { // - 1
    for (int j = 1; j < N * 2; j++) { // - N
        sum++;
    }
    for (int k = 0; k < i; k++) { // - 1
        sum++;
    }
}
System.out.println(sum);

// b) O(N^2 + N) = O(N^2)
ArrayList<Integer> v = new ArrayList<>();
for (int i = 0; i < N; i++) { // - N
    v.add(0, i); // - N, adding in front will shift N-1 element by one to the right
}
while (!v.isEmpty()) { // - N
    v.remove(0); // - 1, same as pop
}
System.out.println("done!");

// c) O(N + NlogN) = O(NlogN)
Queue<Integer> queue = new LinkedList<>();
for (int i = 1; i <= N; i++) { // - N
    queue.add(i * i);
}
TreeMap<Integer, Integer> map = new TreeMap<>();
while (!queue.isEmpty()) { // - N
    int k = queue.remove(); // - 1
    map.put(k, N * N); // logN
}

// d) O(N + N^2 + N) = O(N^2)
HashSet<Integer> set = new HashSet<>();
for (int i = 0; i < N; i++) { // - N
    set.add(i);
}
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < N * N; i++) { // - N^2
    stack.push(i);
}
for (int i = 0; i < N; i++) { // - N
    set.remove(i); // - 1
    stack.pop(); // - 1
}
System.out.println("done!");

// e) O(1 + 1) = O(1)
ArrayList<Integer> v = new ArrayList<>();
for (int i = 1; i <= 1_000_000_000; i++) { // - 1
    v.add(i);
}
v.clear(); // - 1
System.out.println("done!");

// ███████████████████████████████████ bigoh9 ██████████████████████████████████████████████████████

// a) O(N^2 + N) = O(N^2)
int sum = 0;
for (int i = 0; i < N; i++) { // - N
    for (int j = 0; j < N; j++) { // - N
        sum++;
    }
    for (int j = 1; j < N + 5; j++) { // - N
        for (int k = 1; k < 99_999; k++) { // - 1
            sum++;
        }
    }
}
System.out.println(sum);

// b) O(NlogN + N) = O(NlogN)
Stack<Integer> stack = new Stack<>();
TreeSet<Integer> set = new TreeSet<>();
for (int i = 0; i < N; i++) { // - N
    stack.push(N); // - 1
    set.add(N); // - logN
}
while (!stack.isEmpty()) { // - N
    set.remove(stack.pop()); // - 1
}
System.out.println("done!");

// c) O(N * N * logN + N) = O(N^2logN)
TreeMap<Integer, Integer> map = new TreeMap<>();
for (int i = 0; i < N; i++) { // - N
    for (int j = 4; j <= 2 * N + 1; j++) { // - N
        map.put(i, j); // - logN
    }
}
Queue<Integer> queue = new LinkedList<>();
for (int k : map) { // - N
    queue.add(k); // - 1
}
System.out.println("done!");

// d) O(N + N + N^2) = O(N^2)
ArrayList<Integer> list = new ArrayList<>();
HashSet<Integer> hashset = new HashSet<>();
for (int i = 4; i <= N + 7; i++) { // - N
    hashset.add(i); // - 1
}
for (int num : hashset) { // - N
    list.add(num); // - 1, i.e. push to last list position
}
while (!list.isEmpty()) { // - N
    list.remove(0); // - N, remove from head will shift N-1 elements to the right
}
System.out.println("done!");

// ███████████████████████████████████ bigoh10 █████████████████████████████████████████████████████

// a) O(N^2)
int sum1 = 0;
for (int i = 0; i < N; i++) { // - N
    for (int j = 0; j < i; j++) { // - N
        sum1++;
    }
    for (int j = 0; j < i; j++) { // - N
        sum1++;
    }
}
System.out.println(sum1);

// b) O(1 + N) = O(N)
int sum2 = 0;
for (int i = 0; i < 999; i++) { // - 1
    for (int j = 0; j < i; j++) { // - 1
        sum2++;
    }
}
for (int j = 1; j < N - 2; j++) { // - N
    int max = 500;
    for (int k = 1; k < max; k++) { // - 1
        sum2++;
    }
}
System.out.println(sum2);

// c) O(N^2 + N) = O(N^2)
Queue<Integer> queue = new LinkedList<>();
for (int i = 0; i <= N * N * 3; i++) { // - N^2
    queue.add(i); // - 1
}
HashSet<Integer> hashset = new HashSet<>();
while (!queue.isEmpty()) { // - N
    int num = queue.remove(); // - 1
    hashset.add(num); // - 1
}
System.out.println("done!");

// d) O(N + NlogN) = O(NlogN)
TreeMap<Integer, Integer> map = new TreeMap<>();
ArrayList<Integer> list = new ArrayList<>();
for (int i = 0; i < N; i++) { // - N
    list.add(i);
}
while (!list.isEmpty()) { // - N
    int num = list.get(list.size() - 1); // - 1
    list.remove(list.size() - 1); // - 1, same as pop
    map.put(num, num); // - logN
}
System.out.println("done!");
```
