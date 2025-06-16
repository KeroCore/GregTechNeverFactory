package gregtech.api;

import gregtech.api.util.random.XoShiRo256PlusPlusRandom;
import gregtech.common.ConfigHolder;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import net.minecraftforge.oredict.OreDictionary;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

import static net.minecraft.util.text.TextFormatting.*;

/**
 * Made for static imports, this Class is just a Helper.
 */
public class GTValues {

    /**
     * <p/>
     * This is worth exactly one normal Item.
     * This Constant can be divided by many commonly used Numbers such as
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 24, ... 64 or 81
     * without loosing precision and is for that reason used as Unit of Amount.
     * But it is also small enough to be multiplied with larger Numbers.
     * <p/>
     * This is used to determine the amount of Material contained inside a prefixed Ore.
     * For example Nugget = M / 9 as it contains out of 1/9 of an Ingot.
     */
    public static final long M = 3628800;

    /**
     * Renamed from "FLUID_MATERIAL_UNIT" to just "L"
     * <p/>
     * Fluid per Material Unit (Prime Factors: 3 * 3 * 2 * 2 * 2 * 2)
     */
    public static final int L = 144;

    /**
     * The Item WildCard Tag. Even shorter than the "-1" of the past
     */
    public static final short W = OreDictionary.WILDCARD_VALUE;

    public static final Random RNG = new XoShiRo256PlusPlusRandom();

    /** Current time on the Client. Will always be zero on the server. */
    public static long CLIENT_TIME = 0;

    /**
     * The Voltage Tiers. Use this Array instead of the old named Voltage Variables
     */
    public static final long[] V = { 8, 16, 24, 32, 64, 128, 256, 512, 768, 1280, 2048, 3584, 5120, 8192,
        12800, 24575, 32768, 57344, 89600, 131072, 292352, 524288, 2097152,
        8388608, 33554432, 134217728, 536870912, 2147483648L };

    /**
     * The Voltage Tiers divided by 2.
     */
    public static final long[] VH = { 4, 8, 12, 16, 32, 64, 128, 256, 384, 640, 1024, 1792, 2560, 4096,
        6400, 12287, 16384, 28672, 44800, 65536, 146176, 262144, 1048576,
        4194304, 16777216, 67108864, 268435456, 1073741824 };
    /**
     * The Voltage Tiers adjusted for cable loss. Use this for recipe EU/t to avoid full-amp recipes
     */
    public static final long[] VA = {
        8, 16, 24, 32, 64, 128, 256, 512, 768, 1280, 2048, 3584, 5120, 8192,
        12800, 24575, 32768, 57344, 89600, 131072, 292352, 524288, 2097152,
        8388608, 33554432, 134217728, 536870912, 2147483648L
    };

    /**
     * The Voltage Tiers adjusted for cable loss, divided by 2.
     */
    public static final long[] VHA = {
        4, 8, 12, 16, 32, 64, 128, 256, 384, 640, 1024, 1792, 2560, 4096,
        6400, 12287, 16384, 28672, 44800, 65536, 146176, 262144, 1048576,
        4194304, 16777216, 67108864, 268435456, 1073741824
    };

    /**
     * The Voltage Tiers extended all the way to max Long value for overclocking
     */
    public static final long[] VOC = { 8, 32, 128, 512, 2048, 8192, 32768, 131072, 524288, 2097152, 8388608, 33554432,
            134217728, 536870912, 2147483648L, 8589934592L, 34359738368L, 137438953472L, 549755813888L,
            2199023255552L, 8796093022208L, 35184372088832L, 140737488355328L, 562949953421312L, 2251799813685248L,
            9007199254740992L, 36028797018963968L, 144115188075855872L, 576460752303423488L, 2305843009213693952L,
            Long.MAX_VALUE };

    public static final long[] VAOC = { 7, 30, 120, 480, 1920, 7680, 30720, 123880, 491520, 1966080, 7864320,
            31457280, 125829120, 503316480, 2013265920, 8053063680L, 32212254720L, 128849018880L, 515396075520L,
            2061584302080L, 8246337208320L, 32985348833280L, 131948427333120L, 527865581332480L, 2111062325297920L,
            8444249301319680L, 33777097205278720L, 135108988821415880L, 540431751284459520L, 2161727821137838080L,
            8646911284550352320L
    };

