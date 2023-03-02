# 1.fs文件系统模块
fs模块是Node.js官方提供的、用来操作文件的模块。它提供了一系列的方法和属性，用来满足用户对文件的操作要求，例如：
## 1.1 fs.readFile()的语法格式
使用fs.readFile()方法，可以读取指定文件中的内容。
```js
fs.readFile(path[, options], callback)
```
* 参数1：必选参数，字符串，表示文件的路径
* 参数2：可选参数，表示以什么编码格式来读取文件
* 参数3：必选参数，文件读取完成后，通过回调函数拿到读取的结果

```js
// 1.导入fs模块，来操作文件
const fs = require('fs');


// 2.调用fs.readFile()文件读取文件
fs.readFile('./files/1.txt', 'utf8', function(err, dataStr) {
    console.log(err);
    console.log('------');
    console.log(dataStr);
})

```

可以判断err对象是否为null，来判断是否读取成功

```js
// 1.导入fs模块，来操作文件
const fs = require('fs');


// 2.调用fs.readFile()文件读取文件
fs.readFile('./files/1.txt', 'utf8', function(err, dataStr) {
    if (err) {
        return console.log('读取文件失败！' + err.message)
    }
    console.log('读取文件成功~' + dataStr)
    // console.log(err);
    // console.log('------');
    // console.log(dataStr);
})
```

## 1.2 fs.writeFile()的语法格式
向指定的文件中写入内容
```js
fs.writeFIle(file, data[, optiosn], callback)
```
* 1：编选参数，需要制定一个文件路径的字符串，表示文件的存放路径
* 2：必选参数，表示要写入的内容
* 3：可选参数，表示以什么格式写入文件内容，默认行是utf8
* 4：必选参数，文件写入完成后的回调函数

```js
const fs = require('fs')

fs.writeFile('./files/3.txt', 'abcdeee', function(err, data) {
    console.log(err)
})
```
