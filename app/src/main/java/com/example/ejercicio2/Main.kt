package com.example.ejercicio2

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.ejercicio2.model.*
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    val employee = Employee(
        1,
        "Agustín Ollín",
        AcademicLevel.ASSOCIATE,
        "GAGA980828HCRNO3",
        LocalDate.parse("2000-09-08"),
        "ABCD123456"
    )

    val period = Period(
        LocalDate.parse("2000-09-08"),
        LocalDate.parse("2022-09-20"),
        "Periodo general"
    )

    val schedule = Schedule.Builder(employee, period)
        .addMany(listDetails).build()

    val listOfCheckInOut = listOf<CheckInOut>(
        CheckInOut(
            LocalDate.parse("2022-09-12"),
            employee,
            LocalTime.parse("08:00"),
            LocalTime.parse("16:00")
        ),
        CheckInOut(
            LocalDate.parse("2022-09-13"),
            employee,
            LocalTime.parse("08:00"),
            LocalTime.parse("16:00")
        ),
        CheckInOut(
            LocalDate.parse("2022-09-14"),
            employee,
            LocalTime.parse("08:00"),
            LocalTime.parse("16:00")
        ),
        CheckInOut(
            LocalDate.parse("2022-09-15"),
            employee,
            LocalTime.parse("08:00"),
            LocalTime.parse("15:00")
        ),
        CheckInOut(
            LocalDate.parse("2022-09-16"),
            employee,
            LocalTime.parse("09:00"),
            LocalTime.parse("16:00")
        )
    )

    val incident = Incident(
        employee,
        schedule,
        listOfCheckInOut,
        listOf(),
        LocalDate.parse("2022-09-12"),
        LocalDate.parse("2022-09-16")
    )

    println("La antiguedad del empleado ${employee.fullName} es: ${employee.getSeniority()}")
    println("Faltas: ${incident.getAbsences()}")
    println("Retardos: ${incident.getRetardant()}")
}

@RequiresApi(Build.VERSION_CODES.O)
var listDetails = arrayListOf<Schedule.Detail>(
    Schedule.Detail(
        DayOfWeek.MONDAY,
        LocalTime.parse("08:00"),
        LocalTime.parse("16:00")
    ),
    Schedule.Detail(
        DayOfWeek.TUESDAY,
        LocalTime.parse("08:00"),
        LocalTime.parse("16:00")
    ),
    Schedule.Detail(
        DayOfWeek.WEDNESDAY,
        LocalTime.parse("08:00"),
        LocalTime.parse("16:00")
    )
    ,
    Schedule.Detail(
        DayOfWeek.THURSDAY,
        LocalTime.parse("08:00"),
        LocalTime.parse("16:00")
    ),
    Schedule.Detail(
        DayOfWeek.FRIDAY,
        LocalTime.parse("08:00"),
        LocalTime.parse("16:00")
    )
)