    public static final int ULV = 0;
    public static final int QLV = 1;
    public static final int LV = 2;
    public static final int LMV = 3;
    public static final int MLV = 4;
    public static final int MV = 5;
    public static final int MHV = 6;
    public static final int HV = 7;
    public static final int QHV = 8;
    public static final int LEV = 9;
    public static final int EV = 10;
    public static final int HEV = 11;
    public static final int SEV = 12;
    public static final int IV = 13;
    public static final int VIV = 14;
    public static final int SIV = 15;
    public static final int LuV = 16;
    public static final int VLuV = 17;
    public static final int SLuV = 18;
    public static final int ZPM = 19;
    public static final int YPM = 20;
    public static final int RPM = 21;
    public static final int QPM = 22;
    public static final int UHV = 23;
    public static final int UEV = 24;
    public static final int UIV = 25;
    public static final int UXV = 26;
    public static final int OpV = 27;
    public static final int MAX = 28;
    public static final int MAX_TRUE = 30;

    /**
     * The short names for the voltages, used for registration primarily
     */
    public static final String[] VN = new String[] {
        "ULV", "QLV", "LV", "LMV", "MLV", "MV", "MHV", "HV", "QHV", "LEV", "EV", "HEV", "SEV",
        "IV", "VIV", "SIV", "LuV", "VLuV", "SLuV", "ZPM", "YPM", "RPM", "QPM", "UHV", "UEV",
        "UIV", "UXV", "OpV", "MAX", "MAX_TRUE"
    };

    /**
     * The short names for the voltages, up to max Long, used for registration primarily
     */
    public static final String[] VOCN = new String[] { "ULV", "QLV", "LV", "LMV", "MLV", "MV", "MHV", "HV", "QHV", "LEV", "EV", "HEV", "SEV", "IV", "VIV", "LuV", "VLuV", "SLuV", "ZPM", "YPM",
        "RPM", "QPM", "UHV",
            "UEV", "UIV", "UXV", "OpV", "MAX", "MAX+1", "MAX+2", "MAX+3", "MAX+4", "MAX+5", "MAX+6", "MAX+7", "MAX+8",
            "MAX+9", "MAX+10", "MAX+11", "MAX+12", "MAX+13", "MAX+14", "MAX+15", "MAX+16" };

    /**
     * The short names for the voltages, formatted for text
     */
    public static final String[] VNF = new String[] {
        DARK_GRAY + "ULV",
        GRAY + "QLV",
        WHITE + "LV",
        GREEN + "LMV",
        DARK_GREEN + "MLV",
        DARK_AQUA + "MV",
        AQUA + "MHV",
        BLUE + "HV",
        DARK_BLUE + "QHV",
        GOLD + "LEV",
        YELLOW + "EV",
        LIGHT_PURPLE + "HEV",
        DARK_PURPLE + "SEV",
        RED + "IV",
        DARK_RED + "VIV",
        BOLD + RED + "SIV",
        BOLD + GOLD + "LuV",
        BOLD + YELLOW + "VLuV",
        BOLD + GREEN + "SLuV",
        BOLD + AQUA + "ZPM",
        BOLD + BLUE + "YPM",
        BOLD + DARK_PURPLE + "RPM",
        BOLD + DARK_AQUA + "QPM",
        BOLD + DARK_RED + "UHV",
        BOLD + GREEN + "UEV",
        BOLD + DARK_GREEN + "UIV",
        BOLD + YELLOW + "UXV",
        BOLD + BLUE + "OpV",
        BOLD + RED + "MAX",
        BOLD + WHITE + "MAX_TRUE"
    };

    private static final String MAX_PLUS = RED.toString() + BOLD + "M" + YELLOW + BOLD + "A" + GREEN + BOLD + "X" +
            AQUA + BOLD + "+" + LIGHT_PURPLE + BOLD;

