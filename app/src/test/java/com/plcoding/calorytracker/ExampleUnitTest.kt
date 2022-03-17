package com.plcoding.calorytracker

import androidx.compose.ui.ExperimentalComposeUiApi
import com.plcoding.core.domain.preferences.Preferences
import com.plcoding.tracker_data.local.TrackerDao
import com.plcoding.tracker_data.remote.OpenFoodApi
import com.plcoding.tracker_data.repository.TrackerRepositoryImpl
import com.plcoding.tracker_domain.repository.TrackerRepository
import io.mockk.mockk as mock
import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExperimentalComposeUiApi
class ExampleUnitTest {
    private lateinit var preferences: Preferences

    var repository: TrackerRepository = TrackerRepositoryImpl(TrackerDao(),OpenFoodApi)

    @Test
    fun addition_isCorrect() {

        assertEquals(4, 2 + 2)
    }

    @Before
    fun doIt() {
        System.out.println("\n\n\nWe are testing\n\n\n")
    }

    @After
    fun inTheEnd() {

        preferences = mock(relaxed = false)

        System.out.println("-----------------------------------------------------\n Laas \n\n")
    }
}