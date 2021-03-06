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
import net.asam.openscenario.v1_0.api.IRouteRef;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'RouteRef' From OpenSCENARIO class model specification: Defines a
 * reference to a route. Either an inline definition of a route or a route in a catalog.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IRouteRefWriter extends IRouteRef, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Route definition.
   *
   * @param route value of model property route
   */
  public void setRoute(IRouteWriter route);
  /**
   * From OpenSCENARIO class model specification: Reference to route in the catalog.
   *
   * @param catalogReference value of model property catalogReference
   */
  public void setCatalogReference(ICatalogReferenceWriter catalogReference);

  // children
  /**
   * From OpenSCENARIO class model specification: Route definition.
   *
   * @return a writer for model property route
   */
  public IRouteWriter getWriterRoute();
  /**
   * From OpenSCENARIO class model specification: Reference to route in the catalog.
   *
   * @return a writer for model property catalogReference
   */
  public ICatalogReferenceWriter getWriterCatalogReference();
}
