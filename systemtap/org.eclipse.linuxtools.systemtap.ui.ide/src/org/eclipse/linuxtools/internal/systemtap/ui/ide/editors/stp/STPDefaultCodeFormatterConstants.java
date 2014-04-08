/*******************************************************************************
 * Copyright (c) 2000, 2011, 2013 QNX Software Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     QNX Software Systems - Initial API and implementation
 *     Sergey Prigogin (Google)
 *     Anton Leherbauer (Wind River Systems)
 *     Red Hat Inc. - modified for use in SystemTap
 *******************************************************************************/
package org.eclipse.linuxtools.internal.systemtap.ui.ide.editors.stp;

import org.eclipse.linuxtools.internal.systemtap.ui.ide.IDEPlugin;


/**
 * Constants used to set up the options of the code formatter.
 *
 * @since 4.0
 * @noextend This class is not intended to be subclassed by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public class STPDefaultCodeFormatterConstants {

	/**
	 * <pre>
	 * FORMATTER / Option for the language
	 *     - option id:         "org.eclipse.cdt.core.formatter.language"
	 *     - possible values:   object of class <code>ILanguage</code> or <code>null</code>
	 *     - default:           null
	 * </pre>
	 */
	public static final String FORMATTER_LANGUAGE = IDEPlugin.PLUGIN_ID + ".formatter.language";	 //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option for the current file
	 *     - option id:         "org.eclipse.cdt.core.formatter.current_file"
	 *     - possible values:   object of class <code>IFile</code> or <code>null</code>
	 *     - default:           null
	 * </pre>
	 */
	public static final String FORMATTER_CURRENT_FILE = IDEPlugin.PLUGIN_ID + ".formatter.current_file";	 //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option for the translation unit
	 *     - option id:         "org.eclipse.cdt.core.formatter.current_translation_unit"
	 *     - possible values:   object of class <code>ITranslationUnit</code> or <code>null</code>
	 *     - default:           null
	 * </pre>
	 */
	public static final String FORMATTER_TRANSLATION_UNIT = IDEPlugin.PLUGIN_ID + ".formatter.current_translation_unit";	 //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Value to set a brace location at the end of a line.
	 * </pre>
	 * @see #FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST
	 * @see #FORMATTER_BRACE_POSITION_FOR_BLOCK
 	 * @see #FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION
 	 * @see #FORMATTER_BRACE_POSITION_FOR_SWITCH
	 * @see #FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION
	 */
	public static final String END_OF_LINE = "end_of_line"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Value to set an option to false.
	 * </pre>
	 */
	public static final String FALSE = "false"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option for alignment of arguments in method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_arguments_in_method_invocation"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_ARGUMENTS_IN_METHOD_INVOCATION = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_arguments_in_method_invocation";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of assignment
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_assignment"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 * @since 5.3
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_ASSIGNMENT  = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_assignment";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of binary expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_binary_expression"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 * @since 5.3
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_BINARY_EXPRESSION = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_binary_expression";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of compact if
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_compact_if"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_ONE_PER_LINE, INDENT_BY_ONE)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_COMPACT_IF = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_compact_if";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of conditional expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_conditional_expression"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT_FIRST_BREAK, INDENT_ON_COLUMN)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_conditional_expression";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of a chain of conditional expressions.
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_conditional_expression_chain"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_ON_COLUMN)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 * @since 5.3
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_CONDITIONAL_EXPRESSION_CHAIN = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_conditional_expression_chain";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of a declarator list
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_declarator_list"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_DECLARATOR_LIST = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_declarator_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of a enumerator list
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_enumerator_list"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_ONE_PER_LINE, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_ENUMERATOR_LIST = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_enumerator_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of a expression list (except arguments in a method invocation)
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_expression_list"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_EXPRESSION_LIST = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_expression_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of expressions in initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_expressions_in_array_initializer"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_EXPRESSIONS_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_expressions_in_array_initializer";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of member access
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_member_access"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, M_NO_ALIGNMENT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 * @since 5.3
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_MEMBER_ACCESS = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_member_access";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of stream output expression consisting of a chain of
	 * overloaded &lt;&lt; operators.
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_overloaded_left_shift_chainn"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 * @since 5.3
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_OVERLOADED_LEFT_SHIFT_CHAIN = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_overloaded_left_shift_chain"; //$NON-NLS-1$;
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of parameters in method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_parameters_in_method_declaration"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_parameters_in_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of base-clause in type declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_base_clause_in_type_declaration"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_NEXT_SHIFTED, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_BASE_CLAUSE_IN_TYPE_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_base_clause_in_type_declaration";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of constructor initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_constructor_initializer_list"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 * @since 5.3
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_CONSTRUCTOR_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_constructor_initializer_list";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option for alignment of throws clause in method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.alignment_for_throws_clause_in_method_declaration"
	 *     - possible values:   values returned by <code>createAlignmentValue(boolean, int, int)</code> call
	 *     - default:           createAlignmentValue(false, WRAP_COMPACT, INDENT_DEFAULT)
	 * </pre>
	 * @see #createAlignmentValue(boolean, int, int)
	 */
	public static final String FORMATTER_ALIGNMENT_FOR_THROWS_CLAUSE_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.alignment_for_throws_clause_in_method_declaration";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_array_initializer"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of a block
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_block"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_BLOCK = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_block"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of a block in a case statement when the block is the first statement following
	 *             the case
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_block_in_case"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_BLOCK_IN_CASE = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_block_in_case"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_method_declaration"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of a switch statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_switch"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_SWITCH = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_switch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of a type declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_type_declaration"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_type_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to position the braces of a namespace declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.brace_position_for_namespace_declaration"
	 *     - possible values:   { END_OF_LINE, NEXT_LINE, NEXT_LINE_SHIFTED, NEXT_LINE_ON_WRAP }
	 *     - default:           END_OF_LINE
	 * </pre>
	 * @see #END_OF_LINE
	 * @see #NEXT_LINE
	 * @see #NEXT_LINE_SHIFTED
	 * @see #NEXT_LINE_ON_WRAP
	 */
	public static final String FORMATTER_BRACE_POSITION_FOR_NAMESPACE_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.brace_position_for_namespace_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify the minimum distance between code and line comment.
	 *     - option id:         "org.eclipse.cdt.core.formatter.comment.min_distance_between_code_and_line_comment"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "1"
	 * </pre>
	 * @since 5.3
	 */
	public final static String FORMATTER_COMMENT_MIN_DISTANCE_BETWEEN_CODE_AND_LINE_COMMENT = IDEPlugin.PLUGIN_ID + ".formatter.comment.min_distance_between_code_and_line_comment"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option to control whether the white space between code and line comments should be preserved or replaced with a single space
	 *     - option id:         "org.eclipse.cdt.core.formatter.comment.preserve_white_space_between_code_and_line_comments"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 * @since 5.3
	 */
	public final static String FORMATTER_COMMENT_PRESERVE_WHITE_SPACE_BETWEEN_CODE_AND_LINE_COMMENT = IDEPlugin.PLUGIN_ID + ".formatter.comment.preserve_white_space_between_code_and_line_comments"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option to control whether comments starting from the beginning of line should stay that way and never be indented.
	 *     - option id:         "org.eclipse.cdt.core.formatter.comment.never_indent_line_comments_on_first_column"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 * @since 5.4
	 */
	public final static String FORMATTER_COMMENT_NEVER_INDENT_LINE_COMMENTS_ON_FIRST_COLUMN = IDEPlugin.PLUGIN_ID + ".formatter.comment.never_indent_line_comments_on_first_column"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option to compact else/if
	 *     - option id:         "org.eclipse.cdt.core.formatter.compact_else_if"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_COMPACT_ELSE_IF = IDEPlugin.PLUGIN_ID + ".formatter.compact_else_if"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option to set the continuation indentation
	 *     - option id:         "org.eclipse.cdt.core.formatter.continuation_indentation"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "2"
	 * </pre>
	 */
	public static final String FORMATTER_CONTINUATION_INDENTATION = IDEPlugin.PLUGIN_ID + ".formatter.continuation_indentation"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to set the continuation indentation inside initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.continuation_indentation_for_array_initializer"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "2"
	 * </pre>
	 */
	public static final String FORMATTER_CONTINUATION_INDENTATION_FOR_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.continuation_indentation_for_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent 'public:', 'protected:', 'private:' access specifiers relative to class declaration.
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_access_specifier_compare_to_type_header"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_ACCESS_SPECIFIER_COMPARE_TO_TYPE_HEADER = IDEPlugin.PLUGIN_ID + ".formatter.indent_access_specifier_compare_to_type_header";  //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Number of extra spaces in front of 'public:', 'protected:', 'private:' access specifiers.
	 *             Enables fractional indent of access specifiers. Does not affect indentation of body declarations.
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_access_specifier_extra_spaces"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "0"
	 * </pre>
	 * @since 5.2
	 */
	public static final String FORMATTER_INDENT_ACCESS_SPECIFIER_EXTRA_SPACES = IDEPlugin.PLUGIN_ID + ".formatter.indent_access_specifier_extra_spaces"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent body declarations relative to access specifiers (visibility labels)
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_body_declarations_compare_to_access_specifier"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_ACCESS_SPECIFIER = IDEPlugin.PLUGIN_ID + ".formatter.indent_body_declarations_compare_to_access_specifier"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent template declaration compare to template header
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_declaration_compare_to_template_header"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_DECLARATION_COMPARE_TO_TEMPLATE_HEADER = IDEPlugin.PLUGIN_ID + ".formatter.indent_declaration_compare_to_template_header"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent body declarations compare to its enclosing namespace header
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_body_declarations_compare_to_namespace_header"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_BODY_DECLARATIONS_COMPARE_TO_NAMESPACE_HEADER = IDEPlugin.PLUGIN_ID + ".formatter.indent_body_declarations_compare_to_namespace_header"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent breaks compare to cases
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_breaks_compare_to_cases"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_BREAKS_COMPARE_TO_CASES = IDEPlugin.PLUGIN_ID + ".formatter.indent_breaks_compare_to_cases"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent empty lines
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_empty_lines"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_EMPTY_LINES = IDEPlugin.PLUGIN_ID + ".formatter.indent_empty_lines"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent inside line comments at column 0
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_inside_line_comments"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_INSIDE_LINE_COMMENTS = IDEPlugin.PLUGIN_ID + ".formatter.indent_inside_line_comments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent statements inside a block
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_statements_compare_to_block"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BLOCK = IDEPlugin.PLUGIN_ID + ".formatter.indent_statements_compare_to_block"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent statements inside the body of a method or a constructor
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_statements_compare_to_body"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_STATEMENTS_COMPARE_TO_BODY = IDEPlugin.PLUGIN_ID + ".formatter.indent_statements_compare_to_body"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent switch statements compare to cases
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_switchstatements_compare_to_cases"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_CASES = IDEPlugin.PLUGIN_ID + ".formatter.indent_switchstatements_compare_to_cases"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to indent switch statements compare to switch
	 *     - option id:         "org.eclipse.cdt.core.formatter.indent_switchstatements_compare_to_switch"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_INDENT_SWITCHSTATEMENTS_COMPARE_TO_SWITCH = IDEPlugin.PLUGIN_ID + ".formatter.indent_switchstatements_compare_to_switch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify the equivalent number of spaces that represents one indentation
	 *     - option id:         "org.eclipse.cdt.core.formatter.indentation.size"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "4"
	 * </pre>
	 * <p>This option is used only if the tab char is set to MIXED.
	 * </p>
	 * @see #FORMATTER_TAB_CHAR
	 */
	public static final String FORMATTER_INDENTATION_SIZE = IDEPlugin.PLUGIN_ID + ".formatter.indentation.size"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line after the opening brace in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_after_opening_brace_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_AFTER_OPENING_BRACE_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_after_opening_brace_in_array_initializer";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line after template declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_after_template_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_AFTER_TEMPLATE_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_after_template_declaration";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line at the end of the current file if missing
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_at_end_of_file_if_missing"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_AT_END_OF_FILE_IF_MISSING = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_at_end_of_file_if_missing";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line before the catch keyword in try statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_before_catch_in_try_statement"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_BEFORE_CATCH_IN_TRY_STATEMENT = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_before_catch_in_try_statement"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line before the closing brace in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_before_closing_brace_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_BEFORE_CLOSING_BRACE_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_before_closing_brace_in_array_initializer";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line before colon in constructor initializer list.
	 *     - option id:         "org.eclipse.cdt.core.formatter.formatter.insert_new_line_before_colon_in_constructor_initializer_list"
	 *     - possible values:   { DO_NOT_INSERT, INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 * @since 5.3
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_BEFORE_COLON_IN_CONSTRUCTOR_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_before_colon_in_constructor_initializer_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line before the else keyword in if statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_before_else_in_if_statement"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_BEFORE_ELSE_IN_IF_STATEMENT = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_before_else_in_if_statement"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line before while in do statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_before_while_in_do_statement"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_BEFORE_WHILE_IN_DO_STATEMENT = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_before_while_in_do_statement"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line before the identifier in a function declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_before_identifier_in_function_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_BEFORE_IDENTIFIER_IN_FUNCTION_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_before_identifier_in_function_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a new line in an empty block
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_new_line_in_empty_block"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_NEW_LINE_IN_EMPTY_BLOCK = IDEPlugin.PLUGIN_ID + ".formatter.insert_new_line_in_empty_block"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after an assignment operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_assignment_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_ASSIGNMENT_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_assignment_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after a binary operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_binary_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_BINARY_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_binary_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the closing angle bracket in template arguments
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_closing_angle_bracket_in_template_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_closing_angle_bracket_in_template_arguments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the closing angle bracket in template parameters
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_closing_angle_bracket_in_template_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_closing_angle_bracket_in_template_parameters"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the closing brace of a block
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_closing_brace_in_block"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_CLOSING_BRACE_IN_BLOCK = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_closing_brace_in_block"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the closing parenthesis of a cast expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_closing_paren_in_cast"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_CLOSING_PAREN_IN_CAST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_closing_paren_in_cast"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after colon in a base clause of a type definition
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_colon_in_base_clause"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COLON_IN_BASE_CLAUSE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_colon_in_base_clause"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after colon in a case statement when a opening brace follows the colon
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_colon_in_case"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CASE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_colon_in_case"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the colon in a conditional expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_colon_in_conditional"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COLON_IN_CONDITIONAL = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_colon_in_conditional"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the colon in a labeled statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_colon_in_labeled_statement"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COLON_IN_LABELED_STATEMENT = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_colon_in_labeled_statement"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in enum declarations
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_enum_declarations"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_ENUM_DECLARATIONS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_enum_declarations"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in the parameters of a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_method_declaration_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_method_declaration_parameters"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in the exception names in a throws clause of a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_method_declaration_throws"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_DECLARATION_THROWS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_method_declaration_throws"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in the arguments of a method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_method_invocation_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_METHOD_INVOCATION_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_method_invocation_arguments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in a declarator list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_declarator_list"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_DECLARATOR_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_declarator_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in expression list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_expression_list"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_EXPRESSION_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_expression_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in base type names of a type header
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_base_types"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_BASE_TYPES = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_base_types"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in template arguments
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_template_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TEMPLATE_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_template_arguments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the comma in template parameters
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_comma_in_template_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_COMMA_IN_TEMPLATE_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_comma_in_template_parameters"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening angle bracket in template arguments
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_angle_bracket_in_template_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_angle_bracket_in_template_arguments";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening angle bracket in template parameters
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_angle_bracket_in_template_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_angle_bracket_in_template_parameters";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening brace in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_brace_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACE_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_brace_in_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening bracket
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_bracket"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_BRACKET = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_bracket";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a cast expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_cast"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CAST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_cast"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a catch
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_catch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_CATCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_catch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a for statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_for"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_FOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_for"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in an if statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_if"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_IF = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_if"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_method_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_method_invocation"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_METHOD_INVOCATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_method_invocation"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in an exception specification
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_exception_specification"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 * @since 5.1
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_EXCEPTION_SPECIFICATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_exception_specification"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a parenthesized expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_parenthesized_expression"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_parenthesized_expression"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a switch statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_switch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_SWITCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_switch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after the opening parenthesis in a while statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_while"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_OPENING_PAREN_IN_WHILE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_opening_paren_in_while"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after a postfix operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_postfix_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_POSTFIX_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_postfix_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after a prefix operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_prefix_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_PREFIX_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_prefix_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after question mark in a conditional expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_question_in_conditional"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_QUESTION_IN_CONDITIONAL = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_question_in_conditional"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after semicolon in a for statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_semicolon_in_for"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_SEMICOLON_IN_FOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_semicolon_in_for"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space after an unary operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_after_unary_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_AFTER_UNARY_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_after_unary_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before an assignment operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_assignment_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_ASSIGNMENT_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_assignment_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before an binary operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_binary_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_BINARY_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_binary_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing angle bracket in template arguments
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_angle_bracket_in_template_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_angle_bracket_in_template_arguments";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing angle bracket in template parameters
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_angle_bracket_in_template_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_angle_bracket_in_template_parameters";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing brace in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_brace_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACE_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_brace_in_array_initializer";	 //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing bracket
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_bracket"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_BRACKET = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_bracket";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a cast expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_cast"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CAST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_cast"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a catch
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_catch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_CATCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_catch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a for statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_for"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_FOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_for"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in an if statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_if"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_IF = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_if"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_method_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_method_invocation"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_METHOD_INVOCATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_method_invocation"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in an exception specification
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_exception_specification"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 * @since 5.1
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_EXCEPTION_SPECIFICATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_exception_specification"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a parenthesized expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_parenthesized_expression"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_PARENTHESIZED_EXPRESSION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_parenthesized_expression"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a switch statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_switch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_SWITCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_switch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the closing parenthesis in a while statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_while"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_CLOSING_PAREN_IN_WHILE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_closing_paren_in_while"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before colon in a base clause of a type definition
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_colon_in_base_clause"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_BASE_CLAUSE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_colon_in_base_clause"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before colon in a case statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_colon_in_case"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CASE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_colon_in_case"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before colon in a conditional expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_colon_in_conditional"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_CONDITIONAL = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_colon_in_conditional"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before colon in a default statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_colon_in_default"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_DEFAULT = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_colon_in_default"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before colon in a labeled statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_colon_in_labeled_statement"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COLON_IN_LABELED_STATEMENT = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_colon_in_labeled_statement"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in enum declarations
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_enum_declarations"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_ENUM_DECLARATIONS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_enum_declarations"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in the parameters of a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_method_declaration_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_method_declaration_parameters"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in the exception names of the throws clause of a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_method_declaration_throws"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_DECLARATION_THROWS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_method_declaration_throws"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in the arguments of a method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_method_invocation_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_METHOD_INVOCATION_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_method_invocation_arguments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in a declarator list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_declarator_list"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_DECLARATOR_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_declarator_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in a expression list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_expression_list"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_EXPRESSION_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_expression_list"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in the base type names in a type header
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_base_types"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_BASE_TYPES = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_base_types"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in template arguments
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_template_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TEMPLATE_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_template_arguments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before comma in template parameters
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_comma_in_template_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_COMMA_IN_TEMPLATE_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_comma_in_template_parameters"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening angle bracket in template arguments
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_angle_bracket_in_template_arguments"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TEMPLATE_ARGUMENTS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_angle_bracket_in_template_arguments"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening angle bracket in template parameters
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_angle_bracket_in_template_parameters"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_ANGLE_BRACKET_IN_TEMPLATE_PARAMETERS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_angle_bracket_in_template_parameters"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening brace in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_brace_in_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening brace in a block
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_block"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_BLOCK = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_brace_in_block"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening brace in a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_method_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_brace_in_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening brace in a switch statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_switch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_SWITCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_brace_in_switch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening brace in a type declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_type_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_TYPE_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_brace_in_type_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening brace in a namespace declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_namespace_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACE_IN_NAMESPACE_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_brace_in_namespace_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening bracket
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_bracket"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_BRACKET = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_bracket";//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a catch
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_catch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_CATCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_catch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a for statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_for"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_FOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_for"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in an if statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_if"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_IF = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_if"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_method_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_method_invocation"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_METHOD_INVOCATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_method_invocation"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in an exception specification
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_exception_specification"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 * @since 5.1
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_EXCEPTION_SPECIFICATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_exception_specification"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a parenthesized expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_parenthesized_expression"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_PARENTHESIZED_EXPRESSION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_parenthesized_expression"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a switch statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_switch"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_SWITCH = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_switch"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before the opening parenthesis in a while statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_while"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_OPENING_PAREN_IN_WHILE = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_opening_paren_in_while"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before a postfix operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_postfix_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_POSTFIX_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_postfix_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before a prefix operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_prefix_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_PREFIX_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_prefix_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before question mark in a conditional expression
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_question_in_conditional"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_QUESTION_IN_CONDITIONAL = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_question_in_conditional"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before semicolon
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_semicolon"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_semicolon"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before semicolon in for statement
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_semicolon_in_for"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_SEMICOLON_IN_FOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_semicolon_in_for"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space before unary operator
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_before_unary_operator"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BEFORE_UNARY_OPERATOR = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_before_unary_operator"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space between empty braces in an initializer list
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_between_empty_braces_in_array_initializer"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACES_IN_INITIALIZER_LIST = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_between_empty_braces_in_array_initializer"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space between empty brackets
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_between_empty_brackets"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_BRACKETS = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_between_empty_brackets"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space between empty parenthesis in a method declaration
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_between_empty_parens_in_method_declaration"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_DECLARATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_between_empty_parens_in_method_declaration"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space between empty parenthesis in a method invocation
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_between_empty_parens_in_method_invocation"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 */
	public static final String FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_METHOD_INVOCATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_between_empty_parens_in_method_invocation"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to insert a space between empty parenthesis in an exception specification
	 *     - option id:         "org.eclipse.cdt.core.formatter.insert_space_between_empty_parens_in_exception_specification"
	 *     - possible values:   { INSERT, DO_NOT_INSERT }
	 *     - default:           DO_NOT_INSERT
	 * </pre>
	 * @see IDEPlugin#INSERT
	 * @see IDEPlugin#DO_NOT_INSERT
	 * @since 5.1
	 */
	public static final String FORMATTER_INSERT_SPACE_BETWEEN_EMPTY_PARENS_IN_EXCEPTION_SPECIFICATION = IDEPlugin.PLUGIN_ID + ".formatter.insert_space_between_empty_parens_in_exception_specification"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to keep else statement on the same line
	 *     - option id:         "org.eclipse.cdt.core.formatter.keep_else_statement_on_same_line"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_KEEP_ELSE_STATEMENT_ON_SAME_LINE = IDEPlugin.PLUGIN_ID + ".formatter.keep_else_statement_on_same_line"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to keep empty initializer list one one line
	 *     - option id:         "org.eclipse.cdt.core.formatter.keep_empty_array_initializer_on_one_line"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_KEEP_EMPTY_INITIALIZER_LIST_ON_ONE_LINE = IDEPlugin.PLUGIN_ID + ".formatter.keep_empty_array_initializer_on_one_line"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to keep guardian clause on one line
	 *     - option id:         "org.eclipse.cdt.core.formatter.format_guardian_clause_on_one_line"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_KEEP_GUARDIAN_CLAUSE_ON_ONE_LINE = IDEPlugin.PLUGIN_ID + ".formatter.format_guardian_clause_on_one_line"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to keep simple if statement on the one line
	 *     - option id:         "org.eclipse.cdt.core.formatter.keep_imple_if_on_one_line"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_KEEP_SIMPLE_IF_ON_ONE_LINE = IDEPlugin.PLUGIN_ID + ".formatter.keep_imple_if_on_one_line"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to keep then statement on the same line
	 *     - option id:         "org.eclipse.cdt.core.formatter.keep_then_statement_on_same_line"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_KEEP_THEN_STATEMENT_ON_SAME_LINE = IDEPlugin.PLUGIN_ID + ".formatter.keep_then_statement_on_same_line";//$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option to specify the length of the page. Beyond this length, the formatter will try to split the code
	 *     - option id:         "org.eclipse.cdt.core.formatter.lineSplit"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "80"
	 * </pre>
	 */
	public static final String FORMATTER_LINE_SPLIT = IDEPlugin.PLUGIN_ID + ".formatter.lineSplit"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify the number of empty lines to preserve
	 *     - option id:         "org.eclipse.cdt.core.formatter.number_of_empty_lines_to_preserve"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "0"
	 * </pre>
	 */
	public static final String FORMATTER_NUMBER_OF_EMPTY_LINES_TO_PRESERVE = IDEPlugin.PLUGIN_ID + ".formatter.number_of_empty_lines_to_preserve"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify whether the formatter can join wrapped lines or not
	 *     - option id:         "org.eclipse.cdt.core.formatter.join_wrapped_lines"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           TRUE
	 * </pre>
	 * @since 5.3
	 */
	public static final String FORMATTER_JOIN_WRAPPED_LINES = IDEPlugin.PLUGIN_ID + ".formatter.join_wrapped_lines";	//$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify whether or not empty statement should be on a new line
	 *     - option id:         "org.eclipse.cdt.core.formatter.put_empty_statement_on_new_line"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_PUT_EMPTY_STATEMENT_ON_NEW_LINE = IDEPlugin.PLUGIN_ID + ".formatter.put_empty_statement_on_new_line"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify the tabulation size
	 *     - option id:         "org.eclipse.cdt.core.formatter.tabulation.char"
	 *     - possible values:   { TAB, SPACE, MIXED }
	 *     - default:           TAB
	 * </pre>
	 * More values may be added in the future.
	 *
	 * @see IDEPlugin#TAB
	 * @see IDEPlugin#SPACE
	 * @see #MIXED
	 */
	public static final String FORMATTER_TAB_CHAR = IDEPlugin.PLUGIN_ID + ".formatter.tabulation.char"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Option to specify the equivalent number of spaces that represents one tabulation
	 *     - option id:         "org.eclipse.cdt.core.formatter.tabulation.size"
	 *     - possible values:   "&lt;n&gt;", where n is zero or a positive integer
	 *     - default:           "4"
	 * </pre>
	 */
	public static final String FORMATTER_TAB_SIZE = IDEPlugin.PLUGIN_ID + ".formatter.tabulation.size"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / Option to use tabulations only for leading indentations
	 *     - option id:         "org.eclipse.cdt.core.formatter.use_tabs_only_for_leading_indentations"
	 *     - possible values:   { TRUE, FALSE }
	 *     - default:           FALSE
	 * </pre>
	 * @see #TRUE
	 * @see #FALSE
	 */
	public static final String FORMATTER_USE_TABS_ONLY_FOR_LEADING_INDENTATIONS = IDEPlugin.PLUGIN_ID + ".formatter.use_tabs_only_for_leading_indentations"; //$NON-NLS-1$

	/**
	 * <pre>
	 * FORMATTER / The wrapping is done by indenting by one compare to the current indentation.
	 * </pre>
	 */
	public static final int INDENT_BY_ONE= 2;

	/**
	 * <pre>
	 * FORMATTER / The wrapping is done by using the current indentation.
	 * </pre>
	 */
	public static final int INDENT_DEFAULT= 0;
	/**
	 * <pre>
	 * FORMATTER / The wrapping is done by indenting on column under the splitting location.
	 * </pre>
	 */
	public static final int INDENT_ON_COLUMN = 1;

	/**
	 * <pre>
	 * FORMATTER / Possible value for the option FORMATTER_TAB_CHAR
	 * </pre>
	 * @see IDEPlugin#TAB
	 * @see IDEPlugin#SPACE
	 * @see #FORMATTER_TAB_CHAR
	 */
	public static final String MIXED = "mixed"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Value to set a brace location at the start of the next line with
	 *             the right indentation.
	 * </pre>
	 * @see #FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST
	 * @see #FORMATTER_BRACE_POSITION_FOR_BLOCK
 	 * @see #FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION
 	 * @see #FORMATTER_BRACE_POSITION_FOR_SWITCH
	 * @see #FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION
	 */
	public static final String NEXT_LINE = "next_line"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Value to set a brace location at the start of the next line if a wrapping
	 *             occurred.
	 * </pre>
	 * @see #FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST
	 * @see #FORMATTER_BRACE_POSITION_FOR_BLOCK
 	 * @see #FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION
 	 * @see #FORMATTER_BRACE_POSITION_FOR_SWITCH
	 * @see #FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION
	 */
    public static final String NEXT_LINE_ON_WRAP = "next_line_on_wrap"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Value to set a brace location at the start of the next line with
	 *             an extra indentation.
	 * </pre>
	 * @see #FORMATTER_BRACE_POSITION_FOR_INITIALIZER_LIST
	 * @see #FORMATTER_BRACE_POSITION_FOR_BLOCK
 	 * @see #FORMATTER_BRACE_POSITION_FOR_METHOD_DECLARATION
 	 * @see #FORMATTER_BRACE_POSITION_FOR_SWITCH
	 * @see #FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION
	 */
	public static final String NEXT_LINE_SHIFTED = "next_line_shifted"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / Value to set an option to true.
	 * </pre>
	 */
	public static final String TRUE = "true"; //$NON-NLS-1$
	/**
	 * <pre>
	 * FORMATTER / The wrapping is done using as few lines as possible.
	 * </pre>
	 */
	public static final int WRAP_COMPACT= 1;
	/**
	 * <pre>
	 * FORMATTER / The wrapping is done putting the first element on a new
	 *             line and then wrapping next elements using as few lines as possible.
	 * </pre>
	 */
	public static final int WRAP_COMPACT_FIRST_BREAK= 2;
	/**
	 * <pre>
	 * FORMATTER / The wrapping is done by putting each element on its own line
	 *             except the first element.
	 * </pre>
	 */
	public static final int WRAP_NEXT_PER_LINE= 5;
	/**
	 * <pre>
	 * FORMATTER / The wrapping is done by putting each element on its own line.
	 *             All elements are indented by one except the first element.
	 * </pre>
	 */
	public static final int WRAP_NEXT_SHIFTED= 4;

	/**
	 * <pre>
	 * FORMATTER / Value to disable alignment.
	 * </pre>
	 */
	public static final int WRAP_NO_SPLIT= 0;
	/**
	 * <pre>
	 * FORMATTER / The wrapping is done by putting each element on its own line.
	 * </pre>
	 */
	public static final int WRAP_ONE_PER_LINE= 3;

	/*
	 * Private constants.
	 */
	private static final IllegalArgumentException WRONG_ARGUMENT = new IllegalArgumentException();

	/**
	 * Create a new alignment value according to the given values. This must be used to set up
	 * the alignment options.
	 *
	 * @param forceSplit the given force value
	 * @param wrapStyle the given wrapping style
	 * @param indentStyle the given indent style
	 *
	 * @return the new alignment value
	 */
	public static String createAlignmentValue(boolean forceSplit, int wrapStyle, int indentStyle) {
		int alignmentValue = 0;
		switch (wrapStyle) {
			case WRAP_COMPACT:
				alignmentValue |= STPAlignment.M_COMPACT_SPLIT;
				break;
			case WRAP_COMPACT_FIRST_BREAK:
				alignmentValue |= STPAlignment.M_COMPACT_FIRST_BREAK_SPLIT;
				break;
			case WRAP_NEXT_PER_LINE:
				alignmentValue |= STPAlignment.M_NEXT_PER_LINE_SPLIT;
				break;
			case WRAP_NEXT_SHIFTED:
				alignmentValue |= STPAlignment.M_NEXT_SHIFTED_SPLIT;
				break;
			case WRAP_ONE_PER_LINE:
				alignmentValue |= STPAlignment.M_ONE_PER_LINE_SPLIT;
				break;
		}
		if (forceSplit) {
			alignmentValue |= STPAlignment.M_FORCE;
		}
		switch (indentStyle) {
			case INDENT_BY_ONE:
				alignmentValue |= STPAlignment.M_INDENT_BY_ONE;
				break;
			case INDENT_ON_COLUMN:
				alignmentValue |= STPAlignment.M_INDENT_ON_COLUMN;
		}
		return String.valueOf(alignmentValue);
	}

	/**
	 * <p>Return the indentation style of the given alignment value.
	 * The given alignment value should be created using the <code>createAlignmentValue(boolean, int, int)</code>
	 * API.
	 * </p>
	 *
	 * @param value the given alignment value
	 * @return the indentation style of the given alignment value
	 * @see #createAlignmentValue(boolean, int, int)
	 * @exception IllegalArgumentException if the given alignment value is null, or if it
	 * doesn't have a valid format.
	 */
	public static int getIndentStyle(String value) {
		if (value == null) {
			throw WRONG_ARGUMENT;
		}
		try {
			int existingValue = Integer.parseInt(value);
			if ((existingValue & STPAlignment.M_INDENT_BY_ONE) != 0) {
				return INDENT_BY_ONE;
			} else if ((existingValue & STPAlignment.M_INDENT_ON_COLUMN) != 0) {
				return INDENT_ON_COLUMN;
			} else {
				return INDENT_DEFAULT;
			}
		} catch (NumberFormatException e) {
			throw WRONG_ARGUMENT;
		}
	}

	/**
	 * <p>Return the wrapping style of the given alignment value.
	 * The given alignment value should be created using the <code>createAlignmentValue(boolean, int, int)</code>
	 * API.
	 * </p>
	 *
	 * @param value the given alignment value
	 * @return the wrapping style of the given alignment value
	 * @see #createAlignmentValue(boolean, int, int)
	 * @exception IllegalArgumentException if the given alignment value is null, or if it
	 * doesn't have a valid format.
	 */
	public static int getWrappingStyle(String value) {
		if (value == null) {
			throw WRONG_ARGUMENT;
		}
		try {
			int existingValue = Integer.parseInt(value) & STPAlignment.SPLIT_MASK;
			switch (existingValue) {
				case STPAlignment.M_COMPACT_SPLIT:
					return WRAP_COMPACT;
				case STPAlignment.M_COMPACT_FIRST_BREAK_SPLIT:
					return WRAP_COMPACT_FIRST_BREAK;
				case STPAlignment.M_NEXT_PER_LINE_SPLIT:
					return WRAP_NEXT_PER_LINE;
				case STPAlignment.M_NEXT_SHIFTED_SPLIT:
					return WRAP_NEXT_SHIFTED;
				case STPAlignment.M_ONE_PER_LINE_SPLIT:
					return WRAP_ONE_PER_LINE;
				default:
					return WRAP_NO_SPLIT;
			}
		} catch (NumberFormatException e) {
			throw WRONG_ARGUMENT;
		}
	}
}
