package view;

import Controller.Produto;
import Controller.Restaurante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditarProduto extends javax.swing.JFrame {

    private final Restaurante aux_rest = new Restaurante(Login.getUser_cod());//declara um objeto com o id do usuario logado

    public EditarProduto() {
        initComponents();
        nomeTF.setEnabled(false);//bloqueia a edição do nome do produto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painel_principal = new javax.swing.JPanel();
        painel_titulo = new javax.swing.JPanel();
        nome_restLB = new javax.swing.JLabel();
        painel_buttons = new javax.swing.JPanel();
        editarBTN = new javax.swing.JButton();
        cancelarBTN = new javax.swing.JButton();
        precoNormal = new javax.swing.JRadioButton();
        precoPromo = new javax.swing.JRadioButton();
        painel_dados = new javax.swing.JPanel();
        nomeLB = new javax.swing.JLabel();
        precoLB = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        precoTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UAiQueFome");
        setResizable(false);

        painel_principal.setBackground(new java.awt.Color(249, 160, 63));

        painel_titulo.setBackground(new java.awt.Color(249, 160, 63));

        nome_restLB.setBackground(new java.awt.Color(249, 160, 63));
        nome_restLB.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        nome_restLB.setForeground(new java.awt.Color(255, 255, 255));
        nome_restLB.setText("Nome do Restaurante");

        javax.swing.GroupLayout painel_tituloLayout = new javax.swing.GroupLayout(painel_titulo);
        painel_titulo.setLayout(painel_tituloLayout);
        painel_tituloLayout.setHorizontalGroup(
            painel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_tituloLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(nome_restLB, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        painel_tituloLayout.setVerticalGroup(
            painel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_tituloLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(nome_restLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        nome_restLB.setText(aux_rest.getNome());//preenche o label com o nome do restaurante

        painel_buttons.setBackground(new java.awt.Color(249, 160, 63));

        editarBTN.setBackground(java.awt.Color.darkGray);
        editarBTN.setForeground(new java.awt.Color(255, 255, 255));
        editarBTN.setText("Editar");
        editarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTNActionPerformed(evt);
            }
        });

        cancelarBTN.setBackground(java.awt.Color.darkGray);
        cancelarBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBTN.setText("Cancelar");
        cancelarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTNActionPerformed(evt);
            }
        });

        precoNormal.setBackground(new java.awt.Color(249, 160, 63));
        buttonGroup1.add(precoNormal);
        precoNormal.setForeground(new java.awt.Color(255, 255, 255));
        precoNormal.setText("Preço Normal");

        precoPromo.setBackground(new java.awt.Color(249, 160, 63));
        buttonGroup1.add(precoPromo);
        precoPromo.setForeground(new java.awt.Color(255, 255, 255));
        precoPromo.setText("Preço Promocional");

        javax.swing.GroupLayout painel_buttonsLayout = new javax.swing.GroupLayout(painel_buttons);
        painel_buttons.setLayout(painel_buttonsLayout);
        painel_buttonsLayout.setHorizontalGroup(
            painel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(precoNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(precoPromo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(editarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painel_buttonsLayout.setVerticalGroup(
            painel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_buttonsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(painel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoNormal)
                    .addComponent(precoPromo))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        painel_dados.setBackground(new java.awt.Color(249, 160, 63));

        nomeLB.setBackground(new java.awt.Color(249, 160, 63));
        nomeLB.setForeground(new java.awt.Color(255, 255, 255));
        nomeLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB.setText("Nome");

        precoLB.setBackground(new java.awt.Color(249, 160, 63));
        precoLB.setForeground(new java.awt.Color(255, 255, 255));
        precoLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precoLB.setText("Preço");

        nomeTF.setBackground(java.awt.Color.darkGray);
        nomeTF.setForeground(new java.awt.Color(249, 160, 63));

        precoTF.setBackground(java.awt.Color.darkGray);
        precoTF.setForeground(new java.awt.Color(249, 160, 63));
        precoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTFActionPerformed(evt);
            }
        });
        precoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoTFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoTFKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeLB, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        String prod = aux_rest.findProduto(InicioRestaurante.getId_prod());//variavel aux que vai receber a linha dos atributos do produto
        String[] aux_prod = prod.split(";");
        nomeTF.setText(aux_prod[1]);//preenche o campo de texto com o nome antigo
        if(Float.parseFloat(aux_prod[3]) != -1.0){//verifica se o produto está em promoção
            precoTF.setText(aux_prod[3]);
        }else{
            precoTF.setText(aux_prod[2]);//preenche o campo de texto com o preço antigo
        }

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(painel_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(painel_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(painel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTFActionPerformed

    }//GEN-LAST:event_precoTFActionPerformed

    private void editarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTNActionPerformed
        boolean flag = true;//flag que vai definir a possibilidade da edição
        String prod = aux_rest.findProduto(InicioRestaurante.getId_prod());//string com todos os atributos do produto
        String[] atributos_Prod = prod.split(";");//separa a linha de atributos em um vetor de string
        ArrayList<String> categorias = new ArrayList<>();//array list que vai receber as categorias do produto
        String[] aux_categorias = atributos_Prod[5].split(",");//separa as categorias em um vetor de strings
        for (int i = 0; i < aux_categorias.length; i++) {//atualiza a lista de categorias com as categorias do produto
            categorias.add(aux_categorias[i]);
        }
        if (precoTF.getText().equals("")) {//verifica se o campo foi deixado em branco
            flag = false;
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Aviso", JOptionPane.PLAIN_MESSAGE);
        }
        if (!precoNormal.isSelected() && !precoPromo.isSelected()) {//ferifica se nenhuma opção do tipo de preço foi selecionada
            flag = false;
            JOptionPane.showMessageDialog(null, "Selecione o tipo do preço!", "Aviso", JOptionPane.PLAIN_MESSAGE);
        }
        if (flag) {//caso seja possivel realizar o cadastro
            //cria um novo objeto que receber os atributos do produto alvo
            Produto produto = new Produto(atributos_Prod[0], aux_rest.getCnpj(), atributos_Prod[1], Integer.parseInt(atributos_Prod[4]), Float.parseFloat(atributos_Prod[2]), Float.parseFloat(atributos_Prod[3]), categorias);
            if (precoNormal.isSelected()) {//verifica se o tipo de preço é o normal
                if (Float.parseFloat(atributos_Prod[3]) != -1.0) {//verifica se está em promoção
                    if (precoTF.getText().equals(atributos_Prod[3])) {//verifica se o preço normal não foi alterado
                        produto.retirarPromocao();
                    }else{//edita o preço normal com o novo preço
                        produto.retirarPromocao();
                        produto.setPreco(Float.parseFloat(precoTF.getText()));//muda o preço do produto
                    }
                } else {
                    produto.setPreco(Float.parseFloat(precoTF.getText()));//muda o preço do produto
                }
                setVisible(false);
                new InicioRestaurante().setVisible(true);
            } else {
                //mesma coisa com o preço normal mas agora o preço promoção que é atualizado
                produto.setPrecoPromocao(Float.parseFloat(precoTF.getText()));
                setVisible(false);
                new InicioRestaurante().setVisible(true);
            }
        }
    }//GEN-LAST:event_editarBTNActionPerformed

    private void cancelarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTNActionPerformed
        //volta para a tela de inicio do restaurante
        setVisible(false);
        new InicioRestaurante().setVisible(true);
    }//GEN-LAST:event_cancelarBTNActionPerformed

    private void precoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTFKeyReleased
        mascaraDouble(precoTF);
    }//GEN-LAST:event_precoTFKeyReleased

    private void precoTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTFKeyTyped
        mascaraDouble(precoTF);
    }//GEN-LAST:event_precoTFKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelarBTN;
    private javax.swing.JButton editarBTN;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JLabel nome_restLB;
    private javax.swing.JPanel painel_buttons;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JPanel painel_titulo;
    private javax.swing.JLabel precoLB;
    private javax.swing.JRadioButton precoNormal;
    private javax.swing.JRadioButton precoPromo;
    private javax.swing.JTextField precoTF;
    // End of variables declaration//GEN-END:variables

    private void mascaraDouble(JTextField textField) {
        //Verifica se o número digitado é um valor do tipo double
        String texto = textField.getText();
        if (texto.length() > 0) {
            //Verifica o separador decimal e se é um número
            if (!(texto.charAt(texto.length() - 1) == '.' || (texto.charAt(texto.length() - 1) >= '0' && texto.charAt(texto.length() - 1) <= '9'))) {
                //Apaga o último caractere
                texto = texto.substring(0, texto.length() - 1);
            }
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                //Verifica se há mais de um Ponto
                if (texto.charAt(i) == '.') {
                    cont++;
                }
            }
            if (cont > 1) {
                //Apaga o último caractere
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }
}
