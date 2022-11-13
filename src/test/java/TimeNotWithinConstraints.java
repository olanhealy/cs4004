import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.*;

public class TimeNotWithinConstraints {

    //preference set specifying dates within the date range on which the participant would prefer the meeting to take place
    @Test
    @DisplayName("Test to check if the time is within the constraints")
    public void testTime() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");

        //check date within constraints
        //check time within constraints
        assertTrue( meeting.checkTimeConstraints(meeting, "2012-02-02", "2022-12-12") );
    }
}
