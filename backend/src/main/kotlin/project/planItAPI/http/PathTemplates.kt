package project.planItAPI.http

object PathTemplates {
    const val PREFIX = "/api-planit"

    /**
     * User paths
     */
    const val REGISTER = "/register"
    const val LOGIN = "/login"
    const val LOGOUT = "/logout"
    const val USER = "/user/{pathId}"
    const val EDIT_USER = "/user/{pathId}/edit"
    const val ABOUT = "/about"
    //const val UPLOAD_PROFILE_PICTURE = "/user/{id}/upload-profile-picture"


    /**
     * Event paths
     */
    const val CREATE_EVENT = "/event"
    const val GET_EVENT = "/event/{id}"
    const val USERS_IN_EVENT = "/event/{id}/users"
    const val EDIT_EVENT = "/event/{id}/edit"
    const val DELETE_EVENT = "/event/{id}/delete"
    const val JOIN_EVENT = "/event/{id}/join"
    const val LEAVE_EVENT = "/event/{id}/leave"
    const val SEARCH_EVENTS = "/events"
}
