package com.example.myapplication.cases

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myapplication.MainActivity
import com.example.myapplication.helpers.MainActivityRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityE2EAssetTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    private val robot = MainActivityRobot(composeTestRule)  // Use the robot to interact with UI

    @Test
    fun testMXRF11OnInvestmentAndWalletScreen() {
        // Step 1: Switch to Earnings Tab
        robot.clickOnEarningsTab()
        // Step 2: Verify that we are on the "Earnings" tab
        robot.verifyOnEarningsTab()
        // Step 3: Verify specific investments are displayed on Earnings screen
        robot.verifyInvestmentCardIsDisplayed("MXRF11")
        robot.verifyInvestmentCardIsDisplayed("VISC11")
        // Step 4: Switch to Wallet Screen
        robot.clickOnWalletTab()
        // Step 5: Verify that we are on the "Wallet" tab
        robot.verifyOnWalletTab()
        // Step 6: Verify specific investments are displayed on Wallet screen
        robot.verifyWalletEntryIsDisplayed("MXRF11")
        robot.verifyWalletEntryIsDisplayed("VISC11")
    }
}
