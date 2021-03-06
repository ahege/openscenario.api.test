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
import net.asam.openscenario.v1_0.impl.CatalogReferenceImpl;
import net.asam.openscenario.v1_0.impl.ControllerDistributionEntryImpl;
import net.asam.openscenario.v1_0.impl.ControllerImpl;
import net.asam.openscenario.v1_0.parser.CatalogReferenceParserContext;
import net.asam.xml.indexer.Position;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ControllerDistributionEntryImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ControllerDistributionEntryXmlParser
    extends XmlComplexTypeParser<ControllerDistributionEntryImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ControllerDistributionEntryXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ControllerDistributionEntryImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ControllerDistributionEntryImpl>> result = new Hashtable<>();
    result.put(
        OscConstants.ATTRIBUTE__WEIGHT,
        new IAttributeParser<ControllerDistributionEntryImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              ControllerDistributionEntryImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    ControllerDistributionEntryXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    ControllerDistributionEntryXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__WEIGHT, stripDollarSign(attributeValue), startMarker);
            } else {
              // Parse value
              // Simple type
              object.setWeight(parseDouble(attributeValue, startMarker));
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__WEIGHT, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__WEIGHT, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlChoiceParser<ControllerDistributionEntryImpl> {
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
    protected List<IElementParser<ControllerDistributionEntryImpl>> createParserList() {
      List<IElementParser<ControllerDistributionEntryImpl>> result = new ArrayList<>();
      result.add(new SubElementControllerParser());
      result.add(new SubElementCatalogReferenceParser());
      return result;
    }
  }
  /** A parser for subelement controller */
  @SuppressWarnings("synthetic-access")
  private class SubElementControllerParser
      implements IElementParser<ControllerDistributionEntryImpl> {

    /** Constructor */
    public SubElementControllerParser() {
      super();
      this.controllerXmlParser =
          new ControllerXmlParser(
              ControllerDistributionEntryXmlParser.this.messageLogger,
              ControllerDistributionEntryXmlParser.this.filename);
    }

    private ControllerXmlParser controllerXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement,
        ParserContext parserContext,
        ControllerDistributionEntryImpl object) {
      ControllerImpl controller = new ControllerImpl();
      // Setting the parent
      controller.setParent(object);
      this.controllerXmlParser.parseElement(indexedElement, parserContext, controller);

      object.setController(controller);
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
      return elementName.equals(OscConstants.ELEMENT__CONTROLLER);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__CONTROLLER};
    }
  }
  /** A parser for subelement catalogReference */
  @SuppressWarnings("synthetic-access")
  private class SubElementCatalogReferenceParser
      implements IElementParser<ControllerDistributionEntryImpl> {

    /** Constructor */
    public SubElementCatalogReferenceParser() {
      super();
      this.catalogReferenceXmlParser =
          new CatalogReferenceXmlParser(
              ControllerDistributionEntryXmlParser.this.messageLogger,
              ControllerDistributionEntryXmlParser.this.filename);
    }

    private CatalogReferenceXmlParser catalogReferenceXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement,
        ParserContext parserContext,
        ControllerDistributionEntryImpl object) {
      CatalogReferenceImpl catalogReference = new CatalogReferenceImpl();
      // Setting the parent
      catalogReference.setParent(object);
      this.catalogReferenceXmlParser.parseElement(indexedElement, parserContext, catalogReference);

      object.setCatalogReference(catalogReference);
      ((CatalogReferenceParserContext) parserContext).addCatalogReference(catalogReference);
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
      return elementName.equals(OscConstants.ELEMENT__CATALOG_REFERENCE);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__CATALOG_REFERENCE};
    }
  }
}
