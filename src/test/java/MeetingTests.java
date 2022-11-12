
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MeetingTests {

    public static void initalize() {


    }

    /**
     * public void testMeeting() {
     * Meeting meeting = new Meeting("Meeting 1", "2020-01-01", "12:00", "13:00", "Room 1");
     * assertEquals("Meeting 1", meeting.getName());
     * assertEquals("2020-01-01", meeting.getDate());
     * assertEquals("12:00", meeting.getStartTime());
     * assertEquals("13:00", meeting.getEndTime());
     * assertEquals("Room 1", meeting.getRoom());
     * }
     */
    @Test
    @DisplayName("Spelling error in security")
    public void testSecurity() {
        Security securityName = new Security("Security");
        assertEquals("Security", securityName.getSecurity());
        assertFalse(securityName.getSecurity().equals("Securty"));
        assertFalse(securityName.getSecurity().equals("Seciurity"));
        assertFalse(securityName.getSecurity().equals("Secureity"));
        assertFalse(securityName.getSecurity().equals("Securityy"));
        assertFalse(securityName.getSecurity().equals(" Security"));
        assertFalse(securityName.getSecurity().equals("Security "));

    }

    @Test
    @DisplayName("Meeting is not private, non invited participants have access to join")
    public void nonIntendedParticipantsCanJoinOnlineMeeting() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        //meeting.getAttendees();
        meeting.addAttendees(meeting.getMeetingList());
        assertArrayEquals(new String[]{"Kevin", "Olan", "Millie", "Micheal", "Brian", "John", }, meeting.getAttendees().split(", "));
    }
}
