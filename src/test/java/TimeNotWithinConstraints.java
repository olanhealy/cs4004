import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.*;

public class TimeNotWithinConstraints {

    //preference set specifying dates within the date range on which the participant would prefer the meeting to take place
    @Test
    @DisplayName("Test to check if the time is within the constraints")
    public void testDateWithinConstraints() {
        Meeting meeting = new Meeting("Test Meeting", "2023-05-05", "12:00", "13:00", "Room 1");

        assertTrue( meeting.checkTimeConstraints(meeting, "2023-02-02", "2023-12-12") );
    }

    @Test
    @DisplayName("Test to check if the time isnt within the constraints")
    public void testDateOutsideConstraints() {
        Meeting meeting = new Meeting("Test Meeting", "2023-01-01", "12:00", "13:00", "Room 1");

        assertFalse( meeting.checkTimeConstraints(meeting, "2023-02-02", "2023-12-12") );
    }

    @Test
    @DisplayName("Test date in the past")
    public void testDateInPast() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
        assertFalse( meeting.checkTimeConstraints(meeting, "2019-02-02", "2021-12-12") );
    }
}
