<<<<<<< HEAD

public class SendInvite {

    private Meeting meeting;

    public SendInvite(Meeting meeting){
        this.meeting = meeting;
    }

    public String[] sendInvite(){
        String[] temp = new String[meeting.getMeetingList().size()];
        for(int i = 0; i < meeting.getMeetingList().size(); i++){
            temp[i] = meeting.getMeetingList().get(i).getEmail();
        }
        return temp;
    }

}
=======


public class SendInvite {

    private Meeting meeting;

    public SendInvite(Meeting meeting){
        this.meeting = meeting;
    }

    public String[] sendInvite(){
        String[] temp = new String[meeting.getMeetingList().size()];
        for(int i = 0; i < meeting.getMeetingList().size(); i++){
            temp[i] = meeting.getMeetingList().get(i).getEmail();
        }
        return temp;
    }

}
>>>>>>> 80db98909a0111d4a3d23fca16e8508f6b38dde9
