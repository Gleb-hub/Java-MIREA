import java.lang.*;
import java.util.Stack;

public class Task12 {
    public static void main(String[] args) {

    }
}

class MyStringBuilder {
    private Stack<String> history = new Stack<>();

}

abstract class Command {
    public StringBuilder sb;
    private String backup;

    Command(StringBuilder sb) {
        this.sb = sb;
    }

    public abstract void undo();

    public abstract boolean execute();
}

class AppendCommand extends Command {

    AppendCommand() {
        super(string);
    }

    @Override
    public boolean execute() {

        return false;
    }

}
