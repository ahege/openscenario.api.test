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

import net.asam.openscenario.api.IOpenScenarioModelElement;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>From OpenSCENARIO class model specification: Defines a source of traffic at a specific
 * position.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface ITrafficSourceAction extends IOpenScenarioModelElement {
  /**
   * From OpenSCENARIO class model specification: Defines the rate on which vehicles appear at the
   * source location. Unit: vehicles/s. Range: [0..inf[.
   *
   * @return value of model property rate
   */
  public Double getRate();
  /**
   * From OpenSCENARIO class model specification: Defines the radius of the traffic source where
   * vehicles appear around the specific position. Unit: m. Range: [0..inf[.
   *
   * @return value of model property radius
   */
  public Double getRadius();
  /**
   * From OpenSCENARIO class model specification: The optional starting velocity of a scenario
   * object. Unit: m/s; Range: [0..inf[.
   *
   * @return value of model property velocity
   */
  public Double getVelocity();
  /**
   * From OpenSCENARIO class model specification: Defines the position of the traffic source.
   *
   * @return value of model property position
   */
  public IPosition getPosition();
  /**
   * From OpenSCENARIO class model specification: Defines the vehicle and controller distribution
   * for the source.
   *
   * @return value of model property trafficDefinition
   */
  public ITrafficDefinition getTrafficDefinition();
}
