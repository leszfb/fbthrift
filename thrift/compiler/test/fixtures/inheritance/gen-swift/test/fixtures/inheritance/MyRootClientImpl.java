/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import com.facebook.nifty.client.RequestChannel;
import com.facebook.swift.codec.*;
import com.facebook.swift.service.*;
import com.facebook.swift.service.metadata.*;
import com.facebook.swift.transport.client.*;
import com.facebook.swift.transport.util.FutureUtil;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import org.apache.thrift.ProtocolId;
import reactor.core.publisher.Mono;

@SwiftGenerated
public class MyRootClientImpl extends AbstractThriftClient implements MyRoot {


    // Method Handlers
    private ThriftMethodHandler doRootMethodHandler;

    // Method Exceptions
    private static final Class[] doRootExceptions = new Class[] {
        org.apache.thrift.TException.class};

    public MyRootClientImpl(
        RequestChannel channel,
        Map<Method, ThriftMethodHandler> methods,
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        List<? extends ThriftClientEventHandler> eventHandlers) {
      super(channel, headers, persistentHeaders, eventHandlers);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      doRootMethodHandler = methodHandlerMap.get("doRoot");
    }

    public MyRootClientImpl(
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        Mono<? extends RpcClient> rpcClient,
        ThriftServiceMetadata serviceMetadata,
        ThriftCodecManager codecManager,
        ProtocolId protocolId,
        Map<Method, ThriftMethodHandler> methods) {
      super(headers, persistentHeaders, rpcClient, serviceMetadata, codecManager, protocolId);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      doRootMethodHandler = methodHandlerMap.get("doRoot");
    }

    @java.lang.Override
    public void close() {
        super.close();
    }


    @java.lang.Override
    public void doRoot() throws org.apache.thrift.TException {
      doRootWrapper(RpcOptions.EMPTY).getData();
    }

    @java.lang.Override
    public void doRoot(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
      doRootWrapper(rpcOptions).getData();
    }

    @java.lang.Override
    public ResponseWrapper<Void> doRootWrapper(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
      try {
        return FutureUtil.get(executeWrapperWithOptions(doRootMethodHandler, doRootExceptions, rpcOptions));
      } catch (Throwable t) {
        if (t instanceof org.apache.thrift.TException) {
          throw (org.apache.thrift.TException) t;
        }
        throw new org.apache.thrift.TException(t);
      }
    }
}
