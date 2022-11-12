package org.example;

import java.util.ArrayList;

public class RemoveParticipant {
    private Meeting meeting;
    public RemoveParticipant(Meeting meeting){
       this.meeting = meeting;
    }

    public boolean removeParticipant(People person){

        for(int i = 0; i < meeting.getMeetingList().size(); i ++){
            if(meeting.getMeetingList().get(i) == person){
                meeting.getMeetingList().remove(i);
                return true;
            }
        }
        return false;
    }




}
