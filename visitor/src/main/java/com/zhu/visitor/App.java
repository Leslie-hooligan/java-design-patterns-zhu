package com.zhu.visitor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Play play = new Play();
        play.accept(new PlayVisitor() {
            @Override
            void eat(String player) {
                System.out.println(player+" eat");
            }

            @Override
            void sleep(String player) {
                System.out.println(player+" sleep");
            }

            @Override
            void dadodo(String player) {
                System.out.println(player+" dadodo");
            }
        });

        play.accept(new PlayVisitor() {
            @Override
            void eat(String player) {
                System.out.println(player+" not eat");
            }

            @Override
            void sleep(String player) {
                System.out.println(player+" not sleep");
            }

            @Override
            void dadodo(String player) {
                System.out.println(player+" not dadodo");
            }
        });
    }
}
