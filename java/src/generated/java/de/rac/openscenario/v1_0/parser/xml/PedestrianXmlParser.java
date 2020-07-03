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
 
package de.rac.openscenario.v1_0.parser.xml;

import de.rac.openscenario.v1_0.common.IParserMessageLogger;
import de.rac.openscenario.v1_0.common.OscConstants;
import de.rac.openscenario.v1_0.simple.struct.IndexedElement;
import de.rac.openscenario.v1_0.parser.ParserContext;
import de.rac.openscenario.v1_0.common.FileContentMessage;
import de.rac.xml.indexer.Position;
import de.rac.openscenario.v1_0.common.Textmarker;
import de.rac.openscenario.v1_0.common.ErrorLevel;

import de.rac.openscenario.v1_0.parser.WrappedListParser;
import java.util.List;
import de.rac.openscenario.v1_0.api.PedestrianCategory;
import de.rac.openscenario.v1_0.api.IParameterDeclaration;

import de.rac.openscenario.v1_0.impl.PedestrianImpl;
import de.rac.openscenario.v1_0.impl.ParameterDeclarationImpl;
import de.rac.openscenario.v1_0.impl.BoundingBoxImpl;
import de.rac.openscenario.v1_0.impl.PropertiesImpl;


import de.rac.openscenario.v1_0.parser.modelgroup.XmlAllParser;
import java.util.Map;
import java.util.Hashtable;
import java.util.ArrayList;
import de.rac.openscenario.v1_0.parser.type.XmlComplexTypeParser;


/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * Filling a PedestrianImpl instance from an xml tree.
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
public class PedestrianXmlParser extends XmlComplexTypeParser<PedestrianImpl> {

	/**
	 * Constructor
	 * @param messageLogger to log messages during parsing
	 * @param filename to locate the messages in a file
	 */
	public PedestrianXmlParser(IParserMessageLogger messageLogger, String filename) {
		super(messageLogger, filename);
		subElementParser = new SubElementParser(messageLogger, filename);
	}
	@Override
	public void parseElement(IndexedElement indexedElement, ParserContext parserContext,PedestrianImpl object) {
		messageLogger.logMessage(new FileContentMessage("Start Parsing Pedestrian", ErrorLevel.DEBUG, new Textmarker(indexedElement.getStartElementLocation().getLine(), indexedElement.getStartElementLocation().getColumn(), filename))); 
		super.parseElement(indexedElement,  parserContext, object);
		messageLogger.logMessage(new FileContentMessage("End Parsing Pedestrian", ErrorLevel.DEBUG, new Textmarker(indexedElement.getEndElementLocation().getLine(), indexedElement.getEndElementLocation().getColumn(), filename))); 
	
	}			
	
