// enum LogLevel {
//     DEBUG, INFO, ERROR
// }

// interface ILogger {
//     void log (String msg);
// }

// class InfoLogger implements ILogger {
//     public void log(String msg) {
//         System.out.println("INFO: " + msg);
//     }
// }
// class DebugLogger implements ILogger {
//     public void log(String msg) {
//         System.out.println("DEBUG: " + msg);
//     }
// }
// class ErrorLogger implements ILogger {
//     public void log(String msg) {
//         System.out.println("ERROR: " + msg);
//     }
// }

// //Bad code Example: Logger Factory Pattern

// public class Logger{
//     public static void main(String[] args) {
//         //Aab ye logType mere pass kahi se bhi aa sakta hai,
//         //for example, it can come from a configuration file, user input, etc.
//         LogLevel logType = LogLevel.DEBUG;
//         ILogger logger;

//         //Aab agar bhavishya mein mujhe aur log types add karne padte hain,
//         //to mujhe yahan code change karna padega, jo ki bad practice hai.
//         if(logType == LogLevel.DEBUG){
//             logger = new DebugLogger();
//         } else if(logType == LogLevel.INFO){
//             logger = new InfoLogger();
//         } else if(logType == LogLevel.ERROR){
//             logger = new ErrorLogger();
//         } else {
//             throw new IllegalArgumentException("Unknown log level: " + logType);
//         }

//         logger.log("This is a log message.");
//     }
// }




enum LogLevel {
    DEBUG, INFO, ERROR
}

interface ILogger {
    void log (String msg);
}

class InfoLogger implements ILogger {
    public void log(String msg) {
        System.out.println("INFO: " + msg);
    }
}
class DebugLogger implements ILogger {
    public void log(String msg) {
        System.out.println("DEBUG: " + msg);
    }
}
class ErrorLogger implements ILogger {
    public void log(String msg) {
        System.out.println("ERROR: " + msg);
    }
}
class LoggerFactory {
    public static ILogger getLogger(LogLevel level) {
        switch (level) {
            case DEBUG:
                return new DebugLogger();
            case INFO:
                return new InfoLogger();
            case ERROR:
                return new ErrorLogger();
            default:
                throw new IllegalArgumentException("Unknown log level: " + level);
        }
    }
}
public class Logger {
    public static void main(String[] args) {
        ILogger logger = LoggerFactory.getLogger(LogLevel.DEBUG);
        logger.log("This is a debug message.");

        logger = LoggerFactory.getLogger(LogLevel.INFO);
        logger.log("This is an info message.");

        logger = LoggerFactory.getLogger(LogLevel.ERROR);
        logger.log("This is an error message.");
    }
}