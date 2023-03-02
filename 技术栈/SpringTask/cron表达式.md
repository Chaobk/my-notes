## 1. 语法格式
> Seconds Minutes Hours DayofMonth Month DayofWeek [year]

## 2. 元素说明
|时间元素|可出现的字符|有效数值范围|
|--|--|--|
|Seconds|,-*/|0-59|
|Minutes|,-*/|0-59|
|hours|,-*/|0-23|
|DayofMonth|,-*/?LW|0-31|
|Month|,-*/|1-12|
|DayofWeek|,-*/?L#|1-7或SUN-SAT|

## 3. 特殊字符说明
|字符|作用|举例|
|--|--|--|
|,|列出枚举值|在Minutes域使用5,10，表示在5分和10分各触发一次|
|-|表示触发范围|在Minutes域使用5-10，表示从5分到10分钟每分钟触发一次
|*|匹配任意值|在Minutes域使用*, 表示每分钟都会触发一次
|/|起始时间开始触发，每隔固定时间触发一次|在Minutes域使用5/10,表示5分时触发一次，每10分钟再触发一次
|?|在DayofMonth和DayofWeek中，用于匹配任意值|在DayofMonth域使用?,表示每天都触发一次
|#|在DayofMonth中，确定第几个星期几|1#3表示第三个星期日
|L|表示最后|在DayofWeek中使用5L,表示在最后一个星期四触发
|W|表示有效工作日(周一到周五)|在DayofMonth使用5W，如果5日是星期六，则将在最近的工作日4日触发一次