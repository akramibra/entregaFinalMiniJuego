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
        super(648, 266, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Motocicleta moto = new Motocicleta();
        addObject(moto,179,199);
        Persona persona = new Persona();
        addObject(persona,538,126);
        persona.setLocation(457,129);

        Carro carro = new Carro();
        addObject(carro,277,238);
        Finish finish = new Finish();
        addObject(finish,53,71);

        Bush bush = new Bush();
        addObject(bush,183,167);
        Bush bush2 = new Bush();
        addObject(bush2,223,167);
        Bush bush3 = new Bush();
        addObject(bush3,264,167);
        Bush bush4 = new Bush();
        addObject(bush4,304,167);

        Bush bush5 = new Bush();
        addObject(bush5,387,167);
        Bush bush6 = new Bush();
        addObject(bush6,428,167);
        Bush bush7 = new Bush();
        addObject(bush7,468,166);

        bush7.setLocation(470,155);

        bush6.setLocation(430,155);

        bush5.setLocation(388,157);

        bush5.setLocation(385,175);
        bush5.setLocation(390,165);
        bush5.setLocation(390,149);
        bush5.setLocation(391,156);
        bush5.setLocation(390,166);
        bush6.setLocation(443,196);
        bush6.setLocation(429,173);

        bush6.setLocation(431,168);

        bush5.setLocation(392,162);
        bush5.setLocation(392,176);
        bush5.setLocation(393,167);
        bush7.setLocation(472,154);
        bush7.setLocation(480,150);
        bush7.setLocation(480,216);
        bush7.setLocation(474,171);

        bush7.setLocation(468,171);
        bush7.setLocation(466,167);
        bush5.setLocation(413,150);
        bush5.setLocation(393,183);

        bush5.setLocation(396,169);

        bush4.setLocation(309,164);
        bush3.setLocation(269,166);
        bush2.setLocation(228,167);
        bush.setLocation(188,168);

        bush3.setLocation(265,157);

        bush2.setLocation(224,156);

        bush.setLocation(184,155);
        bush.setLocation(192,164);
        bush.setLocation(208,194);
        bush.setLocation(186,163);

        bush.setLocation(193,167);
        bush.setLocation(184,170);
        bush.setLocation(228,210);
        bush.setLocation(186,169);

        bush2.setLocation(242,207);
        bush2.setLocation(228,167);

        bush2.setLocation(228,213);
        bush2.setLocation(224,171);

        bush3.setLocation(280,210);
        bush3.setLocation(261,166);

        bush3.setLocation(272,174);
        bush4.setLocation(316,213);
        bush4.setLocation(311,175);
        bush3.setLocation(269,169);
        bush2.setLocation(252,215);
        bush2.setLocation(225,173);
        bush4.setLocation(303,167);
        bush4.setLocation(313,174);
        bush4.setLocation(300,172);
        bush2.setLocation(224,169);
        bush3.setLocation(258,216);
        bush3.setLocation(260,171);

        bush4.setLocation(300,173);
        bush4.setLocation(296,171);
        bush3.setLocation(272,170);
        bush3.setLocation(256,178);
        bush4.setLocation(295,173);
        bush3.setLocation(268,168);
        bush4.setLocation(297,168);
        bush.setLocation(186,154);
        bush.setLocation(211,137);
        bush.setLocation(188,166);
        bush.setLocation(181,167);
        bush.setLocation(191,161);
        bush2.setLocation(225,166);
        bush3.setLocation(253,163);
        bush4.setLocation(297,164);
        bush4.setLocation(304,163);
        bush3.setLocation(268,164);
        bush2.setLocation(233,166);
        bush.setLocation(199,163);
        Start start = new Start();
        addObject(start,147,203);
        Start start2 = new Start();
        addObject(start2,147,237);
        carro.setLocation(216,241);
        LineaStart lineaStart = new LineaStart();
        addObject(lineaStart,120,239);
        LineaStart lineaStart2 = new LineaStart();
        addObject(lineaStart2,122,200);

        bush.setLocation(187,164);
        bush.setLocation(187,158);
        removeObject(bush);
        bush2.setLocation(224,170);
        bush2.setLocation(225,170);
        bush2.setLocation(228,164);
        removeObject(bush2);
        bush3.setLocation(260,163);
        removeObject(bush3);
        bush4.setLocation(308,159);
        removeObject(bush4);
        persona.setLocation(422,132);
        bush7.setLocation(477,165);
        removeObject(bush7);
        bush6.setLocation(440,165);
        removeObject(bush6);
        bush5.setLocation(404,167);
        removeObject(bush5);

        persona.setLocation(427,146);

        LineaStreet lineaStreet = new LineaStreet();
        addObject(lineaStreet,183,147);

        LineaStreet lineaStreet2 = new LineaStreet();
        addObject(lineaStreet2,196,146);

        LineaStreet lineaStreet3 = new LineaStreet();
        addObject(lineaStreet3,200,147);

        LineaStreet lineaStreet4 = new LineaStreet();
        addObject(lineaStreet4,214,147);

        LineaStreet lineaStreet5 = new LineaStreet();
        addObject(lineaStreet5,227,145);

        LineaStreet lineaStreet6 = new LineaStreet();
        addObject(lineaStreet6,230,146);

        LineaStreet lineaStreet7 = new LineaStreet();
        addObject(lineaStreet7,243,147);

        LineaStreet lineaStreet8 = new LineaStreet();
        addObject(lineaStreet8,255,146);

        LineaStreet lineaStreet9 = new LineaStreet();
        addObject(lineaStreet9,262,147);

        LineaStreet lineaStreet10 = new LineaStreet();
        addObject(lineaStreet10,275,147);

        LineaStreet lineaStreet11 = new LineaStreet();
        addObject(lineaStreet11,288,147);

        LineaStreet lineaStreet12 = new LineaStreet();
        addObject(lineaStreet12,303,146);

        LineaStreet lineaStreet13 = new LineaStreet();
        addObject(lineaStreet13,316,146);

        LineaStreet lineaStreet14 = new LineaStreet();
        addObject(lineaStreet14,332,147);

        LineaStreet lineaStreet15 = new LineaStreet();
        addObject(lineaStreet15,346,147);

        LineaStreet lineaStreet16 = new LineaStreet();
        addObject(lineaStreet16,358,147);

        LineaStreet lineaStreet17 = new LineaStreet();
        addObject(lineaStreet17,373,147);

        LineaStreet lineaStreet18 = new LineaStreet();
        addObject(lineaStreet18,510,146);

        LineaStreet lineaStreet19 = new LineaStreet();
        addObject(lineaStreet19,522,146);

        LineaStreet lineaStreet20 = new LineaStreet();
        addObject(lineaStreet20,388,147);

        LineaStreet lineaStreet21 = new LineaStreet();
        addObject(lineaStreet21,402,147);
        persona.setLocation(413,146);
        LineaStreet lineaStreet22 = new LineaStreet();
        addObject(lineaStreet22,413,146);
        persona.setLocation(429,146);
        LineaStreet lineaStreet23 = new LineaStreet();
        addObject(lineaStreet23,429,146);
        persona.setLocation(439,146);
        LineaStreet lineaStreet24 = new LineaStreet();
        addObject(lineaStreet24,439,146);

        LineaStreet lineaStreet25 = new LineaStreet();
        addObject(lineaStreet25,452,145);

        LineaStreet lineaStreet26 = new LineaStreet();
        addObject(lineaStreet26,459,146);

        LineaStreet lineaStreet27 = new LineaStreet();
        addObject(lineaStreet27,471,145);

        LineaStreet lineaStreet28 = new LineaStreet();
        addObject(lineaStreet28,478,145);

        LineaStreet lineaStreet29 = new LineaStreet();
        addObject(lineaStreet29,488,146);

        LineaStreet lineaStreet30 = new LineaStreet();
        addObject(lineaStreet30,499,145);

        LineaStreet lineaStreet31 = new LineaStreet();
        addObject(lineaStreet31,149,119);

        LineaStreet lineaStreet32 = new LineaStreet();
        addObject(lineaStreet32,166,119);

        LineaStreet lineaStreet33 = new LineaStreet();
        addObject(lineaStreet33,179,119);

        LineaStreet lineaStreet34 = new LineaStreet();
        addObject(lineaStreet34,192,119);

        LineaStreet lineaStreet35 = new LineaStreet();
        addObject(lineaStreet35,208,118);
        LineaStreet lineaStreet36 = new LineaStreet();
        addObject(lineaStreet36,212,119);
        LineaStreet lineaStreet37 = new LineaStreet();
        addObject(lineaStreet37,229,119);
        LineaStreet lineaStreet38 = new LineaStreet();
        addObject(lineaStreet38,246,119);
        LineaStreet lineaStreet39 = new LineaStreet();
        addObject(lineaStreet39,258,119);
        LineaStreet lineaStreet40 = new LineaStreet();
        addObject(lineaStreet40,273,120);
        LineaStreet lineaStreet41 = new LineaStreet();
        addObject(lineaStreet41,282,119);
        LineaStreet lineaStreet42 = new LineaStreet();
        addObject(lineaStreet42,301,119);
        LineaStreet lineaStreet43 = new LineaStreet();
        addObject(lineaStreet43,319,119);
        LineaStreet lineaStreet44 = new LineaStreet();
        addObject(lineaStreet44,333,119);
        LineaStreet lineaStreet45 = new LineaStreet();
        addObject(lineaStreet45,347,118);
        LineaStreet lineaStreet46 = new LineaStreet();
        addObject(lineaStreet46,357,119);
        LineaStreet lineaStreet47 = new LineaStreet();
        addObject(lineaStreet47,368,119);
        LineaStreet lineaStreet48 = new LineaStreet();
        addObject(lineaStreet48,384,119);
        LineaStreet lineaStreet49 = new LineaStreet();
        addObject(lineaStreet49,400,119);
        LineaStreet lineaStreet50 = new LineaStreet();
        addObject(lineaStreet50,416,120);
        LineaStreet lineaStreet51 = new LineaStreet();
        addObject(lineaStreet51,422,119);
        LineaStreet lineaStreet52 = new LineaStreet();
        addObject(lineaStreet52,443,118);
        LineaStreet lineaStreet53 = new LineaStreet();
        addObject(lineaStreet53,461,119);

        LineaGanar lineaGanar = new LineaGanar();
        addObject(lineaGanar,16,123);
        LineaGanar lineaGanar2 = new LineaGanar();
        addObject(lineaGanar2,50,122);
        LineaGanar lineaGanar3 = new LineaGanar();
        addObject(lineaGanar3,71,127);
        lineaGanar3.setLocation(76,136);
        lineaGanar.setLocation(9,143);
        lineaGanar2.setLocation(31,143);
        finish.setLocation(40,96);
        finish.setLocation(70,55);
        finish.setLocation(40,54);
        finish.setLocation(59,53);
        finish.setLocation(61,63);
        finish.setLocation(63,77);
        lineaGanar2.setLocation(49,139);
        lineaGanar3.setLocation(77,140);
        finish.setLocation(59,59);

        carro.setLocation(247,196);

        carro.setLocation(228,205);
        carro.setLocation(206,199);
        carro.setLocation(217,200);
        carro.setLocation(199,195);

        carro.setLocation(207,239);
    }
}
