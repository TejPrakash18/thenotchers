//class Counter {
//    private int count = 0;
//
//    public void increment() {
//        count++; // not atomic
//    }
//
//    public int getCount() {
//        return count;
//    }
//}

class CounterSync {
    private int count = 0;

    public synchronized void increment() {
        count++; // not atomic
    }

    public synchronized int getCount() {
        return count;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        Thread t1 = new Thread(() -> {
//            for(int i=0;i<1000;i++) counter.increment();
//        });
//        Thread t2 = new Thread(() -> {
//            for(int i=0;i<1000;i++) counter.increment();
//        });
//
//        t1.start(); t2.start();
//        t1.join(); t2.join();
//
//        System.out.println("Final count = " + counter.getCount());

        CounterSync sync = new CounterSync();
        Thread st1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) sync.increment();
        });
        Thread st2 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) sync.increment();
        });

        st1.start(); st2.start();
        st1.join(); st2.join();

        System.out.println("Final sync count "+sync.getCount());
    }
}
