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
 * <p>From OpenSCENARIO class model specification: A vehicle type, pedestrian type or miscellaneous
 * object type.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IEntityObject extends IOpenScenarioModelElement {
  /**
   * From OpenSCENARIO class model specification: Reference to a catalog entry of type MiscObject,
   * Vehicle or Pedestrian.
   *
   * @return value of model property catalogReference
   */
  public ICatalogReference getCatalogReference();
  /**
   * From OpenSCENARIO class model specification: Vehicle definition.
   *
   * @return value of model property vehicle
   */
  public IVehicle getVehicle();
  /**
   * From OpenSCENARIO class model specification: Pedestrian definition.
   *
   * @return value of model property pedestrian
   */
  public IPedestrian getPedestrian();
  /**
   * From OpenSCENARIO class model specification: Definition of a MiscObject.
   *
   * @return value of model property miscObject
   */
  public IMiscObject getMiscObject();
}
