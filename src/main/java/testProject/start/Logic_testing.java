package testProject.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Ser on 08.10.2016.
 */
@Component
public class Logic_testing {
    private static final Logger log = LoggerFactory.getLogger(Logic_testing.class);

    public static void someLogic() {
        log.trace("Trace log entry");
        log.debug("Debug log entry");
        log.info("Info log entry");
        log.error("Error log entry");
        log.warn("Warn log entry");

        log.info("This is parametrized log entry. Params are: {}, {}", 45, 89);

        if (log.isInfoEnabled()) {
            log.info("Another Info log entry");
        }
    }
}
