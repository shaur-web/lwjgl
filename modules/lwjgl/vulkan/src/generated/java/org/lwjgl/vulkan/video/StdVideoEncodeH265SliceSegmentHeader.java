/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH265SliceSegmentHeader {
 *     {@link StdVideoEncodeH265SliceSegmentHeaderFlags StdVideoEncodeH265SliceSegmentHeaderFlags} flags;
 *     StdVideoH265SliceType slice_type;
 *     uint32_t slice_segment_address;
 *     uint8_t short_term_ref_pic_set_idx;
 *     uint8_t collocated_ref_idx;
 *     uint8_t {@link #num_ref_idx_l0_active_minus1};
 *     uint8_t {@link #num_ref_idx_l1_active_minus1};
 *     uint8_t MaxNumMergeCand;
 *     int8_t {@link #slice_cb_qp_offset};
 *     int8_t {@link #slice_cr_qp_offset};
 *     int8_t {@link #slice_beta_offset_div2};
 *     int8_t {@link #slice_tc_offset_div2};
 *     int8_t slice_act_y_qp_offset;
 *     int8_t slice_act_cb_qp_offset;
 *     int8_t slice_act_cr_qp_offset;
 *     {@link StdVideoH265ShortTermRefPicSet StdVideoH265ShortTermRefPicSet} const * pShortTermRefPicSet;
 *     {@link StdVideoEncodeH265SliceSegmentLongTermRefPics StdVideoEncodeH265SliceSegmentLongTermRefPics} const * pLongTermRefPics;
 *     {@link StdVideoEncodeH265WeightTable StdVideoEncodeH265WeightTable} const * pWeightTable;
 * }</code></pre>
 */
public class StdVideoEncodeH265SliceSegmentHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        SLICE_TYPE,
        SLICE_SEGMENT_ADDRESS,
        SHORT_TERM_REF_PIC_SET_IDX,
        COLLOCATED_REF_IDX,
        NUM_REF_IDX_L0_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_ACTIVE_MINUS1,
        MAXNUMMERGECAND,
        SLICE_CB_QP_OFFSET,
        SLICE_CR_QP_OFFSET,
        SLICE_BETA_OFFSET_DIV2,
        SLICE_TC_OFFSET_DIV2,
        SLICE_ACT_Y_QP_OFFSET,
        SLICE_ACT_CB_QP_OFFSET,
        SLICE_ACT_CR_QP_OFFSET,
        PSHORTTERMREFPICSET,
        PLONGTERMREFPICS,
        PWEIGHTTABLE;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF, StdVideoEncodeH265SliceSegmentHeaderFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        SLICE_TYPE = layout.offsetof(1);
        SLICE_SEGMENT_ADDRESS = layout.offsetof(2);
        SHORT_TERM_REF_PIC_SET_IDX = layout.offsetof(3);
        COLLOCATED_REF_IDX = layout.offsetof(4);
        NUM_REF_IDX_L0_ACTIVE_MINUS1 = layout.offsetof(5);
        NUM_REF_IDX_L1_ACTIVE_MINUS1 = layout.offsetof(6);
        MAXNUMMERGECAND = layout.offsetof(7);
        SLICE_CB_QP_OFFSET = layout.offsetof(8);
        SLICE_CR_QP_OFFSET = layout.offsetof(9);
        SLICE_BETA_OFFSET_DIV2 = layout.offsetof(10);
        SLICE_TC_OFFSET_DIV2 = layout.offsetof(11);
        SLICE_ACT_Y_QP_OFFSET = layout.offsetof(12);
        SLICE_ACT_CB_QP_OFFSET = layout.offsetof(13);
        SLICE_ACT_CR_QP_OFFSET = layout.offsetof(14);
        PSHORTTERMREFPICSET = layout.offsetof(15);
        PLONGTERMREFPICS = layout.offsetof(16);
        PWEIGHTTABLE = layout.offsetof(17);
    }

    /**
     * Creates a {@code StdVideoEncodeH265SliceSegmentHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265SliceSegmentHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH265SliceSegmentHeaderFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265SliceSegmentHeaderFlags flags() { return nflags(address()); }
    /** @return the value of the {@code slice_type} field. */
    @NativeType("StdVideoH265SliceType")
    public int slice_type() { return nslice_type(address()); }
    /** @return the value of the {@code slice_segment_address} field. */
    @NativeType("uint32_t")
    public int slice_segment_address() { return nslice_segment_address(address()); }
    /** @return the value of the {@code short_term_ref_pic_set_idx} field. */
    @NativeType("uint8_t")
    public byte short_term_ref_pic_set_idx() { return nshort_term_ref_pic_set_idx(address()); }
    /** @return the value of the {@code collocated_ref_idx} field. */
    @NativeType("uint8_t")
    public byte collocated_ref_idx() { return ncollocated_ref_idx(address()); }
    /** [0, 14] */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_active_minus1() { return nnum_ref_idx_l0_active_minus1(address()); }
    /** [0, 14] */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_active_minus1() { return nnum_ref_idx_l1_active_minus1(address()); }
    /** @return the value of the {@code MaxNumMergeCand} field. */
    @NativeType("uint8_t")
    public byte MaxNumMergeCand() { return nMaxNumMergeCand(address()); }
    /** [-12, 12] */
    @NativeType("int8_t")
    public byte slice_cb_qp_offset() { return nslice_cb_qp_offset(address()); }
    /** [-12, 12] */
    @NativeType("int8_t")
    public byte slice_cr_qp_offset() { return nslice_cr_qp_offset(address()); }
    /** [-6, 6] */
    @NativeType("int8_t")
    public byte slice_beta_offset_div2() { return nslice_beta_offset_div2(address()); }
    /** [-6, 6] */
    @NativeType("int8_t")
    public byte slice_tc_offset_div2() { return nslice_tc_offset_div2(address()); }
    /** @return the value of the {@code slice_act_y_qp_offset} field. */
    @NativeType("int8_t")
    public byte slice_act_y_qp_offset() { return nslice_act_y_qp_offset(address()); }
    /** @return the value of the {@code slice_act_cb_qp_offset} field. */
    @NativeType("int8_t")
    public byte slice_act_cb_qp_offset() { return nslice_act_cb_qp_offset(address()); }
    /** @return the value of the {@code slice_act_cr_qp_offset} field. */
    @NativeType("int8_t")
    public byte slice_act_cr_qp_offset() { return nslice_act_cr_qp_offset(address()); }
    /** @return a {@link StdVideoH265ShortTermRefPicSet} view of the struct pointed to by the {@code pShortTermRefPicSet} field. */
    @NativeType("StdVideoH265ShortTermRefPicSet const *")
    public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() { return npShortTermRefPicSet(address()); }
    /** @return a {@link StdVideoEncodeH265SliceSegmentLongTermRefPics} view of the struct pointed to by the {@code pLongTermRefPics} field. */
    @NativeType("StdVideoEncodeH265SliceSegmentLongTermRefPics const *")
    public StdVideoEncodeH265SliceSegmentLongTermRefPics pLongTermRefPics() { return npLongTermRefPics(address()); }
    /** @return a {@link StdVideoEncodeH265WeightTable} view of the struct pointed to by the {@code pWeightTable} field. */
    @NativeType("StdVideoEncodeH265WeightTable const *")
    public StdVideoEncodeH265WeightTable pWeightTable() { return npWeightTable(address()); }

    /** Copies the specified {@link StdVideoEncodeH265SliceSegmentHeaderFlags} to the {@code flags} field. */
    public StdVideoEncodeH265SliceSegmentHeader flags(StdVideoEncodeH265SliceSegmentHeaderFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265SliceSegmentHeader flags(java.util.function.Consumer<StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code slice_type} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_type(@NativeType("StdVideoH265SliceType") int value) { nslice_type(address(), value); return this; }
    /** Sets the specified value to the {@code slice_segment_address} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_segment_address(@NativeType("uint32_t") int value) { nslice_segment_address(address(), value); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_idx} field. */
    public StdVideoEncodeH265SliceSegmentHeader short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) { nshort_term_ref_pic_set_idx(address(), value); return this; }
    /** Sets the specified value to the {@code collocated_ref_idx} field. */
    public StdVideoEncodeH265SliceSegmentHeader collocated_ref_idx(@NativeType("uint8_t") byte value) { ncollocated_ref_idx(address(), value); return this; }
    /** Sets the specified value to the {@link #num_ref_idx_l0_active_minus1} field. */
    public StdVideoEncodeH265SliceSegmentHeader num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@link #num_ref_idx_l1_active_minus1} field. */
    public StdVideoEncodeH265SliceSegmentHeader num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code MaxNumMergeCand} field. */
    public StdVideoEncodeH265SliceSegmentHeader MaxNumMergeCand(@NativeType("uint8_t") byte value) { nMaxNumMergeCand(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_cb_qp_offset} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offset(@NativeType("int8_t") byte value) { nslice_cb_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_cr_qp_offset} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offset(@NativeType("int8_t") byte value) { nslice_cr_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_beta_offset_div2} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2(@NativeType("int8_t") byte value) { nslice_beta_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@link #slice_tc_offset_div2} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2(@NativeType("int8_t") byte value) { nslice_tc_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@code slice_act_y_qp_offset} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offset(@NativeType("int8_t") byte value) { nslice_act_y_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@code slice_act_cb_qp_offset} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offset(@NativeType("int8_t") byte value) { nslice_act_cb_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@code slice_act_cr_qp_offset} field. */
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offset(@NativeType("int8_t") byte value) { nslice_act_cr_qp_offset(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265ShortTermRefPicSet} to the {@code pShortTermRefPicSet} field. */
    public StdVideoEncodeH265SliceSegmentHeader pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) { npShortTermRefPicSet(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentLongTermRefPics} to the {@code pLongTermRefPics} field. */
    public StdVideoEncodeH265SliceSegmentHeader pLongTermRefPics(@NativeType("StdVideoEncodeH265SliceSegmentLongTermRefPics const *") StdVideoEncodeH265SliceSegmentLongTermRefPics value) { npLongTermRefPics(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265WeightTable} to the {@code pWeightTable} field. */
    public StdVideoEncodeH265SliceSegmentHeader pWeightTable(@NativeType("StdVideoEncodeH265WeightTable const *") StdVideoEncodeH265WeightTable value) { npWeightTable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265SliceSegmentHeader set(
        StdVideoEncodeH265SliceSegmentHeaderFlags flags,
        int slice_type,
        int slice_segment_address,
        byte short_term_ref_pic_set_idx,
        byte collocated_ref_idx,
        byte num_ref_idx_l0_active_minus1,
        byte num_ref_idx_l1_active_minus1,
        byte MaxNumMergeCand,
        byte slice_cb_qp_offset,
        byte slice_cr_qp_offset,
        byte slice_beta_offset_div2,
        byte slice_tc_offset_div2,
        byte slice_act_y_qp_offset,
        byte slice_act_cb_qp_offset,
        byte slice_act_cr_qp_offset,
        StdVideoH265ShortTermRefPicSet pShortTermRefPicSet,
        StdVideoEncodeH265SliceSegmentLongTermRefPics pLongTermRefPics,
        StdVideoEncodeH265WeightTable pWeightTable
    ) {
        flags(flags);
        slice_type(slice_type);
        slice_segment_address(slice_segment_address);
        short_term_ref_pic_set_idx(short_term_ref_pic_set_idx);
        collocated_ref_idx(collocated_ref_idx);
        num_ref_idx_l0_active_minus1(num_ref_idx_l0_active_minus1);
        num_ref_idx_l1_active_minus1(num_ref_idx_l1_active_minus1);
        MaxNumMergeCand(MaxNumMergeCand);
        slice_cb_qp_offset(slice_cb_qp_offset);
        slice_cr_qp_offset(slice_cr_qp_offset);
        slice_beta_offset_div2(slice_beta_offset_div2);
        slice_tc_offset_div2(slice_tc_offset_div2);
        slice_act_y_qp_offset(slice_act_y_qp_offset);
        slice_act_cb_qp_offset(slice_act_cb_qp_offset);
        slice_act_cr_qp_offset(slice_act_cr_qp_offset);
        pShortTermRefPicSet(pShortTermRefPicSet);
        pLongTermRefPics(pLongTermRefPics);
        pWeightTable(pWeightTable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265SliceSegmentHeader set(StdVideoEncodeH265SliceSegmentHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceSegmentHeader malloc() {
        return wrap(StdVideoEncodeH265SliceSegmentHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265SliceSegmentHeader calloc() {
        return wrap(StdVideoEncodeH265SliceSegmentHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeader} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265SliceSegmentHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265SliceSegmentHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265SliceSegmentHeader} instance for the specified memory address. */
    public static StdVideoEncodeH265SliceSegmentHeader create(long address) {
        return wrap(StdVideoEncodeH265SliceSegmentHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceSegmentHeader createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265SliceSegmentHeader.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265SliceSegmentHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceSegmentHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceSegmentHeader malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceSegmentHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265SliceSegmentHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265SliceSegmentHeader calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265SliceSegmentHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265SliceSegmentHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265SliceSegmentHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265SliceSegmentHeaderFlags nflags(long struct) { return StdVideoEncodeH265SliceSegmentHeaderFlags.create(struct + StdVideoEncodeH265SliceSegmentHeader.FLAGS); }
    /** Unsafe version of {@link #slice_type}. */
    public static int nslice_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_TYPE); }
    /** Unsafe version of {@link #slice_segment_address}. */
    public static int nslice_segment_address(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_SEGMENT_ADDRESS); }
    /** Unsafe version of {@link #short_term_ref_pic_set_idx}. */
    public static byte nshort_term_ref_pic_set_idx(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SHORT_TERM_REF_PIC_SET_IDX); }
    /** Unsafe version of {@link #collocated_ref_idx}. */
    public static byte ncollocated_ref_idx(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.COLLOCATED_REF_IDX); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1}. */
    public static byte nnum_ref_idx_l0_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.NUM_REF_IDX_L0_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1}. */
    public static byte nnum_ref_idx_l1_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.NUM_REF_IDX_L1_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #MaxNumMergeCand}. */
    public static byte nMaxNumMergeCand(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.MAXNUMMERGECAND); }
    /** Unsafe version of {@link #slice_cb_qp_offset}. */
    public static byte nslice_cb_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_CB_QP_OFFSET); }
    /** Unsafe version of {@link #slice_cr_qp_offset}. */
    public static byte nslice_cr_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_CR_QP_OFFSET); }
    /** Unsafe version of {@link #slice_beta_offset_div2}. */
    public static byte nslice_beta_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_BETA_OFFSET_DIV2); }
    /** Unsafe version of {@link #slice_tc_offset_div2}. */
    public static byte nslice_tc_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_TC_OFFSET_DIV2); }
    /** Unsafe version of {@link #slice_act_y_qp_offset}. */
    public static byte nslice_act_y_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_Y_QP_OFFSET); }
    /** Unsafe version of {@link #slice_act_cb_qp_offset}. */
    public static byte nslice_act_cb_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CB_QP_OFFSET); }
    /** Unsafe version of {@link #slice_act_cr_qp_offset}. */
    public static byte nslice_act_cr_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CR_QP_OFFSET); }
    /** Unsafe version of {@link #pShortTermRefPicSet}. */
    public static StdVideoH265ShortTermRefPicSet npShortTermRefPicSet(long struct) { return StdVideoH265ShortTermRefPicSet.create(memGetAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PSHORTTERMREFPICSET)); }
    /** Unsafe version of {@link #pLongTermRefPics}. */
    public static StdVideoEncodeH265SliceSegmentLongTermRefPics npLongTermRefPics(long struct) { return StdVideoEncodeH265SliceSegmentLongTermRefPics.create(memGetAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PLONGTERMREFPICS)); }
    /** Unsafe version of {@link #pWeightTable}. */
    public static StdVideoEncodeH265WeightTable npWeightTable(long struct) { return StdVideoEncodeH265WeightTable.create(memGetAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE)); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265SliceSegmentHeaderFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265SliceSegmentHeaderFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265SliceSegmentHeader.FLAGS, StdVideoEncodeH265SliceSegmentHeaderFlags.SIZEOF); }
    /** Unsafe version of {@link #slice_type(int) slice_type}. */
    public static void nslice_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_TYPE, value); }
    /** Unsafe version of {@link #slice_segment_address(int) slice_segment_address}. */
    public static void nslice_segment_address(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_SEGMENT_ADDRESS, value); }
    /** Unsafe version of {@link #short_term_ref_pic_set_idx(byte) short_term_ref_pic_set_idx}. */
    public static void nshort_term_ref_pic_set_idx(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SHORT_TERM_REF_PIC_SET_IDX, value); }
    /** Unsafe version of {@link #collocated_ref_idx(byte) collocated_ref_idx}. */
    public static void ncollocated_ref_idx(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.COLLOCATED_REF_IDX, value); }
    /** Unsafe version of {@link #num_ref_idx_l0_active_minus1(byte) num_ref_idx_l0_active_minus1}. */
    public static void nnum_ref_idx_l0_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.NUM_REF_IDX_L0_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_active_minus1(byte) num_ref_idx_l1_active_minus1}. */
    public static void nnum_ref_idx_l1_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.NUM_REF_IDX_L1_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #MaxNumMergeCand(byte) MaxNumMergeCand}. */
    public static void nMaxNumMergeCand(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.MAXNUMMERGECAND, value); }
    /** Unsafe version of {@link #slice_cb_qp_offset(byte) slice_cb_qp_offset}. */
    public static void nslice_cb_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_CB_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_cr_qp_offset(byte) slice_cr_qp_offset}. */
    public static void nslice_cr_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_CR_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_beta_offset_div2(byte) slice_beta_offset_div2}. */
    public static void nslice_beta_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_BETA_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #slice_tc_offset_div2(byte) slice_tc_offset_div2}. */
    public static void nslice_tc_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_TC_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #slice_act_y_qp_offset(byte) slice_act_y_qp_offset}. */
    public static void nslice_act_y_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_Y_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_act_cb_qp_offset(byte) slice_act_cb_qp_offset}. */
    public static void nslice_act_cb_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CB_QP_OFFSET, value); }
    /** Unsafe version of {@link #slice_act_cr_qp_offset(byte) slice_act_cr_qp_offset}. */
    public static void nslice_act_cr_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265SliceSegmentHeader.SLICE_ACT_CR_QP_OFFSET, value); }
    /** Unsafe version of {@link #pShortTermRefPicSet(StdVideoH265ShortTermRefPicSet) pShortTermRefPicSet}. */
    public static void npShortTermRefPicSet(long struct, StdVideoH265ShortTermRefPicSet value) { memPutAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PSHORTTERMREFPICSET, value.address()); }
    /** Unsafe version of {@link #pLongTermRefPics(StdVideoEncodeH265SliceSegmentLongTermRefPics) pLongTermRefPics}. */
    public static void npLongTermRefPics(long struct, StdVideoEncodeH265SliceSegmentLongTermRefPics value) { memPutAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PLONGTERMREFPICS, value.address()); }
    /** Unsafe version of {@link #pWeightTable(StdVideoEncodeH265WeightTable) pWeightTable}. */
    public static void npWeightTable(long struct, StdVideoEncodeH265WeightTable value) { memPutAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PSHORTTERMREFPICSET));
        check(memGetAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PLONGTERMREFPICS));
        check(memGetAddress(struct + StdVideoEncodeH265SliceSegmentHeader.PWEIGHTTABLE));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265SliceSegmentHeader} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265SliceSegmentHeader, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265SliceSegmentHeader ELEMENT_FACTORY = StdVideoEncodeH265SliceSegmentHeader.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265SliceSegmentHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265SliceSegmentHeader#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected StdVideoEncodeH265SliceSegmentHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH265SliceSegmentHeaderFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265SliceSegmentHeaderFlags flags() { return StdVideoEncodeH265SliceSegmentHeader.nflags(address()); }
        /** @return the value of the {@code slice_type} field. */
        @NativeType("StdVideoH265SliceType")
        public int slice_type() { return StdVideoEncodeH265SliceSegmentHeader.nslice_type(address()); }
        /** @return the value of the {@code slice_segment_address} field. */
        @NativeType("uint32_t")
        public int slice_segment_address() { return StdVideoEncodeH265SliceSegmentHeader.nslice_segment_address(address()); }
        /** @return the value of the {@code short_term_ref_pic_set_idx} field. */
        @NativeType("uint8_t")
        public byte short_term_ref_pic_set_idx() { return StdVideoEncodeH265SliceSegmentHeader.nshort_term_ref_pic_set_idx(address()); }
        /** @return the value of the {@code collocated_ref_idx} field. */
        @NativeType("uint8_t")
        public byte collocated_ref_idx() { return StdVideoEncodeH265SliceSegmentHeader.ncollocated_ref_idx(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceSegmentHeader#num_ref_idx_l0_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_active_minus1() { return StdVideoEncodeH265SliceSegmentHeader.nnum_ref_idx_l0_active_minus1(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceSegmentHeader#num_ref_idx_l1_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_active_minus1() { return StdVideoEncodeH265SliceSegmentHeader.nnum_ref_idx_l1_active_minus1(address()); }
        /** @return the value of the {@code MaxNumMergeCand} field. */
        @NativeType("uint8_t")
        public byte MaxNumMergeCand() { return StdVideoEncodeH265SliceSegmentHeader.nMaxNumMergeCand(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceSegmentHeader#slice_cb_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_cb_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.nslice_cb_qp_offset(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceSegmentHeader#slice_cr_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_cr_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.nslice_cr_qp_offset(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceSegmentHeader#slice_beta_offset_div2} field. */
        @NativeType("int8_t")
        public byte slice_beta_offset_div2() { return StdVideoEncodeH265SliceSegmentHeader.nslice_beta_offset_div2(address()); }
        /** @return the value of the {@link StdVideoEncodeH265SliceSegmentHeader#slice_tc_offset_div2} field. */
        @NativeType("int8_t")
        public byte slice_tc_offset_div2() { return StdVideoEncodeH265SliceSegmentHeader.nslice_tc_offset_div2(address()); }
        /** @return the value of the {@code slice_act_y_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_act_y_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.nslice_act_y_qp_offset(address()); }
        /** @return the value of the {@code slice_act_cb_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_act_cb_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.nslice_act_cb_qp_offset(address()); }
        /** @return the value of the {@code slice_act_cr_qp_offset} field. */
        @NativeType("int8_t")
        public byte slice_act_cr_qp_offset() { return StdVideoEncodeH265SliceSegmentHeader.nslice_act_cr_qp_offset(address()); }
        /** @return a {@link StdVideoH265ShortTermRefPicSet} view of the struct pointed to by the {@code pShortTermRefPicSet} field. */
        @NativeType("StdVideoH265ShortTermRefPicSet const *")
        public StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() { return StdVideoEncodeH265SliceSegmentHeader.npShortTermRefPicSet(address()); }
        /** @return a {@link StdVideoEncodeH265SliceSegmentLongTermRefPics} view of the struct pointed to by the {@code pLongTermRefPics} field. */
        @NativeType("StdVideoEncodeH265SliceSegmentLongTermRefPics const *")
        public StdVideoEncodeH265SliceSegmentLongTermRefPics pLongTermRefPics() { return StdVideoEncodeH265SliceSegmentHeader.npLongTermRefPics(address()); }
        /** @return a {@link StdVideoEncodeH265WeightTable} view of the struct pointed to by the {@code pWeightTable} field. */
        @NativeType("StdVideoEncodeH265WeightTable const *")
        public StdVideoEncodeH265WeightTable pWeightTable() { return StdVideoEncodeH265SliceSegmentHeader.npWeightTable(address()); }

        /** Copies the specified {@link StdVideoEncodeH265SliceSegmentHeaderFlags} to the {@code flags} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer flags(StdVideoEncodeH265SliceSegmentHeaderFlags value) { StdVideoEncodeH265SliceSegmentHeader.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code slice_type} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_type(@NativeType("StdVideoH265SliceType") int value) { StdVideoEncodeH265SliceSegmentHeader.nslice_type(address(), value); return this; }
        /** Sets the specified value to the {@code slice_segment_address} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_segment_address(@NativeType("uint32_t") int value) { StdVideoEncodeH265SliceSegmentHeader.nslice_segment_address(address(), value); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_idx} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer short_term_ref_pic_set_idx(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nshort_term_ref_pic_set_idx(address(), value); return this; }
        /** Sets the specified value to the {@code collocated_ref_idx} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer collocated_ref_idx(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.ncollocated_ref_idx(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceSegmentHeader#num_ref_idx_l0_active_minus1} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer num_ref_idx_l0_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nnum_ref_idx_l0_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceSegmentHeader#num_ref_idx_l1_active_minus1} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer num_ref_idx_l1_active_minus1(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nnum_ref_idx_l1_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code MaxNumMergeCand} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer MaxNumMergeCand(@NativeType("uint8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nMaxNumMergeCand(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceSegmentHeader#slice_cb_qp_offset} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_cb_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_cb_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceSegmentHeader#slice_cr_qp_offset} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_cr_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_cr_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceSegmentHeader#slice_beta_offset_div2} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_beta_offset_div2(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_beta_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoEncodeH265SliceSegmentHeader#slice_tc_offset_div2} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_tc_offset_div2(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_tc_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@code slice_act_y_qp_offset} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_act_y_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_act_y_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@code slice_act_cb_qp_offset} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_act_cb_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_act_cb_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@code slice_act_cr_qp_offset} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer slice_act_cr_qp_offset(@NativeType("int8_t") byte value) { StdVideoEncodeH265SliceSegmentHeader.nslice_act_cr_qp_offset(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265ShortTermRefPicSet} to the {@code pShortTermRefPicSet} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer pShortTermRefPicSet(@NativeType("StdVideoH265ShortTermRefPicSet const *") StdVideoH265ShortTermRefPicSet value) { StdVideoEncodeH265SliceSegmentHeader.npShortTermRefPicSet(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentLongTermRefPics} to the {@code pLongTermRefPics} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer pLongTermRefPics(@NativeType("StdVideoEncodeH265SliceSegmentLongTermRefPics const *") StdVideoEncodeH265SliceSegmentLongTermRefPics value) { StdVideoEncodeH265SliceSegmentHeader.npLongTermRefPics(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265WeightTable} to the {@code pWeightTable} field. */
        public StdVideoEncodeH265SliceSegmentHeader.Buffer pWeightTable(@NativeType("StdVideoEncodeH265WeightTable const *") StdVideoEncodeH265WeightTable value) { StdVideoEncodeH265SliceSegmentHeader.npWeightTable(address(), value); return this; }

    }

}