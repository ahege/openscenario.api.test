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
import net.asam.openscenario.common.ErrorLevel;
import net.asam.openscenario.common.FileContentMessage;
import net.asam.openscenario.common.INamedReference;
import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.impl.BaseImpl;
import net.asam.openscenario.impl.NamedReferenceProxy;
import net.asam.openscenario.parser.ParserHelper;
import net.asam.openscenario.v1_0.api.IEntity;
import net.asam.openscenario.v1_0.api.IRelativeTargetSpeed;
import net.asam.openscenario.v1_0.api.SpeedTargetValueType;
import net.asam.openscenario.v1_0.api.writer.IRelativeTargetSpeedWriter;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>Value class that implements IRelativeTargetSpeed. With setter methods to fill the properties.
 *
 * <ul>
 *   <li>getter methods for properties (implemented methods of IRelativeTargetSpeed)
 *   <li>setter methods for properties
 *   <li>getChildren method to collect all children
 *   <li>clone function to make a deep copy
 *   <li>overrides from BaseImpl
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class RelativeTargetSpeedImpl extends BaseImpl implements IRelativeTargetSpeedWriter {
  protected static Hashtable<String, SimpleType> propertyToType = new Hashtable<>();

  /** Filling the property to type map */
  static {
    propertyToType.put(OscConstants.ATTRIBUTE__ENTITY_REF, SimpleType.STRING);
    propertyToType.put(OscConstants.ATTRIBUTE__VALUE, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE, SimpleType.ENUM_TYPE);
    propertyToType.put(OscConstants.ATTRIBUTE__CONTINUOUS, SimpleType.BOOLEAN);
  }

  private INamedReference<IEntity> entityRef;
  private Double value;
  private SpeedTargetValueType speedTargetValueType;
  private Boolean continuous;

  /** Default constructor */
  public RelativeTargetSpeedImpl() {
    super();
    addAdapter(RelativeTargetSpeedImpl.class, this);
    addAdapter(IRelativeTargetSpeed.class, this);
    addAdapter(IRelativeTargetSpeedWriter.class, this);
  }

  @Override
  public IOpenScenarioFlexElement getOpenScenarioFlexElement() {
    return this;
  }

  @Override
  public INamedReference<IEntity> getEntityRef() {
    return this.entityRef;
  }

  @Override
  public Double getValue() {
    return this.value;
  }

  @Override
  public SpeedTargetValueType getSpeedTargetValueType() {
    return this.speedTargetValueType;
  }

  @Override
  public Boolean getContinuous() {
    return this.continuous;
  }

  @Override
  public void setEntityRef(INamedReference<IEntity> entityRef) {
    this.entityRef = entityRef;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__ENTITY_REF);
  }

  @Override
  public void setValue(Double value) {
    this.value = value;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__VALUE);
  }

  @Override
  public void setSpeedTargetValueType(SpeedTargetValueType speedTargetValueType) {
    this.speedTargetValueType = speedTargetValueType;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE);
  }

  @Override
  public void setContinuous(Boolean continuous) {
    this.continuous = continuous;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__CONTINUOUS);
  }

  @Override
  public void resolveParameterInternal(
      IParserMessageLogger logger, String attributeKey, String parameterLiteralValue) {
    if (attributeKey.equals(OscConstants.ATTRIBUTE__ENTITY_REF)) {
      // Proxy
      NamedReferenceProxy<IEntity> proxy = new NamedReferenceProxy<>(parameterLiteralValue);
      this.entityRef = proxy;
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__VALUE)) {
      // Simple type
      this.value =
          ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE)) {
      // Enumeration Type
      SpeedTargetValueType result = SpeedTargetValueType.getFromLiteral(parameterLiteralValue);
      if (result != null) {
        this.speedTargetValueType = result;
        addResolvedParameter(attributeKey);
      } else {
        logger.logMessage(
            new FileContentMessage(
                "Value '" + parameterLiteralValue + "' is not allowed.",
                ErrorLevel.ERROR,
                getTextmarker(attributeKey)));
      }

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__CONTINUOUS)) {
      // Simple type
      this.continuous =
          ParserHelper.parseBoolean(logger, parameterLiteralValue, getTextmarker(attributeKey));
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

    return result;
  }

  /**
   * Making a (deep) clone this object. This is useful and used for importing elements from
   * catalogs.
   *
   * @return a deep copy of the object.
   */
  @Override
  public RelativeTargetSpeedImpl clone() {
    RelativeTargetSpeedImpl clonedObject = new RelativeTargetSpeedImpl();
    cloneStartMarker(clonedObject);
    cloneEndMarker(clonedObject);
    cloneAttributeKeyToStartMarker(clonedObject);
    cloneAttributeKeyToEndMarker(clonedObject);
    cloneAttributeKeyToParameterNameMap(clonedObject);
    // clone attributes;
    // Proxy
    NamedReferenceProxy<IEntity> proxy = ((NamedReferenceProxy<IEntity>) getEntityRef()).clone();
    clonedObject.entityRef = proxy;
    proxy.setParent(clonedObject);
    // Simple type
    clonedObject.value = getValue();
    // Enumeration Type
    SpeedTargetValueType speedTargetValueType = getSpeedTargetValueType();
    if (speedTargetValueType != null) {
      clonedObject.speedTargetValueType =
          SpeedTargetValueType.getFromLiteral(speedTargetValueType.getLiteral());
    }
    // Simple type
    clonedObject.continuous = getContinuous();
    // clone children
    return clonedObject;
  }

  // Implement the IOpenScenarioFlexElement interface

  @Override
  public String getStringProperty(String key) throws KeyNotSupportedException {
    // proxies and string attributes
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__ENTITY_REF)) {
      // Get the Proxy
      INamedReference<IEntity> entityRef = getEntityRef();
      return entityRef != null ? entityRef.getNameRef() : null;
    }
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
    if (key.equals(OscConstants.ATTRIBUTE__VALUE)) {
      return getValue();
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public Integer getUnsignedShortProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public Boolean getBooleanProperty(String key) throws KeyNotSupportedException {
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__CONTINUOUS)) {
      return getContinuous();
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public Date getDateTimeProperty(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public IOpenScenarioFlexElement getChildElement(String key) throws KeyNotSupportedException {
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
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__ENTITY_REF)) {
      // Get the Proxy
      INamedReference<IEntity> entityRef = getEntityRef();
      return entityRef != null ? (IOpenScenarioFlexElement) entityRef.getTargetObject() : null;
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public String getEnumerationLiteral(String key) throws KeyNotSupportedException {
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE)) {
      SpeedTargetValueType speedTargetValueType = getSpeedTargetValueType();
      return speedTargetValueType != null ? speedTargetValueType.getLiteral() : null;
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public String getModelType() {
    return "RelativeTargetSpeed";
  }

  @Override
  public void writeParameterToEntityRef(String parameterName) {
    setAttributeParameter(
        OscConstants.ATTRIBUTE__ENTITY_REF, parameterName, null /*no textmarker*/);
    this.entityRef = null;
  }

  @Override
  public void writeParameterToValue(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__VALUE, parameterName, null /*no textmarker*/);
    this.value = null;
  }

  @Override
  public void writeParameterToSpeedTargetValueType(String parameterName) {
    setAttributeParameter(
        OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE, parameterName, null /*no textmarker*/);
    this.speedTargetValueType = null;
  }

  @Override
  public void writeParameterToContinuous(String parameterName) {
    setAttributeParameter(
        OscConstants.ATTRIBUTE__CONTINUOUS, parameterName, null /*no textmarker*/);
    this.continuous = null;
  }

  @Override
  public String getParameterFromEntityRef() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__ENTITY_REF);
  }

  @Override
  public String getParameterFromValue() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__VALUE);
  }

  @Override
  public String getParameterFromSpeedTargetValueType() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE);
  }

  @Override
  public String getParameterFromContinuous() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__CONTINUOUS);
  }

  @Override
  public boolean isEntityRefParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__ENTITY_REF);
  }

  @Override
  public boolean isValueParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__VALUE);
  }

  @Override
  public boolean isSpeedTargetValueTypeParameterized() {
    return getParameterizedAttributeKeys()
        .contains(OscConstants.ATTRIBUTE__SPEED_TARGET_VALUE_TYPE);
  }

  @Override
  public boolean isContinuousParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__CONTINUOUS);
  }

  // children

}
