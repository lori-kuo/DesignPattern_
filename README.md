# DesignPattern_
## 软件设计模式作业-桥接模式
### 一、问题导入
近年来，支付服务行业出现了微信、支付宝以及其他一些支付服务方式，不同的用户习惯使用的支付方式也略有不同，但是对于商家来说并不希望改变用户习惯。如果一家街边小摊只能使用微信或者只能使用支付宝付款，那么就会让习惯使用另一方支付方式的顾客不适应。
因此，需要开发一个第三方平台，把市面上综合占据市场90%以上的支付服务都集中到自己平台中，再把这样的平台提供给店铺、超市、地摊使用，同时支持人脸、扫描、密码多种方式。
这个第三方平台可以使用多种支付手段，同时可以使用人脸、指纹、密码等付款方式让用户支付起来更加容易。那么这里就出现了多支付与多模式的融合使用，如果给每一个支付都实现一次不同的模式，那就会出现类爆炸的问题，如何解决呢？
### 二、解决方案
由问题导入可以看出，这个问题里有支付方式和付款方式两部分，两者可以独立变化，适合使用桥接模式。
### 三、UML
![image](https://user-images.githubusercontent.com/66066390/145041829-92a6cfb7-6d9b-4e29-b9e7-6b3945739ddd.png)


### 四、核心代码
1. 核心代码<br>
（1）Pay抽象类
![image](https://user-images.githubusercontent.com/66066390/145041884-c97d6207-82fc-45bb-8dca-2321ca5b764b.png)

（2）微信支付实现类
![image](https://user-images.githubusercontent.com/66066390/145041946-05a322db-477a-49c2-b385-b3390a195492.png)

（3）付款方式接口
![image](https://user-images.githubusercontent.com/66066390/145041999-dde5e205-b8b0-45fd-b4c3-edcd27cf49a3.png)

（4）刷脸方式实现类
![image](https://user-images.githubusercontent.com/66066390/145042036-b24e6463-bc0d-45aa-87b5-df2ed0b94a09.png)

（5）测试类
![image](https://user-images.githubusercontent.com/66066390/145042110-12da4ad7-5057-4173-8fa2-971f9a773594.png)

2. 项目结构
![image](https://user-images.githubusercontent.com/66066390/145042139-712f479a-4b2d-4e4a-8b22-df1ef0ca0a17.png)


