package com.learning.dp.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator1 = new ConcreteMediator1();

        Colleague colleague1 = new ConcreteColleague1("A", mediator1);
        Colleague colleague2 = new ConcreteColleague1("B", mediator1);
        Colleague colleague3 = new ConcreteColleague1("C", mediator1);

        colleague1.sendMessage(new Message("Hello Colleague B", "B"));
        System.out.println("\n");

        Mediator mediator2 = new ConcreteMediator2();

        Colleague colleague4 = new ConcreteColleague2("WW", mediator2);
        Colleague colleague5 = new ConcreteColleague2("XX", mediator2);

        colleague4.sendMessage(new Message("Hello XX", "XX"));

    }
}
