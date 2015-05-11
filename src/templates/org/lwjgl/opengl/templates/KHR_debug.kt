/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val KHR_debug = "KHRDebug".nativeClassGL("KHR_debug") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows the GL to notify applications when various events occur that may be useful during application development, debugging and
		profiling.

		These events are represented in the form of enumerable messages with a human-readable string representation. Examples of debug events include incorrect
		use of the GL, warnings of undefined behavior, and performance warnings.

		A message is uniquely identified by a source, a type and an implementation-dependent ID within the source and type pair.

		A message's source identifies the origin of the message and can either describe components of the GL, the window system, third-party external sources
		such as external debuggers, or even the application itself.

		The type of the message roughly identifies the nature of the event that caused the message. Examples include errors, performance warnings, warnings
		about undefined behavior or notifications identifying that the application is within a specific section of the application code.

		A message's ID for a given source and type further distinguishes messages within namespaces. For example, an error caused by a negative parameter value
		or an invalid internal texture format are both errors generated by the API, but would likely have different message IDs.

		Each message is also assigned to a severity level that denotes roughly how "important" that message is in comparison to other messages across all
		sources and types. For example, notification of a GL error would likely have a higher severity than a performance warning due to redundant state changes.

		Furthermore, every message contains an implementation-dependent string representation that provides a useful description of the event.

		Messages are communicated to the application through an application-defined callback function that is called by the GL implementation on each debug
		message. The motivation for the callback routine is to free application developers from actively having to query whether a GL error, or any other
		debuggable event has happened after each call to a GL function. With a callback, developers can keep their code free of debug checks, set breakpoints in
		the callback function, and only have to react to messages as they occur. In situations where using a callback is not possible, a message log is also
		provided that stores only copies of recent messages until they are actively queried.

		To control the volume of debug output, messages can be disabled either individually by ID, or entire sets of messages can be turned off based on
		combination of source and type, through the entire application code or only section of the code encapsulated in debug groups. A debug group may also be
		used to annotate the command stream using descriptive texts.

		This extension also defines debug markers, a mechanism for the OpenGL application to annotate the command stream with markers for discrete events.

		When profiling or debugging an OpenGL application with a built-in or an external debugger or profiler, it is difficult to relate the commands within the
		command stream to the elements of the scene or parts of the program code to which they correspond. Debug markers and debug groups help obviate this by
		allowing applications to specify this link. For example, a debug marker can be used to identify the beginning of a frame in the command stream and a
		debug group can encapsulate a specific command stream to identify a rendering pass. Debug groups also allow control of the debug outputs volume per
		section of an application code providing an effective way to handle the massive amount of debug outputs that drivers can generate.

		Some existing implementations of ${ARB_debug_output.link} only expose the ARB_debug_output extension string if the context was created with the debug
		flag {GLX|WGL}_CONTEXT_DEBUG_BIT_ARB as specified in {GLX|WGL}_ARB_create_context. The behavior is not obvious when the functionality is brought into
		the OpenGL core specification because the extension string and function entry points must always exist.

		This extension modifies the existing ARB_debug_output extension to allow implementations to always have an empty message log. The specific messages
		written to the message log or callback routines are already implementation defined, so this specification simply makes it explicit that it's fine for
		there to be zero messages generated, even when a GL error occurs, which is useful if the context is non-debug.

		Debug output can be enabled and disabled by changing the #DEBUG_OUTPUT state. It is implementation defined how much debug output is generated if the
		context was created without the #CONTEXT_FLAG_DEBUG_BIT set. This is a new query bit added to the existing GL30#CONTEXT_FLAGS state to specify whether the
		context was created with debug enabled.

		Finally, this extension defines a mechanism for OpenGL applications to label their objects (textures, buffers, shaders, etc.) with a descriptive string.

		When profiling or debugging an OpenGL application within an external or built-in (debut output API) debugger or profiler it is difficult to identify
		objects from their object names (integers).

		Even when the object itself is viewed it can be problematic to differentiate between similar objects. Attaching a descriptive string, a label, to an
		object obviates this difficulty.

		The intended purpose of this extension is purely to improve the user experience within OpenGL development tools and application built-in profilers and
		debuggers. This extension typically improves OpenGL programmers efficiency by allowing them to instantly detect issues and the reason for these issues
		giving him more time to focus on adding new features to an OpenGL application.

		${GL43.promoted}
		"""

	IntConstant(
		"Tokens accepted by the {@code target} parameters of Enable, Disable, and IsEnabled.",

		"DEBUG_OUTPUT" _ 0x92E0,
		"DEBUG_OUTPUT_SYNCHRONOUS" _ 0x8242
	)

	IntConstant(
		"Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS.",

		"CONTEXT_FLAG_DEBUG_BIT" _ 0x00000002
	)

	IntConstant(
		"Tokens accepted by the {@code value} parameters of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.",

		"MAX_DEBUG_MESSAGE_LENGTH" _ 0x9143,
		"MAX_DEBUG_LOGGED_MESSAGES" _ 0x9144,
		"DEBUG_LOGGED_MESSAGES" _ 0x9145,
		"DEBUG_NEXT_LOGGED_MESSAGE_LENGTH" _ 0x8243,
		"MAX_DEBUG_GROUP_STACK_DEPTH" _ 0x826C,
		"DEBUG_GROUP_STACK_DEPTH" _ 0x826D,
		"MAX_LABEL_LENGTH" _ 0x82E8
	)

	IntConstant(
		"Tokens accepted by the {@code pname} parameter of GetPointerv.",

		"DEBUG_CALLBACK_FUNCTION" _ 0x8244,
		"DEBUG_CALLBACK_USER_PARAM" _ 0x8245
	)

	IntConstant(
		"""
		Tokens accepted or provided by the {@code source} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code sources} parameter
		of GetDebugMessageLog (some commands restrict {@code source} to a subset of these parameters; see the specification body for details).
		""",

		"DEBUG_SOURCE_API" _ 0x8246,
		"DEBUG_SOURCE_WINDOW_SYSTEM" _ 0x8247,
		"DEBUG_SOURCE_SHADER_COMPILER" _ 0x8248,
		"DEBUG_SOURCE_THIRD_PARTY" _ 0x8249,
		"DEBUG_SOURCE_APPLICATION" _ 0x824A,
		"DEBUG_SOURCE_OTHER" _ 0x824B
	)

	IntConstant(
		"""
		Tokens accepted or provided by the {@code type} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC, and the {@code types} parameter of
		GetDebugMessageLog.
		""",

		"DEBUG_TYPE_ERROR" _ 0x824C,
		"DEBUG_TYPE_DEPRECATED_BEHAVIOR" _ 0x824D,
		"DEBUG_TYPE_UNDEFINED_BEHAVIOR" _ 0x824E,
		"DEBUG_TYPE_PORTABILITY" _ 0x824F,
		"DEBUG_TYPE_PERFORMANCE" _ 0x8250,
		"DEBUG_TYPE_OTHER" _ 0x8251,
		"DEBUG_TYPE_MARKER" _ 0x8268
	)

	IntConstant(
		"""
		Tokens accepted or provided by the {@code type} parameters of DebugMessageControl and DEBUGPROC, and the {@code types} parameter of GetDebugMessageLog.
		""",

		"DEBUG_TYPE_PUSH_GROUP" _ 0x8269,
		"DEBUG_TYPE_POP_GROUP" _ 0x826A
	)

	IntConstant(
		"""
		Tokens accepted or provided by the {@code severity} parameters of DebugMessageControl, DebugMessageInsert and DEBUGPROC callback functions, and the
		{@code severities} parameter of GetDebugMessageLog.
		""",

		"DEBUG_SEVERITY_HIGH" _ 0x9146,
		"DEBUG_SEVERITY_MEDIUM" _ 0x9147,
		"DEBUG_SEVERITY_LOW" _ 0x9148,
		"DEBUG_SEVERITY_NOTIFICATION" _ 0x826B
	)

	IntConstant(
		"Tokens accepted or provided by the {@code identifier} parameters of ObjectLabel and GetObjectLabel.",

		"BUFFER" _ 0x82E0,
		"SHADER" _ 0x82E1,
		"PROGRAM" _ 0x82E2,
		"QUERY" _ 0x82E3,
		"PROGRAM_PIPELINE" _ 0x82E4,
		"SAMPLER" _ 0x82E6,
		"DISPLAY_LIST" _ 0x82E7
	)

	GL43 reuse "DebugMessageControl"
	GL43 reuse "DebugMessageInsert"
	GL43 reuse "DebugMessageCallback"
	GL43 reuse "GetDebugMessageLog"
	GL43 reuse "PushDebugGroup"
	GL43 reuse "PopDebugGroup"
	GL43 reuse "ObjectLabel"
	GL43 reuse "GetObjectLabel"
	GL43 reuse "ObjectPtrLabel"
	GL43 reuse "GetObjectPtrLabel"
}