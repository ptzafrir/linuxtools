/*******************************************************************************
 * Copyright (c) 2015 Red Hat.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat - Initial Contribution
 *******************************************************************************/
package org.eclipse.linuxtools.internal.docker.ui.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.linuxtools.docker.core.DockerConnectionManager;
import org.eclipse.linuxtools.docker.core.DockerException;
import org.eclipse.linuxtools.internal.docker.ui.commands.CommandUtils;
import org.eclipse.linuxtools.internal.docker.ui.wizards.ImageRunNetworkModel;
import org.eclipse.linuxtools.internal.docker.ui.wizards.ImageRunResourceVolumesVariablesModel;
import org.eclipse.linuxtools.internal.docker.ui.wizards.ImageRunSelectionModel;

public class RunImageLaunchConfigurationTabGroup
		extends AbstractLaunchConfigurationTabGroup {

	private ImageRunSelectionModel runSelectionModel;
	private ImageRunResourceVolumesVariablesModel runVolumesModel;
	private ImageRunNetworkModel runNetworkModel;

	public RunImageLaunchConfigurationTabGroup() {
	}

	public ImageRunSelectionModel getRunSelectionModel() {
		return runSelectionModel;
	}

	public ImageRunResourceVolumesVariablesModel getRunVolumesModel() {
		return runVolumesModel;
	}

	public ImageRunNetworkModel getRunNetworkModel() {
		return runNetworkModel;
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		runSelectionModel = null;
		runVolumesModel = null;
		runNetworkModel = null;
		if (DockerConnectionManager.getInstance().hasConnections()) {
			runSelectionModel = new ImageRunSelectionModel(
					CommandUtils.getCurrentConnection(null));
			runNetworkModel = new ImageRunNetworkModel(
					CommandUtils.getCurrentConnection(null));
			try {
				runVolumesModel = new ImageRunResourceVolumesVariablesModel(
						CommandUtils.getCurrentConnection(null));
			} catch (DockerException e) {
				// do nothing
			}
		}
		setTabs(new AbstractLaunchConfigurationTab[] {
				new RunImageMainTab(runSelectionModel, runVolumesModel,
						runNetworkModel),
				new RunImageVolumesTab(runVolumesModel),
				new RunImagePortsTab(runSelectionModel),
				new RunImageLinksTab(runSelectionModel),
				new RunImageNetworkTab(runNetworkModel),
				new RunImageEnvironmentTab(runVolumesModel),
				new RunImageLabelsTab(runVolumesModel),
				new RunImageResourcesTab(runVolumesModel),
				new org.eclipse.debug.ui.CommonTab() });
	}

}
