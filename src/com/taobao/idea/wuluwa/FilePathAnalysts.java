package com.taobao.idea.wuluwa;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.impl.FileEditorManagerImpl;
import com.intellij.openapi.fileEditor.impl.PsiAwareFileEditorManagerImpl;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.docking.impl.DockManagerImpl;

import java.io.File;

/**
 * Author: yunshu.xw
 */
public class FilePathAnalysts {

    public String getWindowFilePath(Project project){
        FileEditorManager fem = FileEditorManager.getInstance(project);
        String result = ((PsiAwareFileEditorManagerImpl) fem).getCurrentFile().getPath();
        return result;
    }

    public String getDestFilePath(String filePath, String srcPath, String destPath){
        String prefix = filePath.substring(0, filePath.indexOf(srcPath));
        String suffix = filePath.substring(filePath.indexOf(srcPath) + srcPath.length(), filePath.length());
        String prefix2 = destPath.substring(0, destPath.indexOf(Constants.DEFAULT_WAR_PATH));
        File file = new File(prefix + prefix2);
        String prefix3 = "";
        for (File contenfile : file.listFiles()) {
            if(contenfile.isDirectory() && contenfile.getName().endsWith(Constants.WAR_SUFFIX)){
                prefix3 = contenfile.getName();
                break;
            }
        }
        return prefix + prefix2 + prefix3 + suffix;
    }
}
