package org.palladiosimulator.jdt.core.parser;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;

class LoggerProgressMonitor implements IProgressMonitor {

    private static final Logger LOG = Logger.getLogger(LoggerProgressMonitor.class);

    private int maximalWork;
    private int progress;
    private String taskName;
    private String subName;
    private boolean isCanceled;

    @Override
    public void beginTask(String name, int totalWork) {
        maximalWork = totalWork;
        setTaskName(name);
        subTask(null);
        setCanceled(false);
        internalWorked(0.0);
    }

    @Override
    public void done() {
        internalWorked(100.0);
        isCanceled = true;
    }

    @Override
    public void internalWorked(double work) {
        progress = (int) Math.ceil(work);
        printProgress();
    }

    @Override
    public boolean isCanceled() {
        return isCanceled;
    }

    private void printProgress() {
        if (isCanceled) {
            return;
        }
        System.out.println(String.format("%3d%% %s %s", progress, taskName, subName));
        LOG.info(String.format("%3d%% %s %s", progress, taskName, subName));
    }

    @Override
    public void setCanceled(boolean value) {
        isCanceled = value;
    }

    @Override
    public void setTaskName(String name) {
        taskName = Objects.requireNonNullElse(name, "");
    }

    @Override
    public void subTask(String name) {
        subName = Objects.requireNonNullElse(name, "");
    }

    @Override
    public void worked(int work) {
        internalWorked(((double) work / maximalWork) * 100.0);
    }

}
