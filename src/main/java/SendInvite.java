
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