    /**
     * The short names for the voltages, up to max Long, formatted for text
     */
    public static final String[] VOCNF = new String[] {
        DARK_GRAY + "ULV",
        GRAY + "QLV",
        WHITE + "LV",
        GREEN + "LMV",
        DARK_GREEN + "MLV",
        DARK_AQUA + "MV",
        AQUA + "MHV",
        BLUE + "HV",
        DARK_BLUE + "QHV",
        GOLD + "LEV",
        YELLOW + "EV",
        LIGHT_PURPLE + "HEV",
        DARK_PURPLE + "SEV",
        RED + "IV",
        DARK_RED + "VIV",
        BOLD + RED + "SIV",
        BOLD + GOLD + "LuV",
        BOLD + YELLOW + "VLuV",
        BOLD + GREEN + "SLuV",
        BOLD + AQUA + "ZPM",
        BOLD + BLUE + "YPM",
        BOLD + DARK_PURPLE + "RPM",
        BOLD + DARK_AQUA + "QPM",
        BOLD + DARK_RED + "UHV",
        BOLD + GREEN + "UEV",
        BOLD + DARK_GREEN + "UIV",
        BOLD + YELLOW + "UXV",
        BOLD + BLUE + "OpV",
        BOLD + RED + "MAX",
        BOLD + WHITE + "MAX+1",
        BOLD + WHITE + "MAX+2",
        BOLD + WHITE + "MAX+3",
        BOLD + WHITE + "MAX+4",
        BOLD + WHITE + "MAX+5",
        BOLD + WHITE + "MAX+6",
        BOLD + WHITE + "MAX+7",
        BOLD + WHITE + "MAX+8",
        BOLD + WHITE + "MAX+9",
        BOLD + WHITE + "MAX+10",
        BOLD + WHITE + "MAX+11",
        BOLD + WHITE + "MAX+12",
        BOLD + WHITE + "MAX+13",
        BOLD + WHITE + "MAX+14",
        BOLD + WHITE + "MAX+15",
        BOLD + WHITE + "MAX+16"
    };
/*
Old:     public static final String[] VOCNF = new String[] {
            DARK_GRAY + "ULV", GRAY + "LV", AQUA + "MV",
            GOLD + "HV", DARK_PURPLE + "EV", BLUE + "IV",
            LIGHT_PURPLE + "LuV", RED + "ZPM", DARK_AQUA + "UV",
            DARK_RED + "UHV", GREEN + "UEV", DARK_GREEN + "UIV",
            YELLOW + "UXV", BLUE.toString() + BOLD + "OpV", RED.toString() + BOLD + "MAX",
            MAX_PLUS + "1", MAX_PLUS + "2", MAX_PLUS + "3", MAX_PLUS + "4",
            MAX_PLUS + "5", MAX_PLUS + "6", MAX_PLUS + "7", MAX_PLUS + "8",
            MAX_PLUS + "9", MAX_PLUS + "10", MAX_PLUS + "11", MAX_PLUS + "12",
            MAX_PLUS + "13", MAX_PLUS + "14", MAX_PLUS + "15", MAX_PLUS + "16", };
*/

