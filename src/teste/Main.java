package teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final int TOTAL = 100_000;
        final int REMOVER = 50_000;

        // Testando com ArrayList
        List<Integer> arrayList = new ArrayList<>();
        long inicioArray = System.currentTimeMillis();

        for (int i = 0; i < TOTAL; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < REMOVER; i++) {
            arrayList.remove(0); // remove do início
        }

        long fimArray = System.currentTimeMillis();
        System.out.println("⏱ Tempo com ArrayList: " + (fimArray - inicioArray) + " ms");

        // Testando com LinkedList
        List<Integer> linkedList = new LinkedList<>();
        long inicioLinked = System.currentTimeMillis();

        for (int i = 0; i < TOTAL; i++) {
            linkedList.add(i);
        }

        for (int i = 0; i < REMOVER; i++) {
            linkedList.remove(0); // remove do início
        }

        long fimLinked = System.currentTimeMillis();
        System.out.println("⏱ Tempo com LinkedList: " + (fimLinked - inicioLinked) + " ms");
    }
}
