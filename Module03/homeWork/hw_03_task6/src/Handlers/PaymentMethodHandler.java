package Handlers;

import Recepient.Recipient;

public abstract class PaymentMethodHandler
{
    protected PaymentMethodHandler next;

    public PaymentMethodHandler getNext() {return next;}
    public void setNext(PaymentMethodHandler next) {this.next = next;}



    public abstract void Handle(Recipient recipient);
}
