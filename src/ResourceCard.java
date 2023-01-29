package src;

public class ResourceCard { //stores a single material
    private final Material material;

    public ResourceCard(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
}
