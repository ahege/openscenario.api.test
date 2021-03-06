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
import net.asam.openscenario.v1_0.api.IFollowTrajectoryAction;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'FollowTrajectoryAction' From OpenSCENARIO class model specification:
 * Controls an entity to follow a trajectory using vertices, timings (optionally) and a
 * corresponding interpolation strategy. The trajectory can be instantiated from a catalog type, or
 * defined within this declaration.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IFollowTrajectoryActionWriter
    extends IFollowTrajectoryAction, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Trajectory definition.
   *
   * @param trajectory value of model property trajectory
   */
  public void setTrajectory(ITrajectoryWriter trajectory);
  /**
   * From OpenSCENARIO class model specification: A reference to the trajectory type in a catalog.
   *
   * @param catalogReference value of model property catalogReference
   */
  public void setCatalogReference(ICatalogReferenceWriter catalogReference);
  /**
   * From OpenSCENARIO class model specification: Defines if time information provided within the
   * trajectory should be considered. If so, it may be used as either absolute or relative time
   * along the trajectory in order to define longitudinal velocity of the actor. Moreover, a time
   * offset or time scaling may be applied.
   *
   * @param timeReference value of model property timeReference
   */
  public void setTimeReference(ITimeReferenceWriter timeReference);
  /**
   * From OpenSCENARIO class model specification: The mode how to follow the given trajectory.
   *
   * @param trajectoryFollowingMode value of model property trajectoryFollowingMode
   */
  public void setTrajectoryFollowingMode(ITrajectoryFollowingModeWriter trajectoryFollowingMode);

  // children
  /**
   * From OpenSCENARIO class model specification: Trajectory definition.
   *
   * @return a writer for model property trajectory
   */
  public ITrajectoryWriter getWriterTrajectory();
  /**
   * From OpenSCENARIO class model specification: A reference to the trajectory type in a catalog.
   *
   * @return a writer for model property catalogReference
   */
  public ICatalogReferenceWriter getWriterCatalogReference();
  /**
   * From OpenSCENARIO class model specification: Defines if time information provided within the
   * trajectory should be considered. If so, it may be used as either absolute or relative time
   * along the trajectory in order to define longitudinal velocity of the actor. Moreover, a time
   * offset or time scaling may be applied.
   *
   * @return a writer for model property timeReference
   */
  public ITimeReferenceWriter getWriterTimeReference();
  /**
   * From OpenSCENARIO class model specification: The mode how to follow the given trajectory.
   *
   * @return a writer for model property trajectoryFollowingMode
   */
  public ITrajectoryFollowingModeWriter getWriterTrajectoryFollowingMode();
}
