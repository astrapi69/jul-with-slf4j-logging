package jul.with.slf4j.logging;

import java.util.logging.LogManager;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class LoggingConfig {
    public static void setup() {
        // Remove existing handlers attached to the root logger
        LogManager.getLogManager().reset();
        // Install SLF4JBridgeHandler to route JUL log messages to SLF4J
        SLF4JBridgeHandler.install();
    }
}