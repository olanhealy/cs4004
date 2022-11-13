package org.example;

public class CheckMeetingList {

    private Meeting meeting;

    public CheckMeetingList(Meeting meeting){
        this.meeting = meeting;
    }

    public String[] checkMeetingList(){
        String[] temp = new String[meeting.getMeetingList().size()];
        for(int i = 0; i < meeting.getMeetingList().size(); i++){
            temp[i] = meeting.getMeetingList().get(i).getEmail();
        }
        return temp;
    }

}
