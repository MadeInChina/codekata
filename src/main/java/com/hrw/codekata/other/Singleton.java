
package com.hrw.codekata.other;

public class Singleton {
    private static Object SYNC = new Object();

    private static Singleton INSTANCE = new Singleton();

    private volatile static Singleton INSTANCE_FOR_MULTITHREAD;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public static Singleton getInstanceForMultiThread() {
        if (INSTANCE_FOR_MULTITHREAD == null) {
            synchronized (SYNC) {
                {
                    if (INSTANCE_FOR_MULTITHREAD == null) {
                        INSTANCE_FOR_MULTITHREAD = new Singleton();
                    }
                }
            }
        }
        return INSTANCE_FOR_MULTITHREAD;
    }

    public static synchronized Singleton getInstanceForMultiThread1() {

        if (INSTANCE_FOR_MULTITHREAD == null) {
            synchronized (INSTANCE_FOR_MULTITHREAD) {
                if (INSTANCE_FOR_MULTITHREAD == null) {
                    INSTANCE_FOR_MULTITHREAD = new Singleton();
                }
            }
        }
        return INSTANCE_FOR_MULTITHREAD;
    }

    public static Singleton getInstanceForMultiThread2() {
        if (INSTANCE_FOR_MULTITHREAD == null) {
            synchronized (Singleton.class) {
                INSTANCE_FOR_MULTITHREAD = new Singleton();
            }
        }
        return INSTANCE_FOR_MULTITHREAD;
    }
}
