package com.zhu.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zhu Junchao
 * @create 2023/8/20 14:08 周日
 */
@Slf4j
public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        log.info("{} Joined party " , this);
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        log.info("{} {}", this, action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            log.info("{} {}", this, action);
            party.act(this, action);
        }
    }
}
