package org.eclipse.linuxtools.valgrind.core;

public final class PluginConstants {
	// IDs for important plugins
	public static final String CORE_PLUGIN_ID = "org.eclipse.linuxtools.valgrind.core"; //$NON-NLS-1$
	public static final String LAUNCH_PLUGIN_ID = "org.eclipse.linuxtools.valgrind.launch"; //$NON-NLS-1$
	public static final String UI_PLUGIN_ID = "org.eclipse.linuxtools.valgrind.ui"; //$NON-NLS-1$
	
	// Extension point constants
	public static final String TOOL_EXT_ID = "valgrindTools"; //$NON-NLS-1$
	public static final String TOOL_EXT_DEFAULT = LAUNCH_PLUGIN_ID + ".memcheck"; //$NON-NLS-1$
	public static final String VIEW_EXT_ID = "valgrindToolViews"; //$NON-NLS-1$
	public static final String OUTPUT_DIR_EXT_ID = "outputDirectoryProviders"; //$NON-NLS-1$
}
