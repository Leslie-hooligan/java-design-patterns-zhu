package com.zhu.state;

/**
 * @author Zhu Junchao
 * @create 2023/8/20 15:51 周日
 */
public class Mammoth {

    private StateEnum state;

    public Mammoth(){
        this.state = StateEnum.PEACEFUL_STATE;
    }

    public void changeState(){
        this.state = this.state==StateEnum.PEACEFUL_STATE?StateEnum.ANGRY_STATE:StateEnum.PEACEFUL_STATE;
    }

    public void status(){
        if(this.state==StateEnum.PEACEFUL_STATE){
            PeacefulState peacefulState = new PeacefulState();
            peacefulState.observe(this);
        }else if(this.state==StateEnum.ANGRY_STATE){
            AngryState angryState = new AngryState();
            angryState.observe(this);
        }
    }


}
