package com.zhu.command;

import lombok.RequiredArgsConstructor;

/**
 * Enumeration for target visibility.
 */
@RequiredArgsConstructor
public enum Visibility {

  VISIBLE("visible"),
  INVISIBLE("invisible");

  private final String title;

  @Override
  public String toString() {
    return title;
  }
}
