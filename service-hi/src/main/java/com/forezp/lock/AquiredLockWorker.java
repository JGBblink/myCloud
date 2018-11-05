package com.forezp.lock;

public interface AquiredLockWorker<T> {
	T invokeAfterLockAquire() throws Exception;
}
