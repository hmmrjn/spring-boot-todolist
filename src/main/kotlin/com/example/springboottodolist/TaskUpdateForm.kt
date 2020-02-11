package com.example.springboottodolist

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class TaskUpdateForm (
        @NotBlank
        @Size(max = 20)
        var content: String? = null,
        var done: Boolean = false
)