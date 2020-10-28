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
import net.asam.openscenario.v1_0.api.INone;
import net.asam.openscenario.v1_0.api.ITimeReference;
import net.asam.openscenario.v1_0.api.ITiming;
import net.asam.openscenario.v1_0.api.writer.INoneWriter;
import net.asam.openscenario.v1_0.api.writer.ITimeReferenceWriter;
import net.asam.openscenario.v1_0.api.writer.ITimingWriter;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 *
 * <p>Value class that implements ITimeReference. With setter methods to fill the properties.
 *
 * <ul>
 *   <li>getter methods for properties (implemented methods of ITimeReference)
 *   <li>setter methods for properties
 *   <li>getChildren method to collect all children
 *   <li>clone function to make a deep copy
 *   <li>overrides from BaseImpl
 * </ul>
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class TimeReferenceImpl extends BaseImpl implements ITimeReferenceWriter {
  protected static Hashtable<String, SimpleType> propertyToType = new Hashtable<>();

  private INoneWriter none;
  private ITimingWriter timing;

  /** Default constructor */
  public TimeReferenceImpl() {
    super();
    addAdapter(TimeReferenceImpl.class, this);
    addAdapter(ITimeReference.class, this);
    addAdapter(ITimeReferenceWriter.class, this);
  }

  @Override
  public IOpenScenarioFlexElement getOpenScenarioFlexElement() {
    return this;
  }

  @Override
  public INone getNone() {
    return this.none;
  }

  @Override
  public ITiming getTiming() {
    return this.timing;
  }

  @Override
  public void setNone(INoneWriter none) {
    this.none = none;
    this.timing = null;
  }

  @Override
  public void setTiming(ITimingWriter timing) {
    this.timing = timing;
    this.none = null;
  }

  @Override
  public void resolveParameterInternal(
      IParserMessageLogger logger, String attributeKey, String parameterLiteralValue) {
    // Empty
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

    INoneWriter none = null;
    none = getWriterNone();
    if (none != null) {
      result.add((BaseImpl) none);
    }
    ITimingWriter timing = null;
    timing = getWriterTiming();
    if (timing != null) {
      result.add((BaseImpl) timing);
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
  public TimeReferenceImpl clone() {
    TimeReferenceImpl clonedObject = new TimeReferenceImpl();
    cloneStartMarker(clonedObject);
    cloneEndMarker(clonedObject);
    cloneAttributeKeyToStartMarker(clonedObject);
    cloneAttributeKeyToEndMarker(clonedObject);
    cloneAttributeKeyToParameterNameMap(clonedObject);
    // clone attributes;
    // clone children
    INoneWriter none = null;
    none = getWriterNone();
    if (none != null) {
      INoneWriter clonedChild = ((NoneImpl) none).clone();
      clonedObject.setNone(clonedChild);
      clonedChild.setParent(clonedObject);
    }
    ITimingWriter timing = null;
    timing = getWriterTiming();
    if (timing != null) {
      ITimingWriter clonedChild = ((TimingImpl) timing).clone();
      clonedObject.setTiming(clonedChild);
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
    if (key.equals(OscConstants.ELEMENT__NONE)) {
      return (IOpenScenarioFlexElement) getNone();
    }
    if (key.equals(OscConstants.ELEMENT__TIMING)) {
      return (IOpenScenarioFlexElement) getTiming();
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
    return "TimeReference";
  }

  // children
  @Override
  public INoneWriter getWriterNone() {
    return this.none;
  }

  @Override
  public ITimingWriter getWriterTiming() {
    return this.timing;
  }
}
