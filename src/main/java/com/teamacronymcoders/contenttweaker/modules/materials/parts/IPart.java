package com.teamacronymcoders.contenttweaker.modules.materials.parts;

import com.teamacronymcoders.contenttweaker.modules.materials.materialpartdata.IPartDataPiece;
import com.teamacronymcoders.contenttweaker.modules.materials.materialparts.IMaterialPart;
import com.teamacronymcoders.contenttweaker.modules.materials.materials.IMaterial;
import com.teamacronymcoders.contenttweaker.modules.materials.parttypes.IPartType;
import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.List;

@ZenRegister
@ZenClass("mods.contenttweaker.Part")
public interface IPart {
    @ZenMethod
    String getName();

    @ZenMethod
    String getUnlocalizedName();

    @ZenMethod
    String getShortUnlocalizedName();

    @ZenMethod
    IPartType getPartType();

    @ZenMethod
    String getPartTypeName();

    @ZenMethod
    String getOreDictPrefix();

    @ZenMethod
    boolean hasOverlay();

    @ZenMethod
    List<IPartDataPiece> getData();

    @ZenMethod
    IMaterialPart registerToMaterial(IMaterial material);

    @ZenMethod
    List<IMaterialPart> registerToMaterials(IMaterial[] materials);
}
