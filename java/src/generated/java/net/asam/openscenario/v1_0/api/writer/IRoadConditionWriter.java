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
import net.asam.openscenario.v1_0.api.IRoadCondition;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'RoadCondition' From OpenSCENARIO class model specification: Definition
 * of the road friction scale factor. Can be augmented with the addition of optional road
 * properties.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IRoadConditionWriter extends IRoadCondition, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Friction scale factor. Range: [0..inf[
   *
   * @param frictionScaleFactor value of model property frictionScaleFactor
   */
  public void setFrictionScaleFactor(Double frictionScaleFactor);
  /**
   * From OpenSCENARIO class model specification: Additional properties to describe the road
   * condition.
   *
   * @param properties value of model property properties
   */
  public void setProperties(IPropertiesWriter properties);

  /**
   * Set a parameter for the attribute frictionScaleFactor
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToFrictionScaleFactor(String parameterName);

  /**
   * Get the parameter for the attribute frictionScaleFactor
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromFrictionScaleFactor();

  /**
   * Retrieves whether the attribute frictionScaleFactor is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isFrictionScaleFactorParameterized();

  // children
  /**
   * From OpenSCENARIO class model specification: Additional properties to describe the road
   * condition.
   *
   * @return a writer for model property properties
   */
  public IPropertiesWriter getWriterProperties();
}
