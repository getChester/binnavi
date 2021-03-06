/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.Debug.MemoryPanel.Implementations;

/**
 * Exception class used to signal operand expressions that could not be evaluated.
 */
public class CExpressionEvaluationException extends Exception {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 5233101270436158623L;

  /**
   * Creates a new exception object.
   *
   * @param msg Describes the exception.
   */
  public CExpressionEvaluationException(final String msg) {
    super(msg);
  }
}
