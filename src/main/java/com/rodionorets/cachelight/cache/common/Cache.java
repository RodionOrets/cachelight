package com.rodionorets.cachelight.cache.common;

public interface Cache<K, V> {

    V put(K key, V value);

    V get(K key);

}
