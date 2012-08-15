package org.netbeans.modules.scss.options;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;

final class ScssPanel extends javax.swing.JPanel implements ChangeListener {

    ScssPanel(ScssOptionsPanelController controller) {
        initComponents();
        jRBundledRuntime.addChangeListener(this);
        jRExternalRuntime.addChangeListener(this);
        jRBundledRuntime.setSelected(ScssSettings.getDefault().isBundleVersion());
        jRExternalRuntime.setSelected(!jRBundledRuntime.isSelected());
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblExternalVersion = new javax.swing.JLabel();
        btnBrowseSassPath = new javax.swing.JButton();
        lblSassPath = new javax.swing.JLabel();
        txtSassPath = new javax.swing.JTextField();
        jRExternalRuntime = new javax.swing.JRadioButton();
        jRBundledRuntime = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbCompileOnSave = new javax.swing.JCheckBox();
        cbOutputStyle = new javax.swing.JComboBox();
        cbLineComments = new javax.swing.JCheckBox();
        cbDebugInfo = new javax.swing.JCheckBox();
        lblBundleVersion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lblExternalVersion.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.lblExternalVersion.text")); // NOI18N

        btnBrowseSassPath.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.btnBrowseSassPath.text")); // NOI18N
        btnBrowseSassPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseSassPathActionPerformed(evt);
            }
        });

        lblSassPath.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.lblSassPath.text")); // NOI18N

        txtSassPath.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.txtSassPath.text")); // NOI18N
        txtSassPath.setMaximumSize(new java.awt.Dimension(6, 20));

        buttonGroup1.add(jRExternalRuntime);
        org.openide.awt.Mnemonics.setLocalizedText(jRExternalRuntime, org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.jRExternalRuntime.text")); // NOI18N

        buttonGroup1.add(jRBundledRuntime);
        org.openide.awt.Mnemonics.setLocalizedText(jRBundledRuntime, org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.jRBundledRuntime.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.jLabel2.text")); // NOI18N

        cbCompileOnSave.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.cbCompileOnSave.text")); // NOI18N
        cbCompileOnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompileOnSaveActionPerformed(evt);
            }
        });

        cbOutputStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "compact", "compressed", "expanded", "nested" }));

        cbLineComments.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.cbLineComments.text")); // NOI18N
        cbLineComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLineCommentsActionPerformed(evt);
            }
        });

        cbDebugInfo.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.cbDebugInfo.text")); // NOI18N
        cbDebugInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDebugInfoActionPerformed(evt);
            }
        });

        lblBundleVersion.setText(org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.lblBundleVersion.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(ScssPanel.class, "ScssPanel.jLabel4.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSassPath)
                                .addGap(18, 18, 18)
                                .addComponent(txtSassPath, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBrowseSassPath))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRBundledRuntime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBundleVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRExternalRuntime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblExternalVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(205, 205, 205))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOutputStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbLineComments)
                                .addGap(52, 52, 52)
                                .addComponent(cbDebugInfo))
                            .addComponent(cbCompileOnSave))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBundledRuntime)
                    .addComponent(lblBundleVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRExternalRuntime)
                    .addComponent(lblExternalVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSassPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowseSassPath)
                    .addComponent(lblSassPath))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOutputStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLineComments)
                    .addComponent(cbDebugInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCompileOnSave)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbDebugInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDebugInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDebugInfoActionPerformed

    private void cbLineCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLineCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLineCommentsActionPerformed

    private void cbCompileOnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompileOnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCompileOnSaveActionPerformed

    private void btnBrowseSassPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseSassPathActionPerformed
        JFileChooser chooser = new JFileChooser(txtSassPath.getText());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = chooser.showDialog(
            SwingUtilities.getWindowAncestor(this),
            org.openide.util.NbBundle.getMessage(ScssPanel.class, "LBL_Select"));
        if (r == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (!file.isDirectory() || file.getPath().contains(" ")) {
                DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message(
                    NbBundle.getMessage(ScssPanel.class, "ERROR_NotFile", file),
                    NotifyDescriptor.Message.WARNING_MESSAGE));
            return;
        }
        file = FileUtil.normalizeFile(file);
        txtSassPath.setText(file.getAbsoluteFile().toString());
        displayVersion();
        }
    }//GEN-LAST:event_btnBrowseSassPathActionPerformed

    void load() {
        txtSassPath.setText(ScssSettings.getDefault().getSassPath());
        displayVersion();
        cbCompileOnSave.setSelected(ScssSettings.getDefault().isCompileOnSave());
        cbLineComments.setSelected(ScssSettings.getDefault().isLineCommentsEnabled());
        cbDebugInfo.setSelected(ScssSettings.getDefault().isDebugInfoEnabled());
        cbOutputStyle.setSelectedIndex(ScssSettings.getDefault().getOutputStyle().id);
//        jRExternalRuntime.setSelected(true);
        txtSassPath.setVisible(jRExternalRuntime.isSelected());
        btnBrowseSassPath.setVisible(jRExternalRuntime.isSelected());
        lblExternalVersion.setVisible(jRExternalRuntime.isSelected());
        lblSassPath.setVisible(jRExternalRuntime.isSelected());
    }

    void store() {
        ScssSettings.getDefault().setHamlPath(txtSassPath.getText());
        ScssSettings.getDefault().setCompileOnSave(cbCompileOnSave.isSelected());
        ScssSettings.getDefault().setLineCommentsEnabled(cbLineComments.isSelected());
        ScssSettings.getDefault().setDebugInfoEnabled(cbDebugInfo.isSelected());
        ScssSettings.getDefault().setOutputStyle(cbOutputStyle.getSelectedIndex());
        ScssSettings.getDefault().setBundle(jRBundledRuntime.isSelected());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    void displayVersion() {
        String version = null;
        File file = new File(txtSassPath.getText());
        if (file.exists()) {
            if (new File(file, "lib" + File.separator + "sass" + File.separator + "engine.rb").exists()
                    || new File("engine.rb").canExecute()) { //NOI18N
                version = ScssSettings.getSassVersion(file);
            }
        }

        if (version != null) {
            lblExternalVersion.setText(NbBundle.getMessage(ScssPanel.class, "LBL_HamlVersion", version));
        } else {
            lblExternalVersion.setText(NbBundle.getMessage(ScssPanel.class, "ERR_NoValidInstallation"));
        }
        version = ScssSettings.getBundleVersion();
        lblBundleVersion.setText(NbBundle.getMessage(ScssPanel.class, "LBL_HamlVersion", version));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseSassPath;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbCompileOnSave;
    private javax.swing.JCheckBox cbDebugInfo;
    private javax.swing.JCheckBox cbLineComments;
    private javax.swing.JComboBox cbOutputStyle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBundledRuntime;
    private javax.swing.JRadioButton jRExternalRuntime;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBundleVersion;
    private javax.swing.JLabel lblExternalVersion;
    private javax.swing.JLabel lblSassPath;
    private javax.swing.JTextField txtSassPath;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        load();
    }
}
