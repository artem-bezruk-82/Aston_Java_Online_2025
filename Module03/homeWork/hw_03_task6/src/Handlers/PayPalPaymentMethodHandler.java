package Handlers;

import Recepient.PaymentMethodsEnum;
import Recepient.Recipient;

public class PayPalPaymentMethodHandler extends PaymentMethodHandler
{

    @Override
    public void Handle(Recipient recipient)
    {
        if (recipient.getPaymentMethod() == PaymentMethodsEnum.PAYPAL_TRANSFER)
            System.out.printf("PayPal transfer operation for %s accomplished\n", recipient.getName());
        else if (next != null)
        {
            System.out.printf("PayPal transfer operation for %s impossible\n", recipient.getName());
            next.Handle(recipient);
        }
    }
}
