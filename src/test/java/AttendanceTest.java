import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttendanceTest {


    public void setup() {

    }

    @Test
    @DisplayName("Participants of meetings are receiving No attendance , regardless if they actually attend or not.")
    public void testAttendance() {


        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        People john = new People ("John", "john111@gmail.com", "+3530876351423");
        People paudie = new People ("Paudie", "paudthelaud@gmail.com", "+3530866651423");
        meeting.addAttendee(john);
        meeting.addAttendee(paudie);
        meeting.joinMeeting(john);

        assertEquals("Attended", meeting.checkAttendance(john));
        assertEquals("No attendance", meeting.checkAttendance(paudie));
        

    }
}
