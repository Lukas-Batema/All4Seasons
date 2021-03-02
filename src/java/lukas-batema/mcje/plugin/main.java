package lukasbatema.mcje.plugin;

public class main {
  public static void main(String[] args) {
    // Starts the season cycle, loops infinitly unless the plugin is removed or crashes.
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
      // When at the highest dayLength, the day gains a total of ___ seconds.
      dayLength = dayLength + 0.05;
      
      // When at the lowest nightLength, the night loses a total of ___ seconds.
      nightLength = nightLength - 0.05;
      
      dayCount++;
    }
    
    // Run the next season function.
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
    
    // Run the next season function.
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
      dayLength = dayLength - 5;
      
      // When at the highest nightLength, the night loses a total of ___ seconds.
      nightLength = nightLength + 5;
      
      dayCount++;
    }
    
    // Run the next season function.
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
    
    // Run the summerSeason() function, since winter is the last called "season".
    summerSeason();
    
  }
}
