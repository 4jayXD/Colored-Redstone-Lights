package net.ajayxd.colored_lamps.foundation.custom.block;

import net.ajayxd.colored_lamps.foundation.custom.properties.ModProperties;
import net.ajayxd.colored_lamps.foundation.custom.properties.enums.DimmableLampBrightness;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BulbBlock;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DimmableLamp extends RedstoneLampBlock
{
    public static final EnumProperty<DimmableLampBrightness> BRIGHTNESS;

    static
    {
        BRIGHTNESS = ModProperties.DIMMABLE_LAMP_BRIGHTNESS;
    }

    public DimmableLamp(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
        builder.add(BRIGHTNESS);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world instanceof ServerWorld serverWorld) {
            this.update(state, serverWorld, pos);
        }
    }

    public void update(BlockState state, ServerWorld world, BlockPos pos)
    {
        boolean isLit = (Boolean) state.get(LIT);
        int power = (int) world.getReceivedRedstonePower(pos);

        if (isLit) {
            if (power <= 5 && power > 0) {
                world.setBlockState(pos, (BlockState) state.with(BRIGHTNESS, DimmableLampBrightness.DARK));
            }
            if (power > 5 && power <= 10) {
                world.setBlockState(pos, (BlockState) state.with(BRIGHTNESS, DimmableLampBrightness.DIM));
            }
            if (power > 10) {
                world.setBlockState(pos, (BlockState) state.with(BRIGHTNESS, DimmableLampBrightness.NORMAL));
            }
        }
        if (isLit != world.isReceivingRedstonePower(pos)){
            if (isLit)
                world.scheduleBlockTick(pos, this, 4);
            else
                world.setBlockState(pos, (BlockState)state.cycle(LIT), 2);
        }
    }
}
