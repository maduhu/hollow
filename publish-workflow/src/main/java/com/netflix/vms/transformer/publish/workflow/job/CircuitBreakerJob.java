package com.netflix.vms.transformer.publish.workflow.job;

import com.netflix.vms.transformer.publish.workflow.PublishWorkflowContext;
import com.netflix.vms.transformer.publish.workflow.job.framework.PublishWorkflowPublicationJob;

import java.io.File;

public abstract class CircuitBreakerJob extends PublishWorkflowPublicationJob {
    protected final long cycleVersion;
    protected final File snapshotFile;
    protected final File deltaFile;
    protected final File reverseDeltaFile;

    public CircuitBreakerJob(PublishWorkflowContext ctx, String vip, long cycleVersion, File snapshotFile, File deltaFile, File reverseDeltaFile) {
        super(ctx, "circuit-breaker", cycleVersion);
        this.cycleVersion = cycleVersion;
        this.snapshotFile = snapshotFile;
        this.deltaFile = deltaFile;
        this.reverseDeltaFile = reverseDeltaFile;
    }

    @Override
    public boolean isEligible() {
        return true;
    }

    @Override
    protected boolean isFailedBasedOnDependencies() {
        return false;
    }

}