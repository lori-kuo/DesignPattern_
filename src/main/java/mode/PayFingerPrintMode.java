package mode;

/**
 * @author Guo Chen
 * @date 2021年12月05日 19:52
 */
public class PayFingerPrintMode implements IPayMode{
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:16
     * @param uId 
     * @return boolean
     */
    public boolean security(String uId) {
        System.out.println("指纹支付，风控校验指纹识别");
        return true;
    }
}
