package net.swutm.netherflowers.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.swutm.netherflowers.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CRIMSON_ORCHID_FLOWER =
            FeatureUtils.register("crimson_orchid_flower", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CRIMSON_ORCHID.get())))));
}
