package channel;

import mode.IPayMode;

import java.math.BigDecimal;

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
