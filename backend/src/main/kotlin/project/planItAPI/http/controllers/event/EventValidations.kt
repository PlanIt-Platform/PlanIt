package project.planItAPI.http.controllers.event

import project.planItAPI.domain.event.Category
import project.planItAPI.domain.event.DateFormat
import project.planItAPI.domain.event.Money
import project.planItAPI.domain.event.Subcategory
import project.planItAPI.domain.event.Visibility
import project.planItAPI.models.EventInputModel
import project.planItAPI.models.ValidatedEventInputsModel
import project.planItAPI.utils.Either
import project.planItAPI.utils.Failure
import project.planItAPI.utils.HTTPCodeException
import project.planItAPI.utils.Success

fun validateEventInput(input: EventInputModel): Either<Exception, ValidatedEventInputsModel> {
    val results = listOf(
        Visibility(input.visibility),
        Category(input.category),
        Subcategory(input.category, input.subCategory),
        DateFormat(input.date),
        DateFormat(input.endDate),
        Money(input.price)
    )

    val errors = results.mapNotNull {
        when (it) {
            is Failure -> it.value
            else -> null
        }
    }

    return if (errors.isEmpty()) {
        Success(
            ValidatedEventInputsModel(
            visibility = (results[0] as Success).value as Visibility,
            category = (results[1] as Success).value as Category,
            subCategory = (results[2] as Success).value as Subcategory,
            date = (results[3] as Success).value as DateFormat,
            endDate = (results[4] as Success).value as DateFormat,
            price = (results[5] as Success).value as Money
        )
        )
    } else {
        Failure(HTTPCodeException(errors.joinToString { it.message }, 400))
    }
}
