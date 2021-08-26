import basemod.BaseMod;
import basemod.interfaces.PostInitializeSubscriber;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

@SpireInitializer
public class SolveTheSpire implements PostInitializeSubscriber {
    public static void initialize(){
        SolveTheSpire solveTheSpire = new SolveTheSpire();
        System.out.println("It's the test mod hello maybe");
    }

    public SolveTheSpire(){
        BaseMod.subscribe(this);
    }

    @Override
    public void receivePostInitialize() {

    }
}
