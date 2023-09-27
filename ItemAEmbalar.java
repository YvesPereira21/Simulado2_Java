public abstract class ItemAEmbalar implements ItemASerEmbaladoIF{
    private String material;
    private double peso;

    public ItemAEmbalar(String material, double peso) {
        this.material = material;
        this.peso = peso;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public double getPeso() {
        return peso;
    }

}
