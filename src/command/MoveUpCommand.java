package command;

public class MoveUpCommand implements Command{
    private GameCharacter character;
    @Override
    public void execute() {
        character.setPosY(character.getPosY()+1.0);
    }
    public void setCharacter(GameCharacter character) {
        this.character = character;
    }
}
