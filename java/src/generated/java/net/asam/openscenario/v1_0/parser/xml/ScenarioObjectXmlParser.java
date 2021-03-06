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
import net.asam.openscenario.parser.modelgroup.XmlSequenceParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.EntityObjectImpl;
import net.asam.openscenario.v1_0.impl.ObjectControllerImpl;
import net.asam.openscenario.v1_0.impl.ScenarioObjectImpl;
import net.asam.xml.indexer.Position;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ScenarioObjectImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ScenarioObjectXmlParser extends XmlComplexTypeParser<ScenarioObjectImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ScenarioObjectXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ScenarioObjectImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ScenarioObjectImpl>> result = new Hashtable<>();
    result.put(
        OscConstants.ATTRIBUTE__NAME,
        new IAttributeParser<ScenarioObjectImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              ScenarioObjectImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    ScenarioObjectXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    ScenarioObjectXmlParser.this.filename);
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
  private class SubElementParser extends XmlSequenceParser<ScenarioObjectImpl> {
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
    protected List<IElementParser<ScenarioObjectImpl>> createParserList() {
      List<IElementParser<ScenarioObjectImpl>> result = new ArrayList<>();
      result.add(new SubElementEntityObjectParser());
      result.add(new SubElementObjectControllerParser());
      return result;
    }
  }
  /** A parser for subelement entityObject */
  @SuppressWarnings("synthetic-access")
  private class SubElementEntityObjectParser implements IElementParser<ScenarioObjectImpl> {

    /** Constructor */
    public SubElementEntityObjectParser() {
      super();
      this.entityObjectXmlParser =
          new EntityObjectXmlParser(
              ScenarioObjectXmlParser.this.messageLogger, ScenarioObjectXmlParser.this.filename);
    }

    private EntityObjectXmlParser entityObjectXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ScenarioObjectImpl object) {
      EntityObjectImpl entityObject = new EntityObjectImpl();
      // Setting the parent
      entityObject.setParent(object);
      this.entityObjectXmlParser.parseElement(indexedElement, parserContext, entityObject);

      object.setEntityObject(entityObject);
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
      return elementName.equals(OscConstants.ELEMENT__CATALOG_REFERENCE)
          || elementName.equals(OscConstants.ELEMENT__VEHICLE)
          || elementName.equals(OscConstants.ELEMENT__PEDESTRIAN)
          || elementName.equals(OscConstants.ELEMENT__MISC_OBJECT);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {
        OscConstants.ELEMENT__CATALOG_REFERENCE,
        OscConstants.ELEMENT__VEHICLE,
        OscConstants.ELEMENT__PEDESTRIAN,
        OscConstants.ELEMENT__MISC_OBJECT
      };
    }
  }
  /** A parser for subelement objectController */
  @SuppressWarnings("synthetic-access")
  private class SubElementObjectControllerParser implements IElementParser<ScenarioObjectImpl> {

    /** Constructor */
    public SubElementObjectControllerParser() {
      super();
      this.objectControllerXmlParser =
          new ObjectControllerXmlParser(
              ScenarioObjectXmlParser.this.messageLogger, ScenarioObjectXmlParser.this.filename);
    }

    private ObjectControllerXmlParser objectControllerXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ScenarioObjectImpl object) {
      ObjectControllerImpl objectController = new ObjectControllerImpl();
      // Setting the parent
      objectController.setParent(object);
      this.objectControllerXmlParser.parseElement(indexedElement, parserContext, objectController);

      object.setObjectController(objectController);
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
      return elementName.equals(OscConstants.ELEMENT__OBJECT_CONTROLLER);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__OBJECT_CONTROLLER};
    }
  }
}
