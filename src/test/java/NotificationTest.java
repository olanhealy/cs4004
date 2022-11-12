import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationTest {
    @Test
    @DisplayName("Notifications about a meeting due to take place are not being sent out")
    public void notificationsNotSent() {

        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        meeting.addAttendees(new ArrayList<People>());
        People people = new People("Kevin", "kev@hotmail.com", "+353 0868604574");
        People ronda = new People("Ronda", "email@gmail.com", "+353 0845504574");
        assertEquals("Notification sent", meeting.notifyAttendee(meeting.checkAttendees(people)) );
    }
}
