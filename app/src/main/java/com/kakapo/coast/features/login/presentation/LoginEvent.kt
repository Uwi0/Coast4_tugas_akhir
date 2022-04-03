package com.kakapo.coast.features.login.presentation

sealed class LoginEvent {
    data class EnteredEmail(val value: String): LoginEvent()
    data class EnteredPassword(val value: String): LoginEvent()
    object OnLogin: LoginEvent()
}