<<<<<<< HEAD
<<<<<<< HEAD
package com.taobao.idea.wuluwa;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.paths.PathReference;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Author: yunshu.xw
 */
public class Wuluboy extends JDOMExternalizerUtil implements ApplicationComponent, Configurable {
    private WuluForm wuluForm;
    private String srcPath;
    private String frame;
    private String destPath;

    public Wuluboy() {
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "Wuluboy";
    }

    public void lol(String filePath){
        if(StringUtils.isBlank(filePath)){
            addActionError("当前打开的文件为空。");
            return;
        }
        if(!filePath.contains(srcPath)){
            addActionError("当前文件不符合路径格式。不包含路径：" + srcPath);
            return;
        }

    }

    private void addActionError(String errorMsg) {
        Messages.showMessageDialog(errorMsg, "出错啦", Messages.getInformationIcon());
    }

    @Override
    public JComponent createComponent() {
        if(wuluForm == null){
            wuluForm = new WuluForm();
        }
        return wuluForm.$$$getRootComponent$$$();
    }

    @Override
    public boolean isModified() {
        return wuluForm != null && wuluForm.isModified(this);
    }

    @Override
    public void apply() throws ConfigurationException {
        if(null == wuluForm){
            return;
        }
        wuluForm.getData(this);
    }

    @Override
    public void reset() {
        if(wuluForm != null){
            wuluForm.setData(this);
        }
    }

    @Override
    public void disposeUIResources() {
        wuluForm = null;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "wuluboy";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @Override
    public String getHelpTopic() {
        return null;
    }

    public String getSrcPath() {
        return srcPath;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(final String frame) {
        this.frame = frame;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }
}
=======
package com.taobao.idea.wuluwa;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.paths.PathReference;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Author: yunshu.xw
 */
public class Wuluboy extends JDOMExternalizerUtil implements ApplicationComponent, Configurable {
    private WuluForm wuluForm;
    private String srcPath;
    private String frame;
    private String destPath;

    public Wuluboy() {
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "Wuluboy";
    }

    public void lol(String filePath){
        if(StringUtils.isBlank(filePath)){
            addActionError("当前打开的文件为空。");
            return;
        }
        if(!filePath.contains(srcPath)){
            addActionError("当前文件不符合路径格式。不包含路径：" + srcPath);
            return;
        }

    }

    private void addActionError(String errorMsg) {
        Messages.showMessageDialog(errorMsg, "出错啦", Messages.getInformationIcon());
    }

    @Override
    public JComponent createComponent() {
        if(wuluForm == null){
            wuluForm = new WuluForm();
        }
        return wuluForm.$$$getRootComponent$$$();
    }

    @Override
    public boolean isModified() {
        return wuluForm != null && wuluForm.isModified(this);
    }

    @Override
    public void apply() throws ConfigurationException {
        if(null == wuluForm){
            return;
        }
        wuluForm.getData(this);
    }

    @Override
    public void reset() {
        if(wuluForm != null){
            wuluForm.setData(this);
        }
    }

    @Override
    public void disposeUIResources() {
        wuluForm = null;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "wuluboy";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @Override
    public String getHelpTopic() {
        return null;
    }

    public String getSrcPath() {
        return srcPath;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(final String frame) {
        this.frame = frame;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }
}
>>>>>>> parent of f655be9... beta版本
=======
package com.taobao.idea.wuluwa;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.paths.PathReference;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Author: yunshu.xw
 */
public class Wuluboy extends JDOMExternalizerUtil implements ApplicationComponent, Configurable {
    private WuluForm wuluForm;
    private String srcPath;
    private String frame;
    private String destPath;

    public Wuluboy() {
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "Wuluboy";
    }

    public void lol(String filePath){
        if(StringUtils.isBlank(filePath)){
            addActionError("当前打开的文件为空。");
            return;
        }
        if(!filePath.contains(srcPath)){
            addActionError("当前文件不符合路径格式。不包含路径：" + srcPath);
            return;
        }

    }

    private void addActionError(String errorMsg) {
        Messages.showMessageDialog(errorMsg, "出错啦", Messages.getInformationIcon());
    }

    @Override
    public JComponent createComponent() {
        if(wuluForm == null){
            wuluForm = new WuluForm();
        }
        return wuluForm.$$$getRootComponent$$$();
    }

    @Override
    public boolean isModified() {
        return wuluForm != null && wuluForm.isModified(this);
    }

    @Override
    public void apply() throws ConfigurationException {
        if(null == wuluForm){
            return;
        }
        wuluForm.getData(this);
    }

    @Override
    public void reset() {
        if(wuluForm != null){
            wuluForm.setData(this);
        }
    }

    @Override
    public void disposeUIResources() {
        wuluForm = null;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "wuluboy";
    }

    @Override
    public Icon getIcon() {
        return null;
    }

    @Override
    public String getHelpTopic() {
        return null;
    }

    public String getSrcPath() {
        return srcPath;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(final String frame) {
        this.frame = frame;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }
}
>>>>>>> parent of f655be9... beta版本
