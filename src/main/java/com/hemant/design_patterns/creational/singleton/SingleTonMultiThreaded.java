package com.hemant.design_patterns.creational.singleton;

public class SingleTonMultiThreaded {

    private static volatile SingleTonMultiThreaded single;

    private SingleTonMultiThreaded() {

    }

    public static SingleTonMultiThreaded getInstance() {
        if (single == null) {
            synchronized (SingleTonMultiThreaded.class) {
                if (single == null) {
                    single = new SingleTonMultiThreaded();
                }
            }
        }
        return single;
    }
}
/**
 * In this example, the instance variable is marked as volatile to ensure visibility across threads.
 * The getInstance() method checks if an instance has already been created, and if not,
 * acquires a lock using the synchronized keyword, before checking again and creating a new instance if necessary.
 */
