// Aston
// Java
// Online
// Module: 3
// Homework
// Task: 6
// Реализовать паттерн "Цепочка Обязанностей"

import Handlers.BankPaymentMethodHandler;
import Handlers.CashPaymentMethodHandler;
import Handlers.PayPalPaymentMethodHandler;
import Handlers.PaymentMethodHandler;
import Recepient.PaymentMethodsEnum;
import Recepient.Recipient;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Recipient> recipients = new ArrayList<>();
        recipients.add( new Recipient("Vasya", PaymentMethodsEnum.BANK_TRANSFER));
        recipients.add( new Recipient("Kolya", PaymentMethodsEnum.CASH_TRANSFER));
        recipients.add(new Recipient("Petya", PaymentMethodsEnum.PAYPAL_TRANSFER));

        PaymentMethodHandler paypal = new PayPalPaymentMethodHandler();
        PaymentMethodHandler bank = new BankPaymentMethodHandler();
        PaymentMethodHandler cash = new CashPaymentMethodHandler();
        paypal.setNext(bank);
        bank.setNext(cash);

        for (Recipient r: recipients)
        {
            paypal.Handle(r);
            System.out.println();
        }
    }
}