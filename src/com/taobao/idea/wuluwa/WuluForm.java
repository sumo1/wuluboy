<<<<<<< HEAD
<<<<<<< HEAD
package com.taobao.idea.wuluwa;

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Author: yunshu.xw
 */
public class WuluForm {
    private JPanel rootFrame;
    private JTextField wordSrc;
    private JLabel labelSrc;
    private JButton buttonSrc;
    private JTextField wordDest;
    private JButton buttonDest;
    private JLabel labelDest;

    public WuluForm() {
        $$$setupUI$$$();
        buttonSrc.setText(Constants.DEFAULT_SRC_PATH);
        buttonDest.setText(Constants.DEFAULT_DEST_PATH);
        eventBindIDEA(buttonSrc, wordSrc);
        eventBindIDEA(buttonDest, wordDest);
    }

    private void createUIComponents() {
        rootFrame = new JPanel();
    }

    public void setData(Wuluboy data) {
        wordSrc.setText(data.getSrcPath());
        wordDest.setText(data.getDestPath());
    }

    public void getData(Wuluboy data) {
        data.setSrcPath(wordSrc.getText());
        data.setDestPath(wordDest.getText());
    }

    public boolean isModified(Wuluboy data) {
        if (wordSrc.getText() != null ? !wordSrc.getText().equals(data.getSrcPath()) : data.getSrcPath() != null)
            return true;
        if (wordDest.getText() != null ? !wordDest.getText().equals(data.getDestPath()) : data.getDestPath() != null)
            return true;
        return false;
    }

