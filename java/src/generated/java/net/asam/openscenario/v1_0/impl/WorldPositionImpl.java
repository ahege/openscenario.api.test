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
import net.asam.openscenario.v1_0.api.IWorldPosition;
import net.asam.openscenario.v1_0.api.writer.IWorldPositionWriter;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>Value class that implements IWorldPosition. With setter methods to fill the properties.
 *
 * <ul>
 *   <li>getter methods for properties (implemented methods of IWorldPosition)
 *   <li>setter methods for properties
 *   <li>getChildren method to collect all children
 *   <li>clone function to make a deep copy
 *   <li>overrides from BaseImpl
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class WorldPositionImpl extends BaseImpl implements IWorldPositionWriter {
  protected static Hashtable<String, SimpleType> propertyToType = new Hashtable<>();

  /** Filling the property to type map */
  static {
    propertyToType.put(OscConstants.ATTRIBUTE__X, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__Y, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__Z, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__H, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__P, SimpleType.DOUBLE);
    propertyToType.put(OscConstants.ATTRIBUTE__R, SimpleType.DOUBLE);
  }

  private Double x;
  private Double y;
  private Double z;
  private Double h;
  private Double p;
  private Double r;

  /** Default constructor */
  public WorldPositionImpl() {
    super();
    addAdapter(WorldPositionImpl.class, this);
    addAdapter(IWorldPosition.class, this);
    addAdapter(IWorldPositionWriter.class, this);
  }

  @Override
  public IOpenScenarioFlexElement getOpenScenarioFlexElement() {
    return this;
  }

  @Override
  public Double getX() {
    return this.x;
  }

  @Override
  public Double getY() {
    return this.y;
  }

  @Override
  public Double getZ() {
    return this.z;
  }

  @Override
  public Double getH() {
    return this.h;
  }

  @Override
  public Double getP() {
    return this.p;
  }

  @Override
  public Double getR() {
    return this.r;
  }

  @Override
  public void setX(Double x) {
    this.x = x;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__X);
  }

  @Override
  public void setY(Double y) {
    this.y = y;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__Y);
  }

  @Override
  public void setZ(Double z) {
    this.z = z;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__Z);
  }

  @Override
  public void setH(Double h) {
    this.h = h;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__H);
  }

  @Override
  public void setP(Double p) {
    this.p = p;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__P);
  }

  @Override
  public void setR(Double r) {
    this.r = r;
    // removeAttributeParameter(OscConstants.ATTRIBUTE__R);
  }

  @Override
  public void resolveParameterInternal(
      IParserMessageLogger logger, String attributeKey, String parameterLiteralValue) {
    if (attributeKey.equals(OscConstants.ATTRIBUTE__X)) {
      // Simple type
      this.x = ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__Y)) {
      // Simple type
      this.y = ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__Z)) {
      // Simple type
      this.z = ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__H)) {
      // Simple type
      this.h = ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__P)) {
      // Simple type
      this.p = ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
      addResolvedParameter(attributeKey);

    } else if (attributeKey.equals(OscConstants.ATTRIBUTE__R)) {
      // Simple type
      this.r = ParserHelper.parseDouble(logger, parameterLiteralValue, getTextmarker(attributeKey));
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
  public WorldPositionImpl clone() {
    WorldPositionImpl clonedObject = new WorldPositionImpl();
    cloneStartMarker(clonedObject);
    cloneEndMarker(clonedObject);
    cloneAttributeKeyToStartMarker(clonedObject);
    cloneAttributeKeyToEndMarker(clonedObject);
    cloneAttributeKeyToParameterNameMap(clonedObject);
    // clone attributes;
    // Simple type
    clonedObject.x = getX();
    // Simple type
    clonedObject.y = getY();
    // Simple type
    clonedObject.z = getZ();
    // Simple type
    clonedObject.h = getH();
    // Simple type
    clonedObject.p = getP();
    // Simple type
    clonedObject.r = getR();
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
    if (key.equals(OscConstants.ATTRIBUTE__X)) {
      return getX();
    } else if (key.equals(OscConstants.ATTRIBUTE__Y)) {
      return getY();
    } else if (key.equals(OscConstants.ATTRIBUTE__Z)) {
      return getZ();
    } else if (key.equals(OscConstants.ATTRIBUTE__H)) {
      return getH();
    } else if (key.equals(OscConstants.ATTRIBUTE__P)) {
      return getP();
    } else if (key.equals(OscConstants.ATTRIBUTE__R)) {
      return getR();
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
    return "WorldPosition";
  }

  @Override
  public void writeParameterToX(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__X, parameterName, null /*no textmarker*/);
    this.x = null;
  }

  @Override
  public void writeParameterToY(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__Y, parameterName, null /*no textmarker*/);
    this.y = null;
  }

  @Override
  public void writeParameterToZ(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__Z, parameterName, null /*no textmarker*/);
    this.z = null;
  }

  @Override
  public void writeParameterToH(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__H, parameterName, null /*no textmarker*/);
    this.h = null;
  }

  @Override
  public void writeParameterToP(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__P, parameterName, null /*no textmarker*/);
    this.p = null;
  }

  @Override
  public void writeParameterToR(String parameterName) {
    setAttributeParameter(OscConstants.ATTRIBUTE__R, parameterName, null /*no textmarker*/);
    this.r = null;
  }

  @Override
  public String getParameterFromX() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__X);
  }

  @Override
  public String getParameterFromY() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__Y);
  }

  @Override
  public String getParameterFromZ() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__Z);
  }

  @Override
  public String getParameterFromH() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__H);
  }

  @Override
  public String getParameterFromP() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__P);
  }

  @Override
  public String getParameterFromR() {
    return getParameterNameFromAttribute(OscConstants.ATTRIBUTE__R);
  }

  @Override
  public boolean isXParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__X);
  }

  @Override
  public boolean isYParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__Y);
  }

  @Override
  public boolean isZParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__Z);
  }

  @Override
  public boolean isHParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__H);
  }

  @Override
  public boolean isPParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__P);
  }

  @Override
  public boolean isRParameterized() {
    return getParameterizedAttributeKeys().contains(OscConstants.ATTRIBUTE__R);
  }

  // children

}
