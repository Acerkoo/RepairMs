package service.userinfo;

import dao.userinfo.Userinfo;
import dao.userinfo.UserinfoDaoImpl;

import java.sql.Connection;
import java.util.List;

public class UserinfoServiceImpl implements UserinfoDao{
    private static UserinfoServiceImpl instance = new UserinfoServiceImpl();
    public static UserinfoServiceImpl getInstance() { return instance; }
    private UserinfoServiceImpl() {}
    @Override
    public void insertUserinfo(Userinfo userinfo) {
        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        userinfoDao.insertUserinfo(userinfo);
    }

    @Override
    public void deleteUserinfo(String uid) {
        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        userinfoDao.deleteUserinfo(uid);
    }

    @Override
    public List queryUserinfoAll() {
        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        return userinfoDao.queryAllUserinfo();
    }

    @Override
    public Userinfo queryUserinfoBy(String uid) {
        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        return userinfoDao.queryUserinfoById(uid);
    }
}
