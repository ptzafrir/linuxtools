/*******************************************************************************
 * Copyright (c) 2017 Red Hat.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat - Initial Contribution
 *******************************************************************************/
package org.eclipse.linuxtools.internal.mylyn.osio.rest.core.response.data;

public class User implements IdNamed {
	
	private String type;
	
	private String id;
	
	private UserAttributes attributes;
	
	private GenericLinks links;
	
	// for testing purposes only
	public User (String id, String type, UserAttributes attributes, GenericLinks links) {
		this.id = id;
		this.type = type;
		this.attributes = attributes;
		this.links = links;
	}
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return attributes.getUsername();
	}
	
	public UserAttributes getAttributes() {
		return attributes;
	}
	
	public GenericLinks getLinks() {
		return links;
	}
	
}
