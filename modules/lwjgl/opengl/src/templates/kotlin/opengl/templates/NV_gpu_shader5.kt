/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_gpu_shader5 = "NVGPUShader5".nativeClassGL("NV_gpu_shader5", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new GPUs. Shaders using the
        new functionality provided by this extension should enable this functionality via the construct
        ${codeBlock("""
\\#extension GL_NV_gpu_shader5 : require (or enable)""")}
        This extension was developed concurrently with the ARB_gpu_shader5 extension, and provides a superset of the features provided there. The features
        common to both extensions are documented in the ARB_gpu_shader5 specification; this document describes only the addition language features not
        available via ARB_gpu_shader5. A shader that enables this extension via an \\#extension directive also implicitly enables the common capabilities
        provided by ARB_gpu_shader5.

        In addition to the capabilities of ARB_gpu_shader5, this extension provides a variety of new features for all shader types, including:
        ${ul(
            """
            support for a full set of 8-, 16-, 32-, and 64-bit scalar and vector data types, including uniform API, uniform buffer object, and shader input and
            output support;
            """,
            """
            the ability to aggregate samplers into arrays, index these arrays with arbitrary expressions, and not require that non-constant indices be uniform
            across all shader invocations;
            """,
            "new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;",
            "new built-in functions to pack and unpack 32-bit unsigned integer types into a two-component 16-bit floating-point vector;",
            "new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;",
            "new built-in functions to compute the composite of a set of boolean conditions a group of shader threads;",
            "vector relational functions supporting comparisons of vectors of 8-, 16-, and 64-bit integer types or 16-bit floating-point types; and",
            """
            extending texel offset support to allow loading texel offsets from regular integer operands computed at run-time, except for lookups with gradients
            (textureGrad*).
            """
        )}
        This extension also provides additional support for processing patch primitives (introduced by ARB_tessellation_shader). ARB_tessellation_shader
        requires the use of a tessellation evaluation shader when processing patches, which means that patches will never survive past the tessellation
        pipeline stage. This extension lifts that restriction, and allows patches to proceed further in the pipeline and be used
        ${ul(
            "as input to a geometry shader, using a new \"patches\" layout qualifier;",
            "as input to transform feedback;",
            "by fixed-function rasterization stages, in which case the patches are drawn as independent points."
        )}
        Additionally, it allows geometry shaders to read per-patch attributes written by a tessellation control shader using input variables declared with
        "patch in".

        Requires ${GL32.core}, GLSL 1.50 and ${ARB_gpu_shader5.link}.
        """

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying.",

        "INT64_NV"..0x140E,
        "UNSIGNED_INT64_NV"..0x140F,
        "INT8_NV"..0x8FE0,
        "INT8_VEC2_NV"..0x8FE1,
        "INT8_VEC3_NV"..0x8FE2,
        "INT8_VEC4_NV"..0x8FE3,
        "INT16_NV"..0x8FE4,
        "INT16_VEC2_NV"..0x8FE5,
        "INT16_VEC3_NV"..0x8FE6,
        "INT16_VEC4_NV"..0x8FE7,
        "INT64_VEC2_NV"..0x8FE9,
        "INT64_VEC3_NV"..0x8FEA,
        "INT64_VEC4_NV"..0x8FEB,
        "UNSIGNED_INT8_NV"..0x8FEC,
        "UNSIGNED_INT8_VEC2_NV"..0x8FED,
        "UNSIGNED_INT8_VEC3_NV"..0x8FEE,
        "UNSIGNED_INT8_VEC4_NV"..0x8FEF,
        "UNSIGNED_INT16_NV"..0x8FF0,
        "UNSIGNED_INT16_VEC2_NV"..0x8FF1,
        "UNSIGNED_INT16_VEC3_NV"..0x8FF2,
        "UNSIGNED_INT16_VEC4_NV"..0x8FF3,
        "UNSIGNED_INT64_VEC2_NV"..0x8FF5,
        "UNSIGNED_INT64_VEC3_NV"..0x8FF6,
        "UNSIGNED_INT64_VEC4_NV"..0x8FF7,
        "FLOAT16_NV"..0x8FF8,
        "FLOAT16_VEC2_NV"..0x8FF9,
        "FLOAT16_VEC3_NV"..0x8FFA,
        "FLOAT16_VEC4_NV"..0x8FFB
    )

    void(
        "Uniform1i64NV",
        "",

        GLint("location", ""),
        GLint64EXT("x", "")
    )

    void(
        "Uniform2i64NV",
        "",

        GLint("location", ""),
        GLint64EXT("x", ""),
        GLint64EXT("y", "")
    )

    void(
        "Uniform3i64NV",
        "",

        GLint("location", ""),
        GLint64EXT("x", ""),
        GLint64EXT("y", ""),
        GLint64EXT("z", "")
    )

    void(
        "Uniform4i64NV",
        "",

        GLint("location", ""),
        GLint64EXT("x", ""),
        GLint64EXT("y", ""),
        GLint64EXT("z", ""),
        GLint64EXT("w", "")
    )

    void(
        "Uniform1i64vNV",
        "",

        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    void(
        "Uniform2i64vNV",
        "",

        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    void(
        "Uniform3i64vNV",
        "",

        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    void(
        "Uniform4i64vNV",
        "",

        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    void(
        "Uniform1ui64NV",
        "",

        GLint("location", ""),
        GLuint64EXT("x", "")
    )

    void(
        "Uniform2ui64NV",
        "",

        GLint("location", ""),
        GLuint64EXT("x", ""),
        GLuint64EXT("y", "")
    )

    void(
        "Uniform3ui64NV",
        "",

        GLint("location", ""),
        GLuint64EXT("x", ""),
        GLuint64EXT("y", ""),
        GLuint64EXT("z", "")
    )

    void(
        "Uniform4ui64NV",
        "",

        GLint("location", ""),
        GLuint64EXT("x", ""),
        GLuint64EXT("y", ""),
        GLuint64EXT("z", ""),
        GLuint64EXT("w", "")
    )

    void(
        "Uniform1ui64vNV",
        "",

        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )

    void(
        "Uniform2ui64vNV",
        "",

        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLuint64EXT.p("value", "")
    )

    void(
        "Uniform3ui64vNV",
        "",

        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )

    void(
        "Uniform4ui64vNV",
        "",

        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )

    void(
        "GetUniformi64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        Check(1)..ReturnParam..GLint64EXT.p("params", "")
    )

    reuse(NV_shader_buffer_load, "GetUniformui64vNV")

    val DSA = DependsOn("GL_EXT_direct_state_access")

    DSA..void(
        "ProgramUniform1i64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint64EXT("x", "")
    )

    DSA..void(
        "ProgramUniform2i64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint64EXT("x", ""),
        GLint64EXT("y", "")
    )

    DSA..void(
        "ProgramUniform3i64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint64EXT("x", ""),
        GLint64EXT("y", ""),
        GLint64EXT("z", "")
    )

    DSA..void(
        "ProgramUniform4i64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLint64EXT("x", ""),
        GLint64EXT("y", ""),
        GLint64EXT("z", ""),
        GLint64EXT("w", "")
    )

    DSA..void(
        "ProgramUniform1i64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform2i64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform3i64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform4i64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform1ui64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint64EXT("x", "")
    )

    DSA..void(
        "ProgramUniform2ui64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint64EXT("x", ""),
        GLuint64EXT("y", "")
    )

    DSA..void(
        "ProgramUniform3ui64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint64EXT("x", ""),
        GLuint64EXT("y", ""),
        GLuint64EXT("z", "")
    )

    DSA..void(
        "ProgramUniform4ui64NV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        GLuint64EXT("x", ""),
        GLuint64EXT("y", ""),
        GLuint64EXT("z", ""),
        GLuint64EXT("w", "")
    )

    DSA..void(
        "ProgramUniform1ui64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize("value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform2ui64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(2, "value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform3ui64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(3, "value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )

    DSA..void(
        "ProgramUniform4ui64vNV",
        "",

        GLuint("program", ""),
        GLint("location", ""),
        AutoSize(4, "value")..GLsizei("count", ""),
        GLuint64EXT.const.p("value", "")
    )
}