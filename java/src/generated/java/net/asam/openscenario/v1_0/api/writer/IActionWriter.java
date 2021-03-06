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
import net.asam.openscenario.v1_0.api.IAction;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>A Writer for the type 'Action' From OpenSCENARIO class model specification: An action serves
 * to create or modify all dynamic elements of a scenario.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public interface IActionWriter
    extends IStoryboardElementWriter, IAction, IOpenScenarioElementWriter {

  // Setters for all attributes

  /**
   * From OpenSCENARIO class model specification: Name of this action.
   *
   * @param name value of model property name
   */
  public void setName(String name);
  /**
   * From OpenSCENARIO class model specification: The GlobalAction to be executed when the enclosing
   * Action is startedis started.
   *
   * @param globalAction value of model property globalAction
   */
  public void setGlobalAction(IGlobalActionWriter globalAction);
  /**
   * From OpenSCENARIO class model specification: The UserDefinedAction to be executed when the
   * enclosing Action is started.
   *
   * @param userDefinedAction value of model property userDefinedAction
   */
  public void setUserDefinedAction(IUserDefinedActionWriter userDefinedAction);
  /**
   * From OpenSCENARIO class model specification: The PrivateAction to be executed when the
   * enclosing Action is started.
   *
   * @param privateAction value of model property privateAction
   */
  public void setPrivateAction(IPrivateActionWriter privateAction);

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
   * From OpenSCENARIO class model specification: The GlobalAction to be executed when the enclosing
   * Action is startedis started.
   *
   * @return a writer for model property globalAction
   */
  public IGlobalActionWriter getWriterGlobalAction();
  /**
   * From OpenSCENARIO class model specification: The UserDefinedAction to be executed when the
   * enclosing Action is started.
   *
   * @return a writer for model property userDefinedAction
   */
  public IUserDefinedActionWriter getWriterUserDefinedAction();
  /**
   * From OpenSCENARIO class model specification: The PrivateAction to be executed when the
   * enclosing Action is started.
   *
   * @return a writer for model property privateAction
   */
  public IPrivateActionWriter getWriterPrivateAction();
}
