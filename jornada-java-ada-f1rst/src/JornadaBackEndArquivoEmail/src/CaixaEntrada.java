import java.time.LocalDate;
import java.util.ArrayList;

public class CaixaEntrada {

    private MailMap caixaEntrada = new MailMap();

    public MailMap getCaixaEntrada() {
        return caixaEntrada;
    }

    public void setCaixaEntrada(MailMap caixaEntrada) {
        this.caixaEntrada = caixaEntrada;
    }

    public void adicionarEmail(Email email){
        caixaEntrada.add(email);
    }

    public void totalCatalogoEndereco(){
        System.out.println(caixaEntrada.getTotal());
    }

    public void totalEmailsPorRemetente(String remetente) throws Exception {
        System.out.println(caixaEntrada.getTotalPorRemetente(remetente));
    }

    public void removerEmailsAntigos(LocalDate localDate){
        caixaEntrada.removerEmailsPorData(localDate);
    }

    public void listarRemetentesDeHoje(){
        System.out.println(caixaEntrada.getRemetentesDiario());
    }

    public void removerEmailsAntigosPorContato(LocalDate localDate, String remetente){
        caixaEntrada.removerPorDataERemetente(localDate, remetente);
    }

    public void buscarRementeEmailPorPalavraChave(ArrayList<String> listaDePalavras){
        System.out.println(caixaEntrada.buscarPorBlockList(listaDePalavras));
    }

    public void buscarEmailPorPalavraChave(ArrayList<String> listaDePalavras){
        System.out.println(caixaEntrada.buscarEmailBlockList(listaDePalavras));
    }

    public void removerEmailPorPalavraChave(ArrayList<String> listaDePalavras){
        caixaEntrada.removerEmailBlockList(listaDePalavras);
    }

    public void mostrarEmailPorPaís(String siglaPais){
        System.out.println(caixaEntrada.getPorPais(siglaPais));
    }

}
