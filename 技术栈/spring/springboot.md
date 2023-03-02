## 1. springboot属性源

### 1.1 属性源优先级
列表按照优先级排序，任何在高优先级属性源里设置的属性都会覆盖低优先级的属性
```
(1) 命令行参数
(2) java:comp/env里的JNDI属性
(3) JVM系统属性
(4) 操作系统环境变量
(5) 随机生成的带random.*前缀的属性（在设置其他属性时，可以引用它们，比如${random.long}）
(6) 应用程序以外的application.properties或者appliaction.yml文件
(7) 打包在应用程序内的application.properties或者appliaction.yml文件
(8) 通过@PropertySource标注的属性源
(9) 默认属性
```

### 1.2 application.properties 以及 application.yml 能放的位置
```
(1) 外置，在相对于应用程序运行目录的/config子目录里。
(2) 外置，在应用程序运行的目录里。
(3) 内置，在config包内。
(4) 内置，在Classpath根目录。
```

同样是优先级排序，另外同优先级位置下yml比properties高
