所谓filter()操作，就是对一个Stream的所有元素一一进行测试，不满足条件的就被”过滤”了，剩下的满足条件的元素就构成了一个新的Stream。
```java
public class Test {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));
    }
}
```

filter()方法接收的对象是Predicate接口对象，它定义了一个test()方法，负责判断元素是否符合条件
