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
``` 
/**
 * @author Guo Chen
 * @date 2021年12月05日 19:41
 */
public abstract class Pay {
    protected IPayMode payMode;
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:14
     * @param payMode 
     * @return null
     */
    public Pay(IPayMode payMode){
        this.payMode=payMode;
    }
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:14
     * @param uId
     * @param tradeId
     * @param amount 
     * @return java.lang.String
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
```

（2）微信支付实现类


（3）付款方式接口<br>


（4）刷脸方式实现类<br>


（5）测试类


2. 项目结构<br>
![image](https://user-images.githubusercontent.com/66066390/145042139-712f479a-4b2d-4e4a-8b22-df1ef0ca0a17.png)


