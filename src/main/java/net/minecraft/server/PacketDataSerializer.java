package net.minecraft.server;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.inventory.CraftItemStack;

// CraftBukkit
public class PacketDataSerializer extends ByteBuf {

    private final ByteBuf a;

    public PacketDataSerializer(ByteBuf bytebuf) {
    }

    public static int a(int i) {
        return 0;
    }

    public PacketDataSerializer a(byte[] abyte) {
        return null;
    }

    public byte[] a() {
        return null;
    }

    public byte[] b(int i) {
        return null;
    }

    public PacketDataSerializer a(int[] aint) {
        return null;
    }

    public int[] b() {
        return null;
    }

    public int[] c(int i) {
        return null;
    }

    public PacketDataSerializer a(long[] along) {
        return null;
    }

    public BlockPosition e() {
        return null;
    }

    public PacketDataSerializer a(BlockPosition blockposition) {
        return null;
    }

    public IChatBaseComponent f() {
        return null;
    }

    public PacketDataSerializer a(IChatBaseComponent ichatbasecomponent) {
        return null;
    }

    public <T extends Enum<T>> T a(Class<T> oclass) {
        return null;
    }

    public PacketDataSerializer a(Enum<?> oenum) {
        return null;
    }

    public int g() {
        return 0;
    }

    public long h() {
        return 0;
    }

    public PacketDataSerializer a(UUID uuid) {
        return null;
    }

    public UUID i() {
        return null;
    }

    public PacketDataSerializer d(int i) {
        return null;
    }

    public PacketDataSerializer b(long i) {
        return null;
    }

    public PacketDataSerializer a(@Nullable NBTTagCompound nbttagcompound) {
        return null;
    }

    @Nullable
    public NBTTagCompound j() {
        return null;
    }

    public PacketDataSerializer a(@Nullable ItemStack itemstack) {
        return null;
    }

    @Nullable
    public ItemStack k() {
        return null;
    }

    public String e(int i) {
        return null;
    }

    public PacketDataSerializer a(String s) {
        return null;
    }

    public int capacity() {
        return 0;
    }

    public ByteBuf capacity(int i) {
        return null;
    }

    public int maxCapacity() {
        return 0;
    }

    public ByteBufAllocator alloc() {
        return null;
    }

    public ByteOrder order() {
        return null;
    }

    public ByteBuf order(ByteOrder byteorder) {
        return null;
    }

    public ByteBuf unwrap() {
        return null;
    }

    public boolean isDirect() {
        return false;
    }

    public int readerIndex() {
        return 0;
    }

    public ByteBuf readerIndex(int i) {
        return null;
    }

    public int writerIndex() {
        return 0;
    }

    public ByteBuf writerIndex(int i) {
        return null;
    }

    public ByteBuf setIndex(int i, int j) {
        return null;
    }

    public int readableBytes() {
        return 0;
    }

    public int writableBytes() {
        return 0;
    }

    public int maxWritableBytes() {
        return 0;
    }

    public boolean isReadable() {
        return false;
    }

    public boolean isReadable(int i) {
        return false;
    }

    public boolean isWritable() {
        return false;
    }

    public boolean isWritable(int i) {
        return false;
    }

    public ByteBuf clear() {
        return null;
    }

    public ByteBuf markReaderIndex() {
        return null;
    }

    public ByteBuf resetReaderIndex() {
        return null;
    }

    public ByteBuf markWriterIndex() {
        return null;
    }

    public ByteBuf resetWriterIndex() {
        return null;
    }

    public ByteBuf discardReadBytes() {
        return null;
    }

    public ByteBuf discardSomeReadBytes() {
        return null;
    }

    public ByteBuf ensureWritable(int i) {
        return null;
    }

    public int ensureWritable(int i, boolean flag) {
        return 0;
    }

    public boolean getBoolean(int i) {
        return false;
    }

    public byte getByte(int i) {
        return 0;
    }

    public short getUnsignedByte(int i) {
        return 0;
    }

    public short getShort(int i) {
        return 0;
    }

    public int getUnsignedShort(int i) {
        return 0;
    }

