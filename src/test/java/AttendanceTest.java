import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttendanceTest {

    AttendanceReport attendanceReport;
    public void setup() {
        attendanceReport = new AttendanceReport();
    }

    @Test
    @DisplayName("Participants of meetings are receiving \"Full attendance\" , regardless if they actually attend or not.")
    public void testAttendance() {
        assertEquals("Full attendance", attendanceReport.getAttendance());


    }
}
