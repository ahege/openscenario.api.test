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
package net.asam.openscenario.v1_0.impl;

import net.asam.openscenario.v1_0.api.IAction;
import net.asam.openscenario.impl.BaseImpl;
import net.asam.openscenario.common.ILocator;
import net.asam.openscenario.common.IParserMessageLogger;
import net.asam.openscenario.v1_0.common.OscConstants;
import net.asam.openscenario.common.FileContentMessage;
import net.asam.openscenario.api.IOpenScenarioModelElement;
import net.asam.openscenario.api.IOpenScenarioFlexElement;
import net.asam.openscenario.api.KeyNotSupportedException;
import java.util.Date;
import java.lang.Cloneable;
import net.asam.openscenario.parser.ParserHelper;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

import net.asam.openscenario.v1_0.api.IGlobalAction;
import net.asam.openscenario.v1_0.api.IPrivateAction;
import net.asam.openscenario.v1_0.api.IUserDefinedAction;


/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * Value class that implements IAction. With setter methods to fill the properties.
 * <ul>
 * <li> getter methods for properties (implemented methods of IAction)
 * <li> setter methods for properties
 * <li> getChildren method to collect all children
 * <li> clone function to make a deep copy
 * <li> overrides from BaseImpl
 * </ul>
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
public class ActionImpl extends BaseImpl implements IAction, Cloneable{
	
	/**
	 * Filling the property to type map
	 */
	 static{
		propertyToType.put(OscConstants.ATTRIBUTE__NAME, String.class);
	}
	
	private String name;
	private IGlobalAction globalAction;
	private IUserDefinedAction userDefinedAction;
	private IPrivateAction privateAction;
	/**
	 * Default constructor
	 */
	public ActionImpl()
	{
		super();
		addAdapter(ActionImpl.class, this);
		addAdapter(IAction.class, this);
		
	}
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public IGlobalAction getGlobalAction()
	{
		return globalAction;
	}
	@Override
	public IUserDefinedAction getUserDefinedAction()
	{
		return userDefinedAction;
	}
	@Override
	public IPrivateAction getPrivateAction()
	{
		return privateAction;
	}
	/**
	 * Sets the value of model property name
	 * @param name from OpenSCENARIO class model specification: [Name of this action.]
	 * 
	*/
	public  void setName (String name )
	{
		this.name = name;
	}
	/**
	 * Sets the value of model property globalAction
	 * @param globalAction from OpenSCENARIO class model specification: [The GlobalAction to be executed when the enclosing 
	 * Action is startedis started.]
	 * 
	*/
	public  void setGlobalAction (IGlobalAction globalAction )
	{
		this.globalAction = globalAction;
	}
	/**
	 * Sets the value of model property userDefinedAction
	 * @param userDefinedAction from OpenSCENARIO class model specification: [The UserDefinedAction to be executed when the 
	 * enclosing Action is started.]
	 * 
	*/
	public  void setUserDefinedAction (IUserDefinedAction userDefinedAction )
	{
		this.userDefinedAction = userDefinedAction;
	}
	/**
	 * Sets the value of model property privateAction
	 * @param privateAction from OpenSCENARIO class model specification: [The PrivateAction to be executed when the enclosing 
	 * Action is started.]
	 * 
	*/
	public  void setPrivateAction (IPrivateAction privateAction )
	{
		this.privateAction = privateAction;
	}

