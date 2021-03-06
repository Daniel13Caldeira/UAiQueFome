/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Produto {

    private String codigo;
    private String restaurante;
    private String nome;
    private int quantidade;
    private float preco;
    private ArrayList<String> categorias;
    private float precoPromocao;

    public float getPreco() {
        if (this.precoPromocao == -1) {
            return this.preco;
        }
        return this.precoPromocao;
    }

    public Produto(String codigo, String restaurante, String nome, int quantidade, float preco, float precoPromocao) {
        this.codigo = codigo;
        this.restaurante = restaurante;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoPromocao = precoPromocao;
    }

    public Produto(String codigo, String restaurante, String nome, int quantidade, float preco, float precoPromocao, ArrayList<String> categorias) {
        this.codigo = codigo;
        this.restaurante = restaurante;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoPromocao = precoPromocao;
        this.categorias = categorias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoPromocao() {
        return precoPromocao;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

}
