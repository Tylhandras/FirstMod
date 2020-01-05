package com.github.tylhandras.firstmod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod(FirstMod.MODID)
public class FirstMod {
    public static final String MODID = "firstmod";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public FirstMod() {
        LOGGER.debug("Hello from the inside");
    }
}
