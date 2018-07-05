package net.minecraft.server;

import com.google.common.util.concurrent.ListenableFuture;

public interface IAsyncTaskHandler {

    public ListenableFuture<Object> postToMainThread(Runnable run);

    public boolean isMainThread();

}