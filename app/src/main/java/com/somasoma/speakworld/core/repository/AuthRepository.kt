package com.somasoma.speakworld.core.repository

interface AuthRepository {
    fun signOut(onSuccessCallback: () -> Unit, onFailureCallback: () -> Unit)
    fun deleteAccount(onSuccessCallback: () -> Unit, onFailureCallback: () -> Unit)
}