    public int getMedium(int i) {
        return 0;
    }

    public int getUnsignedMedium(int i) {
        return 0;
    }

    public int getInt(int i) {
        return 0;
    }

    public long getUnsignedInt(int i) {
        return 0;
    }

    public long getLong(int i) {
        return 0;
    }

    public char getChar(int i) {
        return '?';
    }

    public float getFloat(int i) {
        return 0.0F;
    }

    public double getDouble(int i) {
        return 0.0;
    }

    public ByteBuf getBytes(int i, ByteBuf bytebuf) {
        return null;
    }

    public ByteBuf getBytes(int i, ByteBuf bytebuf, int j) {
        return null;
    }

    public ByteBuf getBytes(int i, ByteBuf bytebuf, int j, int k) {
        return null;
    }

    public ByteBuf getBytes(int i, byte[] abyte) {
        return null;
    }

    public ByteBuf getBytes(int i, byte[] abyte, int j, int k) {
        return null;
    }

    public ByteBuf getBytes(int i, ByteBuffer bytebuffer) {
        return null;
    }

    public ByteBuf getBytes(int i, OutputStream outputstream, int j) throws IOException {
        return null;
    }

    public int getBytes(int i, GatheringByteChannel gatheringbytechannel, int j) throws IOException {
        return 0;
    }

    public ByteBuf setBoolean(int i, boolean flag) {
        return null;
    }

    public ByteBuf setByte(int i, int j) {
        return null;
    }

    public ByteBuf setShort(int i, int j) {
        return null;
    }

    public ByteBuf setMedium(int i, int j) {
        return null;
    }

    public ByteBuf setInt(int i, int j) {
        return null;
    }

    public ByteBuf setLong(int i, long j) {
        return null;
    }

    public ByteBuf setChar(int i, int j) {
        return null;
    }

    public ByteBuf setFloat(int i, float f) {
        return null;
    }

    public ByteBuf setDouble(int i, double d0) {
        return null;
    }

    public ByteBuf setBytes(int i, ByteBuf bytebuf) {
        return null;
    }

    public ByteBuf setBytes(int i, ByteBuf bytebuf, int j) {
        return null;
    }

    public ByteBuf setBytes(int i, ByteBuf bytebuf, int j, int k) {
        return null;
    }

    public ByteBuf setBytes(int i, byte[] abyte) {
        return null;
    }

    public ByteBuf setBytes(int i, byte[] abyte, int j, int k) {
        return null;
    }

    public ByteBuf setBytes(int i, ByteBuffer bytebuffer) {
        return null;
    }

    public int setBytes(int i, InputStream inputstream, int j) throws IOException {
        return 0;
    }

    public int setBytes(int i, ScatteringByteChannel scatteringbytechannel, int j) throws IOException {
        return 0;
    }

    public ByteBuf setZero(int i, int j) {
        return null;
    }

    public boolean readBoolean() {
        return false;
    }

    public byte readByte() {
        return 0;
    }

    public short readUnsignedByte() {
        return 0;
    }

    public short readShort() {
        return 0;
    }

    public int readUnsignedShort() {
        return 0;
    }

    public int readMedium() {
        return 0;
    }

    public int readUnsignedMedium() {
        return 0;
    }

    public int readInt() {
        return 0;
    }

    public long readUnsignedInt() {
        return 0;
    }

    public long readLong() {
        return 0;
    }

    public char readChar() {
        return '?';
    }

    public float readFloat() {
        return 0.0F;
    }

    public double readDouble() {
        return 0.0;
    }

    public ByteBuf readBytes(int i) {
        return null;
    }

    public ByteBuf readSlice(int i) {
        return null;
    }

    public ByteBuf readBytes(ByteBuf bytebuf) {
        return null;
    }

    public ByteBuf readBytes(ByteBuf bytebuf, int i) {
        return null;
    }

    public ByteBuf readBytes(ByteBuf bytebuf, int i, int j) {
        return null;
    }

    public ByteBuf readBytes(byte[] abyte) {
        return null;
    }

    public ByteBuf readBytes(byte[] abyte, int i, int j) {
        return null;
    }

