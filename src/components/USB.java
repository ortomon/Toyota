package components;

public class USB {
    private boolean isWork;

    public void connect() {
        isWork = true;
    }

    public void disconnect() {
        isWork = false;
    }

    public boolean isWork() {
        return isWork;
    }
}
