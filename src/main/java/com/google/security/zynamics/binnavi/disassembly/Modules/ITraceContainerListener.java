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
package com.google.security.zynamics.binnavi.disassembly.Modules;

import com.google.security.zynamics.binnavi.debug.models.trace.TraceList;

/**
 * Interface to be implemented by classes that want to be notified about changes in trace
 * containers.
 */
public interface ITraceContainerListener {
  /**
   * Invoked after a trace was added to a module.
   * 
   * @param container The trace container the trace was added to.
   * @param trace The trace that was added to the module.
   */
  void addedTrace(CTraceContainer container, TraceList trace);

  /**
   * Invoked after a trace was deleted from a module.
   * 
   * @param container The trace container from where the trace was deleted.
   * @param trace The trace that was deleted from the module.
   */
  void deletedTrace(CTraceContainer container, TraceList trace);
}
