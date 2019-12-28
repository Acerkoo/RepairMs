package dao.flow;

public class Flow {

    private String fid;
    private String username;
    private String rank;
    private String ftime;
    private String target;
    private String thing;

    public Flow() {}

    public Flow(String fid, String username, String rank, String ftime, String target, String thing) {
        this.fid = fid;
        this.username = username;
        this.rank = rank;
        this.ftime = ftime;
        this.target = target;
        this.thing = thing;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "fid='" + fid + '\'' +
                ", username='" + username + '\'' +
                ", rank='" + rank + '\'' +
                ", ftime='" + ftime + '\'' +
                ", target='" + target + '\'' +
                ", thing='" + thing + '\'' +
                '}';
    }
}
