package mod.upcraftlp.offhandtweaks;

import com.google.common.collect.Lists;
import net.minecraft.util.text.TextFormatting;

import java.time.Year;
import java.util.List;

public class Reference {

    //VERSION
    public static final String MCVERSIONS = "[1.12, 1.13)";
    public static final String VERSION = "@VERSION@";

    //MISC INFORMATION
    public static final List<String> authors = Lists.newArrayList(
            "UpcraftLP"
    );
    public static final String MOD_DESCRIPTION = "More functionality to the offhand!";
    public static final String CREDITS = TextFormatting.GOLD + "(C)" + "2017-" + Year.now().getValue() + " UpcraftLP";

    //META Information
    public static final String MODNAME = "Offhand Tweaks";
    public static final String MODID = "offhandtweaks";
    public static final String DEPENDENCIES = "";
    public static final String UPDATE_JSON = "https://raw.githubusercontent.com/UpcraftLP/Offhand-Tweaks/master/versions.json";
    public static final String WEBSITE = "https://minecraft.curseforge.com/projects/offhand-tweaks";

    public static final String CLIENTPROXY = "mod.upcraftlp.offhandtweaks.proxy.ClientProxy";
    public static final String SERVERPROXY = "mod.upcraftlp.offhandtweaks.proxy.ServerProxy";
    public static final String FINGERPRINT_KEY = "@FINGERPRINT@";
}
