package crystallography.init;

import crystallography.Crystallography;
import crystallography.fluid.FluidUniversalSolvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.Fluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author xenonni
 */

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, Crystallography.MOD_ID);

    public static final RegistryObject<Fluid> UNIVERSAL_SOLVENT = FLUIDS.register("universal_solvent", () -> new FluidUniversalSolvent() );
}
