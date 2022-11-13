import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationTest {

    @Test
    @DisplayName("Notifications about a meeting due to take place are not being sent out")
    public void notificationsNotSent() {

        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        meeting.addAttendees(new ArrayList<People>());
        People people = new People("Kevin", "kev@hotmail.com", "+353 0868604574");

        assertEquals("Notification sent", meeting.notifyAttendee(meeting.checkAttendees(people)));
    }

    @Test
    @DisplayName("Notifications about a meeting due to take place are being sent out")
    public void notificationsSent() {

        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        meeting.addAttendees(new ArrayList<People>());
        People people = new People("Kevin", "kev@hotmail.com", "+353 0868604574");

        assertEquals("Notification sent", meeting.notifyAttendee(meeting.checkAttendees(people)));
    }

    @Test
    @DisplayName("Notifications about a meeting due to take place are not being sent out")
    public void notificationNotSentAsPersonNotInClass() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        meeting.addAttendees(new ArrayList<People>());
        People people = new People("Paul", "paul@hotmail.com", "+353 0868765574");
        assertEquals("Notification not sent", meeting.notifyAttendee(meeting.checkAttendees(people)));
    }
}