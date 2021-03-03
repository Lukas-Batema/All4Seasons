// Package of this sector of this plugin.
package lukasbatema.mcje.plugin;

/* Other imported packages.
import <package_name>;

I will add/fix "import" line(s) at a later date. */

public class main {
  public static void main(String[] args) {
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
    double dayCount = 0;
    
    while (dayCount > 92 && dayCount <= 184) {
      // When at the highest dayLength, the day gains a total of ___ seconds.
      dayLength = dayLength + 0.05;
      
      // When at the lowest nightLength, the night loses a total of ___ seconds.
      nightLength = nightLength - 0.05;
      
      dayCount++;
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
    double dayCount = 0;
    
    while (dayCount > 184 && dayCount <= 275) {
      // When at the lowest dayLength, the day gains a total of ___ seconds.
      dayLength = dayLength - 0.05;
      
      // When at the highest nightLength, the night loses a total of ___ seconds.
      nightLength = nightLength + 0.05;
      
      dayCount++;
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
    double dayCount = 0;
    
    while (dayCount > 184 && dayCount <= 365) {
      // When at the lowest dayLength, the day gains a total of ___ seconds.
      dayLength = dayLength - 0.05;
      
      // When at the highest nightLength, the night loses a total of ___ seconds.
      nightLength = nightLength + 0.05;
      
      dayCount++;
    }
    
    // Run the summerSeason() function, since winterSeason() is the last called season function, after the while loop finishes.
    summerSeason();
    
  }
}
