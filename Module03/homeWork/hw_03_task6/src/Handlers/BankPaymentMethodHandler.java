package Handlers;

import Recepient.PaymentMethodsEnum;
import Recepient.Recipient;

public class BankPaymentMethodHandler extends PaymentMethodHandler
{
    @Override
    public void Handle(Recipient recipient)
    {
        if (recipient.getPaymentMethod() == PaymentMethodsEnum.BANK_TRANSFER)
            System.out.printf("Bank transfer operation for %s accomplished\n", recipient.getName());
        else if (next != null)
        {
            System.out.printf("Bank transfer operation for %s impossible\n", recipient.getName());
            next.Handle(recipient);
        }
    }
}
