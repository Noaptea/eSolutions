package p17command;

public interface Command {
    void execute(Target target);
    void undo();
    void redo();
}
