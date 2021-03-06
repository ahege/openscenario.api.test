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
import net.asam.openscenario.v1_0.impl.ByEntityConditionImpl;
import net.asam.openscenario.v1_0.impl.EntityConditionImpl;
import net.asam.openscenario.v1_0.impl.TriggeringEntitiesImpl;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ByEntityConditionImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ByEntityConditionXmlParser extends XmlComplexTypeParser<ByEntityConditionImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ByEntityConditionXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ByEntityConditionImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ByEntityConditionImpl>> result = new Hashtable<>();
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlAllParser<ByEntityConditionImpl> {
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
    protected List<IElementParser<ByEntityConditionImpl>> createParserList() {
      List<IElementParser<ByEntityConditionImpl>> result = new ArrayList<>();
      result.add(new SubElementTriggeringEntitiesParser());
      result.add(new SubElementEntityConditionParser());
      return result;
    }
  }
  /** A parser for subelement triggeringEntities */
  @SuppressWarnings("synthetic-access")
  private class SubElementTriggeringEntitiesParser
      implements IElementParser<ByEntityConditionImpl> {

    /** Constructor */
    public SubElementTriggeringEntitiesParser() {
      super();
      this.triggeringEntitiesXmlParser =
          new TriggeringEntitiesXmlParser(
              ByEntityConditionXmlParser.this.messageLogger,
              ByEntityConditionXmlParser.this.filename);
    }

    private TriggeringEntitiesXmlParser triggeringEntitiesXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByEntityConditionImpl object) {
      TriggeringEntitiesImpl triggeringEntities = new TriggeringEntitiesImpl();
      // Setting the parent
      triggeringEntities.setParent(object);
      this.triggeringEntitiesXmlParser.parseElement(
          indexedElement, parserContext, triggeringEntities);

      object.setTriggeringEntities(triggeringEntities);
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
      return elementName.equals(OscConstants.ELEMENT__TRIGGERING_ENTITIES);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__TRIGGERING_ENTITIES};
    }
  }
  /** A parser for subelement entityCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementEntityConditionParser implements IElementParser<ByEntityConditionImpl> {

    /** Constructor */
    public SubElementEntityConditionParser() {
      super();
      this.entityConditionXmlParser =
          new EntityConditionXmlParser(
              ByEntityConditionXmlParser.this.messageLogger,
              ByEntityConditionXmlParser.this.filename);
    }

    private EntityConditionXmlParser entityConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByEntityConditionImpl object) {
      EntityConditionImpl entityCondition = new EntityConditionImpl();
      // Setting the parent
      entityCondition.setParent(object);
      this.entityConditionXmlParser.parseElement(indexedElement, parserContext, entityCondition);

      object.setEntityCondition(entityCondition);
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
      return elementName.equals(OscConstants.ELEMENT__ENTITY_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__ENTITY_CONDITION};
    }
  }
}
