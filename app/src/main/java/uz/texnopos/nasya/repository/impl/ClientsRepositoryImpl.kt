package uz.texnopos.nasya.repository.impl

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import uz.texnopos.nasya.data.local.room.NasyaDao
import uz.texnopos.nasya.data.local.room.entities.Client
import uz.texnopos.nasya.repository.interfaces.ClientsRepository
import javax.inject.Inject

class ClientsRepositoryImpl @Inject constructor(private val dao: NasyaDao) : ClientsRepository {

    override suspend fun clientRegister(client: Client) {
        withContext(IO) { dao.clientRegister(client) }
    }

    override fun getAllClients(): Flow<List<Client>> {
        return dao.getAllClients()
    }

    override suspend fun removeClient(id: Int) {
        withContext(IO) { dao.deleteByClientId(id) }
    }
}