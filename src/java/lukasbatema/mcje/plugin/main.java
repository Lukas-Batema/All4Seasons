// Package of this sector of this plugin.
package lukasbatema.mcje.plugin;

// Other imported packages.
import org.bukkit;
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
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashHelp) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashHelpPageOne) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashHelpSeason) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashHelpRestart) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashHelpToggle) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashSeasonSummer) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashSeasonSpring) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashSeasonAutumn) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashSeasonWinter) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashRestartSeason) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashToggleAutumnLeaves) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashToggleAutumnTemp) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashToggleWinterSnow) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashToggleWinterTemp) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashToggleSpringShowers) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    } else if (slashToggleSummerTemp) {
      System.out.println("Check back later for updates, as this feature is not implemented yet. Thank you!");
    }
    
    // Starts the season cycle, loops infinitly, unless the plugin is removed or untill it crashes.
    summerSeason();
  }
  
  static void summerSeason() {
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
}
