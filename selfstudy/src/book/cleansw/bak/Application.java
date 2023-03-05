package src.book.cleansw.bak;

public abstract class Application {
    private boolean isDone = false;

    /**
     * 초기화 작업
     */
    protected abstract void init();

    /**
     * 프로그램의 주된 작업 수행하며 setDone() 호출할 때까지 반복 호출
     */
    protected abstract void idle();

    /**
     * 종료하기 전에 필요한 일들 수행
     */
    protected abstract void cleanup();

    protected void setDone() {
        isDone = true;
    }

    protected boolean done() {
        return isDone;
    }

    public void run() {
        init();
        while (!done()) {
            idle();
        }
        cleanup();
    }

}
