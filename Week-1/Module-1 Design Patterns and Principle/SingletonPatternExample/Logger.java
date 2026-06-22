package SingletonPatternExample;

class Logger {
    private static Logger obj = new Logger();
    private Logger() {
        System.out.println("Logger Object Created");
    }
    public static Logger getInstance() {
        return obj;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}