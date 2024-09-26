package com.test;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.RunConfigurationExtension;
import com.intellij.execution.configurations.JavaParameters;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.configurations.RunnerSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TestRunConfigurationExtension extends RunConfigurationExtension {
    @Override
    public <T extends RunConfigurationBase<?>> void updateJavaParameters(@NotNull T t, @NotNull JavaParameters javaParameters, @Nullable RunnerSettings runnerSettings) throws ExecutionException {
        System.out.println("updateJavaParameters");
    }
    @Override
    public boolean isApplicableFor(@NotNull RunConfigurationBase<?> runConfigurationBase) {
        return true;
    }
}