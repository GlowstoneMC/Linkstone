package net.minecraft.server;

import com.google.common.util.concurrent.ListenableFuture;

public interface IAsyncTaskHandler {

    ListenableFuture<Object> postToMainThread(Runnable runnable) {
        return null;
    }

    boolean isMainThread() {
        return false;
    }
}
