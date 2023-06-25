package com.example.testmod;

import com.example.api.TestApi;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestModSub implements ModInitializer {
  public static final Logger LOGGER = LoggerFactory.getLogger(TestMod.MODID + "_sub");

  @Override
  public void onInitialize() {
    LOGGER.info(TestApi.greeting + " subby");
  }
}
