import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);

        Baby kid = new Baby();
        addObject(kid, 100, 100);
        Bear brown = new Bear();
        addObject(brown, 340, 100);

        
    }
}
