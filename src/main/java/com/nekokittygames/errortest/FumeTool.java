package com.nekokittygames.errortest;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.turtle.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.event.TextureStitchEvent;

/**
 * Created by Katrina on 21/02/2015.
 */
@Optional.Interface(iface = "dan200.computercraft.api.turtle.ITurtleUpgrade", modid = "ComputerCraft")
public class FumeTool implements ITurtleUpgrade {
    @SideOnly(Side.CLIENT)
    public static IIcon icon;

    @Override
    @Optional.Method(modid = "ComputerCraft")
    public int getUpgradeID() {
        return 171;
    }

    @Override
    @Optional.Method(modid = "ComputerCraft")
    public String getUnlocalisedAdjective() {
        return "ttcomputer.dissipator";
    }


    @Override
    @Optional.Method(modid = "ComputerCraft")
    public TurtleUpgradeType getType() {
        return TurtleUpgradeType.Tool;
    }

    @Override
    @Optional.Method(modid = "ComputerCraft")
    public ItemStack getCraftingItem() {
        return new ItemStack(Blocks.coal_ore);
    }

    @Override
    @Optional.Method(modid = "ComputerCraft")
    public IPeripheral createPeripheral(ITurtleAccess turtle, TurtleSide side) {
        return null;
    }


    @Override
    @Optional.Method(modid = "ComputerCraft")
    public TurtleCommandResult useTool(ITurtleAccess turtle, TurtleSide side,
                                       TurtleVerb verb, int direction) {


        return TurtleCommandResult.failure();
    }

    @Override
    @Optional.Method(modid = "ComputerCraft")
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(ITurtleAccess turtle, TurtleSide side) {
        return icon;
    }

    @Override
    @Optional.Method(modid = "ComputerCraft")
    public void update(ITurtleAccess turtle, TurtleSide side) {

    }

    @SubscribeEvent
    @Optional.Method(modid = "ComputerCraft")
    public void registerIcons(TextureStitchEvent evt) {
        if (evt.map.getTextureType() == 1) icon = evt.map.registerIcon("ttinkerer:gasRemover");
    }
}
