package net.ajayxd.colored_lamps.foundation.custom.block;

import net.ajayxd.colored_lamps.foundation.custom.properties.ModProperties;
import net.ajayxd.colored_lamps.foundation.custom.properties.enums.LampColours;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LedLamp extends RedstoneLampBlock
{
    public static final EnumProperty<LampColours> COLOUR;

    static
    {
        COLOUR = ModProperties.LED_LAMP_COLOURS;
    }

    public LedLamp(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(LIT, false));
        setDefaultState(getDefaultState().with(COLOUR, LampColours.NORMAL));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(COLOUR);
        builder.add(LIT);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {

        if (!world.isClient && world instanceof ServerWorld serverWorld)
            this.update(serverWorld, state, pos);
    }

    public void update(ServerWorld world, BlockState state, BlockPos pos)
    {
        Boolean isLit = state.get(LIT);

        if (isLit)
            switch (world.getReceivedRedstonePower(pos))
            {
                default:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.NORMAL));
                    break;
                case 15:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.WHITE));
                    break;

                case 14:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.LIGHT_GRAY));
                    break;

                case 13:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.GRAY));
                    break;

                case 12:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.BROWN));
                    break;

                case 11:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.RED));
                    break;

                case 10:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.ORANGE));
                    break;

                case 9:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.YELLOW));
                    break;

                case 8:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.GREEN));
                    break;

                case 7:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.DARK_GREEN));
                    break;

                case 6:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.CYAN));
                    break;

                case 5:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.LIGHT_BLUE));
                    break;

                case 4:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.BLUE));
                    break;

                case 3:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.PURPLE));
                    break;

                case 2:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.MAGENTA));
                    break;

                case 1:
                    world.setBlockState(pos, (BlockState) state.with(COLOUR, LampColours.PINK));
                    break;

                case 0:
                    world.setBlockState(pos, (BlockState) state.with(LIT, false));
                    break;
            }

        if (isLit != world.isReceivingRedstonePower(pos)){
            if (isLit)
                world.scheduleBlockTick(pos, this, 4);
            else
                world.setBlockState(pos, (BlockState)state.cycle(LIT), 2);
        }
    }
}
