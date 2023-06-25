package com.example.testmod;

import com.example.api.TestApi;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
  public static final String MODID = "testmod";
  public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

  @Override
  public void onInitialize() {
    LOGGER.info(TestApi.greeting + " testMod");
  }
}
