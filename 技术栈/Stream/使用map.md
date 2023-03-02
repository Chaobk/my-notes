Stream.map()是Stream最常用的一个转换方法，他把一个Stream转换为另一个Stream。
```java
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(" apple ");
        list.add("   pile");
        list.stream()
                .map(String::trim)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
```
