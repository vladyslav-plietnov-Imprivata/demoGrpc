package com.pl.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.stub.StreamObserver;

public class TestUtils {

//  public static String asJsonString(Object obj) {
//    try {
//      return new ObjectMapper().writeValueAsString(obj);
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }
//  }

  public static <T extends GeneratedMessageV3> void verifyGrpc(T expectedResult, StreamObserver<T> streamObserver) {
    verify(streamObserver).onNext(expectedResult);
    verify(streamObserver, atLeastOnce()).onCompleted();
  }

  public static <T extends GeneratedMessageV3> void verifyGrpcError(
      Throwable expectedError,
      StreamObserver<T> streamObserver
  ) {
    verify(streamObserver, never()).onNext(any());
    verify(streamObserver, never()).onCompleted();
    verify(streamObserver, atLeastOnce()).onError(any(expectedError.getClass()));
  }
}
