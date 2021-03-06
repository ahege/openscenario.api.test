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
package net.asam.openscenario.v1_0.parser.xml;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.parser.ParserContext;
import net.asam.openscenario.parser.modelgroup.XmlAllParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.AssignControllerActionImpl;
import net.asam.openscenario.v1_0.impl.ControllerActionImpl;
import net.asam.openscenario.v1_0.impl.OverrideControllerValueActionImpl;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ControllerActionImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ControllerActionXmlParser extends XmlComplexTypeParser<ControllerActionImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ControllerActionXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ControllerActionImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ControllerActionImpl>> result = new Hashtable<>();
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlAllParser<ControllerActionImpl> {
    /**
     * Constructor
     *
     * @param messageLogger to log messages during parsing
     * @param filename to locate the messages in a file
     */
    public SubElementParser(IParserMessageLogger messageLogger, String filename) {
      super(messageLogger, filename);
    }
    /*
     * Creates a list of parser
     */
    @Override
    protected List<IElementParser<ControllerActionImpl>> createParserList() {
      List<IElementParser<ControllerActionImpl>> result = new ArrayList<>();
      result.add(new SubElementAssignControllerActionParser());
      result.add(new SubElementOverrideControllerValueActionParser());
      return result;
    }
  }
  /** A parser for subelement assignControllerAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementAssignControllerActionParser
      implements IElementParser<ControllerActionImpl> {

    /** Constructor */
    public SubElementAssignControllerActionParser() {
      super();
      this.assignControllerActionXmlParser =
          new AssignControllerActionXmlParser(
              ControllerActionXmlParser.this.messageLogger,
              ControllerActionXmlParser.this.filename);
    }

    private AssignControllerActionXmlParser assignControllerActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ControllerActionImpl object) {
      AssignControllerActionImpl assignControllerAction = new AssignControllerActionImpl();
      // Setting the parent
      assignControllerAction.setParent(object);
      this.assignControllerActionXmlParser.parseElement(
          indexedElement, parserContext, assignControllerAction);

      object.setAssignControllerAction(assignControllerAction);
    }

    @Override
    public int getMinOccur() {
      return 1;
    }

    @Override
    public int getMaxOccur() {
      return 1;
    }

    @Override
    public boolean doesMatch(String elementName) {
      return elementName.equals(OscConstants.ELEMENT__ASSIGN_CONTROLLER_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__ASSIGN_CONTROLLER_ACTION};
    }
  }
  /** A parser for subelement overrideControllerValueAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementOverrideControllerValueActionParser
      implements IElementParser<ControllerActionImpl> {

    /** Constructor */
    public SubElementOverrideControllerValueActionParser() {
      super();
      this.overrideControllerValueActionXmlParser =
          new OverrideControllerValueActionXmlParser(
              ControllerActionXmlParser.this.messageLogger,
              ControllerActionXmlParser.this.filename);
    }

    private OverrideControllerValueActionXmlParser overrideControllerValueActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ControllerActionImpl object) {
      OverrideControllerValueActionImpl overrideControllerValueAction =
          new OverrideControllerValueActionImpl();
      // Setting the parent
      overrideControllerValueAction.setParent(object);
      this.overrideControllerValueActionXmlParser.parseElement(
          indexedElement, parserContext, overrideControllerValueAction);

      object.setOverrideControllerValueAction(overrideControllerValueAction);
    }

    @Override
    public int getMinOccur() {
      return 1;
    }

    @Override
    public int getMaxOccur() {
      return 1;
    }

    @Override
    public boolean doesMatch(String elementName) {
      return elementName.equals(OscConstants.ELEMENT__OVERRIDE_CONTROLLER_VALUE_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__OVERRIDE_CONTROLLER_VALUE_ACTION};
    }
  }
}
