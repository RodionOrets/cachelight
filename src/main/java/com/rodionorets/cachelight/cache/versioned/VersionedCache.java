package com.rodionorets.cachelight.cache.versioned;

import com.rodionorets.cachelight.cache.common.Cache;

public interface VersionedCache<K, V> extends Cache<K, V> {

    V get(K key, int version);

}
