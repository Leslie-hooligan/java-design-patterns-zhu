package com.zhu.command;

import java.util.LinkedList;

/**
 * @author Zhu Junchao
 * @create 2023/8/13 22:50 周日
 */
public class Wizard {
    private final LinkedList<Magic> undoStack = new LinkedList<>();
    private final LinkedList<Magic> redoStack = new LinkedList<>();

    public void castSpell(Magic magic){
        magic.execute();
        undoStack.addLast(magic);
    }

    public void redoSpell(){
        if (!redoStack.isEmpty()){
            Magic last = redoStack.pollLast();
            undoStack.addLast(last);
            last.execute();
        }
    }
    public void undoSpell(){
        if (!undoStack.isEmpty()){
            Magic last = undoStack.pollLast();
            redoStack.addLast(last);
            last.execute();
        }
    }

}
