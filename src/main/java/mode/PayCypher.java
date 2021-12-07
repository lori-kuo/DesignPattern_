package mode;

/**
 * @author Guo Chen
 * @date 2021年12月05日 19:53
 */
public class PayCypher implements IPayMode{
    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:43
 * @param uId
 * @return boolean
     */
    public boolean security(String uId) {
        System.out.println("密码支付，风控校验环境安全");
        return true;
    }
}
