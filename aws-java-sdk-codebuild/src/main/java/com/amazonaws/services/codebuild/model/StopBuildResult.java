/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * 
 */
public class StopBuildResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the build that was attempted to be stopped.
     * </p>
     */
    private Build build;

    /**
     * <p>
     * Information about the build that was attempted to be stopped.
     * </p>
     * 
     * @param build
     *        Information about the build that was attempted to be stopped.
     */

    public void setBuild(Build build) {
        this.build = build;
    }

    /**
     * <p>
     * Information about the build that was attempted to be stopped.
     * </p>
     * 
     * @return Information about the build that was attempted to be stopped.
     */

    public Build getBuild() {
        return this.build;
    }

    /**
     * <p>
     * Information about the build that was attempted to be stopped.
     * </p>
     * 
     * @param build
     *        Information about the build that was attempted to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopBuildResult withBuild(Build build) {
        setBuild(build);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBuild() != null)
            sb.append("Build: " + getBuild());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopBuildResult == false)
            return false;
        StopBuildResult other = (StopBuildResult) obj;
        if (other.getBuild() == null ^ this.getBuild() == null)
            return false;
        if (other.getBuild() != null && other.getBuild().equals(this.getBuild()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuild() == null) ? 0 : getBuild().hashCode());
        return hashCode;
    }

    @Override
    public StopBuildResult clone() {
        try {
            return (StopBuildResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}