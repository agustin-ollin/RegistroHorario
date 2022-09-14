package com.example.ejercicio2

import com.example.ejercicio2.model.AcademicLevel
import com.example.ejercicio2.model.Employee
import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun senority(){
        val employee = Employee(
            1,
            "Agustín Ollín",
            AcademicLevel.ASSOCIATE,
            "GAGA980828HCRNO3",
            LocalDate.parse("2000-09-08"),
            "ABCD123456"
        )

        assertEquals(22, employee.getSeniority())
    }

}