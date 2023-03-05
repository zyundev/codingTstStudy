package src.book.cleansw;

public interface Application {
    public void init();
    public void idle();
    public void cleanup();
    public boolean done();
}
