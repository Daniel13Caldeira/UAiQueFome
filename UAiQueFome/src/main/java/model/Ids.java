/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author danie
 */
public class Ids {

    private static File abreArquivo() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            return new File("dados\\ids.txt");
        } else {
            //File arquivo = new File("caminho linux");
            return new File("dados//ids.txt");
        }
    }

    public static void setIdProduto() {
        File arquivo = abreArquivo();
        String idProduto = "", idPedido = "";
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            idProduto = leitor.readLine();
            if (idProduto == null) {
                idProduto = "0";
                idPedido = "0";
            } else {
                idPedido = leitor.readLine();//primeira linha a ser salvo
            }
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
        } catch (IOException ex) {
            //erro(arquivo);
        }
        idProduto = String.valueOf(Integer.parseInt(idProduto) + 1);
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve no arquivo e vai pra próxima linha
            escritor.write(idProduto);
            escritor.newLine();
            escritor.write(idPedido);
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
            //erro(arquivo);
        }
    }

    public static void setIdPedido() {
        File arquivo = abreArquivo();
        String idProduto = "", idPedido = "";
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            idProduto = leitor.readLine();
            if (idProduto == null) {
                idProduto = "0";
                idPedido = "0";
            } else {
                idPedido = leitor.readLine();//primeira linha a ser salvo
            }
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
        } catch (IOException ex) {
            //erro(arquivo);
        }
        idPedido = String.valueOf(Integer.parseInt(idPedido) + 1);
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve no arquivo e vai pra próxima linha
            escritor.write(idProduto);
            escritor.newLine();
            escritor.write(idPedido);
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
            //erro(arquivo);
        }
    }

    public static String getIdProduto() {
        File arquivo = abreArquivo();
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha a ser salvo
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
            return linha;
        } catch (IOException ex) {
            //erro(arquivo);
        }
        return "";
    }

    public static String getIdPedido() {
        File arquivo = abreArquivo();
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();
            String linha = leitor.readLine();//primeira linha a ser salvo
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
            return linha;
        } catch (IOException ex) {
            //erro(arquivo);
        }
        return "";
    }
}