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
import net.asam.openscenario.common.ErrorLevel;
import net.asam.openscenario.common.FileContentMessage;
import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.common.Textmarker;
import net.asam.openscenario.parser.ParserContext;
import net.asam.openscenario.parser.WrappedListParser;
import net.asam.openscenario.parser.modelgroup.XmlAllParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.v1_0.api.PedestrianCategory;
import net.asam.openscenario.v1_0.api.writer.IParameterDeclarationWriter;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.BoundingBoxImpl;
import net.asam.openscenario.v1_0.impl.ParameterDeclarationImpl;
import net.asam.openscenario.v1_0.impl.PedestrianImpl;
import net.asam.openscenario.v1_0.impl.PropertiesImpl;
import net.asam.xml.indexer.Position;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a PedestrianImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class PedestrianXmlParser extends XmlComplexTypeParser<PedestrianImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public PedestrianXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<PedestrianImpl>> getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<PedestrianImpl>> result = new Hashtable<>();
    result.put(
        OscConstants.ATTRIBUTE__MODEL,
        new IAttributeParser<PedestrianImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              PedestrianImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__MODEL, stripDollarSign(attributeValue), startMarker);
            } else {
              // Parse value
              // Simple type
              object.setModel(parseString(attributeValue, startMarker));
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__MODEL, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__MODEL, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    result.put(
        OscConstants.ATTRIBUTE__MASS,
        new IAttributeParser<PedestrianImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              PedestrianImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__MASS, stripDollarSign(attributeValue), startMarker);
            } else {
              // Parse value
              // Simple type
              object.setMass(parseDouble(attributeValue, startMarker));
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__MASS, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__MASS, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    result.put(
        OscConstants.ATTRIBUTE__NAME,
        new IAttributeParser<PedestrianImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              PedestrianImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
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
    result.put(
        OscConstants.ATTRIBUTE__PEDESTRIAN_CATEGORY,
        new IAttributeParser<PedestrianImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              PedestrianImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    PedestrianXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__PEDESTRIAN_CATEGORY,
                  stripDollarSign(attributeValue),
                  startMarker);
            } else {
              // Parse value
              // Enumeration Type
              PedestrianCategory result = PedestrianCategory.getFromLiteral(attributeValue);
              if (result != null) {
                object.setPedestrianCategory(result);
              } else {
                PedestrianXmlParser.this.messageLogger.logMessage(
                    new FileContentMessage(
                        "Value '" + attributeValue + "' is not allowed.",
                        ErrorLevel.ERROR,
                        startMarker));
              }
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__PEDESTRIAN_CATEGORY, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__PEDESTRIAN_CATEGORY, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlAllParser<PedestrianImpl> {
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
    @SuppressWarnings("synthetic-access")
    protected List<IElementParser<PedestrianImpl>> createParserList() {
      List<IElementParser<PedestrianImpl>> result = new ArrayList<>();
      result.add(
          new WrappedListParser<>(
              this.messageLogger,
              PedestrianXmlParser.this.filename,
              new SubElementParameterDeclarationsParser(),
              OscConstants.ELEMENT__PARAMETER_DECLARATIONS));
      result.add(new SubElementBoundingBoxParser());
      result.add(new SubElementPropertiesParser());
      return result;
    }
  }
  /** A parser for subelement parameterDeclarations */
  @SuppressWarnings("synthetic-access")
  private class SubElementParameterDeclarationsParser implements IElementParser<PedestrianImpl> {

    /** Constructor */
    public SubElementParameterDeclarationsParser() {
      super();
      this.parameterDeclarationXmlParser =
          new ParameterDeclarationXmlParser(
              PedestrianXmlParser.this.messageLogger, PedestrianXmlParser.this.filename);
    }

    private ParameterDeclarationXmlParser parameterDeclarationXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, PedestrianImpl object) {
      ParameterDeclarationImpl parameterDeclarations = new ParameterDeclarationImpl();
      // Setting the parent
      parameterDeclarations.setParent(object);
      this.parameterDeclarationXmlParser.parseElement(
          indexedElement, parserContext, parameterDeclarations);
      List<IParameterDeclarationWriter> parameterDeclarationsList =
          object.getWriterParameterDeclarations();
      if (parameterDeclarationsList == null) {
        parameterDeclarationsList = new ArrayList<>();
        object.setParameterDeclarations(parameterDeclarationsList);
      }
      parameterDeclarationsList.add(parameterDeclarations);
    }

    @Override
    public int getMinOccur() {
      return 0;
    }

    @Override
    public int getMaxOccur() {
      return -1;
    }

    @Override
    public boolean doesMatch(String elementName) {
      return elementName.equals(OscConstants.ELEMENT__PARAMETER_DECLARATION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__PARAMETER_DECLARATION};
    }
  }
  /** A parser for subelement boundingBox */
  @SuppressWarnings("synthetic-access")
  private class SubElementBoundingBoxParser implements IElementParser<PedestrianImpl> {

    /** Constructor */
    public SubElementBoundingBoxParser() {
      super();
      this.boundingBoxXmlParser =
          new BoundingBoxXmlParser(
              PedestrianXmlParser.this.messageLogger, PedestrianXmlParser.this.filename);
    }

    private BoundingBoxXmlParser boundingBoxXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, PedestrianImpl object) {
      BoundingBoxImpl boundingBox = new BoundingBoxImpl();
      // Setting the parent
      boundingBox.setParent(object);
      this.boundingBoxXmlParser.parseElement(indexedElement, parserContext, boundingBox);

      object.setBoundingBox(boundingBox);
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
      return elementName.equals(OscConstants.ELEMENT__BOUNDING_BOX);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__BOUNDING_BOX};
    }
  }
  /** A parser for subelement properties */
  @SuppressWarnings("synthetic-access")
  private class SubElementPropertiesParser implements IElementParser<PedestrianImpl> {

    /** Constructor */
    public SubElementPropertiesParser() {
      super();
      this.propertiesXmlParser =
          new PropertiesXmlParser(
              PedestrianXmlParser.this.messageLogger, PedestrianXmlParser.this.filename);
    }

    private PropertiesXmlParser propertiesXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, PedestrianImpl object) {
      PropertiesImpl properties = new PropertiesImpl();
      // Setting the parent
      properties.setParent(object);
      this.propertiesXmlParser.parseElement(indexedElement, parserContext, properties);

      object.setProperties(properties);
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
      return elementName.equals(OscConstants.ELEMENT__PROPERTIES);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__PROPERTIES};
    }
  }
}
