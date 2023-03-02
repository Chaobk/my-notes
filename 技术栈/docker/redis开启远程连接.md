# 1.挂载配置文件
ridis.conf 下载地址： `https://redis.io/docs/manual/config/`

> docker安装的redis默认只能够本地连接，不能进行远程访问，因此需要手动挂载外部redis配置文件
>> （1）在Linux任意目录下创建存放reids配置文件和数据的目录结构：/docker/redis/conf, /docker/redis/data
>> （2）将配置文件redis.conf 从官网下载下来放到配置文件目录 /docker/redis/conf 下
>> （3）修改以下配置
>>> a: `bind 127.0.0.1`，注释掉这部分，这是限制redis只能本地访问  
>>> b: `protected-mode no`，默认是yes，开启保护模式，限制为本地访问
>>> c: `requirepass footbared`，配置redis连接密码，默认是注释的  
>>> d: `dir /`，更改本地redis数据库存放文件夹（可选）  
>>> e: `appendonly yes`，redis持久化，开启了这个redis就不会每次重启时自动清空了


# 2.创建容器并启动 redis 服务端
版本记得换
```
docker run -itd -p 6379:6379 --name myRedis -v /docker/redis/conf/redis.conf:/etc/redis/redis.conf -v /docker/redis/data:/data redis:3.2.1 redis-server /etc/redis/redis.conf
```