    private void eventBindIDEA(JButton button, final JTextField word) {
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                FileChooserDescriptor fcd = new FileChooserDescriptor(false, true, false, false, false, false);
                fcd.setDescription("文件目录");
                fcd.setTitle("请选择要上传的文件...");
                VirtualFile vf = FileChooser.chooseFile(rootFrame, fcd);
                word.setText(vf.getPath());
            }
        });
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootFrame.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        labelSrc = new JLabel();
        labelSrc.setText("请选择web工程所在的src目录下的webapp的地址：");
        rootFrame.add(labelSrc, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wordSrc = new JTextField();
        rootFrame.add(wordSrc, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonSrc = new JButton();
        buttonSrc.setText("浏览...");
        buttonSrc.setMnemonic('浏');
        buttonSrc.setDisplayedMnemonicIndex(0);
        rootFrame.add(buttonSrc, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelDest = new JLabel();
        labelDest.setText("请选择jboss运行web工程所在的目录地址：");
        rootFrame.add(labelDest, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wordDest = new JTextField();
        rootFrame.add(wordDest, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonDest = new JButton();
        buttonDest.setText("浏览...");
        rootFrame.add(buttonDest, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootFrame;
    }
=======
package com.taobao.idea.wuluwa;

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Author: yunshu.xw
 */
public class WuluForm {
    private JPanel rootFrame;
    private JTextField wordSrc;
    private JLabel labelSrc;
    private JButton buttonSrc;
    private JTextField wordDest;
    private JButton buttonDest;
    private JLabel labelDest;

    public WuluForm() {
        $$$setupUI$$$();
        buttonSrc.setText(Constants.DEFAULT_SRC_PATH);
        buttonDest.setText(Constants.DEFAULT_DEST_PATH);
        eventBindIDEA(buttonSrc, wordSrc);
        eventBindIDEA(buttonDest, wordDest);
    }

    private void createUIComponents() {
        rootFrame = new JPanel();
    }

    public void setData(Wuluboy data) {
        wordSrc.setText(data.getSrcPath());
        wordDest.setText(data.getDestPath());
    }

    public void getData(Wuluboy data) {
        data.setSrcPath(wordSrc.getText());
        data.setDestPath(wordDest.getText());
    }

    public boolean isModified(Wuluboy data) {
        if (wordSrc.getText() != null ? !wordSrc.getText().equals(data.getSrcPath()) : data.getSrcPath() != null)
            return true;
        if (wordDest.getText() != null ? !wordDest.getText().equals(data.getDestPath()) : data.getDestPath() != null)
            return true;
        return false;
    }

    private void eventBindIDEA(JButton button, final JTextField word) {
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                FileChooserDescriptor fcd = new FileChooserDescriptor(false, true, false, false, false, false);
                fcd.setDescription("文件目录");
                fcd.setTitle("请选择要上传的文件...");
                VirtualFile vf = FileChooser.chooseFile(rootFrame, fcd);
                word.setText(vf.getPath());
            }
        });
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootFrame.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        labelSrc = new JLabel();
        labelSrc.setText("请选择web工程所在的src目录下的webapp的地址：");
        rootFrame.add(labelSrc, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wordSrc = new JTextField();
        rootFrame.add(wordSrc, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonSrc = new JButton();
        buttonSrc.setText("浏览...");
        buttonSrc.setMnemonic('浏');
        buttonSrc.setDisplayedMnemonicIndex(0);
        rootFrame.add(buttonSrc, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelDest = new JLabel();
        labelDest.setText("请选择jboss运行web工程所在的目录地址：");
        rootFrame.add(labelDest, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wordDest = new JTextField();
        rootFrame.add(wordDest, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonDest = new JButton();
        buttonDest.setText("浏览...");
        rootFrame.add(buttonDest, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootFrame;
    }
>>>>>>> parent of f655be9... beta版本
=======
package com.taobao.idea.wuluwa;

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Author: yunshu.xw
 */
public class WuluForm {
    private JPanel rootFrame;
    private JTextField wordSrc;
    private JLabel labelSrc;
    private JButton buttonSrc;
    private JTextField wordDest;
    private JButton buttonDest;
    private JLabel labelDest;

    public WuluForm() {
        $$$setupUI$$$();
        buttonSrc.setText(Constants.DEFAULT_SRC_PATH);
        buttonDest.setText(Constants.DEFAULT_DEST_PATH);
        eventBindIDEA(buttonSrc, wordSrc);
        eventBindIDEA(buttonDest, wordDest);
    }

    private void createUIComponents() {
        rootFrame = new JPanel();
    }

    public void setData(Wuluboy data) {
        wordSrc.setText(data.getSrcPath());
        wordDest.setText(data.getDestPath());
    }

    public void getData(Wuluboy data) {
        data.setSrcPath(wordSrc.getText());
        data.setDestPath(wordDest.getText());
    }

    public boolean isModified(Wuluboy data) {
        if (wordSrc.getText() != null ? !wordSrc.getText().equals(data.getSrcPath()) : data.getSrcPath() != null)
            return true;
        if (wordDest.getText() != null ? !wordDest.getText().equals(data.getDestPath()) : data.getDestPath() != null)
            return true;
        return false;
    }

    private void eventBindIDEA(JButton button, final JTextField word) {
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                FileChooserDescriptor fcd = new FileChooserDescriptor(false, true, false, false, false, false);
                fcd.setDescription("文件目录");
                fcd.setTitle("请选择要上传的文件...");
                VirtualFile vf = FileChooser.chooseFile(rootFrame, fcd);
                word.setText(vf.getPath());
            }
        });
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootFrame.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        labelSrc = new JLabel();
        labelSrc.setText("请选择web工程所在的src目录下的webapp的地址：");
        rootFrame.add(labelSrc, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wordSrc = new JTextField();
        rootFrame.add(wordSrc, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonSrc = new JButton();
        buttonSrc.setText("浏览...");
        buttonSrc.setMnemonic('浏');
        buttonSrc.setDisplayedMnemonicIndex(0);
        rootFrame.add(buttonSrc, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelDest = new JLabel();
        labelDest.setText("请选择jboss运行web工程所在的目录地址：");
        rootFrame.add(labelDest, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wordDest = new JTextField();
        rootFrame.add(wordDest, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonDest = new JButton();
        buttonDest.setText("浏览...");
        rootFrame.add(buttonDest, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootFrame;
    }
>>>>>>> parent of f655be9... beta版本
}