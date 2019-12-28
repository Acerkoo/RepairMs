package dao.flow;

import java.util.List;

public interface FlowDao {
    public void insertFlow(Flow flow);
    public void deleteFlow(String fid);
    public List<Flow> queryFlowByUser(String name);
    public List<Flow> queryFlowByTarget(String name);
    public List<Flow> queryFlowByThing(String thing);
    public List<Flow> queryFlowByTime(String ftime);
}
