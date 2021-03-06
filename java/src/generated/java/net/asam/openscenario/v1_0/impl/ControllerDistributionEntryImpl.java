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
package net.asam.openscenario.v1_0.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import net.asam.openscenario.api.IOpenScenarioFlexElement;
import net.asam.openscenario.api.KeyNotSupportedException;
import net.asam.openscenario.api.SimpleType;
import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.impl.BaseImpl;
import net.asam.openscenario.parser.ParserHelper;
import net.asam.openscenario.v1_0.api.ICatalogReference;
import net.asam.openscenario.v1_0.api.IController;
import net.asam.openscenario.v1_0.api.IControllerDistributionEntry;
import net.asam.openscenario.v1_0.api.writer.ICatalogReferenceWriter;
import net.asam.openscenario.v1_0.api.writer.IControllerDistributionEntryWriter;
import net.asam.openscenario.v1_0.api.writer.IControllerWriter;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>Value class that implements IControllerDistributionEntry. With setter methods to fill the
 * properties.
 *
 * <ul>
 *   <li>getter methods for properties (implemented methods of IControllerDistributionEntry)
 *   <li>setter methods for properties
 *   <li>getChildren method to collect all children
 *   <li>clone function to make a deep copy
 *   <li>overrides from BaseImpl
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ControllerDistributionEntryImpl extends BaseImpl
    implements IControllerDistributionEntryWriter {
  protected static Hashtable<String, SimpleType> propertyToType = new Hashtable<>();

  /** Filling the property to type map */
  static {
    propertyToType.put(OscConstants.ATTRIBUTE__WEIGHT, SimpleType.DOUBLE);
  }

  private Double weight;
  private IControllerWriter controller;
  private ICatalogReferenceWriter catalogReference;

  /** Default constructor */
  public ControllerDistributionEntryImpl() {
    super();
    addAdapter(ControllerDistributionEntryImpl.class, this);
    addAdapter(IControllerDistributionEntry.class, this);
    addAdapter(IControllerDistributionEntryWriter.class, this);
  }

  @Override
  public IOpenScenarioFlexElement getOpenScenarioFlexElement() {
    return this;
  }

  @Override
  public Double getWeight() {
    return this.weight;
  }

  @Override
  public IController getController() {
    return this.controller;
  }

  @Override
  public ICatalogReference getCatalogReference() {
    return this.catalogReference;
  }

  @Override
  public void setWeight(Double weight) {
    this.weight = weight;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__WEIGHT);
  }

  @Override
  public void setController(IControllerWriter controller) {
    this.controller = controller;
    this.catalogReference = null;
  }

  @Override
  public void setCatalogReference(ICatalogReferenceWriter catalogReference) {
    this.catalogReference = catalogReference;
    this.controller = null;
  }

  @Override
  public void resolveParameterInternal(
      IParserMessageLogger logger, String attributeKey, String parameterLiteralValue) {
    if (attributeKey.equals(OscConstants.ATTRIBUTE__WEIGHT)) {
      // Simple type
      this.weight =
          ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);
    }
  }

  @Override
  public SimpleType getTypeFromAttributeName(String attributeKey) {
    return propertyToType.get(attributeKey);
  }

  /**
   * A list of all aggregated children (lists are flattened). This may be used for applying a
   * specific method for any child.
   *
   * @return a list with all children (as BaseImpl)
   */
  @Override
  public List<BaseImpl> getChildren() {
    List<BaseImpl> result = new ArrayList<>();

    IControllerWriter controller = null;
    controller = getWriterController();
    if (controller != null) {
      result.add((BaseImpl) controller);
    }
    ICatalogReferenceWriter catalogReference = null;
    catalogReference = getWriterCatalogReference();
    if (catalogReference != null) {
      result.add((BaseImpl) catalogReference);
    }
    return result;
  }

  /**
   * Making a (deep) clone this object. This is useful and used for importing elements from
   * catalogs.
   *
   * @return a deep copy of the object.
   */
  @Override
  public ControllerDistributionEntryImpl clone() {
    ControllerDistributionEntryImpl clonedObject = new ControllerDistributionEntryImpl();
    cloneStartMarker(clonedObject);
    cloneEndMarker(clonedObject);
    cloneAttributeKeyToStartMarker(clonedObject);
    cloneAttributeKeyToEndMarker(clonedObject);
    cloneAttributeKeyToParameterNameMap(clonedObject);
    // clone attributes;
    // Simple type
    clonedObject.weight = getWeight();
    // clone children
    IControllerWriter controller = null;
    controller = getWriterController();
    if (controller != null) {
      IControllerWriter clonedChild = ((ControllerImpl) controller).clone();
      clonedObject.setController(clonedChild);
      clonedChild.setParent(clonedObject);
    }
    ICatalogReferenceWriter catalogReference = null;
    catalogReference = getWriterCatalogReference();
    if (catalogReference != null) {
      ICatalogReferenceWriter clonedChild = ((CatalogReferenceImpl) catalogReference).clone();
      clonedObject.setCatalogReference(clonedChild);
      clonedChild.setParent(clonedObject);
    }
    return clonedObject;
  }

  // Implement the IOpenScenarioFlexElement interface

  @Override
  public String getStringProperty(String key) throws KeyNotSupportedException {
    // proxies and string attributes
    throw new KeyNotSupportedException();
  }

  @Override
  public Long getUnsignedIntProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public Integer getIntProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public Double getDoubleProperty(String key) throws KeyNotSupportedException {
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__WEIGHT)) {
      return getWeight();
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public Integer getUnsignedShortProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public Boolean getBooleanProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public Date getDateTimeProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public IOpenScenarioFlexElement getChildElement(String key) throws KeyNotSupportedException {
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ELEMENT__CONTROLLER)) {
      return (IOpenScenarioFlexElement) getController();
    }
    if (key.equals(OscConstants.ELEMENT__CATALOG_REFERENCE)) {
      return (IOpenScenarioFlexElement) getCatalogReference();
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public List<IOpenScenarioFlexElement> getListChildElement(String key)
      throws KeyNotSupportedException {

    throw new KeyNotSupportedException();
  }

  @Override
  public IOpenScenarioFlexElement getParentFlexElement() {
    return (IOpenScenarioFlexElement) getParent();
  }

  @Override
  public IOpenScenarioFlexElement getReferencedElement(String key, String name)
      throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public String getEnumerationLiteral(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public String getModelType() {
    return "ControllerDistributionEntry";
  }

  @Override
  public void writeParameterToWeight(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__WEIGHT, parameterName, null /*no textmarker*/);
    this.weight = null;
  }

  @Override
  public String getParameterFromWeight() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__WEIGHT);
  }

  @Override
  public boolean isWeightParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__WEIGHT);
  }

  // children
  @Override
  public IControllerWriter getWriterController() {
    return this.controller;
  }

  @Override
  public ICatalogReferenceWriter getWriterCatalogReference() {
    return this.catalogReference;
  }
}
