import java.util.ArrayList;
import java.util.List;

public class ItensAEmbalar {
    public List<ItemASerEmbaladoIF> itensEmbalar = new ArrayList<>();

    public void adicionaItem(ItemASerEmbaladoIF item){
        itensEmbalar.add(item);
    }
    public double calcularQtdDeEmbalar(int posicao){
        ItemASerEmbaladoIF item = itensEmbalar.get(posicao);
        return item.getArea() * item.getPeso();
    }
    public Double calculaQtdTotalDeEmbalar(){
        Double qtdTotal = 0.0;
        for (int i = 0; i < itensEmbalar.size(); i++) {
            qtdTotal += calcularQtdDeEmbalar(i);
        }
        return qtdTotal;
    }
}
