package project.planItAPI.services

import project.planItAPI.utils.CreateEventOutputModel
import project.planItAPI.utils.Either
import project.planItAPI.utils.EventOutputModel
import project.planItAPI.utils.SearchEventOutputModel
import project.planItAPI.utils.SuccessMessage
import project.planItAPI.utils.UsersInEventList

/**
 * Represents the result of creating an event.
 */
typealias CreateEventResult = Either<Exception, CreateEventOutputModel>

/**
 * Represents the result of retrieving an event.
 */
typealias EventResult = Either<Exception, EventOutputModel>

/**
 * Represents the result of retrieving a list of users in an event.
 */
typealias UsersInEventResult = Either<Exception, UsersInEventList>

/**
 * Represents the result of searching for an event.
 */
typealias SearchEventResult = Either<Exception, SearchEventOutputModel>

/**
 * Represents the result of joining an event.
 */
typealias JoinEventResult = Either<Exception, SuccessMessage>

/**
 * Represents the result of leaving an event.
 */

typealias LeaveEventResult = Either<Exception, SuccessMessage>

/**
 * Represents the result of deleting an event.
 */
typealias DeleteEventResult = Either<Exception, SuccessMessage>

/**
 * Represents the result of editing an event.
 */
typealias EditEventResult = Either<Exception, SuccessMessage>
