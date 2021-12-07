package channel;

import mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author Guo Chen
 * @date 2021年12月05日 19:44
 */
public class WxPay extends Pay{
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:14
     * @param payMode 
     * @return null
     */
    public WxPay(IPayMode payMode) {
        super(payMode);
    }
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:43
     * @param uId
     * @param tradeId
     * @param amount
     * @return java.lang.String
     */
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.printf("模拟微信渠道支付划账开始。uId：%s tradeId：%s amount：%f\n", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        System.out.printf("模拟微信渠道支付风控校验。uId：%s tradeId：%s security：%s\n", uId, tradeId, security);
        if (!security) {
            System.out.printf("模拟微信渠道支付划账拦截。uId：%s tradeId：%s amount：%f\n", uId, tradeId, amount);
            return "0001";
        }
        System.out.printf("模拟微信渠道支付划账成功。uId：%s tradeId：%s amount：%f\n", uId, tradeId, amount);
        return "0000";
    }
}
