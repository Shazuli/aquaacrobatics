package com.fuzs.aquaacrobatics.integration;

import com.fuzs.aquaacrobatics.config.ConfigHandler;
import net.minecraftforge.fml.common.Loader;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class IntegrationManager {

    private static boolean isEnderIoLoaded;
    private static boolean isRandomPatchesLoaded;
    private static boolean isMoBendsLoaded;
    private static boolean isWingsLoaded;
    private static boolean isArtemisLibLoaded;
    private static boolean isMorphLoaded;
    private static boolean isHatsLoaded;
    
    public static List<IElytraOpenHook> elytraOpenHooks = new LinkedList<>();

    public static void loadCompat() {
        isEnderIoLoaded = Loader.isModLoaded("enderio");
        isRandomPatchesLoaded = Loader.isModLoaded("randompatches");
        isMoBendsLoaded = Loader.isModLoaded("mobends");
        isWingsLoaded = Loader.isModLoaded("wings");
        isArtemisLibLoaded = Loader.isModLoaded("artemislib");
        isMorphLoaded = Loader.isModLoaded("morph");
        isHatsLoaded = Loader.isModLoaded("hats");
    }

    public static boolean isEnderIoEnabled() {

        return isEnderIoLoaded && ConfigHandler.IntegrationConfig.enderIoIntegration;
    }

    public static boolean isRandomPatchesEnabled() {

        return isRandomPatchesLoaded && ConfigHandler.IntegrationConfig.randomPatchesIntegration;
    }

    public static boolean isMoBendsEnabled() {

        return isMoBendsLoaded && ConfigHandler.IntegrationConfig.moBendsIntegration;
    }

    public static boolean isWingsEnabled() {

        return isWingsLoaded && ConfigHandler.IntegrationConfig.wingsIntegration;
    }

    public static boolean isArtemisLibEnabled() {

        return isArtemisLibLoaded && ConfigHandler.IntegrationConfig.artemisLibIntegration;
    }

    public static boolean isMorphEnabled() {

        return isMorphLoaded && ConfigHandler.IntegrationConfig.morphIntegration;
    }

    public static boolean isHatsEnabled() {

        return isHatsLoaded && ConfigHandler.IntegrationConfig.hatsIntegration;
    }

}
