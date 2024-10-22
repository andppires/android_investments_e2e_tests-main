package com.example.myapplication.helpers

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick

class MainActivityRobot(private val composeTestRule: ComposeTestRule) {

    // Function to click the "Earnings" tab
    fun clickOnEarningsTab() {
        composeTestRule
            .onNodeWithText("Earnings")
            .performClick()
    }

    // Function to click the "Wallet" tab
    fun clickOnWalletTab() {
        composeTestRule
            .onNodeWithText("Wallet")
            .performClick()
    }

    // Function to verify if an investment card is displayed based on its tag
    fun verifyInvestmentCardIsDisplayed(tag: String) {
        composeTestRule
            .onNodeWithTag(tag)
            .assertIsDisplayed()
    }

    // Function to verify if an entry is displayed in the Wallet
    fun verifyWalletEntryIsDisplayed(entryText: String) {
        composeTestRule
            .onNodeWithText(entryText)
            .assertIsDisplayed()
    }
    fun verifyTitleIsDisplayed(title: String) {
        // Código para verificar se o título da tela é exibido
        // Pode usar uma função como `assertTrue` para validar a visibilidade do título
    }
        // funcão adicionada para validar se estamos na aba certa
    fun verifyOnEarningsTab() {
        // Verifica se o título "Earnings" ou outro identificador exclusivo da aba está visível
        composeTestRule.onNodeWithText("Earnings").assertIsDisplayed()
    }
         // funcão adicionada para validar se estamos na aba certa
    fun verifyOnWalletTab() {
        // Verifica se o título "Wallet" ou outro identificador exclusivo da aba está visível
        composeTestRule.onNodeWithText("Wallet").assertIsDisplayed()
    }

}
