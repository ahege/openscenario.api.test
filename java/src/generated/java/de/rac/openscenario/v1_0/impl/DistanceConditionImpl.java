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
 
package de.rac.openscenario.v1_0.impl;

import de.rac.openscenario.v1_0.api.IDistanceCondition;
import de.rac.openscenario.v1_0.impl.BaseImpl;
import de.rac.openscenario.v1_0.common.ILocator;
import de.rac.openscenario.v1_0.common.IParserMessageLogger;
import de.rac.openscenario.v1_0.common.OscConstants;
import de.rac.openscenario.v1_0.common.FileContentMessage;
import de.rac.openscenario.v1_0.api.IOpenScenarioModelElement;
import java.lang.Cloneable;
import de.rac.openscenario.v1_0.parser.ParserHelper;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import de.rac.openscenario.v1_0.common.ErrorLevel;

import de.rac.openscenario.v1_0.api.IPosition;
import de.rac.openscenario.v1_0.api.Rule;


/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * Value class that implements IDistanceCondition. With setter methods to fill the properties.
 * <ul>
 * <li> getter methods for properties (implemented methods of IDistanceCondition)
 * <li> setter methods for properties
 * <li> getChildren method to collect all children
 * <li> clone function to make a deep copy
 * <li> overrides from BaseImpl
 * </ul>
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
public class DistanceConditionImpl extends BaseImpl implements IDistanceCondition, Cloneable{
	
	/**
	 * Filling the property to type map
	 */
	 static{
		propertyToType.put(OscConstants.ATTRIBUTE__VALUE, Double.class);
		propertyToType.put(OscConstants.ATTRIBUTE__FREESPACE, Boolean.class);
		propertyToType.put(OscConstants.ATTRIBUTE__ALONG_ROUTE, Boolean.class);
		propertyToType.put(OscConstants.ATTRIBUTE__RULE, String.class);
	}
	
	private Double value;
	private Boolean freespace;
	private Boolean alongRoute;
	private Rule rule;
	private IPosition position;

	@Override
	public Double getValue()
	{
		return value;
	}
	@Override
	public Boolean getFreespace()
	{
		return freespace;
	}
	@Override
	public Boolean getAlongRoute()
	{
		return alongRoute;
	}
	@Override
	public Rule getRule()
	{
		return rule;
	}
	@Override
	public IPosition getPosition()
	{
		return position;
	}
	/**
	 * Sets the value of model property value
	 * @param value from OpenSCENARIO class model specification: [The distance value. Unit: s; Range: [0..inf[.]
	 * 
	*/
	public  void setValue (Double value )
	{
		this.value = value;
	}
	/**
	 * Sets the value of model property freespace
	 * @param freespace from OpenSCENARIO class model specification: [True: distance is measured between closest bounding box 
	 * points. False: reference point distance is used.]
	 * 
	*/
	public  void setFreespace (Boolean freespace )
	{
		this.freespace = freespace;
	}
	/**
	 * Sets the value of model property alongRoute
	 * @param alongRoute from OpenSCENARIO class model specification: [True: routing is taken into account, e.g. turns will 
	 * increase distance. False: straight line distance is used.]
	 * 
	*/
	public  void setAlongRoute (Boolean alongRoute )
	{
		this.alongRoute = alongRoute;
	}
	/**
	 * Sets the value of model property rule
	 * @param rule from OpenSCENARIO class model specification: [The operator (less, greater, equal).]
	 * 
	*/
	public  void setRule (Rule rule )
	{
		this.rule = rule;
	}
	/**
	 * Sets the value of model property position
	 * @param position from OpenSCENARIO class model specification: [The given position the distance is related to.]
	 * 
	*/
	public  void setPosition (IPosition position )
	{
		this.position = position;
	}

	@Override
	public  void resolveParameterInternal(IParserMessageLogger logger,String attributeKey, String parameterLiteralValue)
	{
		if (attributeKey.equals(OscConstants.ATTRIBUTE__VALUE))
		{
			// Simple type
			value = ParserHelper.parseDouble(logger,parameterLiteralValue,getTextmarker(attributeKey));
			removeResolvedParameter(attributeKey);
				
	 	}
		else if (attributeKey.equals(OscConstants.ATTRIBUTE__FREESPACE))
		{
			// Simple type
			freespace = ParserHelper.parseBoolean(logger,parameterLiteralValue,getTextmarker(attributeKey));
			removeResolvedParameter(attributeKey);
				
	 	}
		else if (attributeKey.equals(OscConstants.ATTRIBUTE__ALONG_ROUTE))
		{
			// Simple type
			alongRoute = ParserHelper.parseBoolean(logger,parameterLiteralValue,getTextmarker(attributeKey));
			removeResolvedParameter(attributeKey);
				
	 	}
		else if (attributeKey.equals(OscConstants.ATTRIBUTE__RULE))
		{
			// Enumeration Type
			Rule result = Rule.getFromLiteral(parameterLiteralValue);
			if (result != null)
			{
				rule = result;
				removeResolvedParameter(attributeKey);
			}else
			{
				logger.logMessage(new FileContentMessage( "Value '" + parameterLiteralValue + "' is not allowed.",ErrorLevel.ERROR, getTextmarker(attributeKey)));
			}
				
	 	}
	}
	
	@Override
	public  Class<?> getTypeFromAttributeName(String attributeKey)
	{
		return propertyToType.get(attributeKey);
	}

	/**
	 * A list of all aggregated children (lists are flattened). This may be used for applying a specific 
	 * method for any child.
	 * @return a list with all children (as BaseImpl)
	 */
	public List<BaseImpl> getChildren()
	{
		List<BaseImpl> result = new ArrayList<BaseImpl>();
		
			IPosition position = null;
			position =  getPosition();
			if (position != null)
			{
				result.add((BaseImpl) position);
			}	
		return result;
	}
	
	/**
	 * Making a (deep) clone this object. This is useful and used for importing elements from catalogs.
	 * @return a deep copy of the object.
	 */
	public DistanceConditionImpl clone()
	{
		DistanceConditionImpl clonedObject = new DistanceConditionImpl();
		cloneStartMarker(clonedObject);
		cloneEndMarker(clonedObject);
		cloneAttributeKeyToStartMarker(clonedObject);
		cloneAttributeKeyToEndMarker(clonedObject);
		cloneAttributeKeyToParameterNameMap(clonedObject);
		// clone attributes;
		// Simple type
		clonedObject.setValue(getValue());		
		// Simple type
		clonedObject.setFreespace(getFreespace());		
		// Simple type
		clonedObject.setAlongRoute(getAlongRoute());		
		// Enumeration Type
		Rule rule = getRule();
		if (rule != null)
		{
			clonedObject.setRule(Rule.getFromLiteral(rule.getLiteral()));
		}
		// clone children
		IPosition position = null;
		position =  getPosition();
		if (position != null)
		{
			PositionImpl clonedChild = ((PositionImpl) position).clone();
			clonedObject.setPosition(clonedChild);
			clonedChild.setParent(clonedObject);
		}	
		return clonedObject;
	}
	
	
	
}
