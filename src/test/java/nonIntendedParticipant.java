import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class nonIntendedParticipant { @Test
@DisplayName("Meeting is not private, non invited participants have access to join")
public void nonIntendedParticipantsCanJoinOnlineMeeting() {
    Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "12:00", "13:00", "Room 1");
    //meeting.getAttendees();
    meeting.addAttendees(meeting.getMeetingList());
    assertTrue( meeting.joinMeeting(new People("Kevin", "kev@hotmail.com", "+353 0868604574")));
}
}
