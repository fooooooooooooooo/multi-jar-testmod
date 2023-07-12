package com.example.examplemod;

import com.example.api.TestApi;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleModSub implements ModInitializer {
  public static final Logger LOGGER = LoggerFactory.getLogger(ExampleMod.MODID + "_sub");

  @Override
  public void onInitialize() {
    LOGGER.info(TestApi.greeting + ExampleMod.STR + " subby");
  }
}