    /**
     * Color values for the voltages
     */
    public static final int[] VC = new int[] {
        0x2A2A2A, // ULV - DARK_GRAY
        0xAAAAAA, // QLV - GRAY
        0xFFFFFF, // LV - WHITE
        0x00FF00, // LMV - GREEN
        0x008000, // MLV - DARK_GREEN
        0x008B8B, // MV - DARK_AQUA
        0x00FFFF, // MHV - AQUA
        0x0000FF, // HV - BLUE
        0x00008B, // QHV - DARK_BLUE
        0xFFD700, // LEV - GOLD
        0xFFFF00, // EV - YELLOW
        0xEE82EE, // HEV - LIGHT_PURPLE
        0x800080, // SEV - DARK_PURPLE
        0xFF0000, // IV - RED
        0x8B0000, // VIV - DARK_RED
        0xFF5555, // SIV - BOLD RED (lighter red)
        0xFFC125, // LuV - BOLD GOLD (golden yellow)
        0xFFFF55, // VLuV - BOLD YELLOW (bright yellow)
        0x55FF55, // SLuV - BOLD GREEN (bright green)
        0x55FFFF, // ZPM - BOLD AQUA (bright aqua)
        0x5555FF, // YPM - BOLD BLUE (bright blue)
        0xAA00AA, // RPM - BOLD DARK_PURPLE
        0x00AAAA, // QPM - BOLD DARK_AQUA
        0xAA0000, // UHV - BOLD DARK_RED
        0x00AA00, // UEV - BOLD GREEN
        0x007700, // UIV - BOLD DARK_GREEN
        0xFFFFAA, // UXV - BOLD YELLOW (pale yellow)
        0x5555FF, // OpV - BOLD BLUE (repeat for overpowered)
        0xFF5555, // MAX - BOLD RED (repeat for max)
        0xFFFFFF, // MAX+1
        0xFFFFFF, // MAX+2
        0xFFFFFF, // MAX+3
        0xFFFFFF, // MAX+4
        0xFFFFFF, // MAX+5
        0xFFFFFF, // MAX+6
        0xFFFFFF, // MAX+7
        0xFFFFFF, // MAX+8
        0xFFFFFF, // MAX+9
        0xFFFFFF, // MAX+10
        0xFFFFFF, // MAX+11
        0xFFFFFF, // MAX+12
        0xFFFFFF, // MAX+13
        0xFFFFFF, // MAX+14
        0xFFFFFF, // MAX+15
        0xFFFFFF  // MAX+16
    };
/* old:
    public static final int[] VC = new int[] { 0xC80000, 0xDCDCDC, 0xFF6400, 0xFFFF1E, 0x808080, 0xF0F0F5, 0xE99797,
            0x7EC3C4, 0x7EB07E, 0xBF74C0, 0x0B5CFE, 0x914E91, 0x488748, 0x8C0000, 0x2828F5 };
*/

    /**
     * The long names for the voltages
     */
    public static final String[] VOLTAGE_NAMES = new String[] { "Ultra Low Voltage", "Quite Low Voltage", "Low Voltage", "Low Medium Voltage", "Medium Low Voltage", "Medium Voltage",
            "Medium High Voltage", "High Voltage", "Extreme Voltage", "High Extreme Voltage", "Super Extreme Voltage", "Insane Voltage", "Very Insane Voltage", "Super Insane Voltage",
            "Ludicrous Voltage", "Very Ludicrous Voltage", "Super Ludicrous Voltage", "ZPM Voltage", "YPM Voltage", "RPM Voltage", "QPM Voltage",
            "Ultra High Voltage", "Ultra Excessive Voltage", "Ultra Immense Voltage", "Ultra Extreme Voltage",
            "Overpowered Voltage", "Maximum Voltage" };

    /**
     * GregTech Mod ID
     */
    public static final String MODID = "gregtech";

    /**
     * GregTech Mod Name
     */
    public static final String MOD_NAME = "GregTech";

    private static Boolean isClient;

    public static boolean isClientSide() {
        if (isClient == null) isClient = FMLCommonHandler.instance().getSide().isClient();
        return isClient;
    }

    private static Boolean isDeobf;

    public static boolean isDeobfEnvironment() {
        if (isDeobf == null) isDeobf = FMLLaunchHandler.isDeobfuscatedEnvironment();
        return isDeobf;
    }

    /**
     * Default fallback value used for Map keys.
     * Currently only used in {@link gregtech.loaders.recipe.CraftingComponent}.
     */
    public static final int FALLBACK = -1;

    public static Supplier<Boolean> FOOLS = () -> {
        String[] yearMonthDay = LocalDate.now().toString().split("-");
        return ConfigHolder.misc.specialEvents && yearMonthDay[1].equals("04") && yearMonthDay[2].equals("01");
    };

    public static Supplier<Boolean> XMAS = () -> {
        String[] yearMonthDay = LocalDate.now().toString().split("-");
        return ConfigHolder.misc.specialEvents && yearMonthDay[1].equals("12") &&
                (yearMonthDay[2].equals("24") || yearMonthDay[2].equals("25"));
    };
}
