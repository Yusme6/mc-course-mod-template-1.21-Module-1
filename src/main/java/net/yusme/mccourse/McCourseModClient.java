package net.yusme.mccourse;

import net.fabricmc.api.ClientModInitializer;

public class McCourseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello, Minecraft!");
    }
}
