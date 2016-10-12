package ardasProject.showLocalTime;

import org.springframework.stereotype.Component;

/**
 * Created by Ser on 05.10.2016.
 */
@Component
public interface IDisplay_LT {

    public void showCurrentDateTime();

    public String getPartTime();

}
