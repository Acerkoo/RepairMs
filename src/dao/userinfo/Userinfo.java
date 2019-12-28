package dao.userinfo;

public class Userinfo {
    private String userid;
    private String username;
    private String password;
    private String position;

    public Userinfo(){}

    public Userinfo(String userid, String username, String password, String position) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.position = position;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "UserinfoDao{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
