public class Singleton {
    private static Singleton instance;
    private int connectionId;

    private Singleton() {
        connectionId = hashCode();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public static void main(String[] args) {
        Singleton db1 = Singleton.getInstance();
        Singleton db2 = Singleton.getInstance();
        System.out.println(db1 == db2);
        System.out.println(db1.getConnectionId() + " " + db2.getConnectionId());
    }
}
