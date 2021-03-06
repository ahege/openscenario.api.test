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
import net.asam.openscenario.v1_0.api.ITimeToCollisionCondition;
import net.asam.openscenario.v1_0.api.Rule;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'TimeToCollisionCondition' From OpenSCENARIO class model specification:
 * The currently predicted time to collision of a triggering entity/entities and either a reference
 * entity’s position or an explicit position is compared to a given time value. The logical operator
 * for comparison is defined by the rule attribute.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface ITimeToCollisionConditionWriter
    extends ITimeToCollisionCondition, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: The time to collision value. Unit: s; Range:
   * [0..inf[.
   *
   * @param value value of model property value
   */
  public void setValue(Double value);
  /**
   * From OpenSCENARIO class model specification: True: time to collision is measured using the
   * distance between closest bounding box points.False: reference point distance is used.
   *
   * @param freespace value of model property freespace
   */
  public void setFreespace(Boolean freespace);
  /**
   * From OpenSCENARIO class model specification: True: routing is taken into account, e.g. turns
   * will increase distance. False: straight line distance is used.
   *
   * @param alongRoute value of model property alongRoute
   */
  public void setAlongRoute(Boolean alongRoute);
  /**
   * From OpenSCENARIO class model specification: The operator (less, greater, equal).
   *
   * @param rule value of model property rule
   */
  public void setRule(Rule rule);
  /**
   * From OpenSCENARIO class model specification: The explicit position or a position defined
   * through the current position of a reference entity.
   *
   * @param timeToCollisionConditionTarget value of model property timeToCollisionConditionTarget
   */
  public void setTimeToCollisionConditionTarget(
      ITimeToCollisionConditionTargetWriter timeToCollisionConditionTarget);

  /**
   * Set a parameter for the attribute value
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToValue(String parameterName);
  /**
   * Set a parameter for the attribute freespace
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToFreespace(String parameterName);
  /**
   * Set a parameter for the attribute alongRoute
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToAlongRoute(String parameterName);
  /**
   * Set a parameter for the attribute rule
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToRule(String parameterName);

  /**
   * Get the parameter for the attribute value
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromValue();
  /**
   * Get the parameter for the attribute freespace
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromFreespace();
  /**
   * Get the parameter for the attribute alongRoute
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromAlongRoute();
  /**
   * Get the parameter for the attribute rule
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromRule();

  /**
   * Retrieves whether the attribute value is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isValueParameterized();
  /**
   * Retrieves whether the attribute freespace is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isFreespaceParameterized();
  /**
   * Retrieves whether the attribute alongRoute is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isAlongRouteParameterized();
  /**
   * Retrieves whether the attribute rule is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isRuleParameterized();

  // children
  /**
   * From OpenSCENARIO class model specification: The explicit position or a position defined
   * through the current position of a reference entity.
   *
   * @return a writer for model property timeToCollisionConditionTarget
   */
  public ITimeToCollisionConditionTargetWriter getWriterTimeToCollisionConditionTarget();
}
