package io.github.hcoona.utils;

import java.time.Duration;

public interface ShouldRetry {
  boolean invoke(int retryCount, Exception lastException, Ref<Duration> delay);
}
