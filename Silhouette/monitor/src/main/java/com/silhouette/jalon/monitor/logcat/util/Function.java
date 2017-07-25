package com.silhouette.jalon.monitor.logcat.util;

public interface Function<E, T> {

    T apply(E input);
}
