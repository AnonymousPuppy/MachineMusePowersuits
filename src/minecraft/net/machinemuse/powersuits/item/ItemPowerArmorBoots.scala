package net.machinemuse.powersuits.item

import net.minecraft.client.renderer.texture.IconRegister
import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.machinemuse.utils.render.MuseRenderer

class ItemPowerArmorBoots(id: Int) extends ItemPowerArmor(id, 0, 3) {
  val iconpath = MuseRenderer.ICON_PREFIX + "armorfeet"

  setUnlocalizedName("powerArmorBoots")

  @SideOnly(Side.CLIENT) override def registerIcons(iconRegister: IconRegister) {
    itemIcon = iconRegister.registerIcon(iconpath)
  }
}