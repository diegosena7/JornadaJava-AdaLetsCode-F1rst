package orientacao_objetos_solid.project.solid.s.superclasse;

public class Servicos {

    private Double valorBanho;
    private Double valorTosa;
    private Double valorBanhoMaisTosa;

    private Double valorDiaria;

    public Servicos() {
    }

    public Double getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(Double valorBanho) {
        this.valorBanho = valorBanho;
    }

    public Double getValorTosa() {
        return valorTosa;
    }

    public void setValorTosa(Double valorTosa) {
        this.valorTosa = valorTosa;
    }

    public Double tosarPet(){
        return this.valorTosa;
    }

    public Double getValorBanhoMaisTosa() {
        return valorBanhoMaisTosa;
    }

    public void setValorBanhoMaisTosa(Double valorBanhoMaisTosa) {
        this.valorBanhoMaisTosa = valorBanhoMaisTosa;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Double calculaValorBanhosCachorro(Integer qtidadeBanhos, Double valorBanho){
        return qtidadeBanhos * valorBanho;
    }

    public Double calulaValorTosaCachorro(Integer qtidadeTosas, Double valorTosa){
        return qtidadeTosas * valorTosa;
    }

    public Double calculaValorEstadia(Integer qtidadeDias, Double valorDiaria){
     return qtidadeDias * valorDiaria;
    }
}
