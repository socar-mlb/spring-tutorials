package org.inframincer.psa

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest
class EventControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun getTest() {
        mockMvc.perform(get("/event/1"))
            .andExpect(status().isOk)
            .andExpect(content().string("1"))
    }
}
