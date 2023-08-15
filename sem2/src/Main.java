import java.util.ArrayList;

public class  Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new GemGenerator();
        generator.openReward();
        generator = new ArmorGenerator();
        generator.openReward();

        ArrayList<ItemFabric> l = new ArrayList<>();
        l.add(new GemGenerator());
        l.add(new ArmorGenerator());
        for (ItemFabric itemFabric : l) {
            itemFabric.openReward();
        }


    }
}
