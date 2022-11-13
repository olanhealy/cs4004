import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class nonIntendedParticipant {
    @Test
    @DisplayName("Meeting is private, invited participants have access to join")
    public void IntendedParticipantsCanJoinOnlineMeeting() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "00:00", "23:59", "Room 1");
        //meeting.getAttendees();
        meeting.addAttendees(meeting.getMeetingList());
        assertTrue(meeting.joinMeeting(new People("Kevin", "kev@hotmail.com", "+353 0868604574")));
    }

    @Test
    @DisplayName("Meeting is private, non invited participants cannot join")
    public void NonIntendedParticipantsCantJoinOnlineMeeting() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "00:00", "23:59", "Room 1");
        //meeting.getAttendees();
        meeting.addAttendees(meeting.getMeetingList());
        assertFalse(meeting.joinMeeting(new People("Ronny", "rontheswan@hotmail.com", "+353 0868604574")));
    }

    @Test
    @DisplayName("Name and email match but phone doesn't")
    public void NonIntendedParticipantCantJoinAsNumbersDontMatch() {
        Meeting meeting = new Meeting("Test Meeting", "2020-01-01", "00:00", "23:59", "Room 1");
        //meeting.getAttendees();
        meeting.addAttendees(meeting.getMeetingList());
        assertFalse(meeting.joinMeeting(new People("Kevin", "kev@hotmail.com", "+353 0861234567")));
    }

    @Test
    @DisplayName("Invited to A meeting not B")
    public void InvitedTOAButNotB() {
        Meeting meetingA = new Meeting("Test Meeting", "2020-01-01", "00:00", "23:59", "Room 1");
        Meeting meetingB = new Meeting("Test Meeting 2", "2020-01-01", "00:00", "23:59", "Room 3");
        //meeting.getAttendees();
        meetingA.addAttendees(meetingA.getMeetingList());
        assertTrue(meetingA.joinMeeting(new People("Kevin", "kev@hotmail.com", "+353 0868604574")));
        assertFalse(meetingB.joinMeeting(new People("Kevin", "kev@hotmail.com", "+353 0868604574")));
    }

    @Test
    @DisplayName("No name given")
    public void NoNameGiven() {
        Meeting meetingA = new Meeting("Test Meeting", "2020-01-01", "00:00", "23:59", "Room 1");

        meetingA.addAttendees(meetingA.getMeetingList());
        assertFalse(meetingA.joinMeeting(new People("", "kev@hotmail.com", "+353 0868604574")));
    }

    @Test
    @DisplayName("Join not during meeting time")
    public void JoinNotDuringMeetingTime() {
        Meeting meetingA = new Meeting("Test Meeting", "2020-01-01", "00:00", "00:01", "Room 1");

        meetingA.addAttendees(meetingA.getMeetingList());
        assertFalse(meetingA.joinMeeting(new People("Kevin", "kev@hotmail.com", "+353 0868604574")));

    }
}
