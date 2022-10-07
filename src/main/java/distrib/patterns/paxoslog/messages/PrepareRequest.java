package distrib.patterns.paxoslog.messages;

import distrib.patterns.common.MonotonicId;
import distrib.patterns.common.Request;
import distrib.patterns.common.RequestId;

public class PrepareRequest extends Request {
    public final Integer index;
    public final MonotonicId monotonicId;

    public PrepareRequest(Integer index, MonotonicId monotonicId) {
        super(RequestId.Prepare);
        this.index = index;
        this.monotonicId = monotonicId;
    }
}