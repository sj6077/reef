package com.microsoft.reef.runtime.common.driver;

import com.microsoft.reef.driver.evaluator.CompletedEvaluator;

/**
 * Implementation of CompletedEvaluator.
 */
final class CompletedEvaluatorImpl implements CompletedEvaluator {
  private final String id;

  CompletedEvaluatorImpl(String id) {
    this.id = id;
  }

  @Override
  public String getId() {
    return this.id;
  }
}
