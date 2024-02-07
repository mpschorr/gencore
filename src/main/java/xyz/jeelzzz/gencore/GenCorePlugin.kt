package xyz.jeelzzz.gencore

import org.bukkit.plugin.java.JavaPlugin

class GenCorePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Kotlin Example plugin enabled!")
    }

    override fun onDisable() {
        logger.info("Kotlin Example plugin disabled!")
    }
}