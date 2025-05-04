package com.learning.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator1 extends Mediator{

    private List<Message> messagesArchive;

    public ConcreteMediator1(){
        messagesArchive = new ArrayList<>();
    }

    @Override
    public void transferMessage(Message message) {
        System.out.println("Transferring message via mediator 1 from " + message.getSender() + " to " + message.getReciever());
        Colleague dest = colleagues.get(message.getReciever());
        dest.recieveMessage(message);
        messagesArchive.add(message);
    }

    public void analyzeConversations(){
        for (Message message : messagesArchive){
            System.out.println(message);
        }
    }
}
