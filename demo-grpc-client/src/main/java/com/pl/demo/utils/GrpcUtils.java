package com.pl.demo.utils;

import com.pl.demo.exception.HelloServiceUnavailableException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.function.Supplier;

public class GrpcUtils {

    private GrpcUtils() {
    }

    public static <T> T decorateWithServiceUnavailableException(
        CircuitBreaker circuitBreaker, Supplier<T> supplier
    ) {
        try {
            return circuitBreaker.executeSupplier(supplier);
        } catch (StatusRuntimeException e) {
            if (isConnectionRelatedStatusCode(e.getStatus().getCode())) {
                throw new HelloServiceUnavailableException();
            }
            throw e;
        }
    }

    private static boolean isConnectionRelatedStatusCode(Status.Code statusCode) {
        return statusCode == Status.Code.UNAVAILABLE || statusCode == Status.Code.DEADLINE_EXCEEDED;
    }
}
