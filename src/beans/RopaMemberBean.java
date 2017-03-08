package beans;

public class RopaMemberBean {
    private int id;
    private String membershipID;
    private boolean member;
    private String fullName;
    private String position;
    private String seniorYear;
    private String address;
    private String mobile;
    private String residence;
    private String birthDay;
    private String workPlace;
    private String jobTitle;
    private String email;
    private String other;
    private String nic;
    private String positionName;

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeniorYear() {
        return seniorYear;
    }

    public void setSeniorYear(String seniorYear) {
        this.seniorYear = seniorYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    @Override
    public String toString(){
        String string = this.membershipID +" "+ this.member+" "+ this.fullName +" "+ 
                this.position +" "+ this.seniorYear +" "+ this.address+
                 " "+ this.mobile +" "+ this.residence +" "+ this.birthDay+
                 " "+ this.email +" "+ this.workPlace +" "+ this.jobTitle+
                 " "+ this.nic;
        return string;
    }
    

  
}
