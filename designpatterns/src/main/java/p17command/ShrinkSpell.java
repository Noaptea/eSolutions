package p17command;

public class ShrinkSpell implements Command {

    private Target target;


    @Override
    public void execute(Target target) {
        this.target = target;
        this.target.setSize(Size.SMALL);
    }

    @Override
    public void undo() {

        if(target != null){
            this.target.setSize(Size.BIG);
        }

    }

    @Override
    public void redo() {
        if(target != null){
            this.target.setSize(Size.SMALL);
        }
    }
}
