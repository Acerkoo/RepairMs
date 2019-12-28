package service.userinfo;

import dao.userinfo.Userinfo;

import java.util.List;

public interface UserinfoDao {
    public void insertUserinfo(Userinfo userinfo);
    public void deleteUserinfo(String uid);
    public List queryUserinfoAll();
    public Userinfo queryUserinfoBy(String uid);
}
