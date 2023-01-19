package orientacao_objetos_solid.project.solid.s;

import orientacao_objetos_solid.project.solid.o.Calculos;
import orientacao_objetos_solid.project.solid.s.model.Cachorro;

public class Checkout {

    private Double estadia;

    private Double visitante = 150.0;
    private Double banho;
    private Double tosa;
    private Cachorro cachorro;

    public Checkout(Double estadia, Double banho, Double tosa, Cachorro cachorro) {
        this.estadia = estadia;
        this.banho = banho;
        this.tosa = tosa;
        this.cachorro = cachorro;
    }

    public Double getEstadia() {
        return estadia;
    }

    public void setEstadia(Double estadia) {
        this.estadia = estadia;
    }

    public Double getBanho() {
        return banho;
    }

    public void setBanho(Double banho) {
        this.banho = banho;
    }

    public Double getTosa() {
        return tosa;
    }

    public void setTosa(Double tosa) {
        this.tosa = tosa;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Double getValorFinal(Calculos calculo){
        return calculo.getValorFinal(this);
    }
}
