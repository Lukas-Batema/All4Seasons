// Package of this sector of this plugin.
package src.java.test.lukasbatema.mcje.plugin;

// Main imported packages.
import org.bukkit.*;

public class all4Seasons {
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
    String helpInfo = "The command used for help. Type either /help <command> OR /help <page> for info on the command(s).";
    System.out.println(helpInfo);
  }
  
  static void helpPageOne() {
    String helpFirstPage = " || " + "/help - This command!" + " || " +  "/toggle - toggle different season features." + " || " + "/restart - restart the day count of the season specified" + " || " + "/reload - reloads this plugin" + " || " + "/season - jump to the specified season" + " || ";
    System.out.println(helpFirstPage);
  }
  
  static void helpSeason() {
    String helpSeasonInfo = "/season <summer|spring|autumn|winter>";
    System.out.println(helpSeasonInfo);
  }
  
  static void helpRestart() {
    String helpRestartInfo = "/restart <summer|spring|autumn|winter>";
    System.out.println(helpRestartInfo);
  }
  
  static void helpToggle() {
    String helpToggleInfo = "/toggle <season> <feature>";
    System.out.println(helpToggleInfo);
  }
  
  static void toggleAutumnLeaves() {
    String implementError = "This feature has not yet beem impemented, please check back in a later update! Thanks.";
    System.out.println(implementError);
  }
  
  static void toggleAutumnTemp() {
    String implementError = "This feature has not yet beem impelemented, please check back in a later update! Thanks.";
    System.out.println(implementError);
  }
  
  static void toggleWinterSnow() {
    String implementError = "This feature has not yet beem impelemented, please check back in a later update! Thanks.";
    System.out.println(implementError);
  }
  
  static void toggleWinterTemp() {
    String implementError = "This feature has not yet beem impelemented, please check back in a later update! Thanks.";
    System.out.println(implementError);
  }
  
  static void toggleSpringShowers() {
    String implementError = "This feature has not yet beem impelemented, please check back in a later update! Thanks.";
    System.out.println(implementError);
  }
  
  static void toggleSummerTemp() {
    String implementError = "This feature has not yet beem impelemented, please check back in a later update! Thanks.";
    System.out.println(implementError);
  }
}
