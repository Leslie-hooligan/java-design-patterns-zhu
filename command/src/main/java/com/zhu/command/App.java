package com.zhu.command;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Goblin goblin = new Goblin();
        goblin.printStatus();
        Wizard wizard = new Wizard();
        wizard.castSpell(goblin::changeSize);
        goblin.printStatus();
        wizard.undoSpell();
        goblin.printStatus();
        wizard.redoSpell();
        goblin.printStatus();
        wizard.castSpell(goblin::changeVisibility);
        goblin.printStatus();
        wizard.undoSpell();
        goblin.printStatus();
        wizard.redoSpell();
        goblin.printStatus();
    }
}
