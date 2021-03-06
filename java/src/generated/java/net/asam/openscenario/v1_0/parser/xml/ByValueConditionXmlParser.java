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
import net.asam.openscenario.parser.modelgroup.XmlChoiceParser;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.v1_0.impl.ByValueConditionImpl;
import net.asam.openscenario.v1_0.impl.ParameterConditionImpl;
import net.asam.openscenario.v1_0.impl.SimulationTimeConditionImpl;
import net.asam.openscenario.v1_0.impl.StoryboardElementStateConditionImpl;
import net.asam.openscenario.v1_0.impl.TimeOfDayConditionImpl;
import net.asam.openscenario.v1_0.impl.TrafficSignalConditionImpl;
import net.asam.openscenario.v1_0.impl.TrafficSignalControllerConditionImpl;
import net.asam.openscenario.v1_0.impl.UserDefinedValueConditionImpl;

/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ByValueConditionImpl instance from an xml tree.
 *
 * @author RA Consulting OpenSCENARIO generation facility
 */
public class ByValueConditionXmlParser extends XmlComplexTypeParser<ByValueConditionImpl> {

  /**
   * Constructor
   *
   * @param messageLogger to log messages during parsing
   * @param filename to locate the messages in a file
   */
  public ByValueConditionXmlParser(IParserMessageLogger messageLogger, String filename) {
    super(messageLogger, filename);
    this.subElementParser = new SubElementParser(messageLogger, filename);
  }

  @Override
  protected Map<String, IAttributeParser<ByValueConditionImpl>>
      getAttributeNameToAttributeParserMap() {
    Map<String, IAttributeParser<ByValueConditionImpl>> result = new Hashtable<>();
    return result;
  }

