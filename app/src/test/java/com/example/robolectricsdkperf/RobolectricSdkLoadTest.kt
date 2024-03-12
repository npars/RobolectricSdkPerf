package com.example.robolectricsdkperf

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
class RobolectricSdkLoadTest {
    @get:Rule val activityScenario = ActivityScenarioRule(MainActivity::class.java)

    @Test
    @Config(sdk = [21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34])
    fun manySdks() {
        activityScenario.scenario.onActivity {
            assertNotNull(it.applicationContext)
        }
    }
}