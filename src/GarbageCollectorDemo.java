

public class GarbageCollectorDemo {
    // This will be called before the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected!");
    }

    public static void main(String[] args) {
        // Creating objects
        GarbageCollectorDemo obj1 = new GarbageCollectorDemo();
        GarbageCollectorDemo obj2 = new GarbageCollectorDemo();

        // Nullifying references (objects become eligible for GC)
        obj1 = null;
        obj2 = null;

        // Requesting JVM to run Garbage Collector
        System.gc();   // or Runtime.getRuntime().gc();

        System.out.println("Main method completed.");
    }
}
