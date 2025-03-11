public class Counter {
    static int id;

    public static int invokeCounter() {
        id++;
        return id;
    }
}

