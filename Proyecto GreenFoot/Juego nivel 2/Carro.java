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
    public void act(){
        //atributos
        hitMoto();
        hitPersona();
        mover();
        hitStart();
        salirCalle();
        finish();
    }
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
        public void hitMoto(){ 
            if (isTouching(Motocicleta.class)){ //si el carro choca la moto
            getWorld().showText("Has perdido, has chocado la moto",350,140);//muestra un texto
            Greenfoot.playSound("perder.wav");
            Greenfoot.stop(); // se acaba juego
            
            }
        }
        public void hitPersona(){
            if (isTouching(Persona.class)){//si choca a la persona
            getWorld().showText("Has perdido",350,140);//muestra un texto
            Greenfoot.playSound("llorar.wav");
            Greenfoot.stop();//se acaba el juego
        }
    }
        public void finish(){
            if (isTouching(LineaGanar.class)){//si el carro llega a la meta
            getWorld().showText("El carro ha ganado",350,140);//muestra un mensaje
            Greenfoot.playSound("ganar.wav");
            Greenfoot.stop();//se acaba
        }
    }
        
        public void hitStart(){
        if(isTouching(LineaStart.class)){ //no puede regresar atras de la linea de inicio
        getWorld().showText("No podes regresar atras del Start",350,140);//si regrese pierde
        Greenfoot.playSound("perder.wav");
        Greenfoot.stop();//para el juego
            
            
        }
    }
        public void salirCalle(){
        if(isTouching(LineaStreet.class)){//si sale de la calle
        getWorld().showText("No podes salir de la calle ",350,140);//nos muestra un mensaje
        Greenfoot.playSound("perder.wav");//nos pone un sonido
        Greenfoot.stop();// termina el juego
}
}
}