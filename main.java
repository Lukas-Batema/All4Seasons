public class main {
  public static void main(String[] args) {
    int dayCount = 0;
    
    static void summer() {
      System.out.println("This season is not ready yet, please check back later!");
    }
    
    static void spring() {
      System.out.println("This season is not ready yet, please check back later!");
    }
    
    static void autumn() {
      System.out.println("This season is not ready yet, please check back later!");
    }
    
    static void winter() {
      System.out.println("This season is not ready yet, please check back later!");
    }
  }
  
 static void dateTracker() { 
    if (dayCount >= 365) {
      int dayCount = 0
    } else {
      if (dayCount <= 92 && >=0) {
        summer()
      } else if (dayCount <= 184 && > 92) {
        spring()
      } else if (dayCount <= 275 && > 184) {
        autumn()
      } else if (dayCount <= 365 && > 275) {
        winter()
      }
    }
  }
}
