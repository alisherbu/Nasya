package uz.texnopos.nasya.presentation.main.addclient.usecase

import uz.texnopos.nasya.data.local.room.entities.Client

interface AddClientFragmentUC {
    suspend fun clientRegister(client: Client)
}