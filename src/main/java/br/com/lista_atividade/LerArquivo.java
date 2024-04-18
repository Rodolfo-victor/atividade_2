package br.com.lista_atividade;

import java.io.*;


public class LerArquivo{
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("meuarquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler arquivo!");
            e.printStackTrace();
        }
    }
}