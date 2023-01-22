import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        CaixaEntrada ce = new CaixaEntrada();
        Email email1 = new Email();
        email1.setEnd_remetente("manovoutomarbanho@gmail.com");
        email1.setAssunto("Mandem boladão");
        email1.setData_envio(LocalDate.of(2022,10,10));
        email1.setData_recebimento(LocalDate.of(2022,10,10));
        email1.setTexto("Bla bla");

        Email email2 = new Email();
        email2.setEnd_remetente("manovoutomarbanho@gmail.com.jp");
        email2.setAssunto("Mandem demandas");
        email2.setData_envio(LocalDate.of(2023,01,18));
        email2.setData_recebimento(email2.getData_envio());
        email2.setTexto("Bla bla");

        Email email3 = new Email();
        email3.setEnd_remetente("cotato@patatipatata.com.br");
        email3.setAssunto("Mandem Nudes");
        email3.setData_envio(LocalDate.of(2022,06,10));
        email3.setData_recebimento(LocalDate.of(2022,06,10));
        email3.setTexto("Bla bla");

        Email email4 = new Email();
        email4.setEnd_remetente("cotato@patatipatata.com");
        email4.setAssunto("Mandem pix");
        email4.setData_envio(LocalDate.of(2023,01,18));
        email4.setData_recebimento(email4.getData_envio());
        email4.setTexto("Bla bla");

        ce.adicionarEmail(email1);
        ce.adicionarEmail(email2);
        ce.adicionarEmail(email3);
        ce.adicionarEmail(email4);
        ce.totalCatalogoEndereco();
        ce.totalEmailsPorRemetente("cotato@patatipatata.com");
//        ce.removerEmailsAntigos(LocalDate.of(2022,07,10));
        ce.totalCatalogoEndereco();
        ce.totalEmailsPorRemetente("manovoutomarbanho@gmail.com");
//        ce.totalEmailsPorRemetente("cotato@patatipatata.com");
        ce.listarRemetentesDeHoje();
//        ce.removerEmailsAntigosPorContato(LocalDate.of(2022,12,31), "cotato@patatipatata.com");
        ce.totalEmailsPorRemetente("cotato@patatipatata.com");

        ArrayList<String> listaBusca = new ArrayList();
        listaBusca.add("Nudes");
        listaBusca.add("Pix");
        listaBusca.add("Demandas");

        ce.buscarRementeEmailPorPalavraChave(listaBusca);
        ce.buscarEmailPorPalavraChave(listaBusca);

        ce.removerEmailPorPalavraChave(listaBusca);

        ce.totalEmailsPorRemetente("cotato@patatipatata.com");
        ce.totalEmailsPorRemetente("manovoutomarbanho@gmail.com");

        ce.mostrarEmailPorPaís("jp");

    }

}
