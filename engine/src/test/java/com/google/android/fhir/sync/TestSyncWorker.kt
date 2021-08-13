/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.fhir.sync

import android.content.Context
import androidx.work.WorkerParameters
import com.google.android.fhir.FhirEngine
import com.google.android.fhir.resource.TestingUtils
import org.hl7.fhir.r4.model.ResourceType
import org.mockito.kotlin.mock

class TestSyncWorker(appContext: Context, workerParams: WorkerParameters) :
  FhirSyncWorker(appContext, workerParams) {

  override fun getSyncData() = mapOf(ResourceType.Patient to mapOf("address-city" to "NAIROBI"))

  override fun getDataSource() = TestingUtils.TestDataSourceImpl

  override fun getFhirEngine() = mock<FhirEngine>()
}
