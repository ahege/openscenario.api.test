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
import net.asam.openscenario.v1_0.api.ITimeOfDay;
import net.asam.openscenario.v1_0.api.writer.ITimeOfDayWriter;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>Value class that implements ITimeOfDay. With setter methods to fill the properties.
 *
 * <ul>
 *   <li>getter methods for properties (implemented methods of ITimeOfDay)
 *   <li>setter methods for properties
 *   <li>getChildren method to collect all children
 *   <li>clone function to make a deep copy
 *   <li>overrides from BaseImpl
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class TimeOfDayImpl extends BaseImpl implements ITimeOfDayWriter {
  protected static Hashtable<String, SimpleType> propertyToType = new Hashtable<>();

  /** Filling the property to type map */
  static {
    propertyToType.put(OscConstants.ATTRIBUTE__ANIMATION, SimpleType.BOOLEAN);
    propertyToType.put(OscConstants.ATTRIBUTE__DATE_TIME, SimpleType.DATE_TIME);
  }

  private Boolean animation;
  private java.util.Date dateTime;

  /** Default constructor */
  public TimeOfDayImpl() {
    super();
    addAdapter(TimeOfDayImpl.class, this);
    addAdapter(ITimeOfDay.class, this);
    addAdapter(ITimeOfDayWriter.class, this);
  }

  @Override
  public IOpenScenarioFlexElement getOpenScenarioFlexElement() {
    return this;
  }

  @Override
  public Boolean getAnimation() {
    return this.animation;
  }

  @Override
  public java.util.Date getDateTime() {
    return this.dateTime;
  }

  @Override
  public void setAnimation(Boolean animation) {
    this.animation = animation;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__ANIMATION);
  }

  @Override
  public void setDateTime(java.util.Date dateTime) {
    this.dateTime = dateTime;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__DATE_TIME);
  }

  @Override
  public void resolveParameterInternal(
      IParserMessageLogger logger, String attributeKey, String parameterLiteralValue) {
    if (attributeKey.equals(OscConstants.ATTRIBUTE__ANIMATION)) {
      // Simple type
      this.animation =
          ParserHelper.parseBoolean(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__DATE_TIME)) {
      // Simple type
      this.dateTime =
          ParserHelper.parseDateTime(logger, parameterLiteralValue, getTextmarker(attributeKey));
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
  public TimeOfDayImpl clone() {
    TimeOfDayImpl clonedObject = new TimeOfDayImpl();
    cloneStartMarker(clonedObject);
    cloneEndMarker(clonedObject);
    cloneAttributeKeyToStartMarker(clonedObject);
    cloneAttributeKeyToEndMarker(clonedObject);
    cloneAttributeKeyToParameterNameMap(clonedObject);
    // clone attributes;
    // Simple type
    clonedObject.animation = getAnimation();
    // Simple type
    clonedObject.dateTime = getDateTime();
    // clone children
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
    if (key.equals(OscConstants.ATTRIBUTE__ANIMATION)) {
      return getAnimation();
    }
    throw new KeyNotSupportedException();
  }

  @Override
  public Date getDateTimeProperty(String key) throws KeyNotSupportedException {
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__DATE_TIME)) {
      return getDateTime();
    }
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
    throw new KeyNotSupportedException();
  }

  @Override
  public String getEnumerationLiteral(String key) throws KeyNotSupportedException {
    throw new KeyNotSupportedException();
  }

  @Override
  public String getModelType() {
    return "TimeOfDay";
  }

  @Override
  public void writeParameterToAnimation(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__ANIMATION, parameterName, null /*no textmarker*/);
    this.animation = null;
  }

  @Override
  public void writeParameterToDateTime(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__DATE_TIME, parameterName, null /*no textmarker*/);
    this.dateTime = null;
  }

  @Override
  public String getParameterFromAnimation() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__ANIMATION);
  }

  @Override
  public String getParameterFromDateTime() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__DATE_TIME);
  }

  @Override
  public boolean isAnimationParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__ANIMATION);
  }

  @Override
  public boolean isDateTimeParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__DATE_TIME);
  }

  // children

}
