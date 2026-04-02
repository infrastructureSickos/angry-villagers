package com.infrastructuresickos.angry_villagers;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AngryVillagers.MOD_ID)
public class AngryVillagers {
    public static final String MOD_ID = "angry_villagers";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public AngryVillagers() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("AngryVillagers initialized");
    }
}
