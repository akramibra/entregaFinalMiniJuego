import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motocicleta extends Actor
{
    /**
     * Act - do whatever the Moto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        //atributos
        move();
        hitPersona();
        salirCalle();
            }
    public void move()
    {
        if (Greenfoot.isKeyDown("Up"))//se mueve adelante
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("Down"))//se mueve atras
        {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("Left"))//gira a la izquierda
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("Right"))//gira a la derecha
        {
            turn(3);
        }
    }
    
    public void hitPersona(){
            if (isTouching(Persona.class)){//si la moto choca a la persona
            getWorld().showText("La moto ha perdido, choco a una person",250,100);//muestra un texto
            Greenfoot.playSound("perder.wav");
            Greenfoot.stop();//se acaba el juego
        }
    }
    public void salirCalle(){
        if (isTouching(LineaStreet.class)){//si la moto se sale de la calle
            Greenfoot.playSound("perder.wav");//nos pone un sonido
            getWorld().showText("La moto ha perdido, has salido de la calle",250,100);//nos muestra un mensaje
            Greenfoot.stop();//se acaba el juego
        }
    }
}