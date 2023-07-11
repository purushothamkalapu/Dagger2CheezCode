package com.purushotham.dagger2bycheezycode

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService
    fun getEmailService(): EmailService
}