package com.learning.dp.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
    protected Map<String, Colleague> colleagues = new HashMap<>();

    public abstract void transferMessage(Message message);

    public void addColleague(String ref, Colleague colleague){
        colleagues.put(ref, colleague);
    }
}
