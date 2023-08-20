package com.zhu.mediator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Party party = new PartyImpl();
        PartyMember hobbit = new Hobbit();
        PartyMember wizard = new Wizard();
        PartyMember rogue = new Rogue();
        PartyMember hunter = new Hunter();

        // add party members
        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        // perform actions -> the other party members
        // are notified by the party
        hobbit.act(Action.ENEMY);
        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);
        hunter.act(Action.HUNT);
    }
}
