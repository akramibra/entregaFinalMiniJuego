import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   //nuestros atributos
        mover();
        hitCamionDescarga();
        hitCamion();
        hitPersona();
        hitCarro2();
        lineaInicial();
        hitMoto();
        finish();
    }
    //con los metodos de abajo, tendremos diferentes acciones que hara el carro
    //la mayoria de los metodos es para que al momento de chocar algun objeto, nos muestre un mensaje y nos ponga un sonido
    //dependiendo del objeto que choquemos, nos saldra un texto y un sonido
    // cada texto y sonido es diferente al otro
    //en public de mover, es para asignar las teclas con las cuales jugaremos 
    
    public void mover()
    {
        if (Greenfoot.isKeyDown("w"))//el teclado W va a hacer que el carro se mueva adelante
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("s"))//el teclado S es para atras
        {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("a"))//gira a la izquierda
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d"))//gira a la derecha
        {
            turn(3);
        }
    }
    //
    public void hitCamionDescarga(){
        if(isTouching(CamionDescarga.class)){
        Greenfoot.playSound("Gritar.wav");
        getWorld().showText("Deja que descarguen",350,140);
        Greenfoot.stop();
        }
    }
    
    public void hitCamion(){
        if(isTouching(Camion.class)){
        getWorld().showText("Aprende a manejar",350,140);
        Greenfoot.playSound("Camion.wav");
        Greenfoot.stop();
        }
    }
    public void hitPersona(){
        if(isTouching(PersonaPerro.class)){
            getWorld().showText("Casi matas a la señora con su perro",350,140);
            Greenfoot.playSound("Perro.wav");
            Greenfoot.stop();
        }
    }
    public void hitCarro2(){
        if(isTouching(Carro2.class)){
            getWorld().showText("Le pegaste al carro, perdiste",350,140);
            Greenfoot.playSound("ChocarCarro.wav");
            Greenfoot.stop();
        }
    }
    
    public void lineaInicial(){
        if(isTouching(lineaStart.class)){
            getWorld().showText("No podes regresar atras del Start",350,140);
            Greenfoot.stop();
        }
    }
    public void hitMoto(){
        if (isTouching(Moto.class)){
            Greenfoot.playSound("Gritar.wav");
            Greenfoot.stop();
        }
    }
     public void finish(){
        if (isTouching(LineaFinish.class)){
            getWorld().showText("Has ganado, felicidades",350,140);
            Greenfoot.playSound("Ganar.wav");
            Greenfoot.stop();
        }
    }
    
}
