package com.zhu.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/20 14:13 周日
 */
public class PartyImpl implements Party{
    private List<PartyMember> members;

    public PartyImpl(){
        members = new ArrayList<PartyMember>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member : members){
            if (!member.equals(actor)){
                member.partyAction(action);
            }
        }
    }
}