    public ByteBuf readBytes(ByteBuffer bytebuffer) {
        return null;
    }

    public ByteBuf readBytes(OutputStream outputstream, int i) throws IOException {
        return null;
    }

    public int readBytes(GatheringByteChannel gatheringbytechannel, int i) throws IOException {
        return 0;
    }

    public ByteBuf skipBytes(int i) {
        return null;
    }

    public ByteBuf writeBoolean(boolean flag) {
        return null;
    }

    public ByteBuf writeByte(int i) {
        return null;
    }

    public ByteBuf writeShort(int i) {
        return null;
    }

    public ByteBuf writeMedium(int i) {
        return null;
    }

    public ByteBuf writeInt(int i) {
        return null;
    }

    public ByteBuf writeLong(long i) {
        return null;
    }

    public ByteBuf writeChar(int i) {
        return null;
    }

    public ByteBuf writeFloat(float f) {
        return null;
    }

    public ByteBuf writeDouble(double d0) {
        return null;
    }

    public ByteBuf writeBytes(ByteBuf bytebuf) {
        return null;
    }

    public ByteBuf writeBytes(ByteBuf bytebuf, int i) {
        return null;
    }

    public ByteBuf writeBytes(ByteBuf bytebuf, int i, int j) {
        return null;
    }

    public ByteBuf writeBytes(byte[] abyte) {
        return null;
    }

    public ByteBuf writeBytes(byte[] abyte, int i, int j) {
        return null;
    }

    public ByteBuf writeBytes(ByteBuffer bytebuffer) {
        return null;
    }

    public int writeBytes(InputStream inputstream, int i) throws IOException {
        return 0;
    }

    public int writeBytes(ScatteringByteChannel scatteringbytechannel, int i) throws IOException {
        return 0;
    }

    public ByteBuf writeZero(int i) {
        return null;
    }

    public int indexOf(int i, int j, byte b0) {
        return 0;
    }

    public int bytesBefore(byte b0) {
        return 0;
    }

    public int bytesBefore(int i, byte b0) {
        return 0;
    }

    public int bytesBefore(int i, int j, byte b0) {
        return 0;
    }

    public int forEachByte(ByteBufProcessor bytebufprocessor) {
        return 0;
    }

    public int forEachByte(int i, int j, ByteBufProcessor bytebufprocessor) {
        return 0;
    }

    public int forEachByteDesc(ByteBufProcessor bytebufprocessor) {
        return 0;
    }

    public int forEachByteDesc(int i, int j, ByteBufProcessor bytebufprocessor) {
        return 0;
    }

    public ByteBuf copy() {
        return null;
    }

    public ByteBuf copy(int i, int j) {
        return null;
    }

    public ByteBuf slice() {
        return null;
    }

    public ByteBuf slice(int i, int j) {
        return null;
    }

    public ByteBuf duplicate() {
        return null;
    }

    public int nioBufferCount() {
        return 0;
    }

    public ByteBuffer nioBuffer() {
        return null;
    }

    public ByteBuffer nioBuffer(int i, int j) {
        return null;
    }

    public ByteBuffer internalNioBuffer(int i, int j) {
        return null;
    }

    public ByteBuffer[] nioBuffers() {
        return null;
    }

    public ByteBuffer[] nioBuffers(int i, int j) {
        return null;
    }

    public boolean hasArray() {
        return false;
    }

    public byte[] array() {
        return null;
    }

    public int arrayOffset() {
        return 0;
    }

    public boolean hasMemoryAddress() {
        return false;
    }

    public long memoryAddress() {
        return 0;
    }

    public String toString(Charset charset) {
        return null;
    }

    public String toString(int i, int j, Charset charset) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int compareTo(ByteBuf bytebuf) {
        return 0;
    }

    public String toString() {
        return null;
    }

    public ByteBuf retain(int i) {
        return null;
    }

    public ByteBuf retain() {
        return null;
    }

    public int refCnt() {
        return 0;
    }

    public boolean release() {
        return false;
    }

    public boolean release(int i) {
        return false;
    }
}