  /** Parser for all subelements */
  private class SubElementParser extends XmlChoiceParser<ByValueConditionImpl> {
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
    protected List<IElementParser<ByValueConditionImpl>> createParserList() {
      List<IElementParser<ByValueConditionImpl>> result = new ArrayList<>();
      result.add(new SubElementParameterConditionParser());
      result.add(new SubElementTimeOfDayConditionParser());
      result.add(new SubElementSimulationTimeConditionParser());
      result.add(new SubElementStoryboardElementStateConditionParser());
      result.add(new SubElementUserDefinedValueConditionParser());
      result.add(new SubElementTrafficSignalConditionParser());
      result.add(new SubElementTrafficSignalControllerConditionParser());
      return result;
    }
  }
  /** A parser for subelement parameterCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementParameterConditionParser implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementParameterConditionParser() {
      super();
      this.parameterConditionXmlParser =
          new ParameterConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private ParameterConditionXmlParser parameterConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      ParameterConditionImpl parameterCondition = new ParameterConditionImpl();
      // Setting the parent
      parameterCondition.setParent(object);
      this.parameterConditionXmlParser.parseElement(
          indexedElement, parserContext, parameterCondition);

      object.setParameterCondition(parameterCondition);
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
      return elementName.equals(OscConstants.ELEMENT__PARAMETER_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__PARAMETER_CONDITION};
    }
  }
  /** A parser for subelement timeOfDayCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementTimeOfDayConditionParser implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementTimeOfDayConditionParser() {
      super();
      this.timeOfDayConditionXmlParser =
          new TimeOfDayConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private TimeOfDayConditionXmlParser timeOfDayConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      TimeOfDayConditionImpl timeOfDayCondition = new TimeOfDayConditionImpl();
      // Setting the parent
      timeOfDayCondition.setParent(object);
      this.timeOfDayConditionXmlParser.parseElement(
          indexedElement, parserContext, timeOfDayCondition);

      object.setTimeOfDayCondition(timeOfDayCondition);
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
      return elementName.equals(OscConstants.ELEMENT__TIME_OF_DAY_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__TIME_OF_DAY_CONDITION};
    }
  }
  /** A parser for subelement simulationTimeCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementSimulationTimeConditionParser
      implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementSimulationTimeConditionParser() {
      super();
      this.simulationTimeConditionXmlParser =
          new SimulationTimeConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private SimulationTimeConditionXmlParser simulationTimeConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      SimulationTimeConditionImpl simulationTimeCondition = new SimulationTimeConditionImpl();
      // Setting the parent
      simulationTimeCondition.setParent(object);
      this.simulationTimeConditionXmlParser.parseElement(
          indexedElement, parserContext, simulationTimeCondition);

      object.setSimulationTimeCondition(simulationTimeCondition);
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
      return elementName.equals(OscConstants.ELEMENT__SIMULATION_TIME_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__SIMULATION_TIME_CONDITION};
    }
  }
  /** A parser for subelement storyboardElementStateCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementStoryboardElementStateConditionParser
      implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementStoryboardElementStateConditionParser() {
      super();
      this.storyboardElementStateConditionXmlParser =
          new StoryboardElementStateConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private StoryboardElementStateConditionXmlParser storyboardElementStateConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      StoryboardElementStateConditionImpl storyboardElementStateCondition =
          new StoryboardElementStateConditionImpl();
      // Setting the parent
      storyboardElementStateCondition.setParent(object);
      this.storyboardElementStateConditionXmlParser.parseElement(
          indexedElement, parserContext, storyboardElementStateCondition);

      object.setStoryboardElementStateCondition(storyboardElementStateCondition);
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
      return elementName.equals(OscConstants.ELEMENT__STORYBOARD_ELEMENT_STATE_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__STORYBOARD_ELEMENT_STATE_CONDITION};
    }
  }
  /** A parser for subelement userDefinedValueCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementUserDefinedValueConditionParser
      implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementUserDefinedValueConditionParser() {
      super();
      this.userDefinedValueConditionXmlParser =
          new UserDefinedValueConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private UserDefinedValueConditionXmlParser userDefinedValueConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      UserDefinedValueConditionImpl userDefinedValueCondition = new UserDefinedValueConditionImpl();
      // Setting the parent
      userDefinedValueCondition.setParent(object);
      this.userDefinedValueConditionXmlParser.parseElement(
          indexedElement, parserContext, userDefinedValueCondition);

      object.setUserDefinedValueCondition(userDefinedValueCondition);
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
      return elementName.equals(OscConstants.ELEMENT__USER_DEFINED_VALUE_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__USER_DEFINED_VALUE_CONDITION};
    }
  }
  /** A parser for subelement trafficSignalCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementTrafficSignalConditionParser
      implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementTrafficSignalConditionParser() {
      super();
      this.trafficSignalConditionXmlParser =
          new TrafficSignalConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private TrafficSignalConditionXmlParser trafficSignalConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      TrafficSignalConditionImpl trafficSignalCondition = new TrafficSignalConditionImpl();
      // Setting the parent
      trafficSignalCondition.setParent(object);
      this.trafficSignalConditionXmlParser.parseElement(
          indexedElement, parserContext, trafficSignalCondition);

      object.setTrafficSignalCondition(trafficSignalCondition);
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
      return elementName.equals(OscConstants.ELEMENT__TRAFFIC_SIGNAL_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__TRAFFIC_SIGNAL_CONDITION};
    }
  }
  /** A parser for subelement trafficSignalControllerCondition */
  @SuppressWarnings("synthetic-access")
  private class SubElementTrafficSignalControllerConditionParser
      implements IElementParser<ByValueConditionImpl> {

    /** Constructor */
    public SubElementTrafficSignalControllerConditionParser() {
      super();
      this.trafficSignalControllerConditionXmlParser =
          new TrafficSignalControllerConditionXmlParser(
              ByValueConditionXmlParser.this.messageLogger,
              ByValueConditionXmlParser.this.filename);
    }

    private TrafficSignalControllerConditionXmlParser trafficSignalControllerConditionXmlParser;

    @Override
    public void parse(
        IndexedElement indexedElement, ParserContext parserContext, ByValueConditionImpl object) {
      TrafficSignalControllerConditionImpl trafficSignalControllerCondition =
          new TrafficSignalControllerConditionImpl();
      // Setting the parent
      trafficSignalControllerCondition.setParent(object);
      this.trafficSignalControllerConditionXmlParser.parseElement(
          indexedElement, parserContext, trafficSignalControllerCondition);

      object.setTrafficSignalControllerCondition(trafficSignalControllerCondition);
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
      return elementName.equals(OscConstants.ELEMENT__TRAFFIC_SIGNAL_CONTROLLER_CONDITION);
    }

    @Override
    public String[] getExpectedTagNames() {
      return new String[] {OscConstants.ELEMENT__TRAFFIC_SIGNAL_CONTROLLER_CONDITION};
    }
  }
}
