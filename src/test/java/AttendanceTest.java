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
        People john = new People("John", "john111@gmail.com", "+3530876351423");
        People paudie = new People("Paudie", "paudthelaud@gmail.com", "+3530866651423");
        meeting.addAttendee(john);
        meeting.addAttendee(paudie);
        meeting.joinMeeting(john);

        assertEquals("Attended", meeting.checkAttendance(john));
        assertEquals("No attendance", meeting.checkAttendance(paudie));


    }

    @Test
    @DisplayName("Participants of meetings are receiving No attendance , regardless if they actually attend or not.")
    public void checkMeetingStatusOfPeopleNotInvitedToMeeting() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        People sean = new People("Sean", "sean@gmail.com", "+3530876351423");
        People cian = new People("Cian", "Cian@gmail.com", "+3530876351423");
        assertEquals("No attendance", meeting.checkAttendance(sean));
        assertEquals("No attendance", meeting.checkAttendance(cian));
    }

    @Test
    @DisplayName("Check people attending meeting get set as attended")
    public void checkPeopleAttendingMeetingGetSetAsAttended() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        People john = new People("John", "john@gmail.com", "+3530876351423");
        People paul = new People("Paul", "paul@gmail.com", "+3530876351423");
        meeting.addAttendee(john);
        meeting.joinMeeting(john);
        meeting.addAttendee(paul);
        meeting.joinMeeting(paul);
        assertEquals("Attended", meeting.checkAttendance(john));
        assertEquals("Attended", meeting.checkAttendance(paul));
    }

    @Test
    @DisplayName("Check if people invited who don't join get set no attendance")
    public void checkIfPeopleInvitedWhoDontJoinGetSetNoAttendance() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        People Ellie = new People("Ellie", "ellie@gmail.com", "+3530876351423");
        People Andrew = new People("Andrew", "andrew@gmail.com", "+3530876351423");
        meeting.addAttendee(Ellie);
        meeting.addAttendee(Andrew);
        assertEquals("No attendance", meeting.checkAttendance(Ellie));
        assertEquals("No attendance", meeting.checkAttendance(Andrew));

    }
}
