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
package net.asam.openscenario.v1_0.checker.model;

import java.util.ArrayList;
import java.util.List;
import net.asam.openscenario.checker.model.UnionCheckerRule;
import net.asam.openscenario.checker.tree.PropertyTreeContext;
import net.asam.openscenario.common.ErrorLevel;
import net.asam.openscenario.common.FileContentMessage;
import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.common.ITreeMessageLogger;
import net.asam.openscenario.common.TreeContentMessage;
import net.asam.openscenario.v1_0.api.ITimeToCollisionConditionTarget;
import net.asam.openscenario.v1_0.common.OscConstants;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0 A
 * union checker rule class for the type ITimeToCollisionConditionTarget according to OpenSCENARIO
 * standard all xor elements are checked
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class TimeToCollisionConditionTargetUnionCheckerRule
    extends UnionCheckerRule<ITimeToCollisionConditionTarget> {

  /** Default constructor */
  public TimeToCollisionConditionTargetUnionCheckerRule() {
    super();
  }

  @Override
  public void applyRuleInFileContext(
      IParserMessageLogger messageLogger, ITimeToCollisionConditionTarget object) {
    List<String> propertyNamesNotNull = getNotNullChildren(object);
    if (propertyNamesNotNull.size() > 1) {
      messageLogger.logMessage(
          new FileContentMessage(
              getTooManyMessage(propertyNamesNotNull), ErrorLevel.ERROR, getTextmarker(object)));
    }
  }

  private List<String> getNotNullChildren(ITimeToCollisionConditionTarget object) {
    List<String> propertyNamesNotNull = new ArrayList<>();
    if (object.getPosition() != null) {
      propertyNamesNotNull.add(OscConstants.ELEMENT__POSITION);
    }

    if (object.getEntityRef() != null) {
      propertyNamesNotNull.add(OscConstants.ELEMENT__ENTITY_REF);
    }

    return propertyNamesNotNull;
  }

  @Override
  public void applyRuleInTreeContext(
      ITreeMessageLogger messageLogger, ITimeToCollisionConditionTarget object) {
    List<String> propertyNamesNotNull = getNotNullChildren(object);
    if (propertyNamesNotNull.size() > 1) {
      messageLogger.logMessage(
          new TreeContentMessage(
              getTooManyMessage(propertyNamesNotNull),
              ErrorLevel.ERROR,
              new PropertyTreeContext(object, propertyNamesNotNull)));
    }
  }
}
