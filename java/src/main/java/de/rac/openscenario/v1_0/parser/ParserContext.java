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
 
package de.rac.openscenario.v1_0.parser;

import java.util.ArrayList;
import java.util.List;

import de.rac.openscenario.v1_0.api.ICatalogReference;
import de.rac.openscenario.v1_0.catalog.ICatalogReferenceProvider;
import de.rac.openscenario.v1_0.simple.struct.IndexedElement;

/**
 * A Parser Context that allows a parser to store dynamic information durign the parsing process.
 * A paser context is handed through the hirarchical parser concept and is especially used for parsing
 * XSD groups.
 * 
 * @author Andreas Hege - RA Consulting
 *
 */
public class ParserContext implements ICatalogReferenceProvider{
	private IndexedElement lastElementParsed;
	private List<ICatalogReference> catalogReferences = new ArrayList<ICatalogReference>();
	
	/**
	 * The last element that has been parsed
	 * @return the lasz indexed element that has been parsed
	 */
	public IndexedElement getLastElementParsed() {
		return lastElementParsed;
	}
	
	/**
	 * Sets the last element that has been parsed
	 * @param lastElementParsed the last element that has been parsed
	 */
	public void setLastElementParsed(IndexedElement lastElementParsed) {
		this.lastElementParsed = lastElementParsed;
	}
	/**
	 * Adds a found catalog reference. At the end of the parsing process any 
	 * catalog reference is in the list as a preparation for the next step to resolve the
	 * catalog references.
	 * @param catalogReference a catalog reference to be added.
	 */
	public void addCatalogReference(ICatalogReference catalogReference)
	{
		catalogReferences.add(catalogReference);
	}
	
	@Override
	public List<ICatalogReference> getCatalogReferences() {
		return catalogReferences;
	}

}