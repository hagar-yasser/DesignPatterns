package command;

public class Demo {
    public static void main(String[] args) {
        GameCharacter gameCharacter=new GameCharacter();
        gameCharacter.setPosX(0.0);
        gameCharacter.setPosX(0.0);
        System.out.println("Initial Position is posX : "+gameCharacter.getPosX()+" posY: "+gameCharacter.getPosY());
        MoveUpCommand up=new MoveUpCommand();
        up.setCharacter(gameCharacter);
        MoveLeftCommand left=new MoveLeftCommand();
        left.setCharacter(gameCharacter);
        up.execute();
        left.execute();
        System.out.println("Position after moving up 1 time and left 1 time is posX : "+gameCharacter.getPosX()+" posY: "+gameCharacter.getPosY());

    }
}
