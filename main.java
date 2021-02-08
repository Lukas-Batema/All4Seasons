public class main {
  public static void main(String[] args) {
    System.out.println("This plugin is not ready yet, please check back later!");
  }
  
  static void summerSeason() {
    System.out.println("This season is not ready yet, please check back later!");
  }
    
  static void springSeason() {
    System.out.println("This season is not ready yet, please check back later!");
  }
    
  static void autumnSeason() {
    System.out.println("This season is not ready yet, please check back later!");   
  }
    
  static void winterSeason() {
    System.out.println("This season is not ready yet, please check back later!");
  }
  
 static void dateTracker() { 
   int dayCount = 0;
   
    if (dayCount >= 365) {
      int dayCount = 0
    } else {
      if (dayCount <= 92 && >=0) {
        summerSeason();
      } else if (dayCount <= 184 && > 92) {
        springSeason();
      } else if (dayCount <= 275 && > 184) {
        autumnSeason();
      } else if (dayCount <= 365 && > 275) {
        winterSeason();
      }
    }
 }
