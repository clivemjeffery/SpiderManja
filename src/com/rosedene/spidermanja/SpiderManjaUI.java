/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rosedene.spidermanja;

import com.opencsv.CSVReader;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import static java.awt.event.KeyEvent.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Clive
 */
public class SpiderManjaUI extends javax.swing.JFrame {

    /**
     * Creates new form SpiderManjaUI
     */
    public SpiderManjaUI() {
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

        jFileChooser = new javax.swing.JFileChooser();
        jPanelExpected = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListExpected = new javax.swing.JList<>();
        jPanelStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jPanelExceeding = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListExceeding = new javax.swing.JList<>();
        jPanelEmerging = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListEmerging = new javax.swing.JList<>();
        jPanelBelow = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListBelow = new javax.swing.JList<>();
        jMenuMain = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuFileOpen = new javax.swing.JMenuItem();
        jMenuFileSave = new javax.swing.JMenuItem();
        jMenuFileSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFileImport = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuCopyBelow = new javax.swing.JMenuItem();
        jMenuCopyEmerging = new javax.swing.JMenuItem();
        jMenuEditCopyExpected = new javax.swing.JMenuItem();
        jMenuCopyExceeding = new javax.swing.JMenuItem();

        jFileChooser.setDialogTitle("Open Pupil File");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelExpected.setBackground(new java.awt.Color(51, 255, 102));
        jPanelExpected.setBorder(javax.swing.BorderFactory.createTitledBorder("Expected"));

        jListExpected.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListExpectedKeyPressed(evt);
            }
        });
        jListExpected.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListExpectedValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListExpected);

        javax.swing.GroupLayout jPanelExpectedLayout = new javax.swing.GroupLayout(jPanelExpected);
        jPanelExpected.setLayout(jPanelExpectedLayout);
        jPanelExpectedLayout.setHorizontalGroup(
            jPanelExpectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelExpectedLayout.setVerticalGroup(
            jPanelExpectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanelStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelStatus.setText("A Status Line (useful for design messages)");

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelExceeding.setBackground(new java.awt.Color(255, 204, 255));
        jPanelExceeding.setBorder(javax.swing.BorderFactory.createTitledBorder("Exceeding"));

        jListExceeding.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListExceedingKeyPressed(evt);
            }
        });
        jListExceeding.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListExceedingValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListExceeding);

        javax.swing.GroupLayout jPanelExceedingLayout = new javax.swing.GroupLayout(jPanelExceeding);
        jPanelExceeding.setLayout(jPanelExceedingLayout);
        jPanelExceedingLayout.setHorizontalGroup(
            jPanelExceedingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelExceedingLayout.setVerticalGroup(
            jPanelExceedingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanelEmerging.setBackground(new java.awt.Color(204, 255, 204));
        jPanelEmerging.setBorder(javax.swing.BorderFactory.createTitledBorder("Emerging"));

        jListEmerging.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListEmergingKeyPressed(evt);
            }
        });
        jListEmerging.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEmergingValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListEmerging);

        javax.swing.GroupLayout jPanelEmergingLayout = new javax.swing.GroupLayout(jPanelEmerging);
        jPanelEmerging.setLayout(jPanelEmergingLayout);
        jPanelEmergingLayout.setHorizontalGroup(
            jPanelEmergingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelEmergingLayout.setVerticalGroup(
            jPanelEmergingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        jPanelBelow.setBackground(new java.awt.Color(255, 255, 204));
        jPanelBelow.setBorder(javax.swing.BorderFactory.createTitledBorder("Below"));

        jListBelow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListBelowKeyPressed(evt);
            }
        });
        jListBelow.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListBelowValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jListBelow);

        javax.swing.GroupLayout jPanelBelowLayout = new javax.swing.GroupLayout(jPanelBelow);
        jPanelBelow.setLayout(jPanelBelowLayout);
        jPanelBelowLayout.setHorizontalGroup(
            jPanelBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelBelowLayout.setVerticalGroup(
            jPanelBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jMenuFile.setMnemonic('F');
        jMenuFile.setText("File");

        jMenuFileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        jMenuFileOpen.setMnemonic('O');
        jMenuFileOpen.setText("Open...");
        jMenuFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileOpenActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuFileOpen);

        jMenuFileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        jMenuFileSave.setText("Save");
        jMenuFileSave.setEnabled(false);
        jMenuFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileSaveActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuFileSave);

        jMenuFileSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuFileSaveAs.setMnemonic('A');
        jMenuFileSaveAs.setText("Save As...");
        jMenuFileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileSaveAsActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuFileSaveAs);
        jMenuFile.add(jSeparator1);

        jMenuFileImport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, 0));
        jMenuFileImport.setMnemonic('I');
        jMenuFileImport.setText("Import...");
        jMenuFileImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileImportActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuFileImport);
        jMenuFile.add(jSeparator2);

        jMenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuExit.setMnemonic('Q');
        jMenuExit.setText("Quit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuExit);

        jMenuMain.add(jMenuFile);

        jMenuEdit.setMnemonic('E');
        jMenuEdit.setText("Edit");

        jMenuCopyBelow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuCopyBelow.setMnemonic('B');
        jMenuCopyBelow.setText("Copy Below");
        jMenuCopyBelow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCopyBelowActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuCopyBelow);

        jMenuCopyEmerging.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuCopyEmerging.setText("Copy Emerging");
        jMenuCopyEmerging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCopyEmergingActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuCopyEmerging);

        jMenuEditCopyExpected.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuEditCopyExpected.setMnemonic('x');
        jMenuEditCopyExpected.setText("Copy Expected");
        jMenuEditCopyExpected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditCopyExpectedActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuEditCopyExpected);

        jMenuCopyExceeding.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuCopyExceeding.setMnemonic('e');
        jMenuCopyExceeding.setText("Copy Exceeding");
        jMenuCopyExceeding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCopyExceedingActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuCopyExceeding);

        jMenuMain.add(jMenuEdit);

        setJMenuBar(jMenuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEmerging, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExpected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExceeding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExpected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExceeding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEmerging, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFileImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileImportActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (Tab separated from SIMS)", "txt", "text");
        jFileChooser.setFileFilter(filter);
        jFileChooser.setDialogTitle("Import from a SIMS text file");
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            importFile = jFileChooser.getSelectedFile();
            try {
                CSVReader reader = new CSVReader(new FileReader(importFile.getAbsolutePath()), '\t');
                String [] nextLine;
                spiderFile = null; // clear spiderFile (to avoid saving over another class)
                jMenuFileSave.setEnabled(false); // and disable menu (do with listener?)
                belowPupils.clear();
                emergingPupils.clear();
                expectedPupils.clear();
                exceedingPupils.clear();
                try {
                    while ((nextLine = reader.readNext()) != null) {
                        // nextLine[] is an array of values from the line
                        System.out.println(nextLine[2] + '\t' + nextLine[3]);
                        expectedPupils.addElement(new Pupil(nextLine));
                    }
                    setTitle("Imported from: " + importFile.getAbsolutePath());
                } catch (IOException ex) {
                    Logger.getLogger(SpiderManjaUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                //jListExpected.setModel(expectedPupils);
            } catch (SecurityException | FileNotFoundException ex) {
                System.out.println("problem accessing file" + importFile.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jMenuFileImportActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileOpenActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Spiderman Files", "spm");
        jFileChooser.setFileFilter(filter);
        jFileChooser.setDialogTitle("Open Spider Manager File");
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            spiderFile = jFileChooser.getSelectedFile();
            this.setTitle( spiderFile.getAbsolutePath() );
            try {
                // read objects from file
		FileInputStream fis = new FileInputStream(spiderFile.getAbsolutePath());
		ObjectInputStream ois = new ObjectInputStream(fis);
                belowPupils = (DefaultListModel) ois.readObject();
                emergingPupils = (DefaultListModel) ois.readObject();
		expectedPupils = (DefaultListModel) ois.readObject();
                exceedingPupils = (DefaultListModel) ois.readObject();
                jListBelow.setModel(belowPupils);
                jListEmerging.setModel(emergingPupils);
                jListExpected.setModel(expectedPupils);
                jListExceeding.setModel(exceedingPupils);
		ois.close();
                setTitle(spiderFile.getAbsolutePath());
                jMenuFileSave.setEnabled(true);
            } catch (SecurityException ex) {
                System.out.println("problem accessing file" + spiderFile.getAbsolutePath());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SpiderManjaUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SpiderManjaUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SpiderManjaUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateStats();
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jMenuFileOpenActionPerformed

    private void jListExpectedValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListExpectedValueChanged
        if (evt.getValueIsAdjusting() == false) {
            if (jListExpected.getSelectedIndex() == -1) {
                jLabelStatus.setText("Nothing selected");
            } else { // at least one selected
                jLabelStatus.setText(jListExpected.getSelectedValue().toString());
            }
        }
    }//GEN-LAST:event_jListExpectedValueChanged

    private void copyListToClipboard(DefaultListModel m) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String s = m.toString();
        Float fraction = m.getSize()/fTotalPupils;
        DecimalFormat df = new DecimalFormat(" #0.#%");
        s = s.concat(df.format(fraction));
        Transferable transferable = new StringSelection(s);
        clipboard.setContents(transferable, null);
    }
    
    private void jMenuEditCopyExpectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditCopyExpectedActionPerformed
        copyListToClipboard(expectedPupils);
    }//GEN-LAST:event_jMenuEditCopyExpectedActionPerformed

    private void jListExceedingValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListExceedingValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListExceedingValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // set the list view models
        jListBelow.setModel(belowPupils);
        jListEmerging.setModel(emergingPupils);
        jListExpected.setModel(expectedPupils);
        jListExceeding.setModel(exceedingPupils);
    }//GEN-LAST:event_formWindowOpened

    private void jListExpectedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListExpectedKeyPressed
        // Move the selected item from the source list left or right
        int key;
        key = evt.getKeyCode();
        if (key == VK_LEFT) {
            movePupil(jListExpected, jListEmerging);
        }
        if (key == VK_RIGHT) {
            movePupil(jListExpected, jListExceeding);
        }
    }//GEN-LAST:event_jListExpectedKeyPressed

    private void jListEmergingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListEmergingKeyPressed
        int key;
        key = evt.getKeyCode();
        if (key == VK_RIGHT) {
            movePupil(jListEmerging, jListExpected);
        }
        if (key == VK_LEFT) {
            movePupil(jListEmerging, jListBelow);
        }
    }//GEN-LAST:event_jListEmergingKeyPressed

    private void jListEmergingValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEmergingValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListEmergingValueChanged

    private void jListBelowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListBelowKeyPressed
        int key = evt.getKeyCode();
        if (key == VK_RIGHT) {
            movePupil(jListBelow, jListEmerging);
        }
    }//GEN-LAST:event_jListBelowKeyPressed

    private void jListBelowValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListBelowValueChanged
        jLabelStatus.setText("below list value changed.");
    }//GEN-LAST:event_jListBelowValueChanged

    private void jListExceedingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListExceedingKeyPressed
        int key;
        key = evt.getKeyCode();
        if (key == VK_LEFT) {
            movePupil(jListExceeding, jListExpected);
        }
    }//GEN-LAST:event_jListExceedingKeyPressed

    private void jMenuFileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileSaveAsActionPerformed
        // Save to a new file via the file chooser
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Spiderman Files", "spm");
        jFileChooser.setFileFilter(filter);
        jFileChooser.setDialogTitle("Save As Spider Manager File");
        int returnVal = jFileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            spiderFile = jFileChooser.getSelectedFile();
            jLabelStatus.setText( "Saving to " + spiderFile.getAbsolutePath() );
            saveAll();
        } else {
            System.out.println("File save cancelled by user.");
        }
    }//GEN-LAST:event_jMenuFileSaveAsActionPerformed

    private void jMenuFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileSaveActionPerformed
        if (spiderFile == null) {
            jMenuFileSaveAsActionPerformed(evt);
        } else {
            saveAll();
        }
    }//GEN-LAST:event_jMenuFileSaveActionPerformed

    private void jMenuCopyBelowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCopyBelowActionPerformed
        copyListToClipboard(belowPupils);
    }//GEN-LAST:event_jMenuCopyBelowActionPerformed

    private void jMenuCopyExceedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCopyExceedingActionPerformed
        copyListToClipboard(exceedingPupils);
    }//GEN-LAST:event_jMenuCopyExceedingActionPerformed

    private void jMenuCopyEmergingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCopyEmergingActionPerformed
        copyListToClipboard(emergingPupils);
    }//GEN-LAST:event_jMenuCopyEmergingActionPerformed

    private void movePupil(javax.swing.JList src, javax.swing.JList dst) {
        DefaultListModel srcModel = (DefaultListModel) src.getModel();
        DefaultListModel dstModel = (DefaultListModel) dst.getModel();
        Pupil pupilToMove = (Pupil) src.getSelectedValue();
        int indexOfPupil = src.getSelectedIndex();
        srcModel.remove(indexOfPupil);
        dstModel.addElement(pupilToMove);
        if (srcModel.getSize() > 0) {
            if (indexOfPupil == srcModel.getSize()) { // removed item in last place
                indexOfPupil--;
            }
            src.setSelectedIndex(indexOfPupil);
        }
        updateStats();
    }
    
    private void saveAll() {
        try {
            if (!spiderFile.exists() ) {
                try {
                    spiderFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(SpiderManjaUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // Warn about overwriting?
            }
            FileOutputStream fos = new FileOutputStream(spiderFile.getAbsolutePath());
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(belowPupils);
                oos.writeObject(emergingPupils);
                oos.writeObject(expectedPupils);
                oos.writeObject(exceedingPupils);
                oos.close();
                setTitle(spiderFile.getAbsolutePath());
                jMenuFileSave.setEnabled(true);
            } catch (IOException ex) {
                Logger.getLogger(SpiderManjaUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SecurityException | FileNotFoundException ex) {
            System.out.println("problem accessing file" + spiderFile.getAbsolutePath());
        }
    }
    
    private void updateStats() {
        // data
        fTotalPupils = belowPupils.getSize() + emergingPupils.getSize() + expectedPupils.getSize() + exceedingPupils.getSize();
        fBelowFrac = belowPupils.getSize() / fTotalPupils;
        fEmergingFrac = emergingPupils.getSize() / fTotalPupils;
        fExpectedFrac = expectedPupils.getSize() / fTotalPupils;
        fExceedingFrac = exceedingPupils.getSize() / fTotalPupils;
        // display
        updatePanelTitle(jPanelBelow, "Below", fBelowFrac);
        updatePanelTitle(jPanelEmerging, "Emerging", fEmergingFrac);
        updatePanelTitle(jPanelExpected, "Expected", fExpectedFrac);
        updatePanelTitle(jPanelExceeding, "Exceeding", fExceedingFrac);
    }
    
    private void updatePanelTitle(javax.swing.JPanel p, String title, Float fraction) {
        DecimalFormat df = new DecimalFormat(" #0.#%");
        String s = df.format(fraction);
        ((javax.swing.border.TitledBorder) p.getBorder()).setTitle(title + s);
        p.repaint();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getClassName());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpiderManjaUI().setVisible(true);
            }
        });
    }
    
    // Model variable(s)
    private File spiderFile; // working file in serialisation format
    private File importFile; // original text file import / SIMS report output
    // models for each type of assessment list
    private DefaultListModel<Pupil> belowPupils = new DefaultListModel<>();
    private DefaultListModel<Pupil> emergingPupils = new DefaultListModel<>();
    private DefaultListModel<Pupil> expectedPupils = new DefaultListModel<>();
    private DefaultListModel<Pupil> exceedingPupils = new DefaultListModel<>();
    // summary stats
    private float fTotalPupils = 0.0f; // float to force floating point division in updateStats
    private float fBelowFrac = 0.0f;
    private float fEmergingFrac = 0.0f;
    private float fExpectedFrac = 0.0f;
    private float fExceedingFrac = 0.0f;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JList<Pupil> jListBelow;
    private javax.swing.JList<Pupil> jListEmerging;
    private javax.swing.JList<Pupil> jListExceeding;
    private javax.swing.JList<Pupil> jListExpected;
    private javax.swing.JMenuItem jMenuCopyBelow;
    private javax.swing.JMenuItem jMenuCopyEmerging;
    private javax.swing.JMenuItem jMenuCopyExceeding;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenuItem jMenuEditCopyExpected;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuFileImport;
    private javax.swing.JMenuItem jMenuFileOpen;
    private javax.swing.JMenuItem jMenuFileSave;
    private javax.swing.JMenuItem jMenuFileSaveAs;
    private javax.swing.JMenuBar jMenuMain;
    private javax.swing.JPanel jPanelBelow;
    private javax.swing.JPanel jPanelEmerging;
    private javax.swing.JPanel jPanelExceeding;
    private javax.swing.JPanel jPanelExpected;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
