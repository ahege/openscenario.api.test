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
import net.asam.openscenario.common.Textmarker;
import net.asam.openscenario.parser.ParserContext;
import net.asam.openscenario.parser.modelgroup.XmlChoiceParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.ActionImpl;
import net.asam.openscenario.v1_0.impl.GlobalActionImpl;
import net.asam.openscenario.v1_0.impl.PrivateActionImpl;
import net.asam.openscenario.v1_0.impl.UserDefinedActionImpl;
import net.asam.xml.indexer.Position;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ActionImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ActionXmlParser extends XmlComplexTypeParser<ActionImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ActionXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ActionImpl>> getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ActionImpl>> result = new Hashtable<>();
    result.put(
        OscConstants.ATTRIBUTE__NAME,
        new IAttributeParser<ActionImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              ActionImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    ActionXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(), endPosition.getColumn(), ActionXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__NAME, stripDollarSign(attributeValue), startMarker);
            } else {
              // Parse value
              // Simple type
              object.setName(parseString(attributeValue, startMarker));
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__NAME, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__NAME, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlChoiceParser<ActionImpl> {
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
    protected List<IElementParser<ActionImpl>> createParserList() {
      List<IElementParser<ActionImpl>> result = new ArrayList<>();
      result.add(new SubElementGlobalActionParser());
      result.add(new SubElementUserDefinedActionParser());
      result.add(new SubElementPrivateActionParser());
      return result;
    }
  }
  /** A parser for subelement globalAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementGlobalActionParser implements IElementParser<ActionImpl> {

    /** Constructor */
    public SubElementGlobalActionParser() {
      super();
      this.globalActionXmlParser =
          new GlobalActionXmlParser(
              ActionXmlParser.this.messageLogger, ActionXmlParser.this.filename);
    }

    private GlobalActionXmlParser globalActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ActionImpl object) {
      GlobalActionImpl globalAction = new GlobalActionImpl();
      // Setting the parent
      globalAction.setParent(object);
      this.globalActionXmlParser.parseElement(indexedElement, parserContext, globalAction);

      object.setGlobalAction(globalAction);
    }

    @Override
    public int getMinOccur() {
      return 0;
    }

    @Override
    public int getMaxOccur() {
      return 1;
    }

    @Override
    public boolean doesMatch(String elementName) {
      return elementName.equals(OscConstants.ELEMENT__GLOBAL_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__GLOBAL_ACTION};
    }
  }
  /** A parser for subelement userDefinedAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementUserDefinedActionParser implements IElementParser<ActionImpl> {

    /** Constructor */
    public SubElementUserDefinedActionParser() {
      super();
      this.userDefinedActionXmlParser =
          new UserDefinedActionXmlParser(
              ActionXmlParser.this.messageLogger, ActionXmlParser.this.filename);
    }

    private UserDefinedActionXmlParser userDefinedActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ActionImpl object) {
      UserDefinedActionImpl userDefinedAction = new UserDefinedActionImpl();
      // Setting the parent
      userDefinedAction.setParent(object);
      this.userDefinedActionXmlParser.parseElement(
          indexedElement, parserContext, userDefinedAction);

      object.setUserDefinedAction(userDefinedAction);
    }

    @Override
    public int getMinOccur() {
      return 0;
    }

    @Override
    public int getMaxOccur() {
      return 1;
    }

    @Override
    public boolean doesMatch(String elementName) {
      return elementName.equals(OscConstants.ELEMENT__USER_DEFINED_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__USER_DEFINED_ACTION};
    }
  }
  /** A parser for subelement privateAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementPrivateActionParser implements IElementParser<ActionImpl> {

    /** Constructor */
    public SubElementPrivateActionParser() {
      super();
      this.privateActionXmlParser =
          new PrivateActionXmlParser(
              ActionXmlParser.this.messageLogger, ActionXmlParser.this.filename);
    }

    private PrivateActionXmlParser privateActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ActionImpl object) {
      PrivateActionImpl privateAction = new PrivateActionImpl();
      // Setting the parent
      privateAction.setParent(object);
      this.privateActionXmlParser.parseElement(indexedElement, parserContext, privateAction);

      object.setPrivateAction(privateAction);
    }

    @Override
    public int getMinOccur() {
      return 0;
    }

    @Override
    public int getMaxOccur() {
      return 1;
    }

    @Override
    public boolean doesMatch(String elementName) {
      return elementName.equals(OscConstants.ELEMENT__PRIVATE_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__PRIVATE_ACTION};
    }
  }
}
