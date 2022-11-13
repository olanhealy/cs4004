public class People {
    private String name;
    private String email;
    private String phone;

    public People(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public People() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


    public boolean getAttendance() {
        return false;
    }


    public boolean isValid(People phoneNumber) {
        boolean expected = false;

        //if phone number length is greater than 14, replace the empty spaces with nothing

        if (phoneNumber.getPhone().length() > 14) {
            phoneNumber.getPhone().replace(" ", "");
            System.out.println(phoneNumber.getPhone());
        }
        if (phone.length() == 14 && phone.startsWith("+353") && phone.charAt(4) == '0' && phone.charAt(5) == '8') {
            expected = true;
        }
        return expected;
    }



}


