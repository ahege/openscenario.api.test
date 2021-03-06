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
import net.asam.openscenario.common.INamedReference;
import net.asam.openscenario.v1_0.api.IEntity;
import net.asam.openscenario.v1_0.api.IRelativeTargetSpeed;
import net.asam.openscenario.v1_0.api.SpeedTargetValueType;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'RelativeTargetSpeed' From OpenSCENARIO class model specification:
 * Defines a target speed relative to a reference entity's speed.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IRelativeTargetSpeedWriter
    extends IRelativeTargetSpeed, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Reference entity.
   *
   * @param entityRef value of model property entityRef
   */
  public void setEntityRef(INamedReference<IEntity> entityRef);
  /**
   * From OpenSCENARIO class model specification: Value of the relative speed. This value is either
   * given as a delta or as a factor. E.g. value=10 together with valueType=delta means the
   * entity/entities are supposed to drive 10m/s faster than the target reference entity. E.g.
   * value=1.1 together with valueType=factor means that the entity/entities are supposed to drive
   * 10% faster than the target reference entity. Unit: m/s or 1.
   *
   * @param value value of model property value
   */
  public void setValue(Double value);
  /**
   * From OpenSCENARIO class model specification: The value is either a delta (Unit m/s) or a factor
   * (no Unit).
   *
   * @param speedTargetValueType value of model property speedTargetValueType
   */
  public void setSpeedTargetValueType(SpeedTargetValueType speedTargetValueType);
  /**
   * From OpenSCENARIO class model specification: By setting continuous to true a controller comes
   * into place and tries to maintain a continuous relative speed. This may not be used together
   * with Dynamics.time or Dynamics.distance.
   *
   * @param continuous value of model property continuous
   */
  public void setContinuous(Boolean continuous);

  /**
   * Set a parameter for the attribute entityRef
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToEntityRef(String parameterName);
  /**
   * Set a parameter for the attribute value
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToValue(String parameterName);
  /**
   * Set a parameter for the attribute speedTargetValueType
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToSpeedTargetValueType(String parameterName);
  /**
   * Set a parameter for the attribute continuous
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToContinuous(String parameterName);

  /**
   * Get the parameter for the attribute entityRef
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromEntityRef();
  /**
   * Get the parameter for the attribute value
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromValue();
  /**
   * Get the parameter for the attribute speedTargetValueType
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromSpeedTargetValueType();
  /**
   * Get the parameter for the attribute continuous
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromContinuous();

  /**
   * Retrieves whether the attribute entityRef is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isEntityRefParameterized();
  /**
   * Retrieves whether the attribute value is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isValueParameterized();
  /**
   * Retrieves whether the attribute speedTargetValueType is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isSpeedTargetValueTypeParameterized();
  /**
   * Retrieves whether the attribute continuous is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isContinuousParameterized();

  // children

}
