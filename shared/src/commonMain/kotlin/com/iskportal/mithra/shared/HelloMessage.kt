package com.iskportal.mithra.shared

import kotlinx.serialization.Serializable

@Serializable
data class HelloMessage(
    val person: String,
    val message: String,
)
