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

import java.util.List;
import net.asam.openscenario.api.writer.IOpenScenarioElementWriter;
import net.asam.openscenario.v1_0.api.IEnvironment;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'Environment' From OpenSCENARIO class model specification: Defines the
 * environment conditions of a scenario, e.g. time of day, weather and road condition.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IEnvironmentWriter
    extends ICatalogElementWriter, IEnvironment, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Name of the environment. If used in catalog name
   * is required.
   *
   * @param name value of model property name
   */
  public void setName(String name);
  /**
   * From OpenSCENARIO class model specification: Definition of additional parameters.
   *
   * @param parameterDeclarations value of model property parameterDeclarations
   */
  public void setParameterDeclarations(List<IParameterDeclarationWriter> parameterDeclarations);
  /**
   * From OpenSCENARIO class model specification: Time of the day during the simulation.
   *
   * @param timeOfDay value of model property timeOfDay
   */
  public void setTimeOfDay(ITimeOfDayWriter timeOfDay);
  /**
   * From OpenSCENARIO class model specification: Weather conditions during the simulation.
   *
   * @param weather value of model property weather
   */
  public void setWeather(IWeatherWriter weather);
  /**
   * From OpenSCENARIO class model specification: Road conditions during the simulation.
   *
   * @param roadCondition value of model property roadCondition
   */
  public void setRoadCondition(IRoadConditionWriter roadCondition);

  /**
   * Set a parameter for the attribute name
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToName(String parameterName);

  /**
   * Get the parameter for the attribute name
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromName();

  /**
   * Retrieves whether the attribute name is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isNameParameterized();

  // children
  /**
   * From OpenSCENARIO class model specification: Time of the day during the simulation.
   *
   * @return a writer for model property timeOfDay
   */
  public ITimeOfDayWriter getWriterTimeOfDay();
  /**
   * From OpenSCENARIO class model specification: Weather conditions during the simulation.
   *
   * @return a writer for model property weather
   */
  public IWeatherWriter getWriterWeather();
  /**
   * From OpenSCENARIO class model specification: Road conditions during the simulation.
   *
   * @return a writer for model property roadCondition
   */
  public IRoadConditionWriter getWriterRoadCondition();

  /**
   * From OpenSCENARIO class model specification: Definition of additional parameters.
   *
   * @return a list of writers for model property parameterDeclarations
   */
  public List<IParameterDeclarationWriter> getWriterParameterDeclarations();
}
