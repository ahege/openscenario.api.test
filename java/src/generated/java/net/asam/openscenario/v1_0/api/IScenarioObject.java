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
 * <p>From OpenSCENARIO class model specification: A scenario object represents a runtime object
 * that is created from an EntityObject (vehicle type, pedestrian type, miscellaneous object type)
 * and a Controller. Miscellaneous objects must not have a controller.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IScenarioObject extends IEntity {
  /**
   * From OpenSCENARIO class model specification: Identifier of the scenario object.
   *
   * @return value of model property name
   */
  public String getName();
  /**
   * From OpenSCENARIO class model specification: The EntityObject (either instance of type Vehicle,
   * Pedestrian or MiscObject).
   *
   * @return value of model property entityObject
   */
  public IEntityObject getEntityObject();
  /**
   * From OpenSCENARIO class model specification: Controller of the EntityObject instance.
   *
   * @return value of model property objectController
   */
  public IObjectController getObjectController();
}
