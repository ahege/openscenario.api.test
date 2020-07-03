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

import de.rac.openscenario.v1_0.api.IParameterAssignment;
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
import de.rac.openscenario.v1_0.impl.NamedReferenceProxy;
import de.rac.openscenario.v1_0.common.INamedReference;
import de.rac.openscenario.v1_0.api.IParameterDeclaration;


/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * Value class that implements IParameterAssignment. With setter methods to fill the properties.
 * <ul>
 * <li> getter methods for properties (implemented methods of IParameterAssignment)
 * <li> setter methods for properties
 * <li> getChildren method to collect all children
 * <li> clone function to make a deep copy
 * <li> overrides from BaseImpl
 * </ul>
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
public class ParameterAssignmentImpl extends BaseImpl implements IParameterAssignment, Cloneable{
	
	/**
	 * Filling the property to type map
	 */
	 static{
		propertyToType.put(OscConstants.ATTRIBUTE__PARAMETER_REF, String.class);
		propertyToType.put(OscConstants.ATTRIBUTE__VALUE, String.class);
	}
	
	private NamedReferenceProxy<IParameterDeclaration> parameterRef;
	private String value;

	@Override
	public INamedReference<IParameterDeclaration> getParameterRef()
	{
		return parameterRef;
	}
	@Override
	public String getValue()
	{
		return value;
	}
	/**
	 * Sets the value of model property parameterRef
	 * @param parameterRef from OpenSCENARIO class model specification: [Name of the parameter that must be declared in the 
	 * catalog.]
	 * 
	*/
	public  void setParameterRef (NamedReferenceProxy<IParameterDeclaration> parameterRef )
	{
		this.parameterRef = parameterRef;
	}
	/**
	 * Sets the value of model property value
	 * @param value from OpenSCENARIO class model specification: [Value of the parameter that is handed over to the 
	 * parametrizable type.]
	 * 
	*/
	public  void setValue (String value )
	{
		this.value = value;
	}

	@Override
	public  void resolveParameterInternal(IParserMessageLogger logger,String attributeKey, String parameterLiteralValue)
	{
		if (attributeKey.equals(OscConstants.ATTRIBUTE__VALUE))
		{
			// Simple type
			value = ParserHelper.parseString(logger,parameterLiteralValue,getTextmarker(attributeKey));
			removeResolvedParameter(attributeKey);
				
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
		
		return result;
	}
	
	/**
	 * Making a (deep) clone this object. This is useful and used for importing elements from catalogs.
	 * @return a deep copy of the object.
	 */
	public ParameterAssignmentImpl clone()
	{
		ParameterAssignmentImpl clonedObject = new ParameterAssignmentImpl();
		cloneStartMarker(clonedObject);
		cloneEndMarker(clonedObject);
		cloneAttributeKeyToStartMarker(clonedObject);
		cloneAttributeKeyToEndMarker(clonedObject);
		cloneAttributeKeyToParameterNameMap(clonedObject);
		// clone attributes;
		// Proxy
		NamedReferenceProxy<IParameterDeclaration> proxy = ((NamedReferenceProxy<IParameterDeclaration>)getParameterRef()).clone();
		clonedObject.setParameterRef(proxy);
		proxy.setParent(clonedObject);
		// Simple type
		clonedObject.setValue(getValue());		
		// clone children
		return clonedObject;
	}
	
	
	
}
