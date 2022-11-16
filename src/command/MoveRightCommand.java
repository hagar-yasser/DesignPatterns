package command;

public class MoveRightCommand implements Command{
    GameCharacter character;
    @Override
    public void execute() {
        character.setPosX(character.getPosX()+1.0);
    }

    public void setCharacter(GameCharacter character) {
        this.character = character;
    }
}
