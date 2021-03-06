/*******************************************************************************
 * Copyright (c) 2014, 2017 Frank Becker and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Frank Becker - initial API and implementation
 *     Red Hat Inc. - modified for use in OSIO Rest Connector
 *******************************************************************************/

package org.eclipse.linuxtools.internal.mylyn.osio.rest.core.response.data;

public class LabelListResponse implements RestResponse<Label> {
	private Label[] data;
	
	private PagingLinks links;
	
	private SpaceListMeta meta;
	
	// for testing purposes only
	public LabelListResponse (Label[] data, PagingLinks links, SpaceListMeta meta) {
		this.data = data;
		this.links = links;
		this.meta = meta;
	}

	@Override
	public Label[] getArray() {
		return data;
	}
	
	public PagingLinks getLinks() {
		return links;
	}
	
	public SpaceListMeta getMeta() {
		return meta;
	}
}
