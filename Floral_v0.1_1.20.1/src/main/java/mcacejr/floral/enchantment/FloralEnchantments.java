package mcacejr.floral.enchantment;

import net.minecraft.enchantment.Enchantment;

public class FloralEnchantments {

    public static Enchantment IVY_ROOTS;
    public static Enchantment HUNGRY_FAUNA;
    public static Enchantment WITHERING_TOUCH;

    public static void init() {

        IVY_ROOTS = new IvyRootsFloralEnchantment();
        HUNGRY_FAUNA = new HungryFaunaFloralEnchantment();
        WITHERING_TOUCH = new WitheringTouchFloralEnchantment();

    }

}
