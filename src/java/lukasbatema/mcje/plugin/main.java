// Package of this sector of this plugin.
package src.java.lukasbatema.mcje.plugin;

// Other imported packages.
import org.bukkit;
import org.bukkit.plugin;
import org.bukkit.block;
import org.bukkit.block.data;
import org.bukkit.command;
import org.bukkit.command.defaults;
import org.bukkit.attribute;
import org.bukkit.block.data.type;
import org.bukkit.advancement;
import org.bukkit.enchantments;
import org.bukkit.configuration;
import org.bukkit.configuration.file;
import org.bukkit.configuration.serialization;
import org.bukkit.conversations;
import org.bukkit.event;

public class main {
  public static void main(String[] args) {
    // Base Plugin
    PluginBase();
    
    // plugin.yml
    getName();
    getVersion();
    getMain();
    
    // config.yml
    getConfig();
    saveConfig();
    
    /* 
    Commands
    The slash before the command
    */
    String slash = "/";
    
    /*
    Staff Commands
    Other Staff Commands
    */
    String slashReload = slash + "reload";
    String slashHelp = slash + "help";
    String slashHelpPageOne = slash + "help 1";
    String slashHelpSeason = slash + "help season";
    String slashHelpRestart = slash + "help restart";
    String slashHelpToggle = slash + "help toggle";
    
    // Season Staff Commands
    String slashSeasonSummer = slash + "season summer";
    String slashSeasonSpring = slash + "season spring";
    String slashSeasonAutumn = slash + "season autumn";
    String slashSeasonWinter = slash + "season winter";
    
    String slashRestartSeason = slash + "resart season";
    
    // Season Special Staff Commands
    String slashToggleAutumnLeaves = slash + "toggle autumn leaves";
    String slashToggleAutumnTemp = slash + "toggle autumn temperature";
    String slashToggleWinterSnow = slash + "toggle winter snow";
    String slashToggleWinterTemp = slash + "toggle winter temperature";
    String slashToggleSpringShowers = slash + "toggle spring showers";
    String slashToggleSummerTemp = slash + "toggle summer temperature";
    
    /*
    User Commands
    Other User Commands
    */
    String slashHelp = slash + "help";
    String slashHelpPageOne = slash + "help 1";
    
    // If...else if statement for command syntax
    if (slashReload) {
      reloadConfig();
      getConfig();
      saveConfig();
    } else if (slashHelp) {
      PluginCommand("help", "All4Seasons");
      help();
    } else if (slashHelpPageOne) {
      PluginCommand("help 1", "All4Seasons");
      helpPageOne();
    } else if (slashHelpSeason) {
      PluginCommand("help season", "All4Seasons");
      helpSeason();
    } else if (slashHelpRestart) {
      PluginCommand("help restart", "All4Seasons");
      helpRestart();
    } else if (slashHelpToggle) {
      PluginCommand("help toggle", "All4Seasons");
      helpToggle();
    } else if (slashSeasonSummer) {
      PluginCommand("season summer", "All4Seasons");
      seasonSummer();
    } else if (slashSeasonSpring) {
      PluginCommand("season spring", "All4Seasons");
      seasonSpring();
    } else if (slashSeasonAutumn) {
      PluginCommand("season autumn", "All4Seasons");
      seasonAutumn();
    } else if (slashSeasonWinter) {
      PluginCommand("season winter", "All4Seasons");
      seasonWinter();
    } else if (slashRestartSeason) {
      if (season == "summer") {
        PluginCommand("season summer", "All4Seasons");
        summerSeason();
      } else if (season == "spring") {
        PluginCommand("season spring", "All4Seasons");
        springSeason();
      } else if (season == "autumn") {
        PluginCommand("season autumn", "All4Seasons");
        autumnSeason();
      } else if (season == "winter") {
        PluginCommand("season winter", "All4Seasons");
        winterSeason();
      }
    } else if (slashToggleAutumnLeaves) {
      PluginCommand("toggle autumn leaves", "All4Seasons");
      toggleAutumnLeaves();
    } else if (slashToggleAutumnTemp) {
      PluginCommand("toggle autumn temperature", "All4Seasons");
      toggleAutumnTemp();
    } else if (slashToggleWinterSnow) {
      PluginCommand("toggle winter snow", "All4Seasons");
      toggleWinterSnow();
    } else if (slashToggleWinterTemp) {
      PluginCommand("toggle winter temperature", "All4Seasons");
      toggleWinterTemp();
    } else if (slashToggleSpringShowers) {
      PluginCommand("toggle spring showers", "All4Seasons");
      toggleSpringShowers();
    } else if (slashToggleSummerTemp) {
      PluginCommand("toggle summer temperature", "All4Seasons");
      toggleSummerTemp();
    }
    
    // Starts the season cycle, loops infinitly, unless the plugin is removed or untill it crashes.
    summerSeason();
  }
  