	@Override
	protected  Map<String, IAttributeParser<PedestrianImpl>> getAttributeNameToAttributeParserMap()
	{
		Map<String, IAttributeParser<PedestrianImpl>> result  = new Hashtable<String, IAttributeParser<PedestrianImpl>>();
		result.put(OscConstants.ATTRIBUTE__MODEL, new IAttributeParser<PedestrianImpl>() {
			@Override
			public void parse(Position startPosition, Position endPosition, String attributeName, String attributeValue, PedestrianImpl object)
			{
				
				Textmarker startMarker = new Textmarker(startPosition.getLine(), startPosition.getColumn(),filename);
				Textmarker endMarker = new Textmarker(endPosition.getLine(), endPosition.getColumn(),filename);
				if (isParametrized(attributeValue))
				{
					object.setAttributeParameter(OscConstants.ATTRIBUTE__MODEL, stripDollarSign(attributeValue), startMarker); 
				}else
				{
					// Parse value
					// Simple type
					object.setModel(parseString(attributeValue,startMarker));
				}
				object.putPropertyStartMarker(OscConstants.ATTRIBUTE__MODEL, startMarker);
				object.putPropertyEndMarker(OscConstants.ATTRIBUTE__MODEL, endMarker);
				
			}
			

			@Override
			public int getMinOccur() {
				return 1;
			}
			
		});
		result.put(OscConstants.ATTRIBUTE__MASS, new IAttributeParser<PedestrianImpl>() {
			@Override
			public void parse(Position startPosition, Position endPosition, String attributeName, String attributeValue, PedestrianImpl object)
			{
				
				Textmarker startMarker = new Textmarker(startPosition.getLine(), startPosition.getColumn(),filename);
				Textmarker endMarker = new Textmarker(endPosition.getLine(), endPosition.getColumn(),filename);
				if (isParametrized(attributeValue))
				{
					object.setAttributeParameter(OscConstants.ATTRIBUTE__MASS, stripDollarSign(attributeValue), startMarker); 
				}else
				{
					// Parse value
					// Simple type
					object.setMass(parseDouble(attributeValue,startMarker));
				}
				object.putPropertyStartMarker(OscConstants.ATTRIBUTE__MASS, startMarker);
				object.putPropertyEndMarker(OscConstants.ATTRIBUTE__MASS, endMarker);
				
			}
			

			@Override
			public int getMinOccur() {
				return 1;
			}
			
		});
		result.put(OscConstants.ATTRIBUTE__NAME, new IAttributeParser<PedestrianImpl>() {
			@Override
			public void parse(Position startPosition, Position endPosition, String attributeName, String attributeValue, PedestrianImpl object)
			{
				
				Textmarker startMarker = new Textmarker(startPosition.getLine(), startPosition.getColumn(),filename);
				Textmarker endMarker = new Textmarker(endPosition.getLine(), endPosition.getColumn(),filename);
				if (isParametrized(attributeValue))
				{
					object.setAttributeParameter(OscConstants.ATTRIBUTE__NAME, stripDollarSign(attributeValue), startMarker); 
				}else
				{
					// Parse value
					// Simple type
					object.setName(parseString(attributeValue,startMarker));
				}
				object.putPropertyStartMarker(OscConstants.ATTRIBUTE__NAME, startMarker);
				object.putPropertyEndMarker(OscConstants.ATTRIBUTE__NAME, endMarker);
				
			}
			

			@Override
			public int getMinOccur() {
				return 1;
			}
			
		});
		result.put(OscConstants.ATTRIBUTE__PEDESTRIAN_CATEGORY, new IAttributeParser<PedestrianImpl>() {
			@Override
			public void parse(Position startPosition, Position endPosition, String attributeName, String attributeValue, PedestrianImpl object)
			{
				
				Textmarker startMarker = new Textmarker(startPosition.getLine(), startPosition.getColumn(),filename);
				Textmarker endMarker = new Textmarker(endPosition.getLine(), endPosition.getColumn(),filename);
				if (isParametrized(attributeValue))
				{
					object.setAttributeParameter(OscConstants.ATTRIBUTE__PEDESTRIAN_CATEGORY, stripDollarSign(attributeValue), startMarker); 
				}else
				{
					// Parse value
					// Enumeration Type
					PedestrianCategory result = PedestrianCategory.getFromLiteral(attributeValue);
					if (result != null)
					{
						object.setPedestrianCategory(result);
					}else
					{
						messageLogger.logMessage(new FileContentMessage( "Value '"+attributeValue+"' is not allowed.",ErrorLevel.ERROR, startMarker));
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

	/**
	 * Parser for all subelements
	 */
	private class SubElementParser extends XmlAllParser<PedestrianImpl>{
		/**
		 * Constructor
		 * @param messageLogger to log messages during parsing
		 * @param filename to locate the messages in a file
		 */
		public SubElementParser (IParserMessageLogger messageLogger, String filename) {
			super(messageLogger,filename);	
		}
		/*
		 * Creates a list of parser
		 */
		protected  List<IElementParser<PedestrianImpl>> createParserList()
		{
			List<IElementParser<PedestrianImpl>> result = new ArrayList<IElementParser<PedestrianImpl>>();
			result.add(new WrappedListParser<PedestrianImpl>(messageLogger,filename,new SubElementParameterDeclarationsParser(), OscConstants.ELEMENT__PARAMETER_DECLARATIONS) );
			result.add(new SubElementBoundingBoxParser());
			result.add(new SubElementPropertiesParser());
			return result;
		
		}	
	}
	/**
	 * A parser for subelement parameterDeclarations
	 */
	private class SubElementParameterDeclarationsParser implements IElementParser<PedestrianImpl> {
	
		/**
		 * Constructor
		 */
		public SubElementParameterDeclarationsParser()
		{
			super();
			parameterDeclarationXmlParser = new ParameterDeclarationXmlParser(messageLogger, filename);
		}
		private ParameterDeclarationXmlParser parameterDeclarationXmlParser;
		
		@Override
		public void parse(IndexedElement indexedElement, ParserContext parserContext,PedestrianImpl object)
		{
			ParameterDeclarationImpl parameterDeclarations = new ParameterDeclarationImpl();
			// Setting the parent
			parameterDeclarations.setParent(object);
			parameterDeclarationXmlParser.parseElement(indexedElement,parserContext, parameterDeclarations);
			List<IParameterDeclaration> parameterDeclarationsList = object.getParameterDeclarations();
			if (parameterDeclarationsList == null)
			{
				parameterDeclarationsList = new ArrayList<IParameterDeclaration>();
				object.setParameterDeclarations( parameterDeclarationsList);
			}
			parameterDeclarationsList.add(parameterDeclarations);
			
		}

		@Override
		public int getMinOccur()
		{
			return 0;
		}
		
		@Override
		public int getMaxOccur()
		{
			return -1;
		}
		
		@Override
		public boolean doesMatch(String elementName)
		{
			return elementName.equals(OscConstants.ELEMENT__PARAMETER_DECLARATION);			
		}
		
		@Override
		public String[] getExpectedTagNames()
		{			return new String[]{OscConstants.ELEMENT__PARAMETER_DECLARATION};
		}
	}
	/**
	 * A parser for subelement boundingBox
	 */
	private class SubElementBoundingBoxParser implements IElementParser<PedestrianImpl> {
	
		/**
		 * Constructor
		 */
		public SubElementBoundingBoxParser()
		{
			super();
			boundingBoxXmlParser = new BoundingBoxXmlParser(messageLogger, filename);
		}
		private BoundingBoxXmlParser boundingBoxXmlParser;
		
		@Override
		public void parse(IndexedElement indexedElement, ParserContext parserContext,PedestrianImpl object)
		{
			BoundingBoxImpl boundingBox = new BoundingBoxImpl();
			// Setting the parent
			boundingBox.setParent(object);
			boundingBoxXmlParser.parseElement(indexedElement,parserContext, boundingBox);

			object.setBoundingBox( boundingBox);
			
		}

		@Override
		public int getMinOccur()
		{
			return 1;
		}
		
		@Override
		public int getMaxOccur()
		{
			return 1;
		}
		
		@Override
		public boolean doesMatch(String elementName)
		{
			return
				elementName.equals(OscConstants.ELEMENT__BOUNDING_BOX) ;
		}
		
		@Override
		public String[] getExpectedTagNames()
		{		 	return new String[]{
				OscConstants.ELEMENT__BOUNDING_BOX
					};
		}
	}
	/**
	 * A parser for subelement properties
	 */
	private class SubElementPropertiesParser implements IElementParser<PedestrianImpl> {
	
		/**
		 * Constructor
		 */
		public SubElementPropertiesParser()
		{
			super();
			propertiesXmlParser = new PropertiesXmlParser(messageLogger, filename);
		}
		private PropertiesXmlParser propertiesXmlParser;
		
		@Override
		public void parse(IndexedElement indexedElement, ParserContext parserContext,PedestrianImpl object)
		{
			PropertiesImpl properties = new PropertiesImpl();
			// Setting the parent
			properties.setParent(object);
			propertiesXmlParser.parseElement(indexedElement,parserContext, properties);

			object.setProperties( properties);
			
		}

		@Override
		public int getMinOccur()
		{
			return 1;
		}
		
		@Override
		public int getMaxOccur()
		{
			return 1;
		}
		
		@Override
		public boolean doesMatch(String elementName)
		{
			return
				elementName.equals(OscConstants.ELEMENT__PROPERTIES) ;
		}
		
		@Override
		public String[] getExpectedTagNames()
		{		 	return new String[]{
				OscConstants.ELEMENT__PROPERTIES
					};
		}
	}
}
