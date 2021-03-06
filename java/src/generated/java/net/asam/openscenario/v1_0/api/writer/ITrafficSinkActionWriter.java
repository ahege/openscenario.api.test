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
package net.asam.openscenario.v1_0.api.writer;

import net.asam.openscenario.api.writer.IOpenScenarioElementWriter;
import net.asam.openscenario.v1_0.api.ITrafficSinkAction;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'TrafficSinkAction' From OpenSCENARIO class model specification: Defines
 * a sink of traffic at a specific position.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface ITrafficSinkActionWriter extends ITrafficSinkAction, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Defines the rate on which vehicles disappear at
   * the sinks location. Unit: vehicles/s Range: [0..inf[.
   *
   * @param rate value of model property rate
   */
  public void setRate(Double rate);
  /**
   * From OpenSCENARIO class model specification: Defines the radius of the traffic sink where
   * vehicles disappear around the specified position. Unit: m; Range: [0..inf[.
   *
   * @param radius value of model property radius
   */
  public void setRadius(Double radius);
  /**
   * From OpenSCENARIO class model specification: Defines the position of the traffic sink.
   *
   * @param position value of model property position
   */
  public void setPosition(IPositionWriter position);
  /**
   * From OpenSCENARIO class model specification: Defines the vehicle and controller distribution
   * for the sink.
   *
   * @param trafficDefinition value of model property trafficDefinition
   */
  public void setTrafficDefinition(ITrafficDefinitionWriter trafficDefinition);

  /**
   * Set a parameter for the attribute rate
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToRate(String parameterName);
  /**
   * Set a parameter for the attribute radius
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToRadius(String parameterName);

  /**
   * Get the parameter for the attribute rate
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromRate();
  /**
   * Get the parameter for the attribute radius
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromRadius();

  /**
   * Retrieves whether the attribute rate is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isRateParameterized();
  /**
   * Retrieves whether the attribute radius is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isRadiusParameterized();

  // children
  /**
   * From OpenSCENARIO class model specification: Defines the position of the traffic sink.
   *
   * @return a writer for model property position
   */
  public IPositionWriter getWriterPosition();
  /**
   * From OpenSCENARIO class model specification: Defines the vehicle and controller distribution
   * for the sink.
   *
   * @return a writer for model property trafficDefinition
   */
  public ITrafficDefinitionWriter getWriterTrafficDefinition();
}
