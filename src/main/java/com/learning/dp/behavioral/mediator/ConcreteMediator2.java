package com.learning.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator2 extends Mediator{

    public ConcreteMediator2(){

    }

    @Override
    public void transferMessage(Message message) {
        System.out.println("Transferring message via mediator 2 from " + message.getSender() + " to " + message.getReciever());
        Colleague dest = colleagues.get(message.getReciever());
        dest.recieveMessage(message);
    }

}
