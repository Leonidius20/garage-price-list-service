package ua.leonidius.garagepricelistservice.data

class DatabaseConnection {

    val repository: CarDetailRepository = CarDetailRepositoryImpl()

    fun executeQuery(action: String, vararg params: Int): List<CarDetail> {
        if (action == "get") {
            if (params.isEmpty()) return repository.getAll()
            else {
                val found = repository.getById(params[0])
                return if (found != null) listOf(found) else emptyList()
            }
        } else {
            throw IllegalArgumentException("Action \"$action\" is not supported on this repository")
        }
    }

    companion object {
        private lateinit var connection: DatabaseConnection

        fun getInstance(): DatabaseConnection {
            if (!this::connection.isInitialized)
                connection = DatabaseConnection()
            return connection
        }

    }


}