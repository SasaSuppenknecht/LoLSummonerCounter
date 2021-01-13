import java.util.Arrays;
import java.util.List;

public enum SummonerSpells {
    FLASH(300),
    HEAL(240),
    CLARITY(240),
    EXHAUST(210),
    GHOST(210),
    CLEANSE(210),
    BARRIER(180),
    IGNITE(180),
    TELEPORT(240); // TODO

    private final int COOLDOWN;

    private SummonerSpells(int cooldown){
        this.COOLDOWN = cooldown;
    }

    public int getCOOLDOWN(){
        return this.COOLDOWN;
    }

    public static List<SummonerSpells> getAllAsStrings (){
        List<SummonerSpells> ll = Arrays.asList(SummonerSpells.values());
        return ll;
    }
}
