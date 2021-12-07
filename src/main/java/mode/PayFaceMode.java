package mode;

/**
 * @author Guo Chen
 * @date 2021年12月05日 19:49
 */
public class PayFaceMode implements IPayMode{
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:15
     * @param uId 
     * @return boolean
     */
    public boolean security(String uId) {
        System.out.println("人脸支付，风控校验脸部识别");
        return true;
    }
}
