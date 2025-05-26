class Logger {
  // 1. Private static variable to hold the single instance
  private static Logger instance;

  private int count = 0;

  // 2. Private constructor to prevent instantiation
  private Logger() {
    this.count++;
  }

  // 3. Public method to provide access to the instance
  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger(); // Create a new instance only if it doesn't exist
    }
    return instance; // Return the existing instance
  }
  public void log(String message) {
    System.out.println("Logger-"+ count + ": " + message);
  }
}

class Application1 {
  public void run() {
    // 4. Fetch the single instance of the Logger
    Logger logger = Logger.getInstance();
    logger.log("Application1 started.");
  }
}

//Multiple classes are caling the logger.getinstance
class Application2 {
  public void run() {
    Logger logger = Logger.getInstance();
    logger.log("Application2 started.");
  }
}

class Application3 {
  public void run() {
    Logger logger = Logger.getInstance();
    logger.log("Application3 started.");
  }
}

public class Singlelogger {
  public static void main(String[] args) {
    Application1 App1 = new Application1();
    Application2 App2 = new Application2();
    Application3 App3 = new Application3();

// Multiple instance of some application
    Application1 App1_1 = new Application1();

    App1.run();
    App2.run();
    App3.run();
    App1_1.run();
  }
}
