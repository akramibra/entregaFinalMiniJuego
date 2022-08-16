import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Calle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calle extends World
{

    /**
     * Constructor for objects of class Calle.
     * 
     */
    public Calle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(761, 228, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Carro carro1 = new Carro();
        addObject(carro1,107,58);
        Moto moto = new Moto();
        addObject(moto,108,155);

        Finish finish = new Finish();
        addObject(finish,759,9);
        Finish finish2 = new Finish();
        addObject(finish2,759,36);
        Finish finish3 = new Finish();
        addObject(finish3,759,57);
        Finish finish4 = new Finish();
        addObject(finish4,759,76);
        Finish finish5 = new Finish();
        addObject(finish5,759,104);
        Finish finish6 = new Finish();
        addObject(finish6,759,121);
        Finish finish7 = new Finish();
        addObject(finish7,759,148);
        Finish finish8 = new Finish();
        addObject(finish8,759,165);
        Finish finish9 = new Finish();
        addObject(finish9,759,175);
        Finish finish10 = new Finish();
        addObject(finish10,758,186);
        Finish finish11 = new Finish();
        addObject(finish11,758,204);
        Finish finish12 = new Finish();
        addObject(finish12,759,220);
    }
}
