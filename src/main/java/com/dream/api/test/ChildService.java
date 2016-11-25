package com.dream.api.test;

public interface ChildService {

    default void welcome() {
        System.out.println(" Welcome from child");
    }
}
