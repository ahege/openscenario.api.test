/*
 * Copyright 2020 RA Consulting
 *
 * RA Consulting GmbH licenses this file under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.asam.openscenario.common;

/**
 * Error Levels for Parsing and checking
 *
 * <ul>
 *   <li>FATAL - Fatal error that stops the whole loading process
 *   <li>ERROR - Error that makes the loading results unusable but the loading process can continue
 *       to find additional errors and warnings.
 *   <li>WARNING - Warnings are errors that most likely have been corrected by the loader.
 *   <li>INFO - Informations for the loader process.
 *   <li>DEBUG - Debug information to trace the loading process.
 * </ul>
 *
 * @author Andreas Hege - RA Consulting
 */
public enum ErrorLevel {
  FATAL(5),
  ERROR(4),
  WARNING(3),
  INFO(2),
  DEBUG(1);

  public int severity;

  private ErrorLevel(int severity) {
    this.severity = severity;
  }

  /**
   * Compares two error levels
   *
   * @param other error level
   * @return true if this errorLevel is worse than other error level
   */
  public boolean isWorseOrEqualThan(ErrorLevel other) {
    return this.severity >= other.severity;
  }
}
