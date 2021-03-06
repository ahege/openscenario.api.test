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

package net.asam.openscenario.parser;

import java.util.Date;
import java.util.List;

import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.common.Textmarker;
import net.asam.openscenario.impl.BaseImpl;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.xml.indexer.Position;

/**
 * Base class for all parsers
 *
 * @author Andreas Hege - RA Consulting
 * @param <T> OpenSCENARIO model element type
 */
public abstract class XmlParserBase<T extends BaseImpl> {

  protected IParserMessageLogger messageLogger;
  protected String filename;
  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing process
   * @param filename of the file the parser is operationg on.
   */
  public XmlParserBase(IParserMessageLogger messageLogger, String filename) {
    super();
    this.messageLogger = messageLogger;
    this.filename = filename;
  }

  /**
   * Access for e.g. private subclasses
   *
   * @return the messageLogger
   */
  protected IParserMessageLogger getMessageLogger() {
    return this.messageLogger;
  }

  /**
   * Access for e.g. private subclasses
   *
   * @return the filename
   */
  public String getFilename() {
    return this.filename;
  }

  /**
   * Parser method for sub elements.
   *
   * @param parentElements list of parent elements (important for XSD groups)
   * @param parserContext a parser context to store dynamic information in.
   * @param object model object to be filled by the parsing process
   */
  public abstract void parseSubElements(
      List<IndexedElement> parentElements, ParserContext parserContext, T object);

  /**
   * Parsing a string value
   *
   * @param xmlValue string representation of the value from xml file
   * @param xmlTextMarkerFactory factory for a text marker
   * @return parsed value
   */
  protected static String parseString(
      String xmlValue, @SuppressWarnings("unused") Textmarker xmlTextMarkerFactory) {
    return xmlValue;
  }

  /**
   * Parsing a unsigned int value
   *
   * @param xmlValue string representation of the value from xml file
   * @param textMarker text marker
   * @return parsed value
   */
  protected Long parseUnsignedInt(String xmlValue, Textmarker textMarker) {

    return ParserHelper.parseUnsignedInt(this.messageLogger, xmlValue, textMarker);
  }

  /**
   * Parsing a int value
   *
   * @param xmlValue string representation of the value from xml file
   * @param textMarker text marker
   * @return parsed value
   */
  protected Integer parseInt(String xmlValue, Textmarker textMarker) {

    return ParserHelper.parseInt(this.messageLogger, xmlValue, textMarker);
  }

  /**
   * Parsing a double value
   *
   * @param xmlValue string representation of the value from xml file
   * @param textMarker text marker
   * @return parsed value
   */
  protected Double parseDouble(String xmlValue, Textmarker textMarker) {
    return ParserHelper.parseDouble(this.messageLogger, xmlValue, textMarker);
  }

  /**
   * Parsing a unsigned short value
   *
   * @param xmlValue string representation of the value from xml file
   * @param textMarker text marker
   * @return parsed value
   */
  protected Integer parseUnsignedShort(String xmlValue, Textmarker textMarker) {

    return ParserHelper.parseUnsignedShort(this.messageLogger, xmlValue, textMarker);
  }

  /**
   * Parsing a boolean value
   *
   * @param xmlValue string representation of the value from xml file
   * @param textMarker text marker
   * @return parsed value
   */
  protected Boolean parseBoolean(String xmlValue, Textmarker textMarker) {

    return ParserHelper.parseBoolean(this.messageLogger, xmlValue, textMarker);
  }

  /**
   * Parsing a date value
   *
   * @param xmlValue string representation of the value from xml file
   * @param textMarker text marker
   * @return parsed value
   */
  protected Date parseDateTime(String xmlValue, Textmarker textMarker) {
    return ParserHelper.parseDateTime(this.messageLogger, xmlValue, textMarker);
  }

  /**
   * A parer for a indexed element
   *
   * @param <T> OpenSCENARIO model element type
   */
  public interface IElementParser<T> {
    /**
     * parsing the element
     *
     * @param indexedElement the element to be parsed
     * @param parserContext a parser context to store dynamic information in.
     * @param object the model object to be filled during the parsing process
     */
    public void parse(IndexedElement indexedElement, ParserContext parserContext, T object);

    /**
     * The defined min accur of the element
     *
     * @return the defined min occur value
     */
    public int getMinOccur();

    /**
     * The defined max occur of the element (-1 mean infinity)
     *
     * @return the defined max occur value
     */
    public int getMaxOccur();

    /**
     * Does the parser matsches a specific element name.
     *
     * @param elementName the requested element name
     * @return true if the parser is able to parse an element with this specific element name.
     */
    public boolean doesMatch(String elementName);

    /**
     * A list with the element names (tag names) this parser would accept Mainly for creating error
     * messages
     *
     * @return the list with element names
     */
    public String[] getExpectedTagNames();
  }

  /**
   * Interface for parsing attributes
   *
   * @param <T> OpenSCENARIO model element type
   */
  public interface IAttributeParser<T> {
    /**
     * parse an attribute
     *
     * @param startPosition of the textual representation of the attribute
     * @param endPosition of the textual representation of the attribute
     * @param attributeName name of the attribute
     * @param attributeValue value of the attribute
     * @param object the model object to be filled during the parsing process
     */
    public void parse(
        Position startPosition,
        Position endPosition,
        String attributeName,
        String attributeValue,
        T object);

    /**
     * The defined min accur of the element 0 for optional 1 for required
     *
     * @return the defined min occur value (0 or 1)
     */
    public int getMinOccur();
  }
}
