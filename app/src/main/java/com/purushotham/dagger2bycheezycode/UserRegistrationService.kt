package com.purushotham.dagger2bycheezycode

class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "sri0287@gmail.com", "User Registered")
    }

}