package com.tiviacz.travelersbackpack.init;

import com.tiviacz.travelersbackpack.TravelersBackpack;
import com.tiviacz.travelersbackpack.blocks.SleepingBagBlock;
import com.tiviacz.travelersbackpack.blocks.TravelersBackpackBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TravelersBackpack.MODID);

    //Standard
    public static final RegistryObject<Block> STANDARD_TRAVELERS_BACKPACK = BLOCKS.register("standard", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.BROWN).build()).sound(SoundType.CLOTH)));

    //Blocks
    public static final RegistryObject<Block> NETHERITE_TRAVELERS_BACKPACK = BLOCKS.register("netherite", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.BLACK).build()).sound(SoundType.NETHERITE)));
    public static final RegistryObject<Block> DIAMOND_TRAVELERS_BACKPACK = BLOCKS.register("diamond", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.DIAMOND).build()).sound(SoundType.METAL)));
    public static final RegistryObject<Block> GOLD_TRAVELERS_BACKPACK = BLOCKS.register("gold", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.GOLD).build()).sound(SoundType.METAL)));
    public static final RegistryObject<Block> EMERALD_TRAVELERS_BACKPACK = BLOCKS.register("emerald", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.EMERALD).build()).sound(SoundType.METAL)));
    public static final RegistryObject<Block> IRON_TRAVELERS_BACKPACK = BLOCKS.register("iron", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.IRON).build()).sound(SoundType.METAL)));
    public static final RegistryObject<Block> LAPIS_TRAVELERS_BACKPACK = BLOCKS.register("lapis", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.LAPIS).build()).sound(SoundType.STONE)));
    public static final RegistryObject<Block> REDSTONE_TRAVELERS_BACKPACK = BLOCKS.register("redstone", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.TNT).build()).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COAL_TRAVELERS_BACKPACK = BLOCKS.register("coal", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.BLACK).build()).sound(SoundType.STONE)));

    public static final RegistryObject<Block> QUARTZ_TRAVELERS_BACKPACK = BLOCKS.register("quartz", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.QUARTZ).build()).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BOOKSHELF_TRAVELERS_BACKPACK = BLOCKS.register("bookshelf", () -> new TravelersBackpackBlock(AbstractBlock.Properties.create(new Material.Builder(MaterialColor.BROWN).build()).sound(SoundType.WOOD)));

    //Friendly Mobs
    public static final RegistryObject<Block> BAT_TRAVELERS_BACKPACK = BLOCKS.register("bat", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.BROWN).build()).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> WOLF_TRAVELERS_BACKPACK = BLOCKS.register("wolf", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.GRAY).build()).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> FOX_TRAVELERS_BACKPACK = BLOCKS.register("fox", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.ORANGE_TERRACOTTA).build()).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> OCELOT_TRAVELERS_BACKPACK = BLOCKS.register("ocelot", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.ORANGE_TERRACOTTA).build()).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> COW_TRAVELERS_BACKPACK = BLOCKS.register("cow", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.BROWN).build()).sound(SoundType.SLIME)));
    public static final RegistryObject<Block> PIG_TRAVELERS_BACKPACK = BLOCKS.register("pig", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.PINK).build()).sound(SoundType.SLIME)));
    public static final RegistryObject<Block> CHICKEN_TRAVELERS_BACKPACK = BLOCKS.register("chicken", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.WHITE_TERRACOTTA).build()).sound(SoundType.CLOTH)));
    public static final RegistryObject<Block> VILLAGER_TRAVELERS_BACKPACK = BLOCKS.register("villager", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.GRAY).build()).sound(SoundType.CLOTH)));

    //Other Blocks
    public static final RegistryObject<Block> SLEEPING_BAG = BLOCKS.register("sleeping_bag", () -> new SleepingBagBlock(Block.Properties.create(new Material.Builder(MaterialColor.RED).build()).sound(SoundType.CLOTH).hardnessAndResistance(0.2F).harvestLevel(0).notSolid()));

    //public static final RegistryObject<Block> CRYING_OBSIDIAN_TRAVELERS_BACKPACK = BLOCKS.register("crying_obsidian", () -> new TravelersBackpackBlock(Block.Properties.create(new Material.Builder(MaterialColor.BLACK).build()).sound(SoundType.STONE).setLightLevel(state -> 10)));

}