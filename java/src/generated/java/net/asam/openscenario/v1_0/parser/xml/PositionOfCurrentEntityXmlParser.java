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
import net.asam.openscenario.parser.modelgroup.XmlSequenceParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.v1_0.api.IEntity;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.PositionOfCurrentEntityImpl;
import net.asam.xml.indexer.Position;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a PositionOfCurrentEntityImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class PositionOfCurrentEntityXmlParser
    extends XmlComplexTypeParser<PositionOfCurrentEntityImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public PositionOfCurrentEntityXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<PositionOfCurrentEntityImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<PositionOfCurrentEntityImpl>> result = new Hashtable<>();
    result.put(
        OscConstants.ATTRIBUTE__ENTITY_REF,
        new IAttributeParser<PositionOfCurrentEntityImpl>() {
          @SuppressWarnings("synthetic-access")
          @Override
          public void parse(
              Position startPosition,
              Position endPosition,
              String attributeName,
              String attributeValue,
              PositionOfCurrentEntityImpl object) {

            Textmarker startMarker =
                new Textmarker(
                    startPosition.getLine(),
                    startPosition.getColumn(),
                    PositionOfCurrentEntityXmlParser.this.filename);
            Textmarker endMarker =
                new Textmarker(
                    endPosition.getLine(),
                    endPosition.getColumn(),
                    PositionOfCurrentEntityXmlParser.this.filename);
            if (isParametrized(attributeValue)) {
              object.setAttributeParameter(
                  OscConstants.ATTRIBUTE__ENTITY_REF, stripDollarSign(attributeValue), startMarker);
            } else {
              // Parse value
              // Proxy
              NamedReferenceProxy<IEntity> proxy = new NamedReferenceProxy<>(attributeValue);
              proxy.setParent(object);
              object.setEntityRef(proxy);
            }
            object.putPropertyStartMarker(OscConstants.ATTRIBUTE__ENTITY_REF, startMarker);
            object.putPropertyEndMarker(OscConstants.ATTRIBUTE__ENTITY_REF, endMarker);
          }

          @Override
          public int getMinOccur() {
            return 1;
          }
        });
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlSequenceParser<PositionOfCurrentEntityImpl> {
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
    protected List<IElementParser<PositionOfCurrentEntityImpl>> createParserList() {
      List<IElementParser<PositionOfCurrentEntityImpl>> result = new ArrayList<>();
      return result;
    }
  }
}
