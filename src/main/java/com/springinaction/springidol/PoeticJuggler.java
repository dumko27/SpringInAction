package com.springinaction.springidol;

/**
 *
 * @author Novikov Dmitry
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;
    
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }
    
    public PoeticJuggler(int beanbags, Poem poem) {
        super(beanbags);
        this.poem = poem;
    }
    
    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
