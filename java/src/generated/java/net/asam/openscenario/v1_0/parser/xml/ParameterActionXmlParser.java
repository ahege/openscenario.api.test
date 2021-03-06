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
import net.asam.openscenario.impl.NamedReferenceProxy;
import net.asam.openscenario.parser.ParserContext;
import net.asam.openscenario.parser.modelgroup.XmlChoiceParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.v1_0.api.IParameterDeclaration;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.ParameterActionImpl;
import net.asam.openscenario.v1_0.impl.ParameterModifyActionImpl;
import net.asam.openscenario.v1_0.impl.ParameterSetActionImpl;
import net.asam.xml.indexer.Position;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ParameterActionImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ParameterActionXmlParser extends XmlComplexTypeParser<ParameterActionImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ParameterActionXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ParameterActionImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ParameterActionImpl>> result = new Hashtable<>();
    result.put(
        OscConstants.ATTRIBUTE__PARAMETER_REF,
        new IAttributeParser<ParameterActionImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              ParameterActionImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    ParameterActionXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    ParameterActionXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__PARAMETER_REF,
                  stripDollarSign(attributeValue),
                  startMarker);
            } else {
              // Parse value
              // Proxy
              NamedReferenceProxy<IParameterDeclaration> proxy =
                  new NamedReferenceProxy<>(attributeValue);
              proxy.setParent(object);
              object.setParameterRef(proxy);
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__PARAMETER_REF, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__PARAMETER_REF, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlChoiceParser<ParameterActionImpl> {
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
    protected List<IElementParser<ParameterActionImpl>> createParserList() {
      List<IElementParser<ParameterActionImpl>> result = new ArrayList<>();
      result.add(new SubElementSetActionParser());
      result.add(new SubElementModifyActionParser());
      return result;
    }
  }
  /** A parser for subelement setAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementSetActionParser implements IElementParser<ParameterActionImpl> {

    /** Constructor */
    public SubElementSetActionParser() {
      super();
      this.parameterSetActionXmlParser =
          new ParameterSetActionXmlParser(
              ParameterActionXmlParser.this.messageLogger, ParameterActionXmlParser.this.filename);
    }

    private ParameterSetActionXmlParser parameterSetActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ParameterActionImpl object) {
      ParameterSetActionImpl setAction = new ParameterSetActionImpl();
      // Setting the parent
      setAction.setParent(object);
      this.parameterSetActionXmlParser.parseElement(indexedElement, parserContext, setAction);

      object.setSetAction(setAction);
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
      return elementName.equals(OscConstants.ELEMENT__SET_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__SET_ACTION};
    }
  }
  /** A parser for subelement modifyAction */
  @SuppressWarnings("synthetic-access")
  private class SubElementModifyActionParser implements IElementParser<ParameterActionImpl> {

    /** Constructor */
    public SubElementModifyActionParser() {
      super();
      this.parameterModifyActionXmlParser =
          new ParameterModifyActionXmlParser(
              ParameterActionXmlParser.this.messageLogger, ParameterActionXmlParser.this.filename);
    }

    private ParameterModifyActionXmlParser parameterModifyActionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ParameterActionImpl object) {
      ParameterModifyActionImpl modifyAction = new ParameterModifyActionImpl();
      // Setting the parent
      modifyAction.setParent(object);
      this.parameterModifyActionXmlParser.parseElement(indexedElement, parserContext, modifyAction);

      object.setModifyAction(modifyAction);
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
      return elementName.equals(OscConstants.ELEMENT__MODIFY_ACTION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__MODIFY_ACTION};
    }
  }
}
