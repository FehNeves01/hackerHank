/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.fehneveshackerhank.hackerhank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipeneves
 *
 * link desafio
 *
 * https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class HackerHank {

    public static void main(String[] args) {
        List<Integer> b = preparandoLista();
        List<Integer> a = removeDuplicatas(b);
        int contagem = 0;

        for (int i = 0; i < a.size(); i++) {
            int contagemMesmoElemento = 0;
            if (b.contains(a.get(i))) {
                for (int idx = 0; idx < b.size(); idx++) {

                    if (a.get(i) == b.get(idx)) {
                        contagemMesmoElemento += 1;
                    }
                }
                if (contagemMesmoElemento % 2 == 0) {
                    contagem += contagemMesmoElemento / 2;
                } else {
                    contagemMesmoElemento -= 1;
                    contagem += contagemMesmoElemento / 2;
                }
                contagemMesmoElemento = 0;

            };

        }

        System.out.println(contagem);

    }

    private static List<Integer> preparandoLista() {
        int[] conteudo = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        List<Integer> a = new ArrayList<>();

        for (int each : conteudo) {

            a.add(each);
        }

        return a;
    }

    private static List<Integer> removeDuplicatas(List<Integer> lista) {
        List<Integer> noDuplicatas = new ArrayList<>();
        for (int each : lista) {
            if (!noDuplicatas.contains(each)) {
                noDuplicatas.add(each);
            }
        }
        return noDuplicatas;
    }

}
