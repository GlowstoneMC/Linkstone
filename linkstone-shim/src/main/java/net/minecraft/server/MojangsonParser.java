package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.Version;
import net.glowstone.util.mojangson.Mojangson;

@LClassfile(version = Version.V1_12_R1)
public class MojangsonParser {
    @LMethod(version = Version.V1_12_R1)
    public static NBTTagCompound parse(String mojangson) throws MojangsonParseException {
        try {
            return NBTTagCompound.fromGlowstone(Mojangson.parseCompound(mojangson));
        } catch (net.glowstone.util.mojangson.ex.MojangsonParseException e) {
            throw new MojangsonParseException(e);
        }
    }
}
