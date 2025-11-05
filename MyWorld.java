import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero ();
        addObject(hero, 200, 200);
        
        banana bana = new banana();
        addObject(bana, 100, 300);
    }
}
