Stream.reduce()是Stream的一个聚合方法，它可以把一个Stream的所有元素按照聚合函数聚合成一个结果
````java
public class Test {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6).reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);
    }
}
```
reduce()方法传入的对象是BinaryOperator接口，它定义了一个apply()方法，负责把上次累加的结果和本次的元素进行运算，并返回累加的结果