  static void summerSeason() {
    // Caller
    String season = "summer";
    // How many total ticks are in a day.
    double dayLength = 12000;
    
    // How many total ticks there are in a night.
    double nightLength = 12000;
    
    // Total ticks in a full day and night cycle.
    double totalDayCycleLength = dayLength + nightLength;
    
    // Initial dayCount (Number of days passed).
    double dayCount = 0;
    
    while (dayCount >= 0 && dayCount < 92) {
      if (dayLength + nightLength == totalDayCycleLength) {
        // When at the highest dayLength, the day gains a total of ___ seconds.
        dayLength = dayLength + 0.05;
      
        // When at the lowest nightLength, the night loses a total of ___ seconds.
        nightLength = nightLength - 0.05;
     
        dayCount++;
      }
    }
    
    // Run the springSeason() season function after while loop finishes.
    springSeason();
    
  }
    
  static void springSeason() {
    // Caller
    String season = "spring";
    
    // How many total ticks are in a day.
    double dayLength = 12000;
    
    // How many total ticks there are in a night.
    double nightLength = 12000;
    
    // Total ticks in a full day and night cycle.
    double totalDayCycleLength = dayLength + nightLength;
    
    // Initial dayCount (Number of days passed).
    double dayCount = 93;
    
    while (dayCount > 92 && dayCount <= 184) {
      if (dayLength + nightLength == totalDayCycleLength) {
        // When at the highest dayLength, the day gains a total of ___ seconds.
        dayLength = dayLength + 0.05;
      
        // When at the lowest nightLength, the night loses a total of ___ seconds.
        nightLength = nightLength - 0.05;
      
        dayCount++;
      }
    }
    
    // Run the autumnSeason() season function after the while loop finishes.
    autumnSeason();
    
  }
    
  static void autumnSeason() {
    // Caller
    String season = "autumn";
    
    // How many total ticks are in a day.
    double dayLength = 12000;
    
    // How many total ticks there are in a night.
    double nightLength = 12000;
    
    // Total ticks in a full day and night cycle.
    double totalDayCycleLength = dayLength + nightLength;
    
    // Initial dayCount (Number of days passed).
    double dayCount = 185;
    
    while (dayCount > 184 && dayCount <= 275) {
      if (dayLength + nightLength == totalDayCycleLength) {
        // When at the lowest dayLength, the day gains a total of ___ seconds.
        dayLength = dayLength - 0.05;
      
        // When at the highest nightLength, the night loses a total of ___ seconds.
        nightLength = nightLength + 0.05;
      
        dayCount++;
      }
    }
    
    // Run the winterSeason() season function after the while loop finishes.
    winterSeason();
    
  }
    
  static void winterSeason() {
    // Caller
    String season = "winter";
    
    // How many total ticks are in a day.
    double dayLength = 12000;
    
    // How many total ticks there are in a night.
    double nightLength = 12000;
    
    // Total ticks in a full day and night cycle.
    double totalDayCycleLength = dayLength + nightLength;
    
    // Initial dayCount (Number of days passed).
    double dayCount = 276;
    
    while (dayCount > 275 && dayCount <= 365) {
      if (dayLength + nightLength == totalDayCycleLength) {
        // When at the lowest dayLength, the day gains a total of ___ seconds.
        dayLength = dayLength - 0.05;
      
        // When at the highest nightLength, the night loses a total of ___ seconds.
        nightLength = nightLength + 0.05;
      
        dayCount++;
      }
    }
    
    // Run the summerSeason() function, since winterSeason() is the last called season function, after the while loop finishes.
    summerSeason();
    
  }
  
  static void help() {
    
  }
  
  static void helpPageOne() {
    
  }
  
  static void helpSeason() {
    
  }
  
  static void helpRestart() {
    
  }
  
  static void helpToggle() {
    
  }
  
  static void toggleAutumnLeaves() {
    
  }
  
  static void toggleAutumnTemp() {
    
  }
  
  static void toggleWinterSnow() {
    
  }
  
  static void toggleWinterTemp() {
    
  }
  
  static void toggleSpringShowers() {
    
  }
  
  static void toggleSummerTemp() {
    
  }
}
