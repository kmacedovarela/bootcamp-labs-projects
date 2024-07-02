/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.example;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "cc_application_approval", name = "Cc_application_approval", hidden = true)
@ProcessInput(processName = "cc_application_approval")
public class Cc_application_approvalModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<Cc_application_approvalModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "applicant")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Applicant applicant;

    public org.acme.cc_approval.model.Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(org.acme.cc_approval.model.Applicant applicant) {
        this.applicant = applicant;
    }

    @Override()
    public Cc_application_approvalModel toModel() {
        Cc_application_approvalModel result = new Cc_application_approvalModel();
        result.setApplicant(getApplicant());
        return result;
    }
}