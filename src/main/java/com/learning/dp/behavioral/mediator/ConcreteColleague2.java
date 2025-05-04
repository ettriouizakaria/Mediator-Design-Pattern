package com.learning.dp.behavioral.mediator;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(String name, Mediator mediator) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Colleague 2");
        message.setSender(name);
        System.out.println(message.getSender() + " is sending a message to " + message.getReciever());
        mediator.transferMessage(message);
    }

    @Override
    public void recieveMessage(Message message) {
        System.out.println("Colleague 2");
        System.out.println(message.getReciever() + " is receiving a message from " + message.getSender());
        System.out.println("Message : " + message.getContent());
    }
}
