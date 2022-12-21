package estrutura_de_dados.map;

import java.util.*;

public class MainMaps {

    static Scanner inputUser = new Scanner(System.in);
    static Map<String,Object> map = new HashMap<>();

    public static void main(String[] args) {


    Map<String,Object> map = new HashMap<>();
    map.put("nome", "Diego");
    map.put("sobrenome", "Sena");
    map.put("idade", 33);

    map.put("nome1", "Nayara");
    map.put("sobrenome1", "Andrade");
    map.put("idade1", 34);

        map.forEach((key,value) -> {
            System.out.println("Chave: " + key + " - Valor: " + value);
            });

//        MainMaps mainMaps = new MainMaps();
//        String opcoesUser = "";
//        do{
//            mainMaps.informaDados();
//            opcoesUser = mainMaps.menuOpoes();
//        }while (opcoesUser.equals("1"));
//            mainMaps.imprimeDadosUser();
//            opcoesUser = mainMaps.menuOpoes();
//
//        mainMaps.imprimeDadosUser();
//    }

//    public String menuOpoes(){
//        System.out.println("Se deseja informar dados digte 1, se não, digite 2 (OBS: Informe os dados no formato chave/valor)");
//        String opcaoUser = inputUser.next();
//        return opcaoUser;
//    }
//
//    public void informaDados(){
//        System.out.println("Informe a chave: ");
//        String key = inputUser.nextLine();
//        System.out.println("Informe o valor: ");
//        String value = inputUser.nextLine();
//        map.put(key, value);
    }
//
//    public void imprimeDadosUser(){
//        map.forEach((key,value) -> {
//            System.out.println("Chave: " + key + " - Valor: " + value);
//                }
//        );
//    }
}
