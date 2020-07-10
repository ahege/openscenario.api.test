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

import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.simple.struct.IndexedElement;
import net.asam.openscenario.parser.ParserContext;
import net.asam.openscenario.v1_0.parser.CatalogReferenceParserContext;
import net.asam.openscenario.common.FileContentMessage;
import net.asam.xml.indexer.Position;
import net.asam.openscenario.common.Textmarker;
import net.asam.openscenario.common.ErrorLevel;
import java.util.List;
import net.asam.openscenario.v1_0.api.IControllerDistributionEntry;

import net.asam.openscenario.v1_0.impl.ControllerDistributionImpl;
import net.asam.openscenario.v1_0.impl.ControllerDistributionEntryImpl;


import net.asam.openscenario.parser.modelgroup.XmlSequenceParser;
import java.util.Map;
import java.util.Hashtable;
import java.util.ArrayList;
import net.asam.openscenario.parser.type.XmlComplexTypeParser;


/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a ControllerDistributionImpl instance from an xml tree.
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
public class ControllerDistributionXmlParser extends XmlComplexTypeParser<ControllerDistributionImpl> {

	/**
	 * Constructor
	 * @param messageLogger to log messages during parsing
	 * @param filename to locate the messages in a file
	 */
	public ControllerDistributionXmlParser(IParserMessageLogger messageLogger, String filename) {
		super(messageLogger, filename);
		subElementParser = new SubElementParser(messageLogger, filename);
	}
	@Override
	public void parseElement(IndexedElement indexedElement, ParserContext parserContext,ControllerDistributionImpl object) {
		messageLogger.logMessage(new FileContentMessage("Start Parsing ControllerDistribution", ErrorLevel.DEBUG, new Textmarker(indexedElement.getStartElementLocation().getLine(), indexedElement.getStartElementLocation().getColumn(), filename))); 
		super.parseElement(indexedElement,  parserContext, object);
		messageLogger.logMessage(new FileContentMessage("End Parsing ControllerDistribution", ErrorLevel.DEBUG, new Textmarker(indexedElement.getEndElementLocation().getLine(), indexedElement.getEndElementLocation().getColumn(), filename))); 
	
	}			
	
	@Override
	protected  Map<String, IAttributeParser<ControllerDistributionImpl>> getAttributeNameToAttributeParserMap()
	{
		Map<String, IAttributeParser<ControllerDistributionImpl>> result  = new Hashtable<String, IAttributeParser<ControllerDistributionImpl>>();
		return result;
	}

	/**
	 * Parser for all subelements
	 */
	private class SubElementParser extends XmlSequenceParser<ControllerDistributionImpl>{
		/**
		 * Constructor
		 * @param messageLogger to log messages during parsing
		 * @param filename to locate the messages in a file
		 */
		public SubElementParser (IParserMessageLogger messageLogger, String filename) {
			super( messageLogger, filename);	
		}
		/*
		 * Creates a list of parser
		 */
		protected  List<IElementParser<ControllerDistributionImpl>> createParserList()
		{
			List<IElementParser<ControllerDistributionImpl>> result = new ArrayList<IElementParser<ControllerDistributionImpl>>();
			result.add(new SubElementControllerDistributionEntriesParser());
			return result;
		
		}	
	}
	/**
	 * A parser for subelement controllerDistributionEntries
	 */
	private class SubElementControllerDistributionEntriesParser implements IElementParser<ControllerDistributionImpl> {
	
		/**
		 * Constructor
		 */
		public SubElementControllerDistributionEntriesParser()
		{
			super();
			controllerDistributionEntryXmlParser = new ControllerDistributionEntryXmlParser(messageLogger, filename);
		}
		private ControllerDistributionEntryXmlParser controllerDistributionEntryXmlParser;
		
		@Override
		public void parse(IndexedElement indexedElement, ParserContext parserContext,ControllerDistributionImpl object)
		{
			ControllerDistributionEntryImpl controllerDistributionEntries = new ControllerDistributionEntryImpl();
			// Setting the parent
			controllerDistributionEntries.setParent(object);
			controllerDistributionEntryXmlParser.parseElement(indexedElement,parserContext, controllerDistributionEntries);
			List<IControllerDistributionEntry> controllerDistributionEntriesList = object.getControllerDistributionEntries();
			if (controllerDistributionEntriesList == null)
			{
				controllerDistributionEntriesList = new ArrayList<IControllerDistributionEntry>();
				object.setControllerDistributionEntries( controllerDistributionEntriesList);
			}
			controllerDistributionEntriesList.add(controllerDistributionEntries);
			
		}

		@Override
		public int getMinOccur()
		{
			return 1;
		}
		
		@Override
		public int getMaxOccur()
		{
			return -1;
		}
		
		@Override
		public boolean doesMatch(String elementName)
		{
			return
				elementName.equals(OscConstants.ELEMENT__CONTROLLER_DISTRIBUTION_ENTRY) ;
		}
		
		@Override
		public String[] getExpectedTagNames()
		{		 	return new String[]{
				OscConstants.ELEMENT__CONTROLLER_DISTRIBUTION_ENTRY
					};
		}
	}
}