	@Override
	public  void resolveParameterInternal(IParserMessageLogger logger,String attributeKey, String parameterLiteralValue)
	{
		if (attributeKey.equals(OscConstants.ATTRIBUTE__NAME))
		{
			// Simple type
			name = ParserHelper.parseString(logger,parameterLiteralValue,getTextmarker(attributeKey));
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
		
			IGlobalAction globalAction = null;
			globalAction =  getGlobalAction();
			if (globalAction != null)
			{
				result.add((BaseImpl) globalAction);
			}	
			IUserDefinedAction userDefinedAction = null;
			userDefinedAction =  getUserDefinedAction();
			if (userDefinedAction != null)
			{
				result.add((BaseImpl) userDefinedAction);
			}	
			IPrivateAction privateAction = null;
			privateAction =  getPrivateAction();
			if (privateAction != null)
			{
				result.add((BaseImpl) privateAction);
			}	
		return result;
	}
	
	/**
	 * Making a (deep) clone this object. This is useful and used for importing elements from catalogs.
	 * @return a deep copy of the object.
	 */
	public ActionImpl clone()
	{
		ActionImpl clonedObject = new ActionImpl();
		cloneStartMarker(clonedObject);
		cloneEndMarker(clonedObject);
		cloneAttributeKeyToStartMarker(clonedObject);
		cloneAttributeKeyToEndMarker(clonedObject);
		cloneAttributeKeyToParameterNameMap(clonedObject);
		// clone attributes;
		// Simple type
		clonedObject.setName(getName());		
		// clone children
		IGlobalAction globalAction = null;
		globalAction =  getGlobalAction();
		if (globalAction != null)
		{
			GlobalActionImpl clonedChild = ((GlobalActionImpl) globalAction).clone();
			clonedObject.setGlobalAction(clonedChild);
			clonedChild.setParent(clonedObject);
		}	
		IUserDefinedAction userDefinedAction = null;
		userDefinedAction =  getUserDefinedAction();
		if (userDefinedAction != null)
		{
			UserDefinedActionImpl clonedChild = ((UserDefinedActionImpl) userDefinedAction).clone();
			clonedObject.setUserDefinedAction(clonedChild);
			clonedChild.setParent(clonedObject);
		}	
		IPrivateAction privateAction = null;
		privateAction =  getPrivateAction();
		if (privateAction != null)
		{
			PrivateActionImpl clonedChild = ((PrivateActionImpl) privateAction).clone();
			clonedObject.setPrivateAction(clonedChild);
			clonedChild.setParent(clonedObject);
		}	
		return clonedObject;
	}
  
  // Implement the IOpenScenarioFlexElement interface

  @Override
  public String getStringProperty(String key) throws KeyNotSupportedException
  {
	// proxies and string attributes 
	if (key == null)
	{
		throw new KeyNotSupportedException();
	}
	if (key.equals(OscConstants.ATTRIBUTE__NAME))
	{
		return getName();		
	}else 
	{
		throw new KeyNotSupportedException();
	}
  }
  
  @Override
  public Long getUnsignedIntProperty(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  		
  }  
  
  @Override
  public Integer getIntProperty(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  		
  }
 
  @Override
  public Double getDoubleProperty(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  		
  }
  
  @Override
  public Integer getUnsignedShortProperty(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  	
  }
 
  @Override
  public Boolean getBooleanProperty(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  	
  }
   
  @Override
  public Date getDateTimeProperty(String key) throws KeyNotSupportedException
  {
 	throw new KeyNotSupportedException();

  }
 
  @Override
  public IOpenScenarioFlexElement getChildElement(String key) throws KeyNotSupportedException
  {
	if (key == null)
	{
		throw new KeyNotSupportedException();
	}
	if (key.equals(OscConstants.ELEMENT__GLOBAL_ACTION))
	{
		return (IOpenScenarioFlexElement) getGlobalAction();
	}else 
	if (key.equals(OscConstants.ELEMENT__USER_DEFINED_ACTION))
	{
		return (IOpenScenarioFlexElement) getUserDefinedAction();
	}else 
	if (key.equals(OscConstants.ELEMENT__PRIVATE_ACTION))
	{
		return (IOpenScenarioFlexElement) getPrivateAction();
	}else 
	{
		throw new KeyNotSupportedException();
	}
  }
 
  @Override
  public List<IOpenScenarioFlexElement> getListChildElement(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  }
   
  @Override
  public IOpenScenarioFlexElement getParentFlexElement()
  {
   	return (IOpenScenarioFlexElement) getParent();
  }
  
  @Override
  public IOpenScenarioFlexElement getReferencedElement(String key, String name) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  }
  
  @Override 
  public String getEnumerationLiteral(String key) throws KeyNotSupportedException
  {
	throw new KeyNotSupportedException();
  }
  
  @Override
  public String getModelType()
  {
  	return "Action";
  }
 	
}
