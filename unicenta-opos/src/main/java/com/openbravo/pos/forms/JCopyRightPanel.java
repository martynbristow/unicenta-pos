/*
 * Copyright (C) 2022 KriolOS
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.openbravo.pos.forms;

/**
 *
 * @author bellah
 */
public class JCopyRightPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private static final String OFICIAL_S = "https://github.com/poolborges/unicenta-pos";
    /**
     * Creates new form JCopyRightPanel
     */
    public JCopyRightPanel() {
        initComponents();
        
        copyRightLabel.setText("<html><center>"
                + "<h1>KriolOS POS - Open Source Point Of Sale</h1>"
                + "<p>More info on <href a=\""+OFICIAL_S+"\">official site</a></p>"
                + "<p>"+OFICIAL_S+"</p>"
                + "</center>"
                + "<br><br>"
                + "<h2>License: GPL v3</h2>"
                + "<br>"
                + "This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.<br>"
                + "<br>"
                + " This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.<br>"
                + "<br>"
                + "You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/<br>"
                + "</html>"
        );

        copyRightLabel.setAlignmentX(0.5F);
        copyRightLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copyRightLabel.setMaximumSize(new java.awt.Dimension(800, 1024));
        copyRightLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyRightLabel = new javax.swing.JLabel();

        copyRightLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        copyRightLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(copyRightLabel, org.openide.util.NbBundle.getMessage(JCopyRightPanel.class, "JCopyRightPanel.copyRightLabel.text")); // NOI18N
        copyRightLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        copyRightLabel.setAlignmentX(0.5F);
        copyRightLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copyRightLabel.setMaximumSize(new java.awt.Dimension(800, 1024));
        copyRightLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(copyRightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(copyRightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel copyRightLabel;
    // End of variables declaration//GEN-END:variables
}
