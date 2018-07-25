package net.minecraft.server;

import com.google.common.util.concurrent.ListenableFuture;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface IAsyncTaskHandler {

    public ListenableFuture<Object> postToMainThread(Runnable run);

    public boolean isMainThread();

}