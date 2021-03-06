package com.example.choij.a1

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.choij.R

@SuppressLint("Registered")
class InnerRegisterActivity : AppCompatActivity() {


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_innerregister)

        val years= arrayOf("1980",	"1981",	"1982",	"1983",	"1984",	"1985",	"1986",	"1987",	"1988",	"1989",	"1990",	"1991",	"1992",	"1993",	"1994",	"1995",	"1996",	"1997",	"1998",	"1999",	"2000",	"2001",	"2002",	"2003",	"2004",	"2005",	"2006",	"2007",	"2008",	"2009",	"2010",	"2011",	"2012",	"2013",	"2014",	"2015",	"2016",	"2017",	"2018")
        val yearSpinner = findViewById<Spinner>(R.id.user_birthday_year)
        val yearAdapter = ArrayAdapter<Any>(this,R.layout.support_simple_spinner_dropdown_item,years)
        yearSpinner.adapter=yearAdapter

        val months=arrayOf("1",	"2","3","4","5","6","7","8","9","10","11","12")
        val monthSpinner = findViewById<Spinner>(R.id.user_birthday_month)
        val monthAdapter = ArrayAdapter<Any>(this, android.R.layout.simple_spinner_dropdown_item,months)
        monthSpinner.adapter=monthAdapter

        val dates= arrayOf("1",	"2",	"3",	"4",	"5",	"6",	"7",	"8",	"9",	"10",	"11",	"12",	"13",	"14",	"15",	"16",	"17",	"18",	"19",	"20",	"21",	"22",	"23",	"24",	"25",	"26",	"27",	"28",	"29",	"30",	"31")
        val dateSpinner = findViewById<Spinner>(R.id.user_birthday_date)
        val dateAdapter = ArrayAdapter<Any>(this, android.R.layout.simple_spinner_dropdown_item,dates)
        dateSpinner.adapter=dateAdapter

        val majors=arrayOf("수학과","물리학과","화학과","생명과학과","신소재공학과","기계공학과","산업경영공학과","전자전기공학과","컴퓨터공학과","화학공학과","창의아이티융합공학과")
        val majorSpinner = findViewById<Spinner>(R.id.user_major)
        val majorAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,majors)
        majorSpinner.adapter=majorAdapter

        val questions=arrayOf("다른 이메일 주소는?","나의 보물 1호는?","나의 출신 고등학교는?","나의 출신 고향은?","나의 이상형은?","어머니 성함은?","아버지 성함은?","내가 가장 좋아하는 색깔은?")
        val questionSpinner = findViewById<Spinner>(R.id.user_pw_question)
        val questionAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,questions)
        questionSpinner.adapter=questionAdapter

    }
}