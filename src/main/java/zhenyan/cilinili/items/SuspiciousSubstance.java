package zhenyan.cilinili.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.network.chat.Component; 
import net.minecraft.ChatFormatting;
import java.util.function.Consumer;

public class SuspiciousSubstance extends Item{
    public SuspiciousSubstance(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        textConsumer.accept(Component.translatable("itemTooltip.cilinili.suspicious_substance").withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.DARK_PURPLE));
    }
    
}
