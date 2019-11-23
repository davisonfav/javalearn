import entities.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Olá mundo");

        double x = 10.4875;
        System.out.printf("%.2f%n", x);
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.printf("%.2f%n", x);

        Produto produto = new Produto();
        produto.setNome("Televisão");
        produto.setPreco(1200.00);

        System.out.printf("Nome: %s - Valor: %.2f%n", produto.getNome(), produto.getPreco());

        List<String> lista = new ArrayList<>();
        lista.add("Alice");
        lista.add("Davison");
        lista.add("Lara");
        lista.add("Rosane");

        List<String> listaFiltrada = lista.stream().filter(f -> f.contains("n")).collect(Collectors.toList());
        System.out.println("Itens com 'n':");
        for(String item: listaFiltrada){
            System.out.println(item);
        }

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = sdf1.parse("19/11/2019 23:00:00");
        Date agora = new Date();
        System.out.println(data);
        System.out.println(agora);
//        Scanner sc = new Scanner(System.in);
//
//        String texto = sc.next();
//        System.out.println(texto);
//
//        sc.close();

    }
}
