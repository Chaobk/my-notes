## 1. Stream.of()  

```java
public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        // forEach()方法相当于内部循环调用，
        // 可传入符合Consumer接口的void accept(T t)的方法引用：
        stream.forEach(System.out::println);
    }
}
```

## 2. 基于数组或Collecton  
把数组变成Stream使用Arrays.stream()方法。对于Collection（List、Set、Queue等），直接调用stream()方法就可以获得Stream
```java
public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Arrays.stream(new String[] { "A", "B", "C" });
        Stream<String> stream2 = List.of("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
```

## 3. 基于Supplier  
创建Stream还可以通过Stream.generate()方法，他需要传入一个Supplier对象  

```java
Stream<String> s = Stream.generate(Supplier<String> sp);
```
基于Supplier创建的Stream会不断调用Supplier.get()方法来不断产生下一个元素，这种Stream保存的不是元素，而是算法，它可以用来表示无限序列。  
例如：
```java
public class Main {
    public static void main(String[] args) {
        Stream<Integer> natual = Stream.generate(new NatualSupplier());
        // 注意：无限序列必须先变成有限序列再打印:
        natual.limit(20).forEach(System.out::println);
    }
}

class NatualSupplier implements Supplier<Integer> {
    int n = 0;
    public Integer get() {
        n++;
        return n;
    }
}
```
上述代码我们用一个Supplier<Integer>模拟了一个无限序列（当然受int范围限制不是真的无限大）。如果用List表示，即便在int范围内，也会占用巨大的内存，而Stream几乎不占用空间，因为每个元素都是实时计算出来的，用的时候再算。

对于无限序列，如果直接调用forEach()或者count()这些最终求值操作，会进入死循环，因为永远无法计算完这个序列，所以正确的方法是先把无限序列变成有限序列，例如，用limit()方法可以截取前面若干个元素，这样就变成了一个有限序列，对这个有限序列调用forEach()或者count()操作就没有问题。
