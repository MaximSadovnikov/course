package com.vxvw.course.app

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class MainTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `when call main page redirect be shown`() {
        mockMvc.get("/hello")
//            .andExpect { print { "Hello world" } }
    }
}
