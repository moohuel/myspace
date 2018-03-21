package yang;

/**
 * Created by JangYangsook on 2017-02-17.
 */

public class PaymentChild extends PaymentParent implements Cloneable {

    private String token;
    private String recurrentId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRecurrentId() {
        return recurrentId;
    }

    public void setRecurrentId(String recurrentId) {
        this.recurrentId = recurrentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
