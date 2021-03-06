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
import net.asam.openscenario.v1_0.api.IPedestrian;
import net.asam.openscenario.v1_0.api.PedestrianCategory;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'Pedestrian' From OpenSCENARIO class model specification: Definition of
 * a pedestrian type in a scenario or in a catalog.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IPedestrianWriter
    extends ICatalogElementWriter, IPedestrian, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Definition of the model of the pedestrian.
   *
   * @param model value of model property model
   */
  public void setModel(String model);
  /**
   * From OpenSCENARIO class model specification: The mass of a pedestrian in kg.
   *
   * @param mass value of model property mass
   */
  public void setMass(Double mass);
  /**
   * From OpenSCENARIO class model specification: Name of the pedestrian type. Required when used in
   * catalog.
   *
   * @param name value of model property name
   */
  public void setName(String name);
  /**
   * From OpenSCENARIO class model specification: Category type of pedestrian.
   *
   * @param pedestrianCategory value of model property pedestrianCategory
   */
  public void setPedestrianCategory(PedestrianCategory pedestrianCategory);
  /**
   * From OpenSCENARIO class model specification: Definition of additional parameters.
   *
   * @param parameterDeclarations value of model property parameterDeclarations
   */
  public void setParameterDeclarations(List<IParameterDeclarationWriter> parameterDeclarations);
  /**
   * From OpenSCENARIO class model specification: Bounding box of the pedestrian.
   *
   * @param boundingBox value of model property boundingBox
   */
  public void setBoundingBox(IBoundingBoxWriter boundingBox);
  /**
   * From OpenSCENARIO class model specification: Properties (values/files) of the pedestrian.
   *
   * @param properties value of model property properties
   */
  public void setProperties(IPropertiesWriter properties);

  /**
   * Set a parameter for the attribute model
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToModel(String parameterName);
  /**
   * Set a parameter for the attribute mass
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToMass(String parameterName);
  /**
   * Set a parameter for the attribute name
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToName(String parameterName);
  /**
   * Set a parameter for the attribute pedestrianCategory
   *
   * @param parameterName the name of the parameter (without $)
   */
  public void writeParameterToPedestrianCategory(String parameterName);

  /**
   * Get the parameter for the attribute model
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromModel();
  /**
   * Get the parameter for the attribute mass
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromMass();
  /**
   * Get the parameter for the attribute name
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromName();
  /**
   * Get the parameter for the attribute pedestrianCategory
   *
   * @return the name of the parameter (without $). Null if not parameter set or if attribute is
   *     empty.
   */
  public String getParameterFromPedestrianCategory();

  /**
   * Retrieves whether the attribute model is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isModelParameterized();
  /**
   * Retrieves whether the attribute mass is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isMassParameterized();
  /**
   * Retrieves whether the attribute name is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isNameParameterized();
  /**
   * Retrieves whether the attribute pedestrianCategory is parametrized.
   *
   * @return true if ${property.name.toMemberName()} is paramterized.
   */
  public boolean isPedestrianCategoryParameterized();

  // children
  /**
   * From OpenSCENARIO class model specification: Bounding box of the pedestrian.
   *
   * @return a writer for model property boundingBox
   */
  public IBoundingBoxWriter getWriterBoundingBox();
  /**
   * From OpenSCENARIO class model specification: Properties (values/files) of the pedestrian.
   *
   * @return a writer for model property properties
   */
  public IPropertiesWriter getWriterProperties();

  /**
   * From OpenSCENARIO class model specification: Definition of additional parameters.
   *
   * @return a list of writers for model property parameterDeclarations
   */
  public List<IParameterDeclarationWriter> getWriterParameterDeclarations();
}
