package com.example.springboottodolist

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("tasks")
class TaskController {
    @GetMapping("")
    fun index(model: Model) :String {
        val tasks = listOf(
                Task(1, "たまご", false),
                Task(2, "牛乳", true)
        )
        model.addAttribute("tasks", tasks)
        return "tasks/index"
    }
}