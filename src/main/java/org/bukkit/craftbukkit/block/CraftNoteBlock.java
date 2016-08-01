package org.bukkit.craftbukkit.block;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.TileEntityNote;
import org.bukkit.Instrument;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.block.Block;
import org.bukkit.block.NoteBlock;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;

public class CraftNoteBlock extends CraftBlockState implements NoteBlock {

    private final CraftWorld world = null;

    private final TileEntityNote note = null;

    public CraftNoteBlock(final Block block) {
    }

    public CraftNoteBlock(final Material material, final TileEntityNote te) {
    }

    public Note getNote() {
        return null;
    }

    public byte getRawNote() {
        return 0;
    }

    public void setNote(Note n) {
    }

    public void setRawNote(byte n) {
    }

    public boolean play() {
        return false;
    }

    @Override
    public boolean play(byte instrument, byte note) {
        return false;
    }

    @Override
    public boolean play(Instrument instrument, Note note) {
        return false;
    }

    @Override
    public TileEntityNote getTileEntity() {
        return null;
    }
}
