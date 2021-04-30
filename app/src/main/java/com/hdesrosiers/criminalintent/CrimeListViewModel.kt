package com.hdesrosiers.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {
//    val crimes = mutableListOf<Crime>()
//
//    init {
//        for (i in 0 until 100) {
//            val crime = Crime()
//            if (i % 5 == 0) {
//                when ((0..1).shuffled().first()) {
//                    0 -> crime.requiresPolice = false
//                    else -> crime.requiresPolice = true
//                }
//            }
//            crime.title = "Crime #$i"
//            crime.isSolved = i % 2 == 0
//            crimes += crime
//        }
//    }

    private val crimeRepository = CrimeRepository.get()
    val crimes = crimeRepository.getCrimes()
}