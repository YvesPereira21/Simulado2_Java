import java.util.Objects;

public class MalaRetangular extends ItemAEmbalar{
    private double comprimento;
    private double largura;

    public MalaRetangular(String material, double comprimento, double largura, int peso) {
        super(material, peso);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double getArea() {
        return comprimento * largura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MalaRetangular that = (MalaRetangular) o;
        return Double.compare(that.comprimento, comprimento) == 0 && Double.compare(that.largura, largura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comprimento, largura);
    }

    @Override
    public String toString() {
        return "MalaRetangular{" +
                "comprimento=" + getComprimento() +
                ", largura=" + getLargura() +
                ", peso=" + getPeso() +
                ", area=" + getArea() +
                '}';
    }
}
