package co.wordbe.pomodoro.exception

import javax.sql.DataSource

sealed class ApplicationException : RuntimeException()

class InvalidRequestException(val request: String) : ApplicationException()
class DatabaseException(val source: DataSource) : ApplicationException()

class ExceptionHandler {

    fun exceptionMessage(e: ApplicationException) = when(e) {
        is InvalidRequestException -> { "잘못된 요청입니다. ${e.request}" }
        is DatabaseException -> { "데이터베이스 에러입니다. ${e.source}" }
    }
}

