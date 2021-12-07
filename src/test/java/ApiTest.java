import channel.Pay;
import channel.WxPay;
import channel.ZfbPay;
import mode.PayFaceMode;
import mode.PayFingerPrintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author Guo Chen
 * @date 2021年12月05日 20:00
 */
public class ApiTest {

    /**
     *
     * @author Guo Chen
     * @date 2021/12/5 20:17 
     */
    @Test
    public void test_pay(){
        System.out.println("模拟测试场景；微信支付、人脸方式");
        Pay wxPay=new WxPay(new PayFaceMode());
        wxPay.transfer("DesignPatternWechat", "111111111", new BigDecimal(100));

        System.out.println("\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerPrintMode());
        zfbPay.transfer("DesignPatternZFB","222222222",new BigDecimal(100));

    }
}
