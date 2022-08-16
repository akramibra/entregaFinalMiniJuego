import greenfoot.*;

public class Carro extends Actor{

    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        //atributos
        moveAround();
        hitMoto();
        finish();
            }
    
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("w"))//se mueve recto
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("s"))//para atras
        {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("a"))//a la derecha
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d"))// a la izquierda
        {
            turn(3);
        }
        
    }
        public void hitMoto(){
            if (isTouching(Moto.class)){//si chocan
            getWorld().showText("Has perdido",100,100);//muestra un mensaje
            Greenfoot.playSound("chocarr.wav");// nos va a poner un sonio
            Greenfoot.stop();//se acaba el juego
            
            }
        
        }
        public void finish(){
            if (isTouching(Finish.class)){//si el carro llega a la meta
            getWorld().showText("El carro ha ganado",350,140);//muestra un mensaje
            Greenfoot.playSound("ganar.wav");
            Greenfoot.stop();//se acaba el juego
        }
    }
}