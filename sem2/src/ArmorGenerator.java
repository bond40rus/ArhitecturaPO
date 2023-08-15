public class ArmorGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new ArmorReward();
    }
}
