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

import de.rac.openscenario.v1_0.api.ILaneChangeAction;
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

import de.rac.openscenario.v1_0.api.ILaneChangeTarget;
import de.rac.openscenario.v1_0.api.ITransitionDynamics;


/**
 * This is a automatic generated file according to the OpenSCENARIO specification version 1.0
 * <p>
 * Value class that implements ILaneChangeAction. With setter methods to fill the properties.
 * <ul>
 * <li> getter methods for properties (implemented methods of ILaneChangeAction)
 * <li> setter methods for properties
 * <li> getChildren method to collect all children
 * <li> clone function to make a deep copy
 * <li> overrides from BaseImpl
 * </ul>
 * 
 * @author RA Consulting OpenSCENARIO generation facility
*/
public class LaneChangeActionImpl extends BaseImpl implements ILaneChangeAction, Cloneable{
	
	/**
	 * Filling the property to type map
	 */
	 static{
		propertyToType.put(OscConstants.ATTRIBUTE__TARGET_LANE_OFFSET, Double.class);
	}
	
	private Double targetLaneOffset;
	private ITransitionDynamics laneChangeActionDynamics;
	private ILaneChangeTarget laneChangeTarget;

	@Override
	public Double getTargetLaneOffset()
	{
		return targetLaneOffset;
	}
	@Override
	public ITransitionDynamics getLaneChangeActionDynamics()
	{
		return laneChangeActionDynamics;
	}
	@Override
	public ILaneChangeTarget getLaneChangeTarget()
	{
		return laneChangeTarget;
	}
	/**
	 * Sets the value of model property targetLaneOffset
	 * @param targetLaneOffset from OpenSCENARIO class model specification: [Lane offset to be reached at the target lane; the 
	 * action will end there. Unit: m.]
	 * 
	*/
	public  void setTargetLaneOffset (Double targetLaneOffset )
	{
		this.targetLaneOffset = targetLaneOffset;
	}
	/**
	 * Sets the value of model property laneChangeActionDynamics
	 * @param laneChangeActionDynamics from OpenSCENARIO class model specification: [Shape/time of lane change action.]
	 * 
	*/
	public  void setLaneChangeActionDynamics (ITransitionDynamics laneChangeActionDynamics )
	{
		this.laneChangeActionDynamics = laneChangeActionDynamics;
	}
	/**
	 * Sets the value of model property laneChangeTarget
	 * @param laneChangeTarget from OpenSCENARIO class model specification: [Direction of lane change action.]
	 * 
	*/
	public  void setLaneChangeTarget (ILaneChangeTarget laneChangeTarget )
	{
		this.laneChangeTarget = laneChangeTarget;
	}

	@Override
	public  void resolveParameterInternal(IParserMessageLogger logger,String attributeKey, String parameterLiteralValue)
	{
		if (attributeKey.equals(OscConstants.ATTRIBUTE__TARGET_LANE_OFFSET))
		{
			// Simple type
			targetLaneOffset = ParserHelper.parseDouble(logger,parameterLiteralValue,getTextmarker(attributeKey));
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
		
			ITransitionDynamics laneChangeActionDynamics = null;
			laneChangeActionDynamics =  getLaneChangeActionDynamics();
			if (laneChangeActionDynamics != null)
			{
				result.add((BaseImpl) laneChangeActionDynamics);
			}	
			ILaneChangeTarget laneChangeTarget = null;
			laneChangeTarget =  getLaneChangeTarget();
			if (laneChangeTarget != null)
			{
				result.add((BaseImpl) laneChangeTarget);
			}	
		return result;
	}
	
	/**
	 * Making a (deep) clone this object. This is useful and used for importing elements from catalogs.
	 * @return a deep copy of the object.
	 */
	public LaneChangeActionImpl clone()
	{
		LaneChangeActionImpl clonedObject = new LaneChangeActionImpl();
		cloneStartMarker(clonedObject);
		cloneEndMarker(clonedObject);
		cloneAttributeKeyToStartMarker(clonedObject);
		cloneAttributeKeyToEndMarker(clonedObject);
		cloneAttributeKeyToParameterNameMap(clonedObject);
		// clone attributes;
		// Simple type
		clonedObject.setTargetLaneOffset(getTargetLaneOffset());		
		// clone children
		ITransitionDynamics laneChangeActionDynamics = null;
		laneChangeActionDynamics =  getLaneChangeActionDynamics();
		if (laneChangeActionDynamics != null)
		{
			TransitionDynamicsImpl clonedChild = ((TransitionDynamicsImpl) laneChangeActionDynamics).clone();
			clonedObject.setLaneChangeActionDynamics(clonedChild);
			clonedChild.setParent(clonedObject);
		}	
		ILaneChangeTarget laneChangeTarget = null;
		laneChangeTarget =  getLaneChangeTarget();
		if (laneChangeTarget != null)
		{
			LaneChangeTargetImpl clonedChild = ((LaneChangeTargetImpl) laneChangeTarget).clone();
			clonedObject.setLaneChangeTarget(clonedChild);
			clonedChild.setParent(clonedObject);
		}	
		return clonedObject;
	}
	
	
	
}
