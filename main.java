public class main {
  public static void main(String[] args) {
    dateTracker();
    
    // How many total ticks are in a day.
    int dayLength = 12000;
    
    // How many total ticks there are in a night.
    int nightLength = 12000;
    
    // Total ticks in a full day and night cycle.
    int totalDayCycleLength = dayLength + nightLength;
  }
  
  static void summerSeason() {
    while (dayCount >= 0 && < 92) {
      // When at the highest dayLength, the day gains a total of 0.15 seconds.
      double dayLength = dayLength + 0.05;
      
      // When at the lowest nightLength, the night loses a total of 0.15 seconds.
      double nightLength = nightLength - 0.05;
    }
  }
    
  static void springSeason() {
    while (dayCount > 92 && <= 184) {
      // When at the highest dayLength, the day gains a total of 0.15 seconds.
      double dayLength = dayLength + 0.05;
      
      // When at the lowest nightLength, the night loses a total of 0.15 seconds.
      double nightLength = nightLength - 0.05;
    }
  }
    
  static void autumnSeason() {
    while (dayCount > 184 && <= 275) {
      // When at the lowest dayLength, the day gains a total of 3 seconds.
      int dayLength = dayLength - 5;
      
      // When at the highest nightLength, the night loses a total of 3 seconds.
      int nightLength = nightLength + 5;
    }
  }
    
  static void winterSeason() {
    while (dayCount > 184 && <= 365) {
      // When at the lowest dayLength, the day gains a total of 30 seconds.
      int dayLength = dayLength - 0.05;
      
      // When at the highest nightLength, the night loses a total of 30 seconds.
      int nightLength = nightLength + 0.05;
    }
  }
  
 static void dateTracker() { 
   int dayCount = 0;
   
    if (dayCount >= 365) {
      int dayCount = 0;
    } else {
      if (dayCount >= 0 && <=91) {
        summerSeason();
      } else if (dayCount > 91 && <= 183) {
        springSeason();
      } else if (dayCount > 183 && <= 275) {
        autumnSeason();
      } else if (dayCount > 275 && <= 365) {
        winterSeason();
      }
      
      while (summerTotalDayCycleLength > 23997 && <= 24000 || springTotalDayCycleLength > ) {
        int dayCount++;
      }
    }
 }
