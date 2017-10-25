/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.tencent.angel.spark.models.vector

import com.tencent.angel.spark.context.PSContext


class SparsePSVector(override val poolId: Int,
                     override val id: Int,
                     override val dimension: Int) extends PSVector {
}

object SparsePSVector{
  def apply(dimension: Int, capacity:Int): SparsePSVector = {
    PSContext.instance().createVector(dimension, VectorType.SPARSE, capacity).asInstanceOf[SparsePSVector]
  }
}