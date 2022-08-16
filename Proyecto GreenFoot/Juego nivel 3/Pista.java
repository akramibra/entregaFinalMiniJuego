import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pista extends World
{

    /**
     * Constructor for objects of class Pista.
     * 
     */
    public Pista()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 468, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Carro carro = new Carro();
        addObject(carro,351,410);
        CamionDescarga camionDescarga = new CamionDescarga();
        addObject(camionDescarga,491,288);
        Camion camion = new Camion();
        addObject(camion,59,227);
        Carro2 carro2 = new Carro2();
        addObject(carro2,26,360);
        PersonaPerro personaPerro = new PersonaPerro();
        addObject(personaPerro,456,112);
        Start start = new Start();
        addObject(start,368,409);
        carro.setLocation(396,410);
        Start start2 = new Start();
        addObject(start2,368,444);
        Moto moto = new Moto();
        addObject(moto,399,440);
        carro.setLocation(424,407);
        lineaStart lineaStart = new lineaStart();
        addObject(lineaStart,337,408);
        lineaStart lineaStart2 = new lineaStart();
        addObject(lineaStart2,341,447);
        LineaFinish lineaFinish = new LineaFinish();
        addObject(lineaFinish,269,406);
        LineaFinish lineaFinish2 = new LineaFinish();
        addObject(lineaFinish2,269,420);
        LineaFinish lineaFinish3 = new LineaFinish();
        addObject(lineaFinish3,268,432);
        LineaFinish lineaFinish4 = new LineaFinish();
        addObject(lineaFinish4,268,445);
        Finish finish = new Finish();
        addObject(finish,204,379);
    }
}
