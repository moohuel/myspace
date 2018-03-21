package yang;

import org.junit.Test;

/**
 * Created by JangYangsook on 2017-02-17.
 */
public class CloneManager {

    @Test
    public void doClone() throws Exception {

        PaymentParent parent = new PaymentParent();
        parent.setPaymentId("12345");
        parent.setPaymentName("TodayIsGood");

        PaymentChild child = new PaymentChild();
        child.setToken("ABCDEFG");

        PaymentChild clonedChild = (PaymentChild)child.clone();
        System.out.println(clonedChild.getPaymentId()+", "+clonedChild.getToken());
    }
}
