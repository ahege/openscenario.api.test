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
import net.asam.openscenario.v1_0.api.ISun;
import net.asam.openscenario.v1_0.api.writer.ISunWriter;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>Value class that implements ISun. With setter methods to fill the properties.
 *
 * <ul>
 *   <li>getter methods for properties (implemented methods of ISun)
 *   <li>setter methods for properties
 *   <li>getChildren method to collect all children
 *   <li>clone function to make a deep copy
 *   <li>overrides from BaseImpl
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class SunImpl extends BaseImpl implements ISunWriter {
  protected static Hashtable<String, SimpleType> propertyToType = new Hashtable<>();

  /** Filling the property to type map */
  static {
    propertyToType.put(OscConstants.ATTRIBUTE__INTENSITY, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__AZIMUTH, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__ELEVATION, SimpleType.DOUBLE);
  }

  private Double intensity;
  private Double azimuth;
  private Double elevation;

  /** Default constructor */
  public SunImpl() {
    super();
    addAdapter(SunImpl.class, this);
    addAdapter(ISun.class, this);
    addAdapter(ISunWriter.class, this);
  }

  @Override
  public IOpenScenarioFlexElement getOpenScenarioFlexElement() {
    return this;
  }

  @Override
  public Double getIntensity() {
    return this.intensity;
  }

  @Override
  public Double getAzimuth() {
    return this.azimuth;
  }

  @Override
  public Double getElevation() {
    return this.elevation;
  }

  @Override
  public void setIntensity(Double intensity) {
    this.intensity = intensity;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__INTENSITY);
  }

  @Override
  public void setAzimuth(Double azimuth) {
    this.azimuth = azimuth;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__AZIMUTH);
  }

  @Override
  public void setElevation(Double elevation) {
    this.elevation = elevation;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__ELEVATION);
  }

  @Override
  public void resolveParameterInternal(
      IParserMessageLogger logger, String attributeKey, String parameterLiteralValue) {
    if (attributeKey.equals(OscConstants.ATTRIBUTE__INTENSITY)) {
      // Simple type
      this.intensity =
          ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__AZIMUTH)) {
      // Simple type
      this.azimuth =
          ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__ELEVATION)) {
      // Simple type
      this.elevation =
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

    return result;
  }

  /**
   * Making a (deep) clone this object. This is useful and used for importing elements from
   * catalogs.
   *
   * @return a deep copy of the object.
   */
  @Override
  public SunImpl clone() {
    SunImpl clonedObject = new SunImpl();
    cloneStartMarker(clonedObject);
    cloneEndMarker(clonedObject);
    cloneAttributeKeyToStartMarker(clonedObject);
    cloneAttributeKeyToEndMarker(clonedObject);
    cloneAttributeKeyToParameterNameMap(clonedObject);
    // clone attributes;
    // Simple type
    clonedObject.intensity = getIntensity();
    // Simple type
    clonedObject.azimuth = getAzimuth();
    // Simple type
    clonedObject.elevation = getElevation();
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
    if (key == null) {
      throw new KeyNotSupportedException();
    }
    if (key.equals(OscConstants.ATTRIBUTE__INTENSITY)) {
      return getIntensity();
    } else if (key.equals(OscConstants.ATTRIBUTE__AZIMUTH)) {
      return getAzimuth();
    } else if (key.equals(OscConstants.ATTRIBUTE__ELEVATION)) {
      return getElevation();
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
    return "Sun";
  }

  @Override
  public void writeParameterToIntensity(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__INTENSITY, parameterName, null /*no textmarker*/);
    this.intensity = null;
  }

  @Override
  public void writeParameterToAzimuth(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__AZIMUTH, parameterName, null /*no textmarker*/);
    this.azimuth = null;
  }

  @Override
  public void writeParameterToElevation(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__ELEVATION, parameterName, null /*no textmarker*/);
    this.elevation = null;
  }

  @Override
  public String getParameterFromIntensity() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__INTENSITY);
  }

  @Override
  public String getParameterFromAzimuth() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__AZIMUTH);
  }

  @Override
  public String getParameterFromElevation() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__ELEVATION);
  }

  @Override
  public boolean isIntensityParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__INTENSITY);
  }

  @Override
  public boolean isAzimuthParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__AZIMUTH);
  }

  @Override
  public boolean isElevationParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__ELEVATION);
  }

  // children

}
