package control;

public interface Command {
    void execute();
    
    public static class Null implements Command {
        @Override
        public void execute() { }
    }
}
