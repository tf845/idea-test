package com.test;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.JavaParameters;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.runners.JavaProgramPatcher;

public class TestJavaProgramPatcher extends JavaProgramPatcher {
    public TestJavaProgramPatcher() {
    }

    @Override
    public void patchJavaParameters(Executor executor, RunProfile configuration, JavaParameters javaParameters) {
        System.out.println("patchJavaParameters");
    }
}