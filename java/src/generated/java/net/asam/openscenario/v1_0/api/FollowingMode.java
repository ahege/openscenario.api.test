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
package net.asam.openscenario.v1_0.api;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>From OpenSCENARIO class model specification: Type of lateral control actuation when following
 * a trajectory.
 *
 * <p>Values from OpenSCENARIO class model specification:
 *
 * <ul>
 *   <li>Explicit definition of the lateral position of an entity.
 *   <li>Follow of the steering target (e.g. for a driver model).
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public enum FollowingMode {
  POSITION("position"),
  FOLLOW("follow");

  private final String literal;

  /**
   * The literal from this enumeration value.
   *
   * @return the literal as defined in OpenSCENARIO
   */
  public String getLiteral() {
    return this.literal;
  }

  /**
   * Constructor using the literal
   *
   * @param the literal as defined in OpenSCENARIO
   */
  FollowingMode(String literal) {
    this.literal = literal;
  }
  /**
   * The enumeration value from the literal
   *
   * @param literal as defined in OpenSCENARIO
   * @return the enumeration value
   */
  public static FollowingMode getFromLiteral(String literal) {
    if (literal.equals("position")) {
      return POSITION;
    } else if (literal.equals("follow")) {
      return FOLLOW;
    } else {
      return null;
    }
  }
}
