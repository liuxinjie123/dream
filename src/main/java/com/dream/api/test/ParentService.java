package com.dream.api.test;

public interface ParentService {

    default void welcome() {
        System.out.println(" Welcome !");
    }

}
