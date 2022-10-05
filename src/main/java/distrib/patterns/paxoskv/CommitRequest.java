package distrib.patterns.paxoskv;

import distrib.patterns.common.MonotonicId;
import distrib.patterns.common.Request;
import distrib.patterns.common.RequestId;

public class CommitRequest extends Request {
    public final String key;
    public final String value;
    public final MonotonicId generation;

    public CommitRequest(String key, String value, MonotonicId generation) {
        super(RequestId.CommitRequest);
        this.key = key;
        this.value = value;
        this.generation = generation;
    }
}
