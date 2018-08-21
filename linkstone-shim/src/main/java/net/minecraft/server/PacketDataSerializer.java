package net.minecraft.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.util.ByteProcessor;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketDataSerializer extends ByteBuf {
    @LGenerate
    @LField(version = V1_12_R1, name = "a")
    private ByteBuf wrapped;

    @LConstructor(version = V1_12_R1)
    public PacketDataSerializer(ByteBuf wrapped) {
        this.wrapped = wrapped;
    }

    public byte[] toByteArray() {
        byte[] array = new byte[wrapped.readableBytes()];
        wrapped.readBytes(array);
        return array;
    }

    /* Delegated methods */

    @Override
    public int capacity() {
        return wrapped.capacity();
    }

    @Override
    public ByteBuf capacity(int i) {
        return wrapped.capacity(i);
    }

    @Override
    public int maxCapacity() {
        return wrapped.maxCapacity();
    }

    @Override
    public ByteBufAllocator alloc() {
        return wrapped.alloc();
    }

    @Override
    @Deprecated
    public ByteOrder order() {
        return wrapped.order();
    }

    @Override
    @Deprecated
    public ByteBuf order(ByteOrder byteOrder) {
        return wrapped.order(byteOrder);
    }

    @Override
    public ByteBuf unwrap() {
        return wrapped.unwrap();
    }

    @Override
    public boolean isDirect() {
        return wrapped.isDirect();
    }

    @Override
    public boolean isReadOnly() {
        return wrapped.isReadOnly();
    }

    @Override
    public ByteBuf asReadOnly() {
        return wrapped.asReadOnly();
    }

    @Override
    public int readerIndex() {
        return wrapped.readerIndex();
    }

    @Override
    public ByteBuf readerIndex(int i) {
        return wrapped.readerIndex(i);
    }

    @Override
    public int writerIndex() {
        return wrapped.writerIndex();
    }

    @Override
    public ByteBuf writerIndex(int i) {
        return wrapped.writerIndex(i);
    }

    @Override
    public ByteBuf setIndex(int i, int i1) {
        return wrapped.setIndex(i, i1);
    }

    @Override
    public int readableBytes() {
        return wrapped.readableBytes();
    }

    @Override
    public int writableBytes() {
        return wrapped.writableBytes();
    }

    @Override
    public int maxWritableBytes() {
        return wrapped.maxWritableBytes();
    }

    @Override
    public boolean isReadable() {
        return wrapped.isReadable();
    }

    @Override
    public boolean isReadable(int i) {
        return wrapped.isReadable(i);
    }

    @Override
    public boolean isWritable() {
        return wrapped.isWritable();
    }

    @Override
    public boolean isWritable(int i) {
        return wrapped.isWritable(i);
    }

    @Override
    public ByteBuf clear() {
        return wrapped.clear();
    }

    @Override
    public ByteBuf markReaderIndex() {
        return wrapped.markReaderIndex();
    }

    @Override
    public ByteBuf resetReaderIndex() {
        return wrapped.resetReaderIndex();
    }

    @Override
    public ByteBuf markWriterIndex() {
        return wrapped.markWriterIndex();
    }

    @Override
    public ByteBuf resetWriterIndex() {
        return wrapped.resetWriterIndex();
    }

    @Override
    public ByteBuf discardReadBytes() {
        return wrapped.discardReadBytes();
    }

    @Override
    public ByteBuf discardSomeReadBytes() {
        return wrapped.discardSomeReadBytes();
    }

    @Override
    public ByteBuf ensureWritable(int i) {
        return wrapped.ensureWritable(i);
    }

    @Override
    public int ensureWritable(int i, boolean b) {
        return wrapped.ensureWritable(i, b);
    }

    @Override
    public boolean getBoolean(int i) {
        return wrapped.getBoolean(i);
    }

    @Override
    public byte getByte(int i) {
        return wrapped.getByte(i);
    }

    @Override
    public short getUnsignedByte(int i) {
        return wrapped.getUnsignedByte(i);
    }

    @Override
    public short getShort(int i) {
        return wrapped.getShort(i);
    }

    @Override
    public short getShortLE(int i) {
        return wrapped.getShortLE(i);
    }

    @Override
    public int getUnsignedShort(int i) {
        return wrapped.getUnsignedShort(i);
    }

    @Override
    public int getUnsignedShortLE(int i) {
        return wrapped.getUnsignedShortLE(i);
    }

    @Override
    public int getMedium(int i) {
        return wrapped.getMedium(i);
    }

    @Override
    public int getMediumLE(int i) {
        return wrapped.getMediumLE(i);
    }

    @Override
    public int getUnsignedMedium(int i) {
        return wrapped.getUnsignedMedium(i);
    }

    @Override
    public int getUnsignedMediumLE(int i) {
        return wrapped.getUnsignedMediumLE(i);
    }

    @Override
    public int getInt(int i) {
        return wrapped.getInt(i);
    }

    @Override
    public int getIntLE(int i) {
        return wrapped.getIntLE(i);
    }

    @Override
    public long getUnsignedInt(int i) {
        return wrapped.getUnsignedInt(i);
    }

    @Override
    public long getUnsignedIntLE(int i) {
        return wrapped.getUnsignedIntLE(i);
    }

    @Override
    public long getLong(int i) {
        return wrapped.getLong(i);
    }

    @Override
    public long getLongLE(int i) {
        return wrapped.getLongLE(i);
    }

    @Override
    public char getChar(int i) {
        return wrapped.getChar(i);
    }

    @Override
    public float getFloat(int i) {
        return wrapped.getFloat(i);
    }

    @Override
    public float getFloatLE(int index) {
        return wrapped.getFloatLE(index);
    }

    @Override
    public double getDouble(int i) {
        return wrapped.getDouble(i);
    }

    @Override
    public double getDoubleLE(int index) {
        return wrapped.getDoubleLE(index);
    }

    @Override
    public ByteBuf getBytes(int i, ByteBuf byteBuf) {
        return wrapped.getBytes(i, byteBuf);
    }

    @Override
    public ByteBuf getBytes(int i, ByteBuf byteBuf, int i1) {
        return wrapped.getBytes(i, byteBuf, i1);
    }

    @Override
    public ByteBuf getBytes(int i, ByteBuf byteBuf, int i1, int i2) {
        return wrapped.getBytes(i, byteBuf, i1, i2);
    }

    @Override
    public ByteBuf getBytes(int i, byte[] bytes) {
        return wrapped.getBytes(i, bytes);
    }

    @Override
    public ByteBuf getBytes(int i, byte[] bytes, int i1, int i2) {
        return wrapped.getBytes(i, bytes, i1, i2);
    }

    @Override
    public ByteBuf getBytes(int i, ByteBuffer byteBuffer) {
        return wrapped.getBytes(i, byteBuffer);
    }

    @Override
    public ByteBuf getBytes(int i, OutputStream outputStream, int i1) throws IOException {
        return wrapped.getBytes(i, outputStream, i1);
    }

    @Override
    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i1) throws IOException {
        return wrapped.getBytes(i, gatheringByteChannel, i1);
    }

    @Override
    public int getBytes(int i, FileChannel fileChannel, long l, int i1) throws IOException {
        return wrapped.getBytes(i, fileChannel, l, i1);
    }

    @Override
    public CharSequence getCharSequence(int i, int i1, Charset charset) {
        return wrapped.getCharSequence(i, i1, charset);
    }

    @Override
    public ByteBuf setBoolean(int i, boolean b) {
        return wrapped.setBoolean(i, b);
    }

    @Override
    public ByteBuf setByte(int i, int i1) {
        return wrapped.setByte(i, i1);
    }

    @Override
    public ByteBuf setShort(int i, int i1) {
        return wrapped.setShort(i, i1);
    }

    @Override
    public ByteBuf setShortLE(int i, int i1) {
        return wrapped.setShortLE(i, i1);
    }

    @Override
    public ByteBuf setMedium(int i, int i1) {
        return wrapped.setMedium(i, i1);
    }

    @Override
    public ByteBuf setMediumLE(int i, int i1) {
        return wrapped.setMediumLE(i, i1);
    }

    @Override
    public ByteBuf setInt(int i, int i1) {
        return wrapped.setInt(i, i1);
    }

    @Override
    public ByteBuf setIntLE(int i, int i1) {
        return wrapped.setIntLE(i, i1);
    }

    @Override
    public ByteBuf setLong(int i, long l) {
        return wrapped.setLong(i, l);
    }

    @Override
    public ByteBuf setLongLE(int i, long l) {
        return wrapped.setLongLE(i, l);
    }

    @Override
    public ByteBuf setChar(int i, int i1) {
        return wrapped.setChar(i, i1);
    }

    @Override
    public ByteBuf setFloat(int i, float v) {
        return wrapped.setFloat(i, v);
    }

    @Override
    public ByteBuf setFloatLE(int index, float value) {
        return wrapped.setFloatLE(index, value);
    }

    @Override
    public ByteBuf setDouble(int i, double v) {
        return wrapped.setDouble(i, v);
    }

    @Override
    public ByteBuf setDoubleLE(int index, double value) {
        return wrapped.setDoubleLE(index, value);
    }

    @Override
    public ByteBuf setBytes(int i, ByteBuf byteBuf) {
        return wrapped.setBytes(i, byteBuf);
    }

    @Override
    public ByteBuf setBytes(int i, ByteBuf byteBuf, int i1) {
        return wrapped.setBytes(i, byteBuf, i1);
    }

    @Override
    public ByteBuf setBytes(int i, ByteBuf byteBuf, int i1, int i2) {
        return wrapped.setBytes(i, byteBuf, i1, i2);
    }

    @Override
    public ByteBuf setBytes(int i, byte[] bytes) {
        return wrapped.setBytes(i, bytes);
    }

    @Override
    public ByteBuf setBytes(int i, byte[] bytes, int i1, int i2) {
        return wrapped.setBytes(i, bytes, i1, i2);
    }

    @Override
    public ByteBuf setBytes(int i, ByteBuffer byteBuffer) {
        return wrapped.setBytes(i, byteBuffer);
    }

    @Override
    public int setBytes(int i, InputStream inputStream, int i1) throws IOException {
        return wrapped.setBytes(i, inputStream, i1);
    }

    @Override
    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i1) throws IOException {
        return wrapped.setBytes(i, scatteringByteChannel, i1);
    }

    @Override
    public int setBytes(int i, FileChannel fileChannel, long l, int i1) throws IOException {
        return wrapped.setBytes(i, fileChannel, l, i1);
    }

    @Override
    public ByteBuf setZero(int i, int i1) {
        return wrapped.setZero(i, i1);
    }

    @Override
    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        return wrapped.setCharSequence(i, charSequence, charset);
    }

    @Override
    public boolean readBoolean() {
        return wrapped.readBoolean();
    }

    @Override
    public byte readByte() {
        return wrapped.readByte();
    }

    @Override
    public short readUnsignedByte() {
        return wrapped.readUnsignedByte();
    }

    @Override
    public short readShort() {
        return wrapped.readShort();
    }

    @Override
    public short readShortLE() {
        return wrapped.readShortLE();
    }

    @Override
    public int readUnsignedShort() {
        return wrapped.readUnsignedShort();
    }

    @Override
    public int readUnsignedShortLE() {
        return wrapped.readUnsignedShortLE();
    }

    @Override
    public int readMedium() {
        return wrapped.readMedium();
    }

    @Override
    public int readMediumLE() {
        return wrapped.readMediumLE();
    }

    @Override
    public int readUnsignedMedium() {
        return wrapped.readUnsignedMedium();
    }

    @Override
    public int readUnsignedMediumLE() {
        return wrapped.readUnsignedMediumLE();
    }

    @Override
    public int readInt() {
        return wrapped.readInt();
    }

    @Override
    public int readIntLE() {
        return wrapped.readIntLE();
    }

    @Override
    public long readUnsignedInt() {
        return wrapped.readUnsignedInt();
    }

    @Override
    public long readUnsignedIntLE() {
        return wrapped.readUnsignedIntLE();
    }

    @Override
    public long readLong() {
        return wrapped.readLong();
    }

    @Override
    public long readLongLE() {
        return wrapped.readLongLE();
    }

    @Override
    public char readChar() {
        return wrapped.readChar();
    }

    @Override
    public float readFloat() {
        return wrapped.readFloat();
    }

    @Override
    public float readFloatLE() {
        return wrapped.readFloatLE();
    }

    @Override
    public double readDouble() {
        return wrapped.readDouble();
    }

    @Override
    public double readDoubleLE() {
        return wrapped.readDoubleLE();
    }

    @Override
    public ByteBuf readBytes(int i) {
        return wrapped.readBytes(i);
    }

    @Override
    public ByteBuf readSlice(int i) {
        return wrapped.readSlice(i);
    }

    @Override
    public ByteBuf readRetainedSlice(int i) {
        return wrapped.readRetainedSlice(i);
    }

    @Override
    public ByteBuf readBytes(ByteBuf byteBuf) {
        return wrapped.readBytes(byteBuf);
    }

    @Override
    public ByteBuf readBytes(ByteBuf byteBuf, int i) {
        return wrapped.readBytes(byteBuf, i);
    }

    @Override
    public ByteBuf readBytes(ByteBuf byteBuf, int i, int i1) {
        return wrapped.readBytes(byteBuf, i, i1);
    }

    @Override
    public ByteBuf readBytes(byte[] bytes) {
        return wrapped.readBytes(bytes);
    }

    @Override
    public ByteBuf readBytes(byte[] bytes, int i, int i1) {
        return wrapped.readBytes(bytes, i, i1);
    }

    @Override
    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return wrapped.readBytes(byteBuffer);
    }

    @Override
    public ByteBuf readBytes(OutputStream outputStream, int i) throws IOException {
        return wrapped.readBytes(outputStream, i);
    }

    @Override
    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) throws IOException {
        return wrapped.readBytes(gatheringByteChannel, i);
    }

    @Override
    public CharSequence readCharSequence(int i, Charset charset) {
        return wrapped.readCharSequence(i, charset);
    }

    @Override
    public int readBytes(FileChannel fileChannel, long l, int i) throws IOException {
        return wrapped.readBytes(fileChannel, l, i);
    }

    @Override
    public ByteBuf skipBytes(int i) {
        return wrapped.skipBytes(i);
    }

    @Override
    public ByteBuf writeBoolean(boolean b) {
        return wrapped.writeBoolean(b);
    }

    @Override
    public ByteBuf writeByte(int i) {
        return wrapped.writeByte(i);
    }

    @Override
    public ByteBuf writeShort(int i) {
        return wrapped.writeShort(i);
    }

    @Override
    public ByteBuf writeShortLE(int i) {
        return wrapped.writeShortLE(i);
    }

    @Override
    public ByteBuf writeMedium(int i) {
        return wrapped.writeMedium(i);
    }

    @Override
    public ByteBuf writeMediumLE(int i) {
        return wrapped.writeMediumLE(i);
    }

    @Override
    public ByteBuf writeInt(int i) {
        return wrapped.writeInt(i);
    }

    @Override
    public ByteBuf writeIntLE(int i) {
        return wrapped.writeIntLE(i);
    }

    @Override
    public ByteBuf writeLong(long l) {
        return wrapped.writeLong(l);
    }

    @Override
    public ByteBuf writeLongLE(long l) {
        return wrapped.writeLongLE(l);
    }

    @Override
    public ByteBuf writeChar(int i) {
        return wrapped.writeChar(i);
    }

    @Override
    public ByteBuf writeFloat(float v) {
        return wrapped.writeFloat(v);
    }

    @Override
    public ByteBuf writeFloatLE(float value) {
        return wrapped.writeFloatLE(value);
    }

    @Override
    public ByteBuf writeDouble(double v) {
        return wrapped.writeDouble(v);
    }

    @Override
    public ByteBuf writeDoubleLE(double value) {
        return wrapped.writeDoubleLE(value);
    }

    @Override
    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return wrapped.writeBytes(byteBuf);
    }

    @Override
    public ByteBuf writeBytes(ByteBuf byteBuf, int i) {
        return wrapped.writeBytes(byteBuf, i);
    }

    @Override
    public ByteBuf writeBytes(ByteBuf byteBuf, int i, int i1) {
        return wrapped.writeBytes(byteBuf, i, i1);
    }

    @Override
    public ByteBuf writeBytes(byte[] bytes) {
        return wrapped.writeBytes(bytes);
    }

    @Override
    public ByteBuf writeBytes(byte[] bytes, int i, int i1) {
        return wrapped.writeBytes(bytes, i, i1);
    }

    @Override
    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return wrapped.writeBytes(byteBuffer);
    }

    @Override
    public int writeBytes(InputStream inputStream, int i) throws IOException {
        return wrapped.writeBytes(inputStream, i);
    }

    @Override
    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) throws IOException {
        return wrapped.writeBytes(scatteringByteChannel, i);
    }

    @Override
    public int writeBytes(FileChannel fileChannel, long l, int i) throws IOException {
        return wrapped.writeBytes(fileChannel, l, i);
    }

    @Override
    public ByteBuf writeZero(int i) {
        return wrapped.writeZero(i);
    }

    @Override
    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return wrapped.writeCharSequence(charSequence, charset);
    }

    @Override
    public int indexOf(int i, int i1, byte b) {
        return wrapped.indexOf(i, i1, b);
    }

    @Override
    public int bytesBefore(byte b) {
        return wrapped.bytesBefore(b);
    }

    @Override
    public int bytesBefore(int i, byte b) {
        return wrapped.bytesBefore(i, b);
    }

    @Override
    public int bytesBefore(int i, int i1, byte b) {
        return wrapped.bytesBefore(i, i1, b);
    }

    @Override
    public int forEachByte(ByteProcessor byteProcessor) {
        return wrapped.forEachByte(byteProcessor);
    }

    @Override
    public int forEachByte(int i, int i1, ByteProcessor byteProcessor) {
        return wrapped.forEachByte(i, i1, byteProcessor);
    }

    @Override
    public int forEachByteDesc(ByteProcessor byteProcessor) {
        return wrapped.forEachByteDesc(byteProcessor);
    }

    @Override
    public int forEachByteDesc(int i, int i1, ByteProcessor byteProcessor) {
        return wrapped.forEachByteDesc(i, i1, byteProcessor);
    }

    @Override
    public ByteBuf copy() {
        return wrapped.copy();
    }

    @Override
    public ByteBuf copy(int i, int i1) {
        return wrapped.copy(i, i1);
    }

    @Override
    public ByteBuf slice() {
        return wrapped.slice();
    }

    @Override
    public ByteBuf retainedSlice() {
        return wrapped.retainedSlice();
    }

    @Override
    public ByteBuf slice(int i, int i1) {
        return wrapped.slice(i, i1);
    }

    @Override
    public ByteBuf retainedSlice(int i, int i1) {
        return wrapped.retainedSlice(i, i1);
    }

    @Override
    public ByteBuf duplicate() {
        return wrapped.duplicate();
    }

    @Override
    public ByteBuf retainedDuplicate() {
        return wrapped.retainedDuplicate();
    }

    @Override
    public int nioBufferCount() {
        return wrapped.nioBufferCount();
    }

    @Override
    public ByteBuffer nioBuffer() {
        return wrapped.nioBuffer();
    }

    @Override
    public ByteBuffer nioBuffer(int i, int i1) {
        return wrapped.nioBuffer(i, i1);
    }

    @Override
    public ByteBuffer internalNioBuffer(int i, int i1) {
        return wrapped.internalNioBuffer(i, i1);
    }

    @Override
    public ByteBuffer[] nioBuffers() {
        return wrapped.nioBuffers();
    }

    @Override
    public ByteBuffer[] nioBuffers(int i, int i1) {
        return wrapped.nioBuffers(i, i1);
    }

    @Override
    public boolean hasArray() {
        return wrapped.hasArray();
    }

    @Override
    public byte[] array() {
        return wrapped.array();
    }

    @Override
    public int arrayOffset() {
        return wrapped.arrayOffset();
    }

    @Override
    public boolean hasMemoryAddress() {
        return wrapped.hasMemoryAddress();
    }

    @Override
    public long memoryAddress() {
        return wrapped.memoryAddress();
    }

    @Override
    public String toString(Charset charset) {
        return wrapped.toString(charset);
    }

    @Override
    public String toString(int i, int i1, Charset charset) {
        return wrapped.toString(i, i1, charset);
    }

    @Override
    public int hashCode() {
        return wrapped.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return wrapped.equals(o);
    }

    @Override
    public int compareTo(ByteBuf byteBuf) {
        return wrapped.compareTo(byteBuf);
    }

    @Override
    public String toString() {
        return wrapped.toString();
    }

    @Override
    public ByteBuf retain(int i) {
        return wrapped.retain(i);
    }

    @Override
    public ByteBuf retain() {
        return wrapped.retain();
    }

    @Override
    public ByteBuf touch() {
        return wrapped.touch();
    }

    @Override
    public ByteBuf touch(Object o) {
        return wrapped.touch(o);
    }

    @Override
    public int refCnt() {
        return wrapped.refCnt();
    }

    @Override
    public boolean release() {
        return wrapped.release();
    }

    @Override
    public boolean release(int i) {
        return wrapped.release(i);
    }
}
