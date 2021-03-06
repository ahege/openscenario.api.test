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
import net.asam.openscenario.v1_0.api.IRoutePosition;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'RoutePosition' From OpenSCENARIO class model specification: Position
 * along a route defined in terms of PositionInRoadCoordinates, PositionInLaneCoordinates or current
 * position of a reference object. Orientation definition is optional.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IRoutePositionWriter extends IRoutePosition, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Reference to the route the position is calculated
   * from.
   *
   * @param routeRef value of model property routeRef
   */
  public void setRouteRef(IRouteRefWriter routeRef);
  /**
   * From OpenSCENARIO class model specification: Orientation. The relative reference context refers
   * to the referenced road's s and t coordinates, to the current lane's s and t coordinates or to
   * the orientation of the reference entity.
   *
   * @param orientation value of model property orientation
   */
  public void setOrientation(IOrientationWriter orientation);
  /**
   * From OpenSCENARIO class model specification: Position along the route.
   *
   * @param inRoutePosition value of model property inRoutePosition
   */
  public void setInRoutePosition(IInRoutePositionWriter inRoutePosition);

  // children
  /**
   * From OpenSCENARIO class model specification: Reference to the route the position is calculated
   * from.
   *
   * @return a writer for model property routeRef
   */
  public IRouteRefWriter getWriterRouteRef();
  /**
   * From OpenSCENARIO class model specification: Orientation. The relative reference context refers
   * to the referenced road's s and t coordinates, to the current lane's s and t coordinates or to
   * the orientation of the reference entity.
   *
   * @return a writer for model property orientation
   */
  public IOrientationWriter getWriterOrientation();
  /**
   * From OpenSCENARIO class model specification: Position along the route.
   *
   * @return a writer for model property inRoutePosition
   */
  public IInRoutePositionWriter getWriterInRoutePosition();
}
