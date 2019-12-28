package dao.userinfo;

import java.util.List;

public interface UserinfoDao {
    public void insertUserinfo(Userinfo userinfo);
    public void deleteUserinfo(String uid);
    public int getId();
    public Userinfo queryUserinfoById(String uid);
    public Userinfo loginUserinfo(String username, String password);
    public List queryAllUserinfo();
}
