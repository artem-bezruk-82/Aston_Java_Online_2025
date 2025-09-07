package Recepient;

public class Recipient
{
    private String name;
    private PaymentMethodsEnum paymentMethod;

    public Recipient(String name, PaymentMethodsEnum paymentMethod)
    {
        this.name = name;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public PaymentMethodsEnum getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod(PaymentMethodsEnum paymentMethod) {this.paymentMethod = paymentMethod;}
}
