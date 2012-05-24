/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaPrincipal.java
 *
 * Created on 2/Abr/2012, 14:48:58
 */
package main;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.*;
import metodos.PesquisaLarguraPrimeiro;
import sokoban.SokobanResolver;

/**
 *
 * @author Leonardo Lino
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    private PuzzleTableModel puzzleTableModel;
    private JTable tabelaPuzzle = new JTable();
    private JFileChooser jf = new JFileChooser();
    private SokobanResolver sokobanResolver;
    //private EstadoSokoban puzzle;

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolhaPuzzle = new javax.swing.JComboBox();
        painelPuzzle = new javax.swing.JPanel();
        botaoEscolherPuzzle = new javax.swing.JButton();
        botaoResolver = new javax.swing.JButton();
        botaoMostrarSolucao = new javax.swing.JButton();
        comboMetodo = new javax.swing.JComboBox(SokobanResolver.getNomesMetodos());
        comboHeuristica = new javax.swing.JComboBox(SokobanResolver.getNomesHeuristicas());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sokoban");
        setName("JanelaPrincipal");

        escolhaPuzzle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Problema...", "soko001.txt", "soko002.txt", "soko003.txt", "soko004.txt" }));
        escolhaPuzzle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                escolhaPuzzleItemStateChanged(evt);
            }
        });

        botaoEscolherPuzzle.setText("Escolher puzzle");
        botaoEscolherPuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscolherPuzzleActionPerformed(evt);
            }
        });

        botaoResolver.setText("Resolver");
        botaoResolver.setEnabled(false);
        botaoResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResolverActionPerformed(evt);
            }
        });

        botaoMostrarSolucao.setText("Mostrar solução");
        botaoMostrarSolucao.setEnabled(false);
        botaoMostrarSolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostrarSolucaoActionPerformed(evt);
            }
        });

        comboMetodo.setSelectedItem(PesquisaLarguraPrimeiro.NOME);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(escolhaPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoEscolherPuzzle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoResolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoMostrarSolucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboHeuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 470, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelPuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoEscolherPuzzle, botaoMostrarSolucao, botaoResolver, escolhaPuzzle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escolhaPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEscolherPuzzle)
                    .addComponent(comboMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoResolver)
                    .addComponent(botaoMostrarSolucao)
                    .addComponent(comboHeuristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelPuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoEscolherPuzzle, botaoMostrarSolucao, botaoResolver, escolhaPuzzle});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escolhaPuzzleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_escolhaPuzzleItemStateChanged
        if (escolhaPuzzle.getSelectedIndex() != 0) {
            String escolha = (String) escolhaPuzzle.getSelectedItem();
            File file = new File("src/puzzles/" + escolha);
            try {
                setPuzzle(lerFicheiroProblema(file));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro com a leitura do ficheiro: " + ex.getMessage(),
                        "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_escolhaPuzzleItemStateChanged

    private void botaoResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResolverActionPerformed
        botaoEscolherPuzzle.setEnabled(false);
        botaoResolver.setEnabled(false);
        new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() {
                String metodo = (String) comboMetodo.getSelectedItem();
                String heuristica = (String) comboHeuristica.getSelectedItem();
                System.out.println("Método: " + metodo);
                System.out.println("Heurística: " + heuristica);
                sokobanResolver.setMetodoPesquisa(metodo);
                sokobanResolver.resolverProblema(heuristica);
                return null;
            }

            @Override
            protected void done() {
                if (sokobanResolver.temSolucao()) {
                    botaoMostrarSolucao.setEnabled(true);
                    System.out.println("Custo da solução: " + sokobanResolver.getCustoSolucao());
                    System.out.println("Profundidade da solução: " + sokobanResolver.getProfundidadeSolucao());
                    System.out.println("Tempo de pesquisa: " + Math.round(sokobanResolver.getTempoPesquisa() / 1000000) + " ms");
                } else {
                    String mensagem;
                    if(sokobanResolver.isCompleto()){
                        mensagem = "O problema não tem solução";
                    } else {
                        mensagem = "Não foi encontrada solução";
                    }
                    JOptionPane.showMessageDialog(rootPane, mensagem,
                            "Sem solução", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Tempo de pesquisa: " + Math.round(sokobanResolver.getTempoPesquisa() / 1000000) + " ms");
                }
                botaoEscolherPuzzle.setEnabled(true);
                botaoResolver.setEnabled(true);
            }
        }.execute();
    }//GEN-LAST:event_botaoResolverActionPerformed

    private void botaoEscolherPuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscolherPuzzleActionPerformed
        carregarProblema();
    }//GEN-LAST:event_botaoEscolherPuzzleActionPerformed

    private void botaoMostrarSolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostrarSolucaoActionPerformed
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                botaoMostrarSolucao.setEnabled(false);
                sokobanResolver.mostrarSolucao();
                return null;
            }
        }.execute();
    }//GEN-LAST:event_botaoMostrarSolucaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    public static char[][] lerFicheiroProblema(File f) throws Exception {
        ArrayList<char[]> listaLinhas = new ArrayList<char[]>();
        BufferedReader br = new BufferedReader(new FileReader(f));

        String linha = br.readLine();
        while (linha != null) {
            listaLinhas.add(linha.toCharArray());
            linha = br.readLine();
        }

        char[][] tabela = listaLinhas.toArray(new char[0][0]);
        traduzirProblema(tabela);

        return listaLinhas.toArray(new char[0][0]);
    }

    public void carregarProblema() {
        char[][] chars;
        File fich;
        jf.setCurrentDirectory(new File("src/puzzles"));
        int resposta = jf.showOpenDialog(this);
        if (resposta == JFileChooser.APPROVE_OPTION) {
            fich = jf.getSelectedFile();
        } else {
            return;
        }

        try {
            chars = lerFicheiroProblema(fich);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro com a leitura do ficheiro: " + ex.getMessage(),
                    "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (SokobanResolver.isSokobanValido(chars)) {
            setPuzzle(chars);
        } else {
            JOptionPane.showMessageDialog(rootPane, "O ficheiro indicado não contém um problema de Sokoban válido.",
                    "Erro", JOptionPane.WARNING_MESSAGE);
            carregarProblema();
        }
    }

    public static void traduzirProblema(char[][] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                switch (tabela[i][j]) {
                    case '#':
                        tabela[i][j] = 'P';
                        break;
                    case '.':
                        tabela[i][j] = 'O';
                        break;
                    case '@':
                        tabela[i][j] = 'A';
                        break;
                    case '$':
                        tabela[i][j] = 'C';
                        break;
                    case '*':
                        tabela[i][j] = 'X';
                        break;
                    case ' ':
                        tabela[i][j] = 'V';
                }
            }
        }
    }

    private void setPuzzle(char[][] tabela) {
        if (sokobanResolver == null) {
            sokobanResolver = new SokobanResolver(tabela);
        } else {
            sokobanResolver.setProblema(tabela);
        }
        puzzleTableModel = new PuzzleTableModel(sokobanResolver.getPuzzleInicial());
        configurarTabela();
        botaoResolver.setEnabled(true);
    }

    private void configurarTabela() {
        tabelaPuzzle.setModel(puzzleTableModel);
        tabelaPuzzle.setDefaultRenderer(Object.class, new PecaPuzzleCellRenderer());
        for (int i = 0; i < tabelaPuzzle.getColumnCount(); i++) {
            tabelaPuzzle.getColumnModel().getColumn(i).setPreferredWidth(Propriedades.CELL_WIDTH);
        }

        tabelaPuzzle.setRowHeight(Propriedades.CELL_HEIGHT);
        tabelaPuzzle.setBorder(BorderFactory.createLineBorder(Color.black));
        painelPuzzle.add(tabelaPuzzle);
        pack();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEscolherPuzzle;
    private javax.swing.JButton botaoMostrarSolucao;
    private javax.swing.JButton botaoResolver;
    private javax.swing.JComboBox comboHeuristica;
    private javax.swing.JComboBox comboMetodo;
    private javax.swing.JComboBox escolhaPuzzle;
    private javax.swing.JPanel painelPuzzle;
    // End of variables declaration//GEN-END:variables
}
