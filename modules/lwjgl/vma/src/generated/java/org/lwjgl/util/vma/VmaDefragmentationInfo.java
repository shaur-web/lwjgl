/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Parameters for defragmentation.
 * 
 * <p>To be used with function {@link Vma#vmaBeginDefragmentation BeginDefragmentation}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDefragmentationInfo {
 *     VmaDefragmentationFlags {@link #flags};
 *     VmaPool {@link #pool};
 *     VkDeviceSize {@link #maxBytesPerPass};
 *     uint32_t {@link #maxAllocationsPerPass};
 * }</code></pre>
 */
public class VmaDefragmentationInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        POOL,
        MAXBYTESPERPASS,
        MAXALLOCATIONSPERPASS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        POOL = layout.offsetof(1);
        MAXBYTESPERPASS = layout.offsetof(2);
        MAXALLOCATIONSPERPASS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VmaDefragmentationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDefragmentationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** use combination of {@code VmaDefragmentationFlagBits}. One or more of:<br><table><tr><td>{@link Vma#VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT}</td><td>{@link Vma#VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT}</td></tr><tr><td>{@link Vma#VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT}</td><td>{@link Vma#VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT}</td></tr><tr><td>{@link Vma#VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK DEFRAGMENTATION_FLAG_ALGORITHM_MASK}</td></tr></table> */
    @NativeType("VmaDefragmentationFlags")
    public int flags() { return nflags(address()); }
    /**
     * custom pool to be defragmented.
     * 
     * <p>If null then default pools will undergo defragmentation process.</p>
     */
    @NativeType("VmaPool")
    public long pool() { return npool(address()); }
    /**
     * maximum numbers of bytes that can be copied during single pass, while moving allocations to different places.
     * 
     * <p>0 means no limit.</p>
     */
    @NativeType("VkDeviceSize")
    public long maxBytesPerPass() { return nmaxBytesPerPass(address()); }
    /**
     * maximum number of allocations that can be moved during single pass to a different place.
     * 
     * <p>0 means no limit.</p>
     */
    @NativeType("uint32_t")
    public int maxAllocationsPerPass() { return nmaxAllocationsPerPass(address()); }

    /** Sets the specified value to the {@link #flags} field. */
    public VmaDefragmentationInfo flags(@NativeType("VmaDefragmentationFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pool} field. */
    public VmaDefragmentationInfo pool(@NativeType("VmaPool") long value) { npool(address(), value); return this; }
    /** Sets the specified value to the {@link #maxBytesPerPass} field. */
    public VmaDefragmentationInfo maxBytesPerPass(@NativeType("VkDeviceSize") long value) { nmaxBytesPerPass(address(), value); return this; }
    /** Sets the specified value to the {@link #maxAllocationsPerPass} field. */
    public VmaDefragmentationInfo maxAllocationsPerPass(@NativeType("uint32_t") int value) { nmaxAllocationsPerPass(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDefragmentationInfo set(
        int flags,
        long pool,
        long maxBytesPerPass,
        int maxAllocationsPerPass
    ) {
        flags(flags);
        pool(pool);
        maxBytesPerPass(maxBytesPerPass);
        maxAllocationsPerPass(maxAllocationsPerPass);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaDefragmentationInfo set(VmaDefragmentationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaDefragmentationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationInfo malloc() {
        return wrap(VmaDefragmentationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDefragmentationInfo calloc() {
        return wrap(VmaDefragmentationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaDefragmentationInfo} instance allocated with {@link BufferUtils}. */
    public static VmaDefragmentationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaDefragmentationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaDefragmentationInfo} instance for the specified memory address. */
    public static VmaDefragmentationInfo create(long address) {
        return wrap(VmaDefragmentationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaDefragmentationInfo.class, address);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaDefragmentationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDefragmentationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDefragmentationInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaDefragmentationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationInfo malloc(MemoryStack stack) {
        return wrap(VmaDefragmentationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaDefragmentationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDefragmentationInfo calloc(MemoryStack stack) {
        return wrap(VmaDefragmentationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDefragmentationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDefragmentationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo.FLAGS); }
    /** Unsafe version of {@link #pool}. */
    public static long npool(long struct) { return memGetAddress(struct + VmaDefragmentationInfo.POOL); }
    /** Unsafe version of {@link #maxBytesPerPass}. */
    public static long nmaxBytesPerPass(long struct) { return UNSAFE.getLong(null, struct + VmaDefragmentationInfo.MAXBYTESPERPASS); }
    /** Unsafe version of {@link #maxAllocationsPerPass}. */
    public static int nmaxAllocationsPerPass(long struct) { return UNSAFE.getInt(null, struct + VmaDefragmentationInfo.MAXALLOCATIONSPERPASS); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo.FLAGS, value); }
    /** Unsafe version of {@link #pool(long) pool}. */
    public static void npool(long struct, long value) { memPutAddress(struct + VmaDefragmentationInfo.POOL, value); }
    /** Unsafe version of {@link #maxBytesPerPass(long) maxBytesPerPass}. */
    public static void nmaxBytesPerPass(long struct, long value) { UNSAFE.putLong(null, struct + VmaDefragmentationInfo.MAXBYTESPERPASS, value); }
    /** Unsafe version of {@link #maxAllocationsPerPass(int) maxAllocationsPerPass}. */
    public static void nmaxAllocationsPerPass(long struct, int value) { UNSAFE.putInt(null, struct + VmaDefragmentationInfo.MAXALLOCATIONSPERPASS, value); }

    // -----------------------------------

    /** An array of {@link VmaDefragmentationInfo} structs. */
    public static class Buffer extends StructBuffer<VmaDefragmentationInfo, Buffer> implements NativeResource {

        private static final VmaDefragmentationInfo ELEMENT_FACTORY = VmaDefragmentationInfo.create(-1L);

        /**
         * Creates a new {@code VmaDefragmentationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDefragmentationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaDefragmentationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaDefragmentationInfo#flags} field. */
        @NativeType("VmaDefragmentationFlags")
        public int flags() { return VmaDefragmentationInfo.nflags(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo#pool} field. */
        @NativeType("VmaPool")
        public long pool() { return VmaDefragmentationInfo.npool(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo#maxBytesPerPass} field. */
        @NativeType("VkDeviceSize")
        public long maxBytesPerPass() { return VmaDefragmentationInfo.nmaxBytesPerPass(address()); }
        /** @return the value of the {@link VmaDefragmentationInfo#maxAllocationsPerPass} field. */
        @NativeType("uint32_t")
        public int maxAllocationsPerPass() { return VmaDefragmentationInfo.nmaxAllocationsPerPass(address()); }

        /** Sets the specified value to the {@link VmaDefragmentationInfo#flags} field. */
        public VmaDefragmentationInfo.Buffer flags(@NativeType("VmaDefragmentationFlags") int value) { VmaDefragmentationInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo#pool} field. */
        public VmaDefragmentationInfo.Buffer pool(@NativeType("VmaPool") long value) { VmaDefragmentationInfo.npool(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo#maxBytesPerPass} field. */
        public VmaDefragmentationInfo.Buffer maxBytesPerPass(@NativeType("VkDeviceSize") long value) { VmaDefragmentationInfo.nmaxBytesPerPass(address(), value); return this; }
        /** Sets the specified value to the {@link VmaDefragmentationInfo#maxAllocationsPerPass} field. */
        public VmaDefragmentationInfo.Buffer maxAllocationsPerPass(@NativeType("uint32_t") int value) { VmaDefragmentationInfo.nmaxAllocationsPerPass(address(), value); return this; }

    }

}