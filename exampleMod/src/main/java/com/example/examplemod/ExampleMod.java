package com.example.examplemod;

import com.example.api.TestApi;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
  public static final String MODID = "examplemod";
  public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
  public static final String STR = " exampleMod";

  @Override
  public void onInitialize() {
    LOGGER.info(TestApi.greeting + STR);
  }
}
