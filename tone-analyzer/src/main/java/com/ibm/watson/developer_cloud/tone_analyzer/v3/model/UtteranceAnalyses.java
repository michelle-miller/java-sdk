/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.tone_analyzer.v3.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * UtteranceAnalyses.
 */
public class UtteranceAnalyses extends GenericModel {

  /** An array of {@link UtteranceAnalysis} objects that provides the results for each utterance of the input. */
  @SerializedName("utterances_tone")
  private List<UtteranceAnalysis> utterancesTone;

  /**
   * Gets the utterancesTone.
   *
   * @return the utterancesTone
   */
  public List<UtteranceAnalysis> getUtterancesTone() {
    return utterancesTone;
  }

  /**
   * Sets the utterancesTone.
   *
   * @param utterancesTone the new utterancesTone
   */
  public void setUtterancesTone(final List<UtteranceAnalysis> utterancesTone) {
    this.utterancesTone = utterancesTone;
  }
}
