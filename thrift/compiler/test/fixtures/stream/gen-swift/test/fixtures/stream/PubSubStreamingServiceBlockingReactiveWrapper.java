/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.stream;

import java.util.*;

public class PubSubStreamingServiceBlockingReactiveWrapper 
    implements PubSubStreamingService.Reactive {
    private final PubSubStreamingService _delegate;
    private final reactor.core.scheduler.Scheduler _scheduler;

    public PubSubStreamingServiceBlockingReactiveWrapper(PubSubStreamingService _delegate, reactor.core.scheduler.Scheduler _scheduler) {
        
        this._delegate = _delegate;
        this._scheduler = _scheduler;
    }

    @java.lang.Override
    public void close() {
        _delegate.close();
    }

}
