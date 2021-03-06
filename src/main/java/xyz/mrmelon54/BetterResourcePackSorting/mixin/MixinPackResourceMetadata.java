package xyz.mrmelon54.BetterResourcePackSorting.mixin;

import net.minecraft.resource.metadata.PackResourceMetadata;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import xyz.mrmelon54.BetterResourcePackSorting.duck.PackResourceCustomNameGetter;
import xyz.mrmelon54.BetterResourcePackSorting.duck.PackResourceCustomNameSetter;

@Mixin(PackResourceMetadata.class)
public class MixinPackResourceMetadata implements PackResourceCustomNameGetter, PackResourceCustomNameSetter {
    private Text customName;

    @Override
    public Text getCustomName() {
        return customName;
    }

    @Override
    public void setCustomName(Text name) {
        customName = name;
    }
}
