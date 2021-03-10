package com.example.warwickparkingapp

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.add_accountsection.*
import kotlinx.android.synthetic.main.add_accountsection.view.*

class AddAccountSection() : AppCompatActivity () {

    lateinit var HoursList: ArrayList<BarEntry>
    lateinit var DateList: ArrayList<String>
    lateinit var CostsList: ArrayList<BarEntry>
    lateinit var Date2List: ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_accountsection)

        DateList = ArrayList()
        HoursList = ArrayList()

        val barDataSet = BarDataSet(getHours(), "Hours")
        val barData = BarData(getDatesList(), barDataSet)
        barChart.animateY(3000)
        barChart.data = barData


        CostsList = ArrayList()
        Date2List = ArrayList()

        val barDataSet2 = BarDataSet(getCosts(), "Cost(£)")
        val barData2 = BarData(getDates2List(), barDataSet2)
        barChart2.animateY(3000)
        barChart2.data = barData2

    }

    fun getHours(): ArrayList<BarEntry> {

        HoursList.add(BarEntry(3f, 0))
        HoursList.add(BarEntry(4f, 1))
        HoursList.add(BarEntry(1f, 2))
        HoursList.add(BarEntry(2f, 3))
        HoursList.add(BarEntry(3f, 4))
        HoursList.add(BarEntry(6f, 5))
        HoursList.add(BarEntry(1f, 6))
        HoursList.add(BarEntry(8f, 7))
        HoursList.add(BarEntry(3f, 8))
        HoursList.add(BarEntry(4f, 9))

        return HoursList

    }

    fun getDatesList(): ArrayList<String> {

        DateList.add("11th Jan 2021")
        DateList.add("13th Jan 2021")
        DateList.add("17th Jan 2021")
        DateList.add("20th Jan 2021")
        DateList.add("25th Jan 2021")
        DateList.add("26th Jan 2021")
        DateList.add("29th Jan 2021")
        DateList.add("1st Feb 2021")
        DateList.add("5th Feb 2021")
        DateList.add("7th Feb 2021")

        return DateList


    }

    fun getDates2List(): ArrayList<String> {

        Date2List.add("11th Jan 2021")
        Date2List.add("13th Jan 2021")
        Date2List.add("17th Jan 2021")
        Date2List.add("20th Jan 2021")
        Date2List.add("25th Jan 2021")
        Date2List.add("26th Jan 2021")
        Date2List.add("29th Jan 2021")
        Date2List.add("1st Feb 2021")
        Date2List.add("5th Feb 2021")
        Date2List.add("7th Feb 2021")

        return Date2List

    }


    fun getCosts(): ArrayList<BarEntry> {

        CostsList.add(BarEntry(2.00f, 0))
        CostsList.add(BarEntry(2.60f, 1))
        CostsList.add(BarEntry(1.30f, 2))
        CostsList.add(BarEntry(1.30f, 3))
        CostsList.add(BarEntry(2.00f, 4))
        CostsList.add(BarEntry(5.50f, 5))
        CostsList.add(BarEntry(1.30f, 6))
        CostsList.add(BarEntry(5.50f, 7))
        CostsList.add(BarEntry(2.00f, 8))
        CostsList.add(BarEntry(2.60f, 9))


        return CostsList
    }
}


















