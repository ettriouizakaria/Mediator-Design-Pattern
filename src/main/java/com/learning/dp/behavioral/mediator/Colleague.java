package com.learning.dp.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Colleague {

    protected Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addColleague(name, this);
    }

    public Colleague(String name) {
        this.name = name;
    }

    public abstract void sendMessage(Message message);
    public abstract void recieveMessage(Message message);

